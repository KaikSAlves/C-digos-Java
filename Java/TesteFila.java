import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/*
        A cada 3 atendimentos a paciente com prioridade, deve ser chamado
         uma paciente comum, não havendo paciente com prioridade, o atendimento deve ser feito para os pacientes
          comuns por ordem de chegada.
         */


public class TesteFila {
    public static void main(String[] args) throws InterruptedException {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        Fila senhas = new Fila();
        int qntdSenha = rand.nextInt(1, 19);
        gerarSenha(senhas, qntdSenha);

        System.out.println("Bem vindo a coleta de sangue!");
        System.out.print(".");
        TimeUnit.SECONDS.sleep(1);
        System.out.print(".");
        TimeUnit.SECONDS.sleep(1);
        System.out.println(".");
        TimeUnit.SECONDS.sleep(1);

        System.out.println(qntdSenha + " pacientes estão na sua frente");
        TimeUnit.SECONDS.sleep(1);
        senhas.organizarPorPrioridade();
        System.out.println(senhas);
        TimeUnit.SECONDS.sleep(1);

        int num = rand.nextInt(100000, 999999);

        do {
            if (senhas.contem(num)) {
                num = rand.nextInt(100000, 999999);
            } else {
                break;
            }
        } while (true);

        System.out.println("Você deseja uma senha preferencial (1) ou comum (0)? ");
        int tipoSenha = sc.nextInt();
        Senha minhaSenha = new Senha(num, tipoSenha, senhas.tamanho());
        senhas.enfileirar(minhaSenha);
        senhas.organizarPorPrioridade();

        System.out.println(senhas);
        System.out.println("Sua senha é " + minhaSenha + "\u001B[0m | Lugar na fila: " + (senhas.busca(minhaSenha) + 1));

        TimeUnit.SECONDS.sleep(1);

        System.out.print("Atendendo");
        TimeUnit.SECONDS.sleep(1);
        System.out.print(".");
        TimeUnit.SECONDS.sleep(1);
        System.out.print(".");
        TimeUnit.SECONDS.sleep(1);
        System.out.println(".");
        TimeUnit.SECONDS.sleep(1);

        int prioridadeAtendido = 0;

        while(true){

            if (senhas.espiar().equals(minhaSenha)) {
                System.out.println("\u001B[0mChegou sua vez!!");
                break;
            }

            if (prioridadeAtendido != 3) {

                if (senhas.espiar().getPrioridade() == 1) {
                    prioridadeAtendido++;
                }

                TimeUnit.SECONDS.sleep(1);
                System.out.println("\u001B[0mProximo: " + senhas.espiar());
                TimeUnit.SECONDS.sleep(2);
                atender(senhas);

            } else {

                for (int j = 0; j < senhas.tamanho(); j++) {
                    if (senhas.busca(j).getPrioridade() == 0) {

                        System.out.println("\u001B[0mProximo: " + senhas.busca(j));

                        atender(senhas, j);
                        break;
                    }
                }
                prioridadeAtendido = 0;
            }

            TimeUnit.SECONDS.sleep(2);
            System.out.println(senhas);
            TimeUnit.SECONDS.sleep(2);
            System.out.println();

        }
    }

    public static void atender(Fila senhas) throws InterruptedException {
        System.out.print(senhas.espiar() + "\u001B[0m Atendido");
        senhas.desemfileirar();
        System.out.println("\u001B[0m, faltam " + senhas.tamanho() + "\u001B[0m pessoas!");
    }

    public static void atender(Fila senhas, int indice) throws InterruptedException {
        System.out.print(senhas.busca(indice) + "\u001B[0m Atendido");
        senhas.remove(indice);
        System.out.println("\u001B[0m, faltam " + senhas.tamanho() + "\u001B[0m pessoas!");
    }

    public static void gerarSenha(Fila senhas, int qntdeSenhas) {
        Random rand = new Random();

        for (int i = 0; i < qntdeSenhas; i++) {


            int num = rand.nextInt(100000, 999999);

            do {
                if (senhas.contem(num)) {
                    num = rand.nextInt(100000, 999999);
                } else {
                    break;
                }
            } while (true);

            Senha senha = new Senha(num, rand.nextInt(0, 2), i);
            senhas.enfileirar(senha);

        }
    }

}

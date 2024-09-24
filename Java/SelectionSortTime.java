import java.sql.SQLOutput;

public class SelectionSortTime {
    public static void main(String[] args) {
        int[] vetor = new int[100000];

        //Tempo de execucao com o tamanho 10: 0
        //Tempo de execucao com o tamanho 100: 0
        //Tempo de execucao com o tamanho 1000: 0
        //Tempo de execucao com o tamanho 10000: 48
        //Tempo de execucao com o tamanho 100000: 4096

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
        }

        long inicio = System.currentTimeMillis();

        //metodo de ordenacao
        int menor_posicao, aux;
        for (int i = 0; i < vetor.length; i++) {
            menor_posicao = i;
            for (int j = 1 + i; j < vetor.length; j++) {
                if (vetor[j] < vetor[menor_posicao]) {
                    menor_posicao = j;
                }
            }

            aux = vetor[menor_posicao];
            vetor[menor_posicao] = vetor[i];
            vetor[i] = aux;
        }

        long fim = System.currentTimeMillis();

        System.out.println("Tempo de execução: " + (fim-inicio));

    }
}


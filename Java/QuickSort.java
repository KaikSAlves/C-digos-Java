public class QuickSort {
    public static void main(String[] args) {
        int[] vetor = new int[10];

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = (int) (Math.random() * vetor.length);
            System.out.print(vetor[i] + " ");
        }

        System.out.println();
        System.out.println("Ordenado: ");

        //metodo de ordenamento
        ordenaQuickSort(vetor,0, vetor.length-1);


        for(int i : vetor){
            System.out.print(i + " ");
        }
    }

    public static void ordenaQuickSort(int[] vetor, int esquerda, int direita){
        if(esquerda < direita){
            int p = particao(vetor, esquerda, direita);
            ordenaQuickSort(vetor, esquerda, p);
            ordenaQuickSort(vetor, p + 1, direita);
        }
    }

    public static int particao(int[] vetor, int esquerda, int direita){
        int meio = (int) (esquerda + direita) / 2;
        int pivo = vetor[meio];
        int i = esquerda - 1;
        int j = direita + 1;

        while(true){
            do{
                i++;
            }while(vetor[i] < pivo);
            do{
                j--;
            }while(vetor[j] > pivo);

            if(i >= j){
                return j;
            }
            int aux = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = aux;
        }
    }
}

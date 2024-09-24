public class QuickSortTime {
    public static void main(String[] args) {
        int[] vetor = new int[1000000];

        //Tempo de execucao com o tamanho 10: 0
        //Tempo de execucao com o tamanho 100: 0
        //Tempo de execucao com o tamanho 1000: 0
        //Tempo de execucao com o tamanho 10000: 0
        //Tempo de execucao com o tamanho 100000: 16

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
        }

        long inicio = System.currentTimeMillis();
        //metodo de ordenamento
        ordenaQuickSort(vetor, 0, vetor.length - 1);

        long fim = System.currentTimeMillis();

        System.out.println("Tempo de execucao: " + (fim - inicio));
    }

    public static void ordenaQuickSort(int[] vetor, int esquerda, int direita) {
        if (esquerda < direita) {
            int p = particao(vetor, esquerda, direita);
            ordenaQuickSort(vetor, esquerda, p);
            ordenaQuickSort(vetor, p + 1, direita);
        }
    }

    public static int particao(int[] vetor, int esquerda, int direita) {
        int meio = (int) (esquerda + direita) / 2;
        int pivo = vetor[meio];
        int i = esquerda - 1;
        int j = direita + 1;

        while (true) {
            do {
                i++;
            } while (vetor[i] < pivo);
            do {
                j--;
            } while (vetor[j] > pivo);

            if (i >= j) {
                return j;
            }
            int aux = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = aux;
        }
    }
}

public class InsertionSortTime {
    public static void main(String[] args) {
        int[] vetor = new int[100000];
        //Tempo de execucao com o tamanho 10: 0
        //Tempo de execucao com o tamanho 100: 0
        //Tempo de execucao com o tamanho 1000: 0
        //Tempo de execucao com o tamanho 10000: 32
        //Tempo de execucao com o tamanho 100000: 2409


        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
        }

        long inicio = System.currentTimeMillis();

        //metodo de ordenacao
        int aux, j;
        for (int i = 1; i < vetor.length; i++) {
            aux = vetor[i];
            j = i - 1;
            while (j >= 0 && aux < vetor[j]) {
                vetor[j + 1] = vetor[j];
                j--;
            }

            vetor[j + 1] = aux;
        }
        long fim = System.currentTimeMillis();
        System.out.println("Tempo de execucao: " + (fim-inicio));
    }
}

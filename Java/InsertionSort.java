public class InsertionSort {
    public static void main(String[] args) {
        int[] vetor = new int[10];

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = (int) (Math.random()  * vetor.length);
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
        System.out.println("    Ordenado:");

        //metodo de ordenacao
        int aux, j;
        for(int i = 1; i < vetor.length; i++){
            aux = vetor[i];
            j = i -1;
            while(j >= 0 && aux < vetor[j]){
                vetor[j + 1] = vetor[j];
                j--;
            }

            vetor[j + 1] = aux;
        }

        for(int i : vetor){
            System.out.print(i + " ");
        }

    }
}

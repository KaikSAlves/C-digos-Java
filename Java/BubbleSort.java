public class BubbleSort {
    public static void
    main(String[] args) {
        int vetor[] = new int[10];

        for(int i = 1; i < vetor.length; i++){
            vetor[i] = (int) (Math.random()  * vetor.length);
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
        sort(vetor);

        System.out.println("     Ordenado:");

        for(int i : vetor){
            System.out.print(i + " ");
        }
    }

    public static void sort(int[] vetor){
        int aux;
        for(int i = 0; i < vetor.length; i++){
            for(int j = i + 1; j < vetor.length; j++){
                if(vetor[i] > vetor[j]){
                    aux = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = aux;
                }
            }
        }
    }
}
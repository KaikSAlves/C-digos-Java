public class SelectionSort {
    public static void main(String[] args) {
        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
        System.out.println("    Ordenado:");

        //metodo de ordenacao
       int menor_posicao, aux;
       for(int i = 0; i < vetor.length; i++){
           menor_posicao = i;
           for(int j = 1 + i; j < vetor.length; j++){
               if(vetor[j] < vetor[menor_posicao]){
                   menor_posicao = j;
               }
           }

           aux = vetor[menor_posicao];
           vetor[menor_posicao] = vetor[i];
           vetor[i] = aux;
       }

        for (int i : vetor) {
            System.out.print(i + " ");
        }


    }
}

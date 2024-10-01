public class ListaEncadeada <Tipo>{
    private No inicio;
    private No fim;
    private int tamanho;

    public ListaEncadeada() {
        this.tamanho = 0;
    }

    public No getInicio() {
        return inicio;
    }

    public void setInicio(No inicio) {
        this.inicio = inicio;
    }

    public No getFim() {
        return fim;
    }

    public void setFim(No fim) {
        this.fim = fim;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public No pegar(int posicao){
        No atual = this.inicio;
        for(int i = 0; i < posicao; i++){
            if(atual.getPonteiro() != null){
                atual = (No) atual.getPonteiro();
            }
        }

        return atual;
    }

    public void adiciona(Tipo elemento){
        No<Tipo> celula = new No<>(elemento);
        if(this.inicio == null && this.fim == null){
            this.fim = celula;
            this.inicio = celula;
        }else{
            this.fim.setPonteiro(celula);
            this.fim = celula;
        }

        this.tamanho++;
    }

    public void remover(Tipo elemento){
        No anterior = null;
        No atual = this.inicio;

        for(int i = 0; i < this.getTamanho(); i++){
            if(atual.getElemento().equals(elemento)){
                if(this.tamanho == 1){
                    this.inicio = null;
                    this.fim = null;
                } else if( atual == inicio){
                    this.inicio = (No) atual.getPonteiro();
                } else if( atual == fim){
                    this.fim = anterior;
                    anterior.setPonteiro(null);
                } else{
                    anterior.setPonteiro(atual.getPonteiro());
                    atual = null;
                    this.tamanho --;
                    break;
                }
            }
            anterior = atual;
            atual = (No) atual.getPonteiro();
        }
    }

    @Override
    public String toString() {
        return "[" + inicio;
    }
}

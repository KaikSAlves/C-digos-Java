package projeto_revisao_ed;

import java.io.ObjectStreamException;

public class VetorObjeto {
    private Object[] elementos;
    private int tamanho;

    public VetorObjeto(int capacidade) {
        this.elementos = new Object[capacidade];
        this.tamanho = 0;
    }

    public void adiciona(Object elemento) {
        this.aumentaCapacidade();
        this.elementos[this.tamanho] = elemento;
        this.tamanho++;
    }

    public int tamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < this.tamanho - 1; i++) {
            sb.append(this.elementos[i] + ", ");
        }

        if (this.tamanho > 0) {
            sb.append(this.elementos[this.tamanho - 1]);
        }

        sb.append("]");

        return sb.toString();
    }

    public Object buscaPorPosicao(int posicao) throws Exception {
        if (posicao >= 0 && posicao < tamanho) {
            return this.elementos[posicao];
        } else {
            throw new Exception("Posicao invalida");
        }
    }

    public int buscaPorElemento(Object elemento){
        for(int i = 0; i < this.tamanho; i++){
            if(this.elementos[i].equals(elemento)){
                return i;
            }
        }

        return -1;
    }

    public void adicionaInicio(Object elemento){
        this.aumentaCapacidade();
        for(int i = this.tamanho - 1; i >= 0; i--){
            this.elementos[i+1] = this.elementos[i];
        }
        this.elementos[0] = elemento;
        this.tamanho++;
    }

    public void remover(int posicao){
        if(posicao >= 0 && posicao < tamanho){
            for(int i = posicao; i < tamanho - 1; i++){
                elementos[i] = elementos[i + 1];
            }
            this.tamanho--;
        }
    }

    private void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            Object[] elementosNovos = new Object[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }

            this.elementos = elementosNovos;
        }
    }
}

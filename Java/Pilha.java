public class Pilha <T> extends EstruturaEstatica<T>{

    public Pilha(){}


    public Pilha(int capacidade){
        super(capacidade);
    }

    @Override
    public void empilhar(T valor) {
        aumentarCapacidade();
        this.elementos[tamanho] = valor;
        tamanho++;
    }

    @Override
    public T desempilhar() throws Exception {
        if(estaVazia()){
            throw new Exception("A pilha está vazia!");
        }else{
            T elemento = this.elementos[tamanho -1];
            this.elementos[tamanho] = null;
            tamanho--;
            return elemento;
        }
    }

    @Override
    public T topo() throws Exception {
        if(estaVazia()){
            throw new Exception("A pilha está vazia!");
        }else {
            return this.elementos[tamanho -1];
        }
    }

    @Override
    public int tamanho() {
        return this.tamanho;
    }
}

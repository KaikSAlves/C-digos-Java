
//<T> indica que estamos trabalhando com um estrutura de dados genéricos
public abstract class EstruturaEstatica <T>{
    protected T[] elementos;
    protected int tamanho;

    public EstruturaEstatica(int capacidade){
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public EstruturaEstatica(){
        this(10);
    }

    public void empilhar(T valor){
    }

    public T desempilhar() throws Exception{
        return null;
    }

    public final boolean estaVazia(){
        if(this.tamanho == 0){
            return true;
        }else{
            return false;
        }
    }

    public T topo() throws Exception{
        return null;
    }

    public int tamanho(){
        return 0;
    }

    public final T[] aumentarCapacidade(){

        if(this.tamanho == this.elementos.length){
            T[] sup = (T[]) new Object[this.tamanho*2];

            for(int i = 0; i < this.elementos.length; i++){
                sup[i] = this.elementos[i];
            }

            return this.elementos = sup;
        }
        return this.elementos;
    }

    public final String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = 0; i < this.tamanho; i++){

            if(i == this.tamanho - 1){
                sb.append(this.elementos[i] + "]");
                break;
            }

            sb.append(this.elementos[i] + ", ");

        }

        return  sb.toString();
    }
}

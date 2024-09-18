public class Senha {
    private int num;
    private int prioridade;
    private int ordemChegada;

    public static int COMUM  = 0;
    public static int PREFERENCIA = 1;

    public Senha(int num, int prioridade, int ordemChegada){
        this.num = num;
        this.prioridade = prioridade;
    }

    public int getOrdemChegada() {
        return ordemChegada;
    }


    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getPrioridade() {
        return prioridade;
    }

    @Override
    public String toString(){
        if(this.prioridade == 1){
            return "\u001b[31m" + this.num;
        }else{
            return "\u001B[0m" + this.num;
        }

    }

}

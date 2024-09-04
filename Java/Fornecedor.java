public class Fornecedor {
    private String nome;
    private String fone;
    
    public Fornecedor(String nome, String fone){
        this.nome = nome;
        this.fone = fone;
    }

    public Fornecedor(){
        this("", "");
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setFone(String fone){
        this.fone = fone;
    }

    public String getFone(){
        return this.fone;
    }

    public static void main(String[] args) {
    }
}

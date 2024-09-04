public class FornecedorPessoa extends Fornecedor{
    private String rg;
    private String cpf;

    public FornecedorPessoa(){
        this("", "", "", "");
    }

    public FornecedorPessoa(String nome, String fone, String rg, String cpf){
        super(nome, fone);
        this.rg = rg;
        this.cpf = cpf;
    }

    public void setRg(String rg){
        this.rg = rg;
    }

    public String getRg(){
        return this.rg;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getCpf(){
        return this.cpf;
    }
    
    @Override
    public String toString(){
        return "Nome: " + getNome() + 
            "\nFone: " + getFone() +
            "\nRG: " + getRg() +
            "\nCPF: " + getCpf();

    }
}

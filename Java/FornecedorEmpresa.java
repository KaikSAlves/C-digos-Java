public class FornecedorEmpresa extends Fornecedor{
    private String ie;
    private String cnpj;
    
    public FornecedorEmpresa(){
        this("", "", "", "");
    }

    public FornecedorEmpresa(String nome, String fone, String ie, String cnpj){
        super(nome, fone);
        this.ie = ie;
        this.cnpj = cnpj;
    }

    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }

    public String getCnpj(){
        return this.cnpj;
    }

    public void setIe(String ie){
        this.ie = ie;
    }

    public String getIe(){
        return this.ie;
    }

    @Override
    public String toString(){
        return "Nome: " + getNome() + 
            "\nFone: " + getFone() +
            "\nIE: " + getIe() +
            "\nCNPJ: " +getCnpj();

    }
}
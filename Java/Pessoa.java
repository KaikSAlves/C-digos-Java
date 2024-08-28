public class Pessoa {
    private String nome;
    private String telefone;
    private String sexo;

    public static final int MASCULINO  = 1;
    public static final int FEMININO = 2;

    public Pessoa(String nome, String telefone, int sexo){
        this.nome = nome;
        this.telefone = telefone;
        setSexo(sexo);
    }

    public Pessoa(){
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setSexo(int sexo){
        if(sexo == 1){
            this.sexo = "Maculino";
        }else{
            this.sexo = "Feminino";
        }

    }

}

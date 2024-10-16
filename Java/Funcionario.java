
package entities;


public class Funcionario {
    private int id;
    private String nome;
    private int idade;
    private String setor;

    public Funcionario(int id, String nome, int idade, String setor) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.setor = setor;
    }

    public Funcionario(String nome, int idade, String setor) {
        this.nome = nome;
        this.idade = idade;
        this.setor = setor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    @Override
    public String toString() {
        return "ID: " + this.id +
                "Nome: " + this.nome + 
                "Idade: " + this.idade + 
                "Setor: " + this.setor;
    }
    
    
}

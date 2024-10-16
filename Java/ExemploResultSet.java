
import entities.Aluno;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExemploResultSet {
	public static void main(String[] args) {        
		try {
			ConectaMySQL conexao = new ConectaMySQL();
			Connection cn = conexao.openDB();
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM Aluno");
			System.out.format("%-4S %-30S %-25S %-4S" , 
					"id", "Nome completo", "Telefone", "Nota" ); 
			System.out.print("\n-----------------------------"
					+ "--------------------------------------\n");
			while (rs.next()) {
				int id = rs.getInt("alunosID");
				String nome = rs.getString("alunosNome");
				String telefone = rs.getString("alunosTelefone");
				double nota = rs.getDouble("alunosNota");
                                Aluno novo = new Aluno(id, nome, telefone, nota);
				                        imprimirAluno(novo);
			} 
			conexao.closeDB(cn, st, rs);
		} catch (SQLException e) {
			System.out.println("Falha ao realizar a operaÃ§Ã£o.");
			e.printStackTrace();        
		}    
	}
        
        public static void imprimirAluno(Aluno aluno){
            System.out.format("%-4d %-30S %-25S %-4.2f\n" , 
					aluno.getId(), aluno.getNome(),aluno.getTelefone(),aluno.getNota() ); 
        }
}

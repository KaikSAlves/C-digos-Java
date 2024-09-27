import java.io.FileNotFoundException;
import java.io.IOException;

public class TestaArquivo {
    public static void main(String[] args) {
        try {
            System.out.println(ArquivosUtil.lerArquivo("C:\\Users\\kaik.salves\\IdeaProjects\\teste.txt"));
        }catch(FileNotFoundException e){
            System.err.println("Erro: " + e.getMessage());
        }catch (IOException e) {
            System.err.println("Erro: " + e.getMessage());
        }catch (Exception e){
            System.err.println("Erro: " + e.getMessage());
        }finally{
            System.err.println("Passou no finally");
        }

    }
}

import java.io.*;

public class ArquivosUtil {
    public static String lerArquivo(String caminho) throws IOException {
        String conteudoArquivo = "";

        File f = new File(caminho);
        FileReader fr = new FileReader(f);
        BufferedReader reader = new BufferedReader(fr);
        String linha;
        while((linha = reader.readLine()) != null) {
            conteudoArquivo += linha;
        }

        reader.close();
        fr.close();
        return conteudoArquivo;

    }
}

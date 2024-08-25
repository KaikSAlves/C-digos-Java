
import entities.Acoes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ColetandoInformacoesWeb {

    public static void main(String[] args) {
        String url = "https://www.fundamentus.com.br/resultado.php";
        
        try {
            Document doc = Jsoup.connect(url).get();
            List<Acoes> acoes = coletarAcoes(doc);
            
            for(Acoes acao : acoes){
                
                //formatando a String que possui %
                int tam = acao.getDivYield().length();
                String divYieldFormated = acao.getDivYield().substring(0, tam-1);
                
                //tratando o erro multplie points
                divYieldFormated = divYieldFormated.replace(".", "");
                //
                
                divYieldFormated = divYieldFormated.replace(",",".");
                double divYield = Double.parseDouble(divYieldFormated);
                
                if(divYield > 20){
                    System.out.println(acao);
                }
            }

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "erro: " + ex.getMessage());
        }
    }

    public static List<Acoes> coletarAcoes(Document doc) {
        List<String> tdsList = new ArrayList<>();
        List<Acoes> acoes = new ArrayList<>();
        final int quantidadeElementosPorAcao = 20;
        
        Elements trs = doc.select("tr");
        Elements tds = trs.select("td");

        for (Element td : tds) {
            tdsList.add(td.text());
            
            if (tdsList.size() > quantidadeElementosPorAcao) {
                
                acoes.add(instanciarPorLista(tdsList));
                
                tdsList.clear();
            }
        }
        
        return acoes;
    }
    
    public static Acoes instanciarPorLista(List<String> tdsList){
        return new Acoes(tdsList.get(0),
                        tdsList.get(1), tdsList.get(2), tdsList.get(3),
                        tdsList.get(4), tdsList.get(5), tdsList.get(6),
                        tdsList.get(7), tdsList.get(8), tdsList.get(9),
                        tdsList.get(10), tdsList.get(11), tdsList.get(12),
                        tdsList.get(13), tdsList.get(14),tdsList.get(15),
                        tdsList.get(16), tdsList.get(17), tdsList.get(18),
                        tdsList.get(19), tdsList.get(20));
    }
}

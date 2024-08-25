import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

import org.json.simple.JSONObject;

import entities.Stock;
import tools.Querry;

public class Main {
    public static void main(String[] args) throws Exception {
        File file = new File("D:\\KAIK\\PROJETOS PESSOAIS\\ELECTRON\\AnalisadorBolsaDeValores\\stocks.json");
        FileWriter fw = new FileWriter(file);
        JSONObject json = new JSONObject();
        Querry qr = new Querry();

        for(Stock stock : qr.stocks){
            json.put("papel", stock.getPapel());
            json.put("cotacao", stock.getCotacao());
            json.put("pL", stock.getpL());
            json.put("pVp", stock.getpVp());
            json.put("psr", stock.getPsr());
            json.put("divYield", stock.getDivYield());
            json.put("pAtivo", stock.getpAtivo());
            json.put("pCapGiro", stock.getpCapGiro());
            json.put("pEbit", stock.getpEbit());
            json.put("pAtivCircLiq", stock.getpAtivCircLiq());
            json.put("evEbit", stock.getEvEbit());
            json.put("evEbitda", stock.getEvEbit());
            json.put("mrgEbit", stock.getMrgEbit());
            json.put("mrgLiq", stock.getMrgLiq());
            json.put("liqCorr", stock.getLiqCorr());
            json.put("roic", stock.getRoic());
            json.put("roe", stock.getRoe());
            json.put("liq2Meses", stock.getLiq2Meses());
            json.put("patrimLiq", stock.getPatrimLiq());
            json.put("divBrutPatrim", stock.getDivBrutPatrim());
            json.put("crescRec5a", stock.getCrescRec5a());
            fw.write(json.toJSONString());
            fw.write("\n");
            json.clear();
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

import entities.Stock;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Querry {

    private static final String url = "https://www.fundamentus.com.br/resultado.php";
    private Document doc;
    private List<Stock> stocks;

    public Querry() {
        try {
            this.doc = Jsoup.connect(url).get();
            this.stocks = getStocks();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "erro: " + ex.getMessage());
        }
    }
    
    public Stock getByName(String name) throws Exception{
        for(Stock stock: this.stocks){
            if(stock.getPapel().equalsIgnoreCase(name)){
                return stock;
            }
        }
        new Exception("Nome inválido ou não identificado!");
        return null;
    }

    private List<Stock> getStocks() {
        List<Stock> stocks = new ArrayList<>();
        final int quantidadeElementosPorAcao = 20;
        List<String> tdsList = new ArrayList<>();
        Elements trs = this.doc.select("tr");
        Elements tds = trs.select("td");

        for (Element td : tds) {
            tdsList.add(td.text());

            if (tdsList.size() > quantidadeElementosPorAcao) {

                stocks.add(instanceByList(tdsList));

                tdsList.clear();
            }
        }

        return stocks;
    }
    
    private Stock instanceByList(List<String> tdsList){
        return new Stock(tdsList.get(0),
                        tdsList.get(1), tdsList.get(2), tdsList.get(3),
                        tdsList.get(4), tdsList.get(5), tdsList.get(6),
                        tdsList.get(7), tdsList.get(8), tdsList.get(9),
                        tdsList.get(10), tdsList.get(11), tdsList.get(12),
                        tdsList.get(13), tdsList.get(14),tdsList.get(15),
                        tdsList.get(16), tdsList.get(17), tdsList.get(18),
                        tdsList.get(19), tdsList.get(20));
    }
}



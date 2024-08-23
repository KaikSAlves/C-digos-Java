//Nome:Kaik de Souza Alves

package Program;

import java.util.Scanner;

import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.JOptionPane;

import entities.Veiculo;

public class App {
    public static void main(String[] args) {
        double velocidade = 0;
        int continuar = 0;

        // cadastrar veiculo

        JOptionPane.showMessageDialog(null, "Cadastre um veiculo!", "Cadastro", JOptionPane.PLAIN_MESSAGE);
        String marca = JOptionPane.showInputDialog(null, "Informe a marca: ", "Cadastro", JOptionPane.PLAIN_MESSAGE);
        String modelo = JOptionPane.showInputDialog(null, "Informe o modelo: ", "Cadastro", JOptionPane.PLAIN_MESSAGE);
        int anoFabricacao = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o ano de fabricação: ",
                "Cadastro", JOptionPane.PLAIN_MESSAGE));

        Veiculo veiculo = new Veiculo(marca, modelo, anoFabricacao);

        // ligar veiculo

        int ligarVeiculo = JOptionPane.showConfirmDialog(null, "Deseja ligar o veículo?");

        if (ligarVeiculo == 0) {
            JOptionPane.showMessageDialog(null, "Veículo ligado!", "", JOptionPane.PLAIN_MESSAGE);
            veiculo.ligarVeiculo();
            JOptionPane.showMessageDialog(null, veiculo, "DADOS", JOptionPane.PLAIN_MESSAGE);

            // realizar acoes de acelerar, parar ou desacelerar

            do {
                int acao = JOptionPane.showConfirmDialog(null, "Acelerar: yes\nDesacelerar: no\nSair: cancel");

                // parar veiculo

                if (acao == 3) {
                    veiculo.desligarVeiculo();
                    JOptionPane.showMessageDialog(null, "O veículo foi deligado");
                    break;
                }

                // receber velocidade

                do {
                    velocidade = Double.parseDouble(JOptionPane.showInputDialog(null,
                            "Informe a velocidade do veículo (menor ou igual a 120): "));

                } while (velocidade > 120);

                try {
                    if (acao == 0) {
                        veiculo.acelerarVeiculo(velocidade);
                    } else if (acao == 1) {
                        veiculo.desacelerarVeiculo(velocidade);
                    }

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }

                JOptionPane.showMessageDialog(null, "Estado: " + veiculo.getEstado().toString() + "\nKmPorH: " + veiculo.getKmPorH() + "\nMarcha: " + veiculo.getMarcha(), "VEICULO EM MOVIMENTO", JOptionPane.PLAIN_MESSAGE);
                continuar = JOptionPane.showConfirmDialog(null, "Continuar se movimentando?");

            } while (continuar == 0);

            veiculo.desligarVeiculo();
            JOptionPane.showMessageDialog(null, veiculo, "VEICULO PARADO", JOptionPane.PLAIN_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "O veículo se manteve desligado...", "", JOptionPane.PLAIN_MESSAGE);
        }

    }
}

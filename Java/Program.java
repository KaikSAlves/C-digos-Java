
//Nome: Kaik de Souza Alves 
package App;


import java.util.Scanner;

import javax.swing.JOptionPane;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int repetir = 1;
        do {

            int ordem = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a ordem da matriz quadrada: ", "Informe a Ordem da MATRIZ", JOptionPane.PLAIN_MESSAGE));

            double[][] matriz = new double[ordem][ordem];

            for (int j = 0; j < ordem; j++) {
                for (int i = 0; i < ordem; i++) {
                    matriz[j][i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor da posição [" + j + "][" + i + "]"));
                }
            }

            double maiorNumero = maiorNumero(matriz);
            double menorNumero = menorNumero(matriz);
            double diagonalPrincipal = somarDiagonalPrincipal(matriz);
            double diagonalSecundaria = somarDiagonalSecundaria(matriz);
            double somaDasDiagonais = diagonalPrincipal + diagonalSecundaria;

            JOptionPane.showMessageDialog(null, imprimirMatriz(matriz) + "\nSomatória matriz: " + somatoriaMatriz(matriz)
                    + "\nMaior número da matriz: " + maiorNumero
                    + "\nMenor número da matriz: " + menorNumero
                    + "\nSoma diagonal principal: " + diagonalPrincipal
                    + "\nSoma diagonal secundaria: " + diagonalSecundaria
                    + "\nSoma das diagonais:  " + somaDasDiagonais);
            repetir = JOptionPane.showConfirmDialog(null, "Deseja repetir o processo?");
        } while (repetir == 0);
    }

    public static String imprimirMatriz(double[][] matriz) {
        StringBuilder sb = new StringBuilder();
        for (double[] vetor : matriz) {
            sb.append("|  ");
            for (double num : vetor) {
                sb.append(num + "  ");

            }
            sb.append("|\n");
        }

        return sb.toString();
    }

    public static double somatoriaMatriz(double[][] matriz) {
        double sum = 0;
        for (double[] vetor : matriz) {
            for (double num : vetor) {
                sum += num;
            }
        }

        return sum;
    }

    public static double maiorNumero(double[][] matriz) {
        double maiorNumero = -999999999;
        for (double[] vetor : matriz) {
            for (double num : vetor) {
                if (maiorNumero < num) {
                    maiorNumero = num;
                }
            }
        }

        return maiorNumero;
    }

    public static double menorNumero(double[][] matriz) {
        double menorNumero = 999999999;
        for (double[] vetor : matriz) {
            for (double num : vetor) {
                if (menorNumero > num) {
                    menorNumero = num;
                }
            }
        }
        return menorNumero;
    }

    public static double somarDiagonalPrincipal(double[][] matriz) {
        int cont = 1;
        double sum = 0;
        for (double[] vetor : matriz) {
            if (cont > vetor.length) {
                break;
            } else {
                sum += vetor[vetor.length - cont];
                cont++;
            }
        }

        return sum;
    }

    public static double somarDiagonalSecundaria(double[][] matriz) {
        int cont = 0;
        int sum = 0;
        for (double[] vetor : matriz) {
            if (cont >= vetor.length) {
                break;
            } else {
                sum += vetor[cont];
                cont++;
            }
        }

        return sum;

    }
}

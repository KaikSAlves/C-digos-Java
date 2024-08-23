//Nome: Kaik de Souza ALves

package entities;

import entities.enums.*;

public class Veiculo {
    private String marca;
    private String modelo;
    private Integer anoFabricacao;
    private Estado estado;
    private Double kmPorHora;
    private String marcha;

    public Veiculo(String marca, String modelo, Integer anoFabricacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.estado = Estado.valueOf("DESLIGADO");
        this.kmPorHora = 0.0;
        this.marcha = "neutra";
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(Integer anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public Estado getEstado() {
        return this.estado;
    }

    public double getKmPorH(){
        return this.kmPorHora;
    }

    public String getMarcha(){
        return this.marcha;
    }

    public void ligarVeiculo() {
        if (getEstado().toString().equals("DESLIGADO")) {
            this.estado = Estado.valueOf("LIGADO");
            System.out.println("O veículo foi ligado!");
        }else{
            System.out.println("O veículo já está ligado!");
        }
    }

    public void desligarVeiculo(){
        if(getEstado().toString().equals("LIGADO")){
            this.estado = Estado.valueOf("DESLIGADO");
            this.kmPorHora = 0.0;
            alterarMarcha(kmPorHora);
            System.out.println("O veículo foi desligado!");
        }else{
            System.out.println("O veículo já está desligado!");
        }
    }

    public void acelerarVeiculo(double velocidade) throws Exception{
        if(getEstado().toString().equals("LIGADO")){
            if(this.kmPorHora <= 120 && (this.kmPorHora + velocidade) <= 120){
                kmPorHora += velocidade;
                alterarMarcha(kmPorHora);
            }else{
                throw new Exception("O veículo não pode exceder 120km/h!");
            }
            
        }else{
            throw new Exception("O veículo não está ligado!");
        }
    }

    public void desacelerarVeiculo(double velocidade) throws Exception{
        if(getEstado().toString().equals("LIGADO")){
            if(this.kmPorHora > 0){
                kmPorHora -= velocidade;
                if(kmPorHora < 0){
                    kmPorHora = 0.0;
                }
                alterarMarcha(kmPorHora);
            }else{
                throw new Exception("O veículo não pode ser desacelerado a 0km/h");
            }
        }else{
            throw new Exception("O veículo não está ligado!");
        }
    }

    private void alterarMarcha(double kmPorHora){

        if(kmPorHora <= 0){
            this.marcha  = "neutro";
        }else if(kmPorHora >= 0 && kmPorHora <= 20){
            this.marcha = "1° marcha";
        }else if(kmPorHora > 20 && kmPorHora <= 40){
            this.marcha = "2° marcha";
        }else if(kmPorHora > 40 && kmPorHora <= 60){
            this.marcha = "3° marcha";
        }else if(kmPorHora > 60 && kmPorHora <= 80){
            this.marcha = "4° marcha";
        }else if(kmPorHora > 80 && kmPorHora <= 120){
            this.marcha = "5° marcha";
        }
    }

    @Override
    public String toString(){
        return "Marca: " + this.marca + "\nModelo: " + this.modelo 
        + "\nAno de Fabricação: " + this.anoFabricacao + "\nEstado: " + this.estado.toString()
        + "\nKm/h: " + this.kmPorHora + "\nMarcha: " + this.marcha;
    }

}

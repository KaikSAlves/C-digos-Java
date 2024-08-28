public class Circulo {
    private Double raio;

    public Circulo(Double raio) {
        this.raio = raio;
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }


    public double calcularArea(){
        return  Math.PI*raio*raio;
    }

    public double calcularPerimetro(){
        return 2 * Math.PI * this.getRaio();
    }

    public String toString(){
        return "Raio: " + String.format("%.2f", getRaio()) + "\n" +
                "Area: " + String.format("%.2f" ,calcularArea()) + "\n" +
                "Perimetro: " + String.format("%.2f", calcularPerimetro());
    }

}

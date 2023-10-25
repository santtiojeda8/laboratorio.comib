public class Circulo {
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    public void Area(){
        double circ_area=Math.PI*Math.pow(radio,2);
        System.out.println("El area del círculo es "+circ_area);
    }
    public void Circunferencia(){
        double circ_per=2*Math.PI*radio;
        System.out.println("La circunferencia del círculo es "+circ_per);
    }
}

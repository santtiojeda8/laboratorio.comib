public class Rectangulo {
    private int alto;
    private int ancho;

    public Rectangulo() {
    }

    public Rectangulo(int alto, int ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    public void Area(){
        int rec_area=alto*ancho;
        System.out.println("El Área del rectángulo es "+rec_area);
    }
    public void Perimetro(){
        int rec_peri=(alto*2)+(ancho*2);
        System.out.println("El perímetro del rectánuglo es "+rec_peri);
    }
}

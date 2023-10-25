public class Pelicula {
    private String titulo;
    private String director;
    private int duración;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, int duración) {
        this.titulo = titulo;
        this.director = director;
        this.duración = duración;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuración() {
        return duración;
    }

    public void setDuración(int duración) {
        this.duración = duración;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", director='" + director + '\'' +
                ", duración=" + duración +
                '}';
    }
}

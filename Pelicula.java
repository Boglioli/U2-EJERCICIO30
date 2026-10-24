public class Pelicula extends ContenidoDigital{
    public Pelicula(String titulo, int duracionMinutos) {
        super(titulo, duracionMinutos);
    }
    public void reproducir() {
        System.out.println("reproduciendo pelicula: " + titulo);
        System.out.println("duracion: " + duracionMinutos + "minutos");
    }
}

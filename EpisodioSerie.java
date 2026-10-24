public class EpisodioSerie extends ContenidoDigital {
    public EpisodioSerie(String titulo, int duracionMinutos) {
        super(titulo, duracionMinutos);
    }
    public void reproducir() {
        System.out.println("reproduciendo episodio de serie: " + titulo);
        System.out.println("duracion: " + duracionMinutos + "minutos");
    }

}

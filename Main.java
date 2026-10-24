public class Main {
    public static void main(String[] args) {
        ContenidoDigital[] contenidos = new ContenidoDigital[3];
        contenidos[0] = new Pelicula("titanic" , 195);
        contenidos[1] = new EpisodioSerie("capitulo 1" , 45);
        contenidos[2] = new TransmisionVivo("partido de padel" , 120, true);
        for (int i = 0; i < contenidos.length; i++) {
            contenidos[i].reproducir();
            
        }
    }
}
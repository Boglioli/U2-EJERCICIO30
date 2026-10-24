public class TransmisionVivo extends ContenidoDigital {
    boolean enCurso;

    public TransmisionVivo(String titulo, int duracionMinutos, boolean enCurso) {
        super(titulo, duracionMinutos);
        this.enCurso = enCurso;
    }

    public void reproducir() {
            if (enCurso) {
                System.out.println("reproduciendo tansmision en vivo" + titulo);
            } else {
                System.out.println("la transmision no esta en curso" + titulo);
            }
        }
    }


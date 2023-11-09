package DIP;

public class SistemaNotificacion {

    private final ServicioNotificación servicio;

    public SistemaNotificacion(ServicioNotificación servicio) {
        this.servicio = servicio;
    }

    public void enviarMensaje(String mensaje) {
        servicio.enviarNotificacion(mensaje);
    }
}

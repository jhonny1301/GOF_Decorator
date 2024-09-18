abstract class VentanaDecorador implements Ventana {
    protected Ventana ventanaDecorada;

    public VentanaDecorador(Ventana ventanaDecorada) {
        this.ventanaDecorada = ventanaDecorada;
    }

    public void dibujar() {
        ventanaDecorada.dibujar();
    }
}
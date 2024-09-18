public class Main {
    public static void main(String[] args) {
        Ventana ventana = new BordesDecorador(new VentanaSimple());
        ventana.dibujar();
    }
}
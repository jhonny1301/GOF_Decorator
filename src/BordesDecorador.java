class BordesDecorador extends VentanaDecorador {
    public BordesDecorador(Ventana ventanaDecorada) {
        super(ventanaDecorada);
    }

    public void dibujar() {
        super.dibujar();
        System.out.println("Agrega bordes a la ventana.");
    }
}
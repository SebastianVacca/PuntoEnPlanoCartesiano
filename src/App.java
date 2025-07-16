public class App {
    public static void main(String[] args) throws Exception {
        var punto = new Punto();

        System.out.println(punto.mostrarCoordenadas());

        punto.mover(3.2, 5.6);

        System.out.println(punto.mostrarCoordenadas());

        System.out.println(punto.calcularDistancia());

    }
}

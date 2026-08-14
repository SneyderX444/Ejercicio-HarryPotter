package harrypotter.view;

public class ConsolaView {

    public void mostrarTitulo(String titulo) {
        System.out.println();
        System.out.println("=== " + titulo + " ===");
    }

    public void mostrarSeparador() {
        System.out.println("-----------------------------------------------");
    }

    public void mostrarEstadoInicial(String nombre, String hechizo) {
        System.out.println(nombre + " es hábil en: " + hechizo);
    }

    public void mostrarResultadoHechizo(String resultado) {
        System.out.println(">> " + resultado);
    }

    public void mostrarCambioDeHechizo(String nombre, String hechizoAnterior, String hechizoNuevo) {
        System.out.println(nombre + " cambia su hechizo hábil: "
                + hechizoAnterior + " -> " + hechizoNuevo);
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}

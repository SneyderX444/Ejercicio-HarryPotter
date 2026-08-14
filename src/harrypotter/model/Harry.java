package harrypotter.model;

public class Harry {

    private final String nombre = "Harry Potter";
    private Hechizo hechizoActual;

    public Harry(Hechizo hechizoInicial) {
        this.hechizoActual = hechizoInicial;
    }

    public void cambiarHechizo(Hechizo nuevoHechizo) {
        this.hechizoActual = nuevoHechizo;
    }

    public String lanzarHechizo(String objetivo) {
        return hechizoActual.lanzar(nombre, objetivo);
    }

    public String getNombre() {
        return nombre;
    }

    public String getHechizoActualNombre() {
        return hechizoActual.getNombre();
    }
}

package harrypotter.model;

public class Ron {

    private final String nombre = "Ron Weasley";
    private Hechizo hechizoActual;

    public Ron(Hechizo hechizoInicial) {
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

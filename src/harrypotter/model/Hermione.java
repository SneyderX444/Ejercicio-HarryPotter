package harrypotter.model;

public class Hermione {

    private final String nombre = "Hermione Granger";
    private Hechizo hechizoActual;

    public Hermione(Hechizo hechizoInicial) {
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

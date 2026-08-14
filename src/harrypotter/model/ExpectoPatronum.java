package harrypotter.model;

public class ExpectoPatronum implements Hechizo {

    @Override
    public String lanzar(String lanzador, String objetivo) {
        return lanzador + " concentra un recuerdo feliz y exclama \"Expecto Patronum\": "
                + "un guardián plateado aparece para proteger a " + objetivo + " de la magia oscura.";
    }

    @Override
    public String getNombre() {
        return "Expecto Patronum";
    }
}

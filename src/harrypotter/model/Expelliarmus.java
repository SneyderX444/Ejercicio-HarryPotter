package harrypotter.model;

public class Expelliarmus implements Hechizo {

    @Override
    public String lanzar(String lanzador, String objetivo) {
        return lanzador + " grita \"Expelliarmus\": el objeto que sostenía "
                + objetivo + " sale disparado de sus manos.";
    }

    @Override
    public String getNombre() {
        return "Expelliarmus";
    }
}

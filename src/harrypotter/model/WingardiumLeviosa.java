package harrypotter.model;

public class WingardiumLeviosa implements Hechizo {

    @Override
    public String lanzar(String lanzador, String objetivo) {
        return lanzador + " agita su varita y pronuncia \"Wingardium Leviosa\": "
                + objetivo + " comienza a levitar suavemente en el aire.";
    }

    @Override
    public String getNombre() {
        return "Wingardium Leviosa";
    }
}

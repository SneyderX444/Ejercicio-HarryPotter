package harrypotter.model;

public class OculusReparo implements Hechizo {

    @Override
    public String lanzar(String lanzador, String objetivo) {
        return lanzador + " apunta su varita y dice \"Oculus Reparo\": "
                + objetivo + " quedan reparados por completo.";
    }

    @Override
    public String getNombre() {
        return "Oculus Reparo";
    }
}

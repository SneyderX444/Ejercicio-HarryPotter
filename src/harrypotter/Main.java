package harrypotter;

import harrypotter.controller.JuegoController;
import harrypotter.view.ConsolaView;

public class Main {

    public static void main(String[] args) {
        ConsolaView view = new ConsolaView();
        JuegoController controller = new JuegoController(view);
        controller.ejecutarDemo();
    }
}

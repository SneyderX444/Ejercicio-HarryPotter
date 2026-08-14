package harrypotter.controller;

import harrypotter.model.ExpectoPatronum;
import harrypotter.model.Expelliarmus;
import harrypotter.model.Harry;
import harrypotter.model.Hermione;
import harrypotter.model.OculusReparo;
import harrypotter.model.Ron;
import harrypotter.model.WingardiumLeviosa;
import harrypotter.view.ConsolaView;

public class JuegoController {

    private final ConsolaView view;

    public JuegoController(ConsolaView view) {
        this.view = view;
    }

    public void ejecutarDemo() {

        Harry harry = new Harry(new ExpectoPatronum());
        Ron ron = new Ron(new Expelliarmus());
        Hermione hermione = new Hermione(new WingardiumLeviosa());

        view.mostrarTitulo("Estado inicial de los personajes");
        view.mostrarEstadoInicial(harry.getNombre(), harry.getHechizoActualNombre());
        view.mostrarEstadoInicial(ron.getNombre(), ron.getHechizoActualNombre());
        view.mostrarEstadoInicial(hermione.getNombre(), hermione.getHechizoActualNombre());

        view.mostrarTitulo("Cada personaje lanza su hechizo habitual");
        view.mostrarResultadoHechizo(harry.lanzarHechizo("un dementor"));
        view.mostrarResultadoHechizo(ron.lanzarHechizo("Draco Malfoy"));
        view.mostrarResultadoHechizo(hermione.lanzarHechizo("un libro pesado"));

        view.mostrarTitulo("Cambio de hechizo en tiempo de ejecución");
        view.mostrarMensaje("Los anteojos de Harry se rompieron. Hermione necesita reparar en vez de hacer levitar.");

        String hechizoAnteriorHermione = hermione.getHechizoActualNombre();
        hermione.cambiarHechizo(new OculusReparo());
        view.mostrarCambioDeHechizo(hermione.getNombre(), hechizoAnteriorHermione, hermione.getHechizoActualNombre());

        view.mostrarResultadoHechizo(hermione.lanzarHechizo("los anteojos de Harry"));

        view.mostrarSeparador();
        view.mostrarMensaje("El objeto 'hermione' sigue siendo la misma instancia durante toda la ejecución: solo cambió el objeto Hechizo que tiene asignado.");
    }
}

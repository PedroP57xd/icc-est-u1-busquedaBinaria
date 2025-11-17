import controllers.BusquedaBinaria;
import controllers.MetodoOrdenamiento;
import controllers.PersonaController;
import models.Persona;
import views.ShowConsole;

public class App {
    public static void main(String[] args) throws Exception {
        PersonaController pController = new PersonaController();
        ShowConsole vista = new ShowConsole();
        MetodoOrdenamiento sort = new MetodoOrdenamiento();
        BusquedaBinaria bBinaria = new BusquedaBinaria();

        Persona[] people = new Persona[] {
                new Persona("Juan", 25),
                new Persona("Ana", 30),
                new Persona("Pedro", 20),
                new Persona("Maria", 28),
                new Persona("Luis", 22),
                new Persona("Carmen", 27),
                new Persona("Sofia", 24),
        };

        vista.showPersonas(people);
        // ascendente
        sort.sort(people, true);
        // descendente
        // sort.sort(people, false);
        System.out.println();
        vista.showPersonas(people);

        Persona respBBinaria = bBinaria.busquedaByName(people, "Pedro");
        vista.showPersonaResult(respBBinaria, "Pedro");

    }
}

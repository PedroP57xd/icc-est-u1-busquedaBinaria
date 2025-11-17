package views;

import models.Persona;

public class ShowConsole {
    public void showResult(int resultado, int valorBuscado){


    }

    public void showPersonaResult(Persona resPer,String nombre){
        if (resPer!=null) {
            System.out.println("     \nPersona Encontrada, Los datos de " + nombre + " son: " + resPer+"\n");
        } else {
            System.out.println("     \nNo se encontraron datos de " + nombre +"\n");
        }
    }
    public void showPersonas(Persona[] perosnas){
        for (int i = 0; i < perosnas.length; i++) {
            System.out.println(perosnas[i]);
        }
    }


}

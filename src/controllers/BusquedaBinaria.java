package controllers;

import models.Persona;

public class BusquedaBinaria {
    public Persona busquedaByName(Persona[] array,String objetivo) {
        int izquierda=0;
        int derecha=array.length-1;
        while (izquierda<=derecha) {
            int central=(izquierda+derecha)/2;
            if (array[central].getNombre().equals(objetivo)) {
                return array[central];
            }else if (array[central].getNombre().compareTo(objetivo)<0) {
                izquierda=central+1;
            }else{
                derecha=central-1;
            }

        }
        return null;
    }

    public Persona busquedaByage(Persona[] array, int objetivo) {
        int izquierda=0;
        int derecha=array.length-1;
        while (izquierda<=derecha) {
            int central=(izquierda+derecha)/2;
            if (array[central].getNombre().equals(objetivo)) {
                return array[central];
            }else if (array[central].getNombre().compareTo(objetivo)<0) {
                izquierda=central+1;
            }else{
                derecha=central-1;
            }

        }
        return null;
    }
}

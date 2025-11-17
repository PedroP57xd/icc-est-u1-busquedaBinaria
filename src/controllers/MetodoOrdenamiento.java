package controllers;

import models.Persona;

public class MetodoOrdenamiento {
    public void sort(Persona[] personas, boolean orden) {
        for (int i = 0; i < personas.length - 1; i++) {
            for (int j = 0; j < personas.length - 1 - i; j++) {
                if (orden) {
                    // Ascendente
                    if (personas[j].getNombre().compareTo(personas[j+1].getNombre())>0) {
                        Persona aux = personas[j];
                        personas[j]=personas[j+1];
                        personas[j+1]=aux;
                    }
                }else{
                    //Descendente
                    if (personas[j].getNombre().compareToIgnoreCase(personas[j+1].getNombre())<0) {
                        Persona aux = personas[j];
                        personas[j]=personas[j+1];
                        personas[j+1]=aux;
                    }
                }
            }
        }
    }
}

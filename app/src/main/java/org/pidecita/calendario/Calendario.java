package org.pidecita.calendario;

import java.util.ArrayList;

import java.util.List;

public class Calendario {

    // private Calendar calendario = new GregorianCalendar(2024, Calendar.JANUARY, 1);
    private List<Cita> citas = new ArrayList<>();

    public Calendario(){}

    public void addCita(Cita cita) {
        if (isCitaLibre(cita)) {
            citas.add(cita);
            System.out.println("Se añadió la cita");
        } else {
            System.out.println("No se pudo añadir la cita");
        }
    }

    public List<Cita> citas() {
        return this.citas;
    }
    
    private boolean isCitaLibre(Cita nuevaCita) {
        return citas().stream()
                .allMatch(cita -> cita.getFecha() != nuevaCita.getFecha());
    }
}

/*
 * Mi idea es: 
 * - coges la fecha de la nueva cita.
 * - compruebas si existe en la lisa de citas.
 * - Si no existe selecciona la cita anterior y calcula el final de esa cita sumandole los minutos del servicio.
 * - Comprobamos si la fecha y hora de la cita nueva está dentro del inicio y fin de la cita anterior. 
 */
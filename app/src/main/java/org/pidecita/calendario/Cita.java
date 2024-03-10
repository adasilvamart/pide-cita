package org.pidecita.calendario;
import java.util.Calendar;

import org.pidecita.cliente.Cliente;
import org.pidecita.servicios.Servicio;

public class Cita {
    private Calendar fecha = null;
    private Servicio servicio = null;
    private Cliente cliente = null;


    public Cita(Servicio servico, Cliente cliente, Calendar fecha) {
        this.servicio = servico;
        this.cliente = cliente;
        this.fecha = fecha;
    }

    public Calendar getFecha() {
        return this.fecha;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public Servicio getServicio() {
        return this.servicio;
    }

}

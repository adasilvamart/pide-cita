package org.pidecita.servicios;

public class LimpiezaFacial implements Servicio {
    
    private final Integer minutes = 60;
    private Double price = 12.5;

    public LimpiezaFacial(){}

    @Override
    public Integer getMinutes() {
        return minutes;
    }

    public Double getPrice() {
        return price;
    }

    public void doService() {
        System.out.println("Limpieza facial hecha");
    };
}

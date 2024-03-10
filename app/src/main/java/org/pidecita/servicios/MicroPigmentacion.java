package org.pidecita.servicios;

public class MicroPigmentacion implements Servicio{
    
    private final Integer minutes = 120;
    private Double price = 220.5;

    public MicroPigmentacion(){}

    @Override
    public Integer getMinutes() {
        return minutes;
    }

    public Double getPrice() {
        return price;
    }

    public void doService() {
        System.out.println("Micro hecha");
    };
}

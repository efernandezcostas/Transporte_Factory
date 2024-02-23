//package com.castelao.

public class FactoryTransporte {
    public static final Integer BICICLETA = 0;
    public static final Integer CAMION = 1;

    public static IComun getTranporte (Integer opcion){
        switch (opcion){
            case CAMION:
                return new Camion();
            case BICICLETA:
                return new Bicicleta();
            default:
                return null;
        }
    }
}

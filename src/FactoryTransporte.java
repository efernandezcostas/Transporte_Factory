public class FactoryTransporte {

    public static Integer embalaje;

    /**
     * Devuelve el tipo de embalaje que se va a utilizar dependiendo del tamaño y el peso del producto que se desea enviar.
     * @param x -> anchura del paquete
     * @param y -> altura del paquete
     * @param z -> profundidad del paquete
     * @param peso -> peso del paquete
     * @return embalaje -> Tipo de embalaje que se va a utilizar
     */
    public static Integer tipoEmbalaje(float x, float y, float z, float peso) {
        if (peso > 10)                          embalaje = IComun.PALE;
        else if (peso>1 && x + y + z > 100)     embalaje = IComun.CAJA;
        else                                    embalaje = IComun.CARTON;
        return embalaje;
    }

    /**
     * Devuelve el vehículo que se va a utilizar dependiendo del embalaje.
     * @param embalaje -> Tipo de embalaje que se obtiene con el metodo tipoEmbalaje
     * @return un nuevo objeto del tipo Bicicleta o Camión dependiendo del tamaño del embalaje.
     * Bicicleta -> Cartón
     * Camion -> Caja, Pale
     */
    public static IComun getTranporte (int embalaje){
        if (embalaje==IComun.CARTON)    return new Bicicleta();
        else                            return new Camion();
    }
}

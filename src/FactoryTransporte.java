public class FactoryTransporte {
    /**
     * Recibe el tipo de embalaje y devuelve el tipo de vehículo dependiendo de éste.
     * @param embalaje - Tipo de embalaje que se va a utilizar
     * @return - new Bicicleta() si el embalaje es CARTON. / - new Camion() en cualquier otro caso.
     */
    public static IComun getTransporte (Integer embalaje) {
        if (embalaje.equals(IComun.CARTON))     return new Bicicleta();
        else                                    return new Camion();
    }
}

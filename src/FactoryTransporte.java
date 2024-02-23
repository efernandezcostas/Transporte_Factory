public class FactoryTransporte {

    public static Integer embalaje;

    public static Integer tipoEmbalaje(float x, float y, float z, float peso) {
        if (peso > 10)                          embalaje = IComun.PALE;
        else if (peso>1 && x + y + z > 100)     embalaje = IComun.CAJA;
        else                                    embalaje = IComun.CARTON;
        return embalaje;
    }

    public static IComun getTranporte (int embalaje){
        switch (embalaje){
            case 0:     return new Bicicleta();
            case 1:     return new Camion();
            case 2:     return new Camion();
            default:    return null;
        }
    }
}

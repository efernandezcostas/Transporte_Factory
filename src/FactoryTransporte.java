public class FactoryTransporte {

    public static Integer embalaje;

    public static Integer tipoEmbalaje(float x, float y, float z, float peso) {
        if (peso > 10)                          embalaje = IComun.PALE;
        else if (peso>1 && x + y + z > 100)     embalaje = IComun.CAJA;
        else                                    embalaje = IComun.CARTON;
        return embalaje;
    }

    public static IComun getTranporte (int embalaje){
        if (embalaje==IComun.CARTON)    return new Bicicleta();
        else                            return new Camion();
    }
}

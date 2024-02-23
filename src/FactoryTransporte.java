public class FactoryTransporte {

    public static final int BICICLETA = 0;
    public static final int CAMION = 1;

    public static IComun getTranporte (int embalaje){

        switch (embalaje){
            case 0:
                return new Camion();
            case 1:
                return new Bicicleta();
            case 2:
                return new Camion();
            default:
                return null;
        }

    }
}

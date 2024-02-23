import com.castelao.transporte;

public class Main {
    public static void main(String[] args) {
        IComun transporte;

        transporte=FactoryTransporte.getTranporte(FactoryTransporte.CAMION);
        if (transporte instanceof Camion){
            System.out.println("Camion");
        }
        System.out.println("Coste: "+transporte.costeTotal(36300));

        transporte=FactoryTransporte.getTranporte(FactoryTransporte.BICICLETA);
        if (transporte instanceof Bicicleta){
            System.out.println("Bicicleta");
        }
        System.out.println("Coste: "+transporte.costeTotal(36300));
    }
}

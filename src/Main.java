import javax.swing.*;
//import com.castelao.transporte;

public class Main {
    public static void main(String[] args) {
        IComun transporte;
        int miTipo;

        transporte = FactoryTransporte.getTranporte(Integer.parseInt(JOptionPane.showInputDialog("""
                Escoge tipo de transporte:
                (0) Bicicleta
                (1) Camión
                """)));

        if (transporte instanceof Camion) {
            System.out.println("Camión");
            miTipo = transporte.tipoEmbalaje(100,10,10,2);

            if (miTipo == IComun.PALE) System.out.println("Envíado en un palé");
            if (miTipo == IComun.CARTON) System.out.println("Envíado en un cartón");
            if (miTipo == IComun.CAJA) System.out.println("Envíado en una caja");

            System.out.println(transporte.costeTotal(36300));
        }

        if (transporte instanceof Bicicleta) {
            System.out.println("Bicicleta");
            miTipo = transporte.tipoEmbalaje(100,10,10,2);

            if (miTipo == IComun.PALE) System.out.println("Envíado en un palé");
            if (miTipo == IComun.CARTON) System.out.println("Envíado en un cartón");
            if (miTipo == IComun.CAJA) System.out.println("Envíado en una caja");

            System.out.println(transporte.costeTotal(36300));
        }
    }
}

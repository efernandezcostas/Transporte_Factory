import javax.swing.*;
import com.castelao.transporte;

public class Main {
    public static void main(String[] args) {
        IComun transporte;

        int miTipoEmbalaje;

        float dx, dy, dz, peso;
        dx = Float.parseFloat(JOptionPane.showInputDialog("Anchura del paquete centímetros"));
        dy = Float.parseFloat(JOptionPane.showInputDialog("Altura del paquete centímetros"));
        dz = Float.parseFloat(JOptionPane.showInputDialog("Profundidad del paquete centímetros"));
        peso = Float.parseFloat(JOptionPane.showInputDialog("Peso del paquete Kg"));

        miTipoEmbalaje = FactoryTransporte.tipoEmbalaje(dx, dy, dz, peso);
        if (miTipoEmbalaje == IComun.CARTON) System.out.println("Enviado en un cartón.");
        if (miTipoEmbalaje == IComun.CAJA) System.out.println("Enviado en un caja.");
        if (miTipoEmbalaje == IComun.PALE) System.out.println("Enviado en un palé.");

        transporte = FactoryTransporte.getTranporte(miTipoEmbalaje);

        if (transporte instanceof Camion) {
            System.out.println("Vehículo seleccionado: Camión");
            System.out.println("Coste total: " + transporte.costeTotal(36300));
        }

        if (transporte instanceof Bicicleta) {
            System.out.println("Vehículo seleccionado: Bicicleta");
            System.out.println("Coste total: " + transporte.costeTotal(36300));
        }
    }
}

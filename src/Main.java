import javax.swing.*;

/**
 * @author efernandezcostas
 */
public class Main {
    /**
     * Clase main desde la que se introducen los datos
     * @param args
     */
    public static void main(String[] args) {

        IComun transporte;
        Integer miTipoEmbalaje;

        float dx, dy, dz, peso;
        dx = Float.parseFloat(JOptionPane.showInputDialog("Anchura del paquete centímetros"));
        dy = Float.parseFloat(JOptionPane.showInputDialog("Altura del paquete centímetros"));
        dz = Float.parseFloat(JOptionPane.showInputDialog("Profundidad del paquete centímetros"));
        peso = Float.parseFloat(JOptionPane.showInputDialog("Peso del paquete Kg"));

        miTipoEmbalaje = IComun.tipoEmbalaje(dx, dy, dz, peso);
        if (miTipoEmbalaje.equals(IComun.CARTON))   System.out.println("Enviado en un cartón.");
        if (miTipoEmbalaje.equals(IComun.CAJA))     System.out.println("Enviado en un caja.");
        if (miTipoEmbalaje.equals(IComun.PALE))     System.out.println("Enviado en un palé.");

        transporte = FactoryTransporte.getTransporte(miTipoEmbalaje);
        System.out.println("Vehículo seleccionado: " + transporte.getClass().getName());
        System.out.println("Coste total: " + transporte.costeTotal(36300, miTipoEmbalaje));
    }
}

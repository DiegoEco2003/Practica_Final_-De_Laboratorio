package client;
import component.*;
import decorator.*;

public class CajaRegistradora {
    public static void main(String[] args) {
        // Caso 1: Venta simple
        ProcesadorDePago pago1 = new PagoBase(10.00);
        System.out.println("Total Caso 1: $" + pago1.procesarMonto() + "\n");

        // Caso 2: Grupo de turistas con tarjeta internacional
        ProcesadorDePago pago2 = new PagoBase(50.00);
        pago2 = new RecargoInternacionalDecorator(pago2);
        pago2 = new PropinaGrupalDecorator(pago2);
        System.out.println("Total Turistas: $" + pago2.procesarMonto() + "\n");

        // Caso 3: Cliente VIP con tarjeta internacional
        ProcesadorDePago pago3 = new PagoBase(20.00);
        pago3 = new RecargoInternacionalDecorator(pago3);
        pago3 = new DescuentoFidelidadDecorator(pago3);
        System.out.println("Total VIP: $" + pago3.procesarMonto() + "\n");
    }
}
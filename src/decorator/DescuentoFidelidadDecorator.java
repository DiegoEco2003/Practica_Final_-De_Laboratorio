package decorator;
import component.ProcesadorDePago;

public class DescuentoFidelidadDecorator extends CargoDecorator {
    public DescuentoFidelidadDecorator(ProcesadorDePago pagoOriginal) {
        super(pagoOriginal);
    }

    @Override
    public double procesarMonto() {
        double monto = super.procesarMonto();
        double descuento = monto * 0.15;
        System.out.println(" - Descuento fidelidad (15%): -$" + descuento);
        return monto - descuento;
    }
}
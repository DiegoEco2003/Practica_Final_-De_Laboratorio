package decorator;
import component.ProcesadorDePago;

public class RecargoInternacionalDecorator extends CargoDecorator {
    public RecargoInternacionalDecorator(ProcesadorDePago pagoOriginal) {
        super(pagoOriginal);
    }

    @Override
    public double procesarMonto() {
        double monto = super.procesarMonto();
        System.out.println(" + Recargo tarjeta internacional: $2.0");
        return monto + 2.0;
    }
}
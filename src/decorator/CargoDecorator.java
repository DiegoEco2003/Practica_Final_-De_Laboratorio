package decorator;
import component.ProcesadorDePago;

public abstract class CargoDecorator implements ProcesadorDePago {
    protected ProcesadorDePago pagoOriginal;

    public CargoDecorator(ProcesadorDePago pagoOriginal) {
        this.pagoOriginal = pagoOriginal;
    }

    @Override
    public double procesarMonto() {
        return pagoOriginal.procesarMonto();
    }
}

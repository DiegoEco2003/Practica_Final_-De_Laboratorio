package decorator;
import component.ProcesadorDePago;

public class PropinaGrupalDecorator extends CargoDecorator {
    public PropinaGrupalDecorator(ProcesadorDePago pagoOriginal) {
        super(pagoOriginal);
    }

    @Override
    public double procesarMonto() {
        double monto = super.procesarMonto();
        double propina = monto * 0.10;
        System.out.println(" + Propina grupal (10%): $" + propina);
        return monto + propina;
    }
}
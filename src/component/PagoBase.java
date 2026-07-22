package component;

public class PagoBase implements ProcesadorDePago {
    private double montoInicial;

    public PagoBase(double montoInicial) {
        this.montoInicial = montoInicial;
    }

    @Override
    public double procesarMonto() {
        System.out.println("Monto base del ticket: $" + this.montoInicial);
        return this.montoInicial;
    }
}
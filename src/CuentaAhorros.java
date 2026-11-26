public class CuentaAhorros extends Cuenta{
    private double interes;

    public CuentaAhorros(String numeroCuenta, double saldo, String titular, double interes) {
        super(numeroCuenta, saldo, titular);
        this.interes = interes;
    }

    public void aplicarIntereses(){
        saldo += saldo*interes/100;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Interés anual: " + interes + "%");
    }
}

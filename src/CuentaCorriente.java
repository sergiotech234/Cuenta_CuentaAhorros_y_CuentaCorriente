public class CuentaCorriente extends Cuenta{
    private double sobregiro;

    public CuentaCorriente(String numeroCuenta, double saldo, String titular, double sobregiro) {
        super(numeroCuenta, saldo, titular);
        this.sobregiro = sobregiro;
    }

    public double getSobregiro() {
        return sobregiro;
    }

    public void setSobregiro(double sobregiro) {
        this.sobregiro = sobregiro;
    }

    @Override
    public void retirar(double cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException(
                    "La cantidad debe ser mayor que cero"
            );
        }

        if (saldo - cantidad < -sobregiro) {
            throw new IllegalArgumentException(
                    "Se supera el límite del sobregiro"
            );
        }

        saldo -= cantidad;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Sobregiro permitido: " + sobregiro + " €");
    }
}

public class TestCuenta {
    public static void main(String[] args) {
        // PRUEBA 1: Cuenta de ahorros
        CuentaAhorros ahorros = new CuentaAhorros(
                "001", 1000, "Ana", 3
        );
        ahorros.aplicarIntereses();
        ahorros.mostrarInformacion();
        System.out.println("----------------------");
        // PRUEBA 2: Cuenta corriente
        CuentaCorriente corriente = new CuentaCorriente(
                "002", 1000, "Luis", 500
        );
        corriente.retirar(1200);
        corriente.mostrarInformacion();
        System.out.println("----------------------");
        // PRUEBA 3: Intentamos retirar otros 400 €
        try {
            corriente.retirar(400);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        corriente.mostrarInformacion();
        System.out.println("----------------------");
        // PRUEBA 4: Cuenta normal con saldo insuficiente
        Cuenta cuenta = new Cuenta(
                "003", 100, "Marta"
        );
        try {
            cuenta.retirar(150);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        cuenta.mostrarInformacion();
    }
}


public class PruebaMetodos {
	public static void main(String[] args) {
		Cuenta miCuenta = new Cuenta(6,344846);
		miCuenta.depositar(300);;
		miCuenta.depositar(200);
		
		
		System.out.println(miCuenta.getSaldo());
		
		
		miCuenta.retirar(100);
		System.out.println(miCuenta.getSaldo());
		
		
		Cuenta otraCuenta = new Cuenta(44,68768);
		otraCuenta.depositar(1000);
		otraCuenta.transferir(1000, miCuenta);
		
		System.out.println(miCuenta.getSaldo());
		System.out.println(otraCuenta.getSaldo());
		
		
	}
}

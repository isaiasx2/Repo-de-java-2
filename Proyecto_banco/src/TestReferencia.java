
public class TestReferencia {
	public static void main(String[] args) {
		Cuenta primeraCuenta = new Cuenta(65);
		primeraCuenta.depositar(200);
		
		Cuenta segundaCuenta = new Cuenta(787);
		segundaCuenta.depositar(100);
		
		System.out.println("primera cuenta: "+ primeraCuenta.getSaldo());
		System.out.println("segunda cuenta: "+ segundaCuenta.getSaldo());
		
		segundaCuenta.depositar(400);
		System.out.println("primera cuenta: "+ primeraCuenta.getSaldo());
		
		System.out.println(primeraCuenta);
		System.out.println(segundaCuenta);
		
		if(primeraCuenta == segundaCuenta) {
			System.out.println("son iguales");
		}else {
			System.out.println("son diferentes");
		}
	}
}

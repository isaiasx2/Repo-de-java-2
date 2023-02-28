package biteBankHeredado;

public class TestCuentaExceptionSaldo {
	public static void main(String[] args) {
		Cuenta cuenta = new CuentaAhorro(1, 3);
		cuenta.depositar(1000);
		try{cuenta.saca(1100);}
		catch(SaldoInsuficienteException e) {
			e.printStackTrace();
			
		}
		
	}
}

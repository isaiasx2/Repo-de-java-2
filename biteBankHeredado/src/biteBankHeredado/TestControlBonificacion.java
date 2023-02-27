package biteBankHeredado;

public class TestControlBonificacion {
	public static void main(String[] args) {
		
		
		Gerente jimena = new Gerente();
		jimena.setSalario(10000);
		
		
		Contador alexis = new Contador();
		alexis.setSalario(5000);
		
		
		ControlBonificacion controlBonificacion = new ControlBonificacion();
		controlBonificacion.registrarSalario(jimena);
		controlBonificacion.registrarSalario(alexis);
		
		
	}
}

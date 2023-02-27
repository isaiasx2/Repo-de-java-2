package biteBankHeredado;

public class TestReferencias {
	public static void main(String[] args) {
		Funcionario funcionario = new Gerente();
		funcionario.setNombre("diego");
		
		Gerente gerente = new Gerente();
		gerente.setNombre("jimena");
		
		funcionario.setSalario(2000);
		gerente.setSalario(10000);
		
		
		
		
		
	}
}

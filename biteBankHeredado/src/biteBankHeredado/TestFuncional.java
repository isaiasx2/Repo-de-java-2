package biteBankHeredado;

public class TestFuncional {
	public static void main(String[] args) {
		Funcionario isaias = new Funcionario();
		isaias.setNombre("isaias");
		isaias.setDocumento("22222222");
		isaias.setSalario(150000);
		
		
		System.out.println(isaias.getSalario());
		System.out.println(isaias.getBonificacion());
	}
}

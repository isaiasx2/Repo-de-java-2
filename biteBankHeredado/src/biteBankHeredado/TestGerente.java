package biteBankHeredado;

public class TestGerente {
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setSalario(6000);
		gerente.setTipo(1);
		gerente.setDocumento("22222222");
		gerente.setNombre("pepe");
		gerente.iniciarSesion("AluraCursos");
		
		System.out.println(gerente.getBonificacion());
		System.out.println(gerente.getSalario());
		System.out.println(gerente.getNombre());
		System.out.println(gerente.iniciarSesion("AluraCursos"));
	}
}

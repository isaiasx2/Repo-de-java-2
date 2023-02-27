package biteBankHeredado;

public class SistemaInterno {
	private String clave = "AluraCursos"; 
	public boolean autenticar(Autenticable gerente) {
		boolean puedeIniciarSesion = gerente.iniciarSesion(clave);
		if(puedeIniciarSesion) {
			System.out.println("Login exitoso");
			return true;
		}else {
			System.out.println("Fallo login");
			return false;
		}
		
	}
}

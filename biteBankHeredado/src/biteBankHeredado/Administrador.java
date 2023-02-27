package biteBankHeredado;

public class Administrador extends Funcionario implements Autenticable {
	private AutenticacionUtil util;
	
	public Administrador() {
		this.util = new AutenticacionUtil();
	}

	public double getBonificacion() {
		return 0;
	}
	public void setClave(String clave) {
	}

	public boolean iniciarSesion(String clave) {
		return this.util.iniciarSesion(clave);
	}

	@Override
	public String getClave() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}

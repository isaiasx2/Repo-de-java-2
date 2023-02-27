package biteBankHeredado;

public class Gerente extends Funcionario implements Autenticable {
	public void setClave(String clave) {
	}

	public boolean iniciarSesion(String clave) {
		return this.iniciarSesion(clave);
	}

	public double getBonificacion() {
		System.out.println("ejecutando desde gerente");
		return super.getSalario() + this.getSalario() * 0.05; 
	}

	@Override
	public String getClave() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}

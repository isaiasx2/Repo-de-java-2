package biteBankHeredado;

public abstract class Funcionario {
	private String nombre;
	private String documento;
	protected double salario;

	public String getNombre() {
		return nombre;
	}

	public Funcionario() {

	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public abstract double getBonificacion();
	
	

}

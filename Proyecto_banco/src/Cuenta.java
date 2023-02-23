// entidad cuenta://
class Cuenta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular = new Cliente();
	
	//constructor de cuenta
	private static int total = 0;
	public Cuenta(int agencia, int numero) {
		if(agencia <= 0) {
			System.out.println("No se permite 0");
			this.agencia = 1;
			this.numero = numero;
		}else {
			this.agencia = agencia;
		}
		total ++;
		System.out.println("se van creando "+total);
		
		
	}
	
	//NO RETORNA VALOR VOID(VACIO)
	public void depositar(double valor){
		this.saldo += valor;
	}
	//RETORNA VALOR BOOLEAN
	public boolean retirar (double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}return false;
	}
	public boolean transferir(double valor, Cuenta cuenta){
		if(this.saldo >= valor ) {
			this.saldo -= valor;
			cuenta.depositar(valor);
			return true;
		}return false;

	}
	public double getSaldo(){
		return this.saldo;
	}
	public void setAgencia(int nuevaAgencia){
		if(nuevaAgencia > 0) {
			this.agencia = nuevaAgencia;
		}else {
			System.out.println("No esta permitido ese valor");
		}
		
	}
	public int getAgencia() {
		return agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public Cliente getTitular() {
		return titular;
	}
	public static int getTotal() {
		return Cuenta.total;
	}
	
}


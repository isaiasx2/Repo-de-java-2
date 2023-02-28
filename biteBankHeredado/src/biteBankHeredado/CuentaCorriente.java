package biteBankHeredado;

 class CuentaCorriente extends Cuenta {
	public CuentaCorriente(int agencia, int numero) {
		super(agencia, numero);
	}
	@Override
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	@Override
	public void saca(double valor) throws SaldoInsuficienteException{
		double valorRetirar = valor + 0.2;
		super.saca(valorRetirar);
	}
}

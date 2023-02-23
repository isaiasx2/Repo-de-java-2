
public class PruebaEncapsulamiento {
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta(55);
		Cliente cliente = new Cliente();
		cliente.setNombre("Pedro");
		cliente.setDocumento("22222222"); 
		cuenta.setTitular(cliente);
		cuenta.setNumero(1);
		
		Cliente titular = cuenta.getTitular();
		
		System.out.println(cliente);
		System.out.println(cuenta.getTitular());
		System.out.println(titular);
		System.out.println(cuenta.getNumero());
	}
}

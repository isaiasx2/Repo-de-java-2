
public class TestReferencia2 {
	public static void main(String[] args) {
		Cliente diego = new Cliente();
		diego.setNombre("Diego"); 
		//diego.documento = "22222222";
		//diego.telefono = "222222222";
		
		
		Cuenta cuentaDiego = new Cuenta(55);
		cuentaDiego.setAgencia(1);;
		//cuentaDiego.titular = diego;
		
		//System.out.println(cuentaDiego.titular.documento);
	}
}

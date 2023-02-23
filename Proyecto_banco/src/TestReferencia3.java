
public class TestReferencia3 {
	public static void main(String[] args) {
		Cuenta cuentaDiego = new Cuenta(45);
		cuentaDiego.getTitular().getNombre();
		System.out.println(cuentaDiego.getTitular().getNombre());
	}
}

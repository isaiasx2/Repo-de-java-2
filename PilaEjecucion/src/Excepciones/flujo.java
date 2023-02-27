package Excepciones;

public class flujo {
	public static void main(String[] args) {
		System.out.println("Inicio main ");
		try {
			metodo2();
		}catch(MiException exception) {
			String msj = exception.getMessage();
			System.out.println("exception "+ msj);
			exception.printStackTrace();
		}
		System.out.println("Fin main");

	}
	public static void metodo1() throws MiException{
		System.out.println("Inicio metodo 1");
		metodo2();
		System.out.println("Fin metodo 1");
	}
	public static void metodo2() throws MiException {
		
		Cuenta cuenta = new Cuenta();
		System.out.println("inicio metodo 2");
		throw new MiException("esio");
		
		}
	
	}


package Excepciones;

public class TestConexion {
	public static void main(String[] args) throws Exception {
		
		
		try(Conexion con = new Conexion()){//resume todo el codigo de abajo
			con.leerDatos();
		}catch(IllegalStateException e) {
			System.out.println("Ejecutando catch");
			e.printStackTrace();
		}
		
		
		/*
		Conexion conexion = null;
		try {
			conexion = new Conexion();
			conexion.leerDatos();
			
			}
		catch(IllegalStateException e) {
			System.out.println("recibiendo exception");
			e.printStackTrace();
		}
		finally {
			System.out.println("Ejecutando finally");
			if(conexion != null) {
			conexion.cerrar();
			}
		}*/
		
		
	}
	
}

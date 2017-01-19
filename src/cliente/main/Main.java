package cliente.main;

import java.io.IOException;

import entidad.Empleado;

public class Main {

    public static void main(String[] args) {

	Empleado empleado = new Empleado("Pepito perez", "pp@hotmail.com");
	try {
	    System.out.println("Conectando al servidor...!!");
	    Cliente cliente = new Cliente("localhost", 5555);
	    cliente.enviarObeto(empleado);
	} catch (IOException e) {
	    System.err.println("CLIENTE: " + e.getMessage());
	    e.printStackTrace();
	}

    }

}

package servidor.main;

import java.io.IOException;

import entidad.Empleado;

public class Main {

    public static void main(String[] args) {

	try {
	    Thread servidor = new Servidor(5555);
	    servidor.start();
	    System.out.println("Servidor en marcha...!!");
	} catch (IOException e) {
	    System.err.println("SERVIDOR: "+e.getMessage());
	    e.printStackTrace();
	}

    }

}

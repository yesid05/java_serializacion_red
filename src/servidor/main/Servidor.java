package servidor.main;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

import entidad.Empleado;

public class Servidor extends Thread {

    // --------------------------
    // Atributos
    // --------------------------

    /**
     * Atributo para crear un socket para poder comunicarse
     */
    private ServerSocket servidor;

    /**
     * Atributo para leer bytes
     */
    private InputStream ipsServer;

    /**
     * Atributo para leer objetos en bytes
     */
    private ObjectInputStream objIpsServidor;
    
    /**
     * Atributo de tipo empleado
     */
    private Empleado empleado;

    public Servidor(int unPuerto) throws IOException {
	
	servidor = new ServerSocket(unPuerto);
	servidor.setSoTimeout(10000);
	
    }
    
    public Empleado darEmpleado(){
	return empleado;
    }
    
    @Override
    public void run() {
	super.run();
	while (true) {
	    try {
		System.out.println("SERVIDOR- Esperando en al cliente en el puerto "+servidor.getLocalPort());
		Socket  unServidor = servidor.accept();
		
		System.out.println("SERVIDOR- Conectado a: "+unServidor.getRemoteSocketAddress());
		ipsServer = unServidor.getInputStream();
		
		objIpsServidor = new ObjectInputStream(ipsServer);
		
		empleado = (Empleado)objIpsServidor.readObject();
		System.out.printf("Nombre: %s, Mail %s,",empleado.darNombre(),empleado.darMail() );
		
		unServidor.close();
		
	    } catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    } catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }
	}
    }

}

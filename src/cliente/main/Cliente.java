package cliente.main;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import entidad.Empleado;

public class Cliente {

    // ---------------------------------
    // Atributos
    // ---------------------------------

    /**
     * Punto para comunicar dos máquinas
     */
    private Socket cliente;

    /**
     * Atributo para escribir bytes
     */
    private OutputStream opsClinete;

    /**
     * Atributo para leer bytes
     */
    private InputStream ipsCliente;

    /**
     * Atributo para escribir objetos en bytes
     */
    private ObjectOutputStream objOpsCliente;

    /**
     * Atributo para leer objetos en bytes;
     */
    private ObjectInputStream objIpsCliente;

    /**
     * Máquina cliente
     * 
     * @param unNombre
     *            dirección ip de la máquina
     * @param unPuerto
     *            puerto de la máquina
     * @throws IOException
     * @throws UnknownHostException
     * @throws @throws
     *             IOException
     */
    public Cliente(String unNombre, int unPuerto) throws UnknownHostException, IOException {
	cliente = new Socket(unNombre, unPuerto);
	opsClinete = cliente.getOutputStream();
	objOpsCliente = new ObjectOutputStream(opsClinete);

    }
    
    public void enviarObeto(Empleado unEmpleado) throws IOException{
	objOpsCliente.writeObject(unEmpleado); 
	cliente.close();
    }

}

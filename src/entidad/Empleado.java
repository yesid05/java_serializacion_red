package entidad;

import java.io.Serializable;

public class Empleado implements Serializable {

    // ----------------------------
    // Atributos
    // ----------------------------

    /**
     * Nombre de un empleado
     */
    private String nombre;

    /**
     * Direcci�n de correo electr�nico
     */
    private String mail;

    // ----------------------------
    // Metodos
    // ----------------------------

    /**
     * Contruye un empleado sin parametros
     */
    public Empleado() {
    }

    /**
     * Contruye un empleado con su nombre y correo electr�nico
     * 
     * @param unNombre
     *            nombre de tipo String
     * @param unCorreo
     *            correo electr�nico de tipo String
     */
    public Empleado(String unNombre, String unCorreo) {

	nombre = unNombre;
	mail = unCorreo;

    }

    /**
     * Modifica el nombre
     * 
     * @param unNombre
     *            nuevo nombre de tipo String
     */
    public void cambiarNombre(String unNombre) {

	nombre = unNombre;

    }

    /**
     * Retorna el nombre
     * 
     * @return un nombre de tipo String
     */
    public String darNombre() {

	return nombre;

    }

    /**
     * Modifica el correo electr�nico
     * 
     * @param unMail
     *            nuevo correo electr�nico de tipo String
     */
    public void cambiarMail(String unMail) {

	mail = unMail;

    }
    
    /**
     * Retorna el correo electr�nico 
     * @return un correo de tipo String 
     */
    public String darMail(){
	
	return mail;
	
    }

}

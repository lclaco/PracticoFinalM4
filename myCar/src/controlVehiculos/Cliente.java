/**
 * 
 */
package controlVehiculos;

/**
 * @author Infoseg
 *
 */
public class Cliente {
	private String nombre, apellidoPaterno,apellidoMaterno, rut, email, fonoContacto;

	

	/**
	 * 
	 */
	public Cliente() {
	}
	
	
	
	
	/**
	 * @param nombre
	 * @param apellidoPaterno
	 * @param apellidoMaterno
	 * @param rut
	 * @param email
	 * @param fonoContacto
	 */
	public Cliente(String nombre, String apellidoPaterno, String apellidoMaterno, String rut, String email,
			String fonoContacto) {
		setNombre (nombre);
		setApellidoPaterno(apellidoPaterno);
		setApellidoMaterno(apellidoMaterno);
		setRut(rut);
		setEmail(email);
		setFonoContacto(fonoContacto);
	}

	//Accesadores y mutadores (getter y setter)
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		if (nombre.length()>0)
            this.nombre = nombre;
        else
            System.out.println("Nombre debe tener al menos un caracter");
	}

	/**
	 * @return the apellidoPaterno
	 */
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	/**
	 * @param apellidoPaterno the apellidoPaterno to set
	 */
	public void setApellidoPaterno(String apellidoPaterno) {
		if (apellidoPaterno.length()>0)
            this.apellidoPaterno = apellidoPaterno;
        else
            System.out.println("Apellido Paterno debe tener al menos un caracter");
	}

	/**
	 * @return the apellidoMaterno
	 */
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	/**
	 * @param apellidoMaterno the apellidoMaterno to set
	 */
	public void setApellidoMaterno(String apellidoMaterno) {
		if (apellidoMaterno.length()>0)
            this.apellidoMaterno = apellidoMaterno;
        else
            System.out.println("Apellido Materno debe tener al menos un caracter");
		
	}

	/**
	 * @return the rut
	 */
	public String getRut() {
		return rut;
	}

	/**
	 * @param rut the rut to set
	 */
	public void setRut(String rut) {
		if (rut.length()>0)
            this.rut = rut;
        else
            System.out.println("Rut debe tener al menos un caracter");
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		if (email.length()>0)
            this.email = email;
        else
            System.out.println("Email debe tener al menos un caracter");
	}

	/**
	 * @return the fonoContacto
	 */
	public String getFonoContacto() {
		return fonoContacto;
	}

	/**
	 * @param fonoContacto the fonoContacto to set
	 */
	public void setFonoContacto(String fonoContacto) {
		if (fonoContacto.length()>0 && fonoContacto.length()<10)
            this.fonoContacto = fonoContacto;
        else
            System.out.println("FonoContacto debe tener 9 numeros ej:912345678");
	}


	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno="
				+ apellidoMaterno + ", rut=" + rut + ", email=" + email + ", fonoContacto=" + fonoContacto + "]";
	}
	 
	 
	 
	 
	 
}

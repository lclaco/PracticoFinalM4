/**
 * 
 */
package controlVehiculos;

/**
 * @author Infoseg
 *
 */
public class Vehiculo {
	/**
	 * atributos de la clase Vehiculo ppu (placa patente única), marca, modelo, año de fabricación 
	 */

	private String ppu , marca, modelo; 
	private int anioFabricacion; 
	private Cliente dueño;
		
	
	/**
	 * constructor sin parámetros de la clase Vehiculo
	 */
	public Vehiculo() {
	}

	/**
	 * constructor con parámetros de la clase Vehiculo
	 * @param ppu (placa patente única)
	 * @param marca un texto con el nombre de la marca ejem:"AUDI"
	 * @param modelo un texto con el modelo ejem:"A3"
	 * @param anioFabricacion es el año de la fabricacion del vehiculo
	 * @param dueño 
	 */
	public Vehiculo(String ppu, String marca, String modelo, int anioFabricacion, Cliente dueño) {		
		this.ppu = ppu;
		this.marca = marca;
		this.modelo = modelo;
		this.anioFabricacion = anioFabricacion;
		this.dueño = dueño;
	}

	//Accesadores y mutadores (getter y setter)	
	/**
	 * Accesador de
	 * @return the ppu
	 */
	public String getPpu() {
		return ppu;
	}

	/**
	 * mutador de
	 * @param ppu the ppu to set
	 */
	public void setPpu(String ppu) {
		this.ppu = ppu;
	}

	/**
	 * Accesador de
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * mutador de
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * mutador de
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * @return the anioFabricacion
	 */
	public int getAnioFabricacion() {
		return anioFabricacion;
	}

	/**
	 * mutador de
	 * @param anioFabricacion the anioFabricacion to set
	 */
	public void setAnioFabricacion(int anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}

	/**
	 * @return the dueño
	 */
	public Cliente getDueño() {
		return dueño;
	}

	/**
	 * mutador de
	 * @param dueño the dueño to set
	 */
	public void setDueño(Cliente dueño) {
		this.dueño = dueño;
	}
	/**
	 * Representacion en String de un objeto de la clase vehiculo
	 * @return String con la representacion de un objeto de la clase vehiculo
	 */
	@Override
	public String toString() {
		return "Vehiculo [ppu=" + ppu + ", marca=" + marca + ", modelo=" + modelo + ", anioFabricacion="
				+ anioFabricacion + ", dueño=" + dueño + "]";
	}
	
	
	
}

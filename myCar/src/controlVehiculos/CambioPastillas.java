/**
 * 
 */
package controlVehiculos;

import java.time.LocalDateTime;

/**
 * @author Infoseg
 *
 */
public class CambioPastillas extends Mantencion {

	private String tipoPastilla;
			
	/**
	 * 
	 */
	public CambioPastillas() {
		
	}
	
	/**
	 * @param tipoPastilla
	 */
	public CambioPastillas(String tipoPastilla) {		
		setTipoPastilla(tipoPastilla);
	}

	

	/**
	 * @param mantencionRealizada
	 * @param observaciones
	 * @param montoServicio
	 * @param fechaHoraActual
	 * @param auto
	 */
	public CambioPastillas(String mantencionRealizada, String observaciones, int montoServicio,
			LocalDateTime fechaHoraActual, Vehiculo auto) {
		super(mantencionRealizada, observaciones, montoServicio, fechaHoraActual, auto);
		// TODO Auto-generated constructor stub
	}

	//Accesadores y mutadores (getter y setter)
	/**
	 * @return the tipoPastilla
	 */
	public String getTipoPastilla() {
		return tipoPastilla;
	}

	/**
	 * @param tipoPastilla the tipoPastilla to set
	 */
	public void setTipoPastilla(String tipoPastilla) {
		this.tipoPastilla = tipoPastilla;
	}

	@Override
	public int obtenerTotalServicio(String tipoPastilla) {
		int precio = 0;
		if (tipoPastilla.equals("10K")) {
			return precio = 20000;}
		if	(tipoPastilla.equals("5K")) {
			return precio = 10000;}		
		return precio;
	}

	@Override
	public String toString() {
		return "CambioPastillas [tipoPastilla=" + tipoPastilla + ", mantencionRealizada=" + mantencionRealizada
				+ ", observaciones=" + observaciones + ", montoServicio=" + montoServicio + ", fechaHoraActual="
				+ fechaHoraActual + ", auto=" + auto + "]";
	}

	
	
}

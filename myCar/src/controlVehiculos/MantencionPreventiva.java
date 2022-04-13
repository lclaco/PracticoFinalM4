/**
 * 
 */
package controlVehiculos;

import java.time.LocalDateTime;

/**
 * @author Infoseg
 *
 */
public class MantencionPreventiva extends Mantencion {

	private String tipoMantencion;
	/**
	 * 
	 */
	public MantencionPreventiva() {
		// TODO Auto-generated constructor stub
	}

	
	/**
	 * @param mantencionRealizada
	 * @param observaciones
	 * @param montoServicio
	 * @param fechaHoraActual
	 * @param auto
	 */
	public MantencionPreventiva(String mantencionRealizada, String observaciones, int montoServicio,
			LocalDateTime fechaHoraActual, Vehiculo auto) {
		super(mantencionRealizada, observaciones, montoServicio, fechaHoraActual, auto);
		// TODO Auto-generated constructor stub
	}

	//Accesadores y mutadores (getter y setter)
	/**
	 * @param tipoMantencion
	 */
	public MantencionPreventiva(String tipoMantencion) {
		super();
		setTipoMantencion(tipoMantencion);
	}
	
	/**
	 * @return the tipoMantencion
	 */
	public String getTipoMantencion() {
		return tipoMantencion;
	}

	/**
	 * @param tipoMantencion the tipoMantencion to set
	 */
	public void setTipoMantencion(String tipoMantencion) {
		this.tipoMantencion = tipoMantencion;
	}

	@Override
	public int obtenerTotalServicio(String tipoMantencion) {
		int precio = 0;
		if (tipoMantencion.equals("10000K")) {
			return precio = 200000;}
		if	(tipoMantencion.equals("50000K")) {
			return precio = 250000;}		
		return precio;
	}


	@Override
	public String toString() {
		return "MantencionPreventiva [tipoMantencion=" + tipoMantencion + ", mantencionRealizada=" + mantencionRealizada
				+ ", observaciones=" + observaciones + ", montoServicio=" + montoServicio + ", fechaHoraActual="
				+ fechaHoraActual + ", auto=" + auto + "]";
	}

	
}

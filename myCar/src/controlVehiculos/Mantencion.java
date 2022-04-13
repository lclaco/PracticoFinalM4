/**
 * 
 */
package controlVehiculos;

import java.time.LocalDateTime;

/**
 * @author Infoseg
 *
 */
public abstract class Mantencion {
	
	/*
	 * Mantención: mantención realizada (por ejemplo, cambio de aceite),
	 * observaciones y monto del servicio (en pesos) Fecha: día, mes y año
	 */

	
	
	
	protected String mantencionRealizada, observaciones;
	protected int montoServicio;
	protected LocalDateTime fechaHoraActual = LocalDateTime.now();
	protected Vehiculo auto;
	
	/**
	 * 
	 */
	public Mantencion() {
	}

		

	/**
	 * @param mantencionRealizada
	 * @param observaciones
	 * @param montoServicio
	 * @param fechaHoraActual
	 * @param auto
	 */
	public Mantencion(String mantencionRealizada, String observaciones, int montoServicio,
			LocalDateTime fechaHoraActual, Vehiculo auto) {
		
		this.mantencionRealizada = mantencionRealizada;
		this.observaciones = observaciones;
		this.montoServicio = montoServicio;
		this.fechaHoraActual = fechaHoraActual;
		this.auto = auto;
	}

	//Accesadores y mutadores (getter y setter)
	
	/**
	 * @return the mantencionRealizada
	 */
	public String getMantencionRealizada() {
		return mantencionRealizada;
	}

	/**
	 * @param mantencionRealizada the mantencionRealizada to set
	 */
	public void setMantencionRealizada(String mantencionRealizada) {
		this.mantencionRealizada = mantencionRealizada;
	}

	/**
	 * @return the observaciones
	 */
	public String getObservaciones() {
		return observaciones;
	}

	/**
	 * @param observaciones the observaciones to set
	 */
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	/**
	 * @return the montoServicio
	 */
	public int getMontoServicio() {
		return montoServicio;
	}

	/**
	 * @param montoServicio the montoServicio to set
	 */
	public void setMontoServicio(int montoServicio) {
		this.montoServicio = montoServicio;
	}
	/**
	 * @return the fechaHoraActual
	 */
	public LocalDateTime getFechaHoraActual() {
		return fechaHoraActual;
	}

	/**
	 * @param fechaHoraActual the fechaHoraActual to set
	 */
	public void setFechaHoraActual(LocalDateTime fechaHoraActual) {
		this.fechaHoraActual = fechaHoraActual;
	}
	
	

	/**
	 * @return the auto
	 */
	public Vehiculo getAuto() {
		return auto;
	}

	/**
	 * @param auto the auto to set
	 */
	public void setAuto(Vehiculo auto) {
		this.auto = auto;
	}

	@Override
	public String toString() {
		return "Mantencion [mantencionRealizada=" + mantencionRealizada + ", observaciones=" + observaciones
				+ ", montoServicio=" + montoServicio + ", fechaHoraActual=" + fechaHoraActual + ", auto=" + auto + "]";
	}
	
	/**
	 * retorna el valor por el tipo de servicio
	 */
	public abstract int obtenerTotalServicio(String tipoServicio);
}

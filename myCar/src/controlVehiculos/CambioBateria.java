package controlVehiculos;

import java.time.LocalDateTime;

public class CambioBateria extends Mantencion {

	private String tipoBateria;
	

	/**
	 * 
	 */
	public CambioBateria() {
		
	}
	
	
	/**
	 * @param mantencionRealizada
	 * @param observaciones
	 * @param montoServicio
	 * @param fechaHoraActual
	 * @param auto
	 */
	public CambioBateria(String mantencionRealizada, String observaciones, int montoServicio,
			LocalDateTime fechaHoraActual, Vehiculo auto) {
		super(mantencionRealizada, observaciones, montoServicio, fechaHoraActual, auto);
		// TODO Auto-generated constructor stub
	}




	/**
	 * @param tipoBateria
	 */
	public CambioBateria(String tipoBateria) {
		setTipoBateria(tipoBateria);
	}

	//Accesadores y mutadores (getter y setter)
	/**
	 * @return the tipoBateria
	 */
	public String getTipoBateria() {
		return tipoBateria;
	}

	/**
	 * @param tipoBateria the tipoBateria to set
	 */
	public void setTipoBateria(String tipoBateria) {
		this.tipoBateria = tipoBateria;
	}

	@Override
	public int obtenerTotalServicio(String tipoBateria) {
		int precio = 0;
		if (tipoBateria.equals("50 Ah")) {
			return precio = 40000;}
		if	(tipoBateria.equals("100 Ah")) {
			return precio = 80000;}		
		return precio;
	}


	@Override
	public String toString() {
		return "CambioBateria [tipoBateria=" + tipoBateria + ", mantencionRealizada=" + mantencionRealizada
				+ ", observaciones=" + observaciones + ", montoServicio=" + montoServicio + ", fechaHoraActual="
				+ fechaHoraActual + ", auto=" + auto + "]";
	}

	

	
}

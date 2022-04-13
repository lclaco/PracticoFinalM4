/**
 * 
 */
package controlVehiculos;

import java.time.LocalDateTime;

/**
 * @author Infoseg
 *
 */
public class CambioAceite extends Mantencion {
	
	private String tipoAceite;
	
	/**
	 * 
	 */
	public CambioAceite() {
		
	}
		
	/**
	 * @param tipoAceite
	 */
	public CambioAceite(String tipoAceite) {		
		setTipoAceite(tipoAceite);
	}
	
	
	
	
	/**
	 * @param mantencionRealizada
	 * @param observaciones
	 * @param montoServicio
	 * @param fechaHoraActual
	 * @param auto
	 */
	public CambioAceite(String mantencionRealizada, String observaciones, int montoServicio,
			LocalDateTime fechaHoraActual, Vehiculo auto) {
		super(mantencionRealizada, observaciones, montoServicio, fechaHoraActual, auto);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int obtenerTotalServicio(String tipoAceite) {
		int precio = 0;
		if (tipoAceite.equals("10K")) {
			return precio = 20000;}
		if	(tipoAceite.equals("5K")) {
			return precio = 10000;}		
		return precio;
	}

	//Accesadores y mutadores (getter y setter)
	/**
	 * @return the tipoAceite
	 */
	public String getTipoAceite() {
		return tipoAceite;
	}

	/**
	 * @param tipoAceite the tipoAceite to set
	 */
	public void setTipoAceite(String tipoAceite) {
		if (tipoAceite.length()>0)
            this.tipoAceite = tipoAceite;
        else
            System.out.println("Tipo de Aceite debe tener al menos un caracter");
	}

	@Override
	public String toString() {
		return "CambioAceite [tipoAceite=" + tipoAceite + ", mantencionRealizada=" + mantencionRealizada
				+ ", observaciones=" + observaciones + ", montoServicio=" + montoServicio + ", fechaHoraActual="
				+ fechaHoraActual + ", auto=" + auto + "]";
	}

	

	
	
}

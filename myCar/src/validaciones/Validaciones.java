package validaciones;

import java.time.LocalDate;

public class Validaciones {

	
	public static boolean emailValido(String email) {
		String emailLimpio = email.strip();
		
		String regexEmail1 = "[a-zA-Z0-9_.]+@[a-zA-Z0-9_.]+\\.(cl|com)$";
		String regexEmail2 = "";
		if( emailLimpio.length() == 9 && emailLimpio.matches("[0-9]{9}")) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void fechaValida() {
		int anno = 2022;
		int mes = 2;
		int dia = 29;
		
		
		
		try {
			LocalDate.of(anno, mes, dia);
			//procesamie
		} catch (Exception e) {
			System.out.println("Fecha invalida.....");
		}
	}
	
	
	public static boolean telefonoValido(String telefono) {
		String telefonoLimpio = telefono.strip().replace(" ", "");
		if( telefonoLimpio.length() == 9 && telefonoLimpio.matches("[0-9]{9}")) {
			return true;
		} else {
			return false;
		}
	}

}
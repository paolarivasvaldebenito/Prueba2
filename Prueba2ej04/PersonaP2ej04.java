package Prueba2ej04;

public class PersonaP2ej04 {

	public static void main(String[] args) {
				
		//String rut, String nombres, String apellidos, String direccion, int telefono, Double sueldo,String municipalidad, String departamento
		
		EpublicoP2ej04 EPU = new EpublicoP2ej04("152423566", "Fernando", "Mellado Salinas", "Los Laureles 45", 780000,527000.9,"de los alamos","Administrativo");
		
		System.out.println("rut: "+EPU.getRut());
		
		System.out.println("nombre: "+EPU.getNombres());
		
		System.out.println("apellidos: "+EPU.getApellidos());
		
		System.out.println("direccion: "+EPU.getDireccion());
		
		System.out.println("telefono: "+EPU.getTelefono());
		
		
		
		
				
		EPU.setMunicipalidad("de los alamos");
		System.out.println("Municipalidad "+EPU.getMunicipalidad());
		
		EPU.setDepartamento("administrativo");
		System.out.println("Departamento: "+EPU.getDepartamento());
		
		
		
		System.out.println("******************************");
		
		
		//String rut, String nombres, String apellidos, String direccion, int telefono, Double sueldo, String comuna, String empresa
		
		
		EprivadoP2ej04 EPRI = new EprivadoP2ej04("123456787","Francisco", "Risopatron de Lourdes", "Juan Bosco 1786",54545545,44333.0, "Las Condes", "gerencia");
		
		System.out.println("rut: "+EPRI.getRut());
		
		System.out.println("nombre: "+EPRI.getNombres());
		
		System.out.println("apellido: "+EPRI.getApellidos());
		
		System.out.println("direccion: "+EPRI.getDireccion());
		
		System.out.println("telefono: "+EPRI.getTelefono());
		
		
		
		EPRI.setComuna("las Condes");
		System.out.println("Comuna: "+EPRI.getMunicipalidad());
		
		EPRI.setEmpresa("gerencia");
		System.out.println("Empresa: "+EPRI.getDepartamento());
		

	}

}

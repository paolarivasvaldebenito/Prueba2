package Prueba2ej04;

public class EprivadoP2ej04 extends EmpleadoP2ej04{
	
	private String comuna;
	private String empresa;
	
	
	public EprivadoP2ej04(String rut, String nombres, String apellidos, String direccion, int telefono, Double sueldo, String comuna, String empresa) {
		super();
		this.comuna = comuna;
		this.empresa = empresa;
	}


	public String getComuna() {
		return comuna;
	}


	public void setComuna(String comuna) {
		this.comuna = comuna;
	}


	public String getEmpresa() {
		return empresa;
	}


	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}



	public String getMunicipalidad() {
		// TODO Auto-generated method stub
		return null;
	}


	public String getDepartamento() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	


}

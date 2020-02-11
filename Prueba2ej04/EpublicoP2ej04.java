package Prueba2ej04;

public class EpublicoP2ej04 extends EmpleadoP2ej04{
	
	private String municipalidad;
	private String departamento;
	
	
	public EpublicoP2ej04(String rut, String nombres, String apellidos, String direccion, int telefono, Double sueldo,String municipalidad, String departamento) {
		super(rut,nombres, apellidos, direccion,telefono,sueldo);
		this.municipalidad = municipalidad;
		this.departamento = departamento;
	}


	public String getMunicipalidad() {
		return municipalidad;
	}


	public void setMunicipalidad(String municipalidad) {
		this.municipalidad = municipalidad;
	}


	public String getDepartamento() {
		return departamento;
	}


	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}


	@Override
	public String toString() {
		return "Epublico [municipalidad=" + municipalidad + ", departamento=" + departamento + "]";
	}
	
	
	
	
	
	

	

}

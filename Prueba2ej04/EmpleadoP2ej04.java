package Prueba2ej04;

public class EmpleadoP2ej04 {

	private String rut;
	private String nombres;
	private String apellidos;
	private String direccion;
	private int telefono;
	private Double sueldo;
	
	
	public EmpleadoP2ej04() {
		super();
	}


	public EmpleadoP2ej04(String rut, String nombres, String apellidos, String direccion, int telefono, Double sueldo) {
		super();
		this.rut = rut;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.telefono = telefono;
		this.sueldo = sueldo;
	}


	public String getRut() {
		return rut;
	}


	public void setRut(String rut) {
		this.rut = rut;
	}


	public String getNombres() {
		return nombres;
	}


	public void setNombres(String nombres) {
		this.nombres = nombres;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public int getTelefono() {
		return telefono;
	}


	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}


	public Double getSueldo() {
		return sueldo;
	}


	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}


	@Override
	public String toString() {
		return "Empleado [rut=" + rut + ", nombres=" + nombres + ", apellidos=" + apellidos + ", direccion=" + direccion
				+ ", telefono=" + telefono + ", sueldo=" + sueldo + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}

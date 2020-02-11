package Prueba2ej02;

public class EmpleadoP2ej02 {

	private String numeroDeRut;
	private String Nombre;
	private String Apellidop;  
	private String apellidom;
	private String cargo;
	private String direccion;
	private int fono;
	private String email;
	
	
	public EmpleadoP2ej02() {
		super();
	}

	
	public EmpleadoP2ej02(String numeroDeRut, String nombre, String apellidop, String apellidom, String cargo) {
		super();
		this.numeroDeRut = numeroDeRut;
		Nombre = nombre;
		Apellidop = apellidop;
		this.apellidom = apellidom;
		this.cargo = cargo;
		
	}
	
	public EmpleadoP2ej02(String numeroDeRut, String apellidop, String apellidom, String direccion, int fono, String email) {
		super();
		this.numeroDeRut = numeroDeRut;
		Apellidop = apellidop;
		this.apellidom = apellidom;
		this.direccion = direccion;
		this.fono = fono;
		this.email = email;
	}


	public String getNumeroDeRut() {
		return numeroDeRut;
	}


	public void setNumeroDeRut(String numeroDeRut) {
		this.numeroDeRut = numeroDeRut;
	}


	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	public String getApellidop() {
		return Apellidop;
	}


	public void setApellidop(String apellidop) {
		Apellidop = apellidop;
	}


	public String getApellidom() {
		return apellidom;
	}


	public void setApellidom(String apellidom) {
		this.apellidom = apellidom;
	}


	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public int getFono() {
		return fono;
	}


	public void setFono(int fono) {
		this.fono = fono;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
	
	
	
	
	
	

}

package Prueba2ej03;

public class AutomovilP2ej03 {

	private String marca;
	private String modelo;
	private int a�o;
	private double precio;
	
	public AutomovilP2ej03() {
		super();
	}

	
	public AutomovilP2ej03(String marca, String modelo, int a�o, Double precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.a�o = a�o;
		this.precio = precio;
	}

    public void preciofinal() {
    	if (this.precio!=0) {
    		
    		int preciofinal= (int)((precio+ (precio*0.19)+(precio*0.05)+100000));
    		//preciofinal= (precio+ (precio*0.19)+(precio*0.05)+100000);
    		
    		System.out.println("El valor final es: "+preciofinal);
			
		} else 

			System.out.println ("No ha ingresado un precio");
			
    	
    	}
    
    public Double getPrecio() {
		return precio;
	}


	public void setPrecio(Double precio) {
		this.precio = precio;
	}   
	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public int getA�o() {
		return a�o;
	}


	public void setA�o(int a�o) {
		this.a�o = a�o;
	}


}

package Prueba2ej03;


public class PrincipalP2ej03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AutomovilP2ej03 A1= new AutomovilP2ej03("Subaru", "XV", 2020, 12000000.99);
		
		
		System.out.println("El automovil de marca: "+A1.getMarca()+"\n"+"modelo: "+A1.getModelo()+"\n"+ "año: "+A1.getAño()+ 
				"\n"+"Tiene un valor de:"+A1.getPrecio());
		
		System.out.println("********************************************************");
		
		
		A1.preciofinal();
		
		}

}

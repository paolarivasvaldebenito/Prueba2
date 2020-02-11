package Prueba2ej02;

public class PrincipalP2ej02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

	EmpleadoP2ej02 E1= new EmpleadoP2ej02("8.183.404-0", "Pedro","Novoa","Smith","jefe de obra");
	EmpleadoP2ej02 E2= new EmpleadoP2ej02("8.183.404-0", "Novoa", "Smith","Los acacios 940", 412953720, "pnovoasmith@gmail.com");
	
	
	
	System.out.println("Don"+E1.getNombre()+""+E1.getApellidop()+""+E1.getApellidom()+ "\n"+"Numero de rut:"+E1.getNumeroDeRut()+
			"\n"+"Tiene el cargo de:"+E1.getCargo());
	
	System.out.println("********************************************************");
	System.out.println("Sr."+E2.getApellidop()+"" + E2.getApellidom()+"\n"+"Numero de rut: "+E2.getNumeroDeRut()+"\n"+"Vive en: "+E2.getDireccion()+
			"\n"+"fono: "+E2.getFono()+ "\n"+"email: "+E2.getEmail() );
			
}
}
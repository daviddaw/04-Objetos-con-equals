package articulo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String color,nombre;
		double precio;
		System.out.println("Dame el color");
		color=in.next();
		System.out.println("Dame el nombre");
		nombre=in.next();
		System.out.println("Dame el precio");
		precio=in.nextInt();
		
		
		Articulo arti1 = new Articulo(nombre,color,precio), arti2 = new Articulo(),arti3 = new Articulo(nombre,color);	
		
		System.out.println("");
		
		System.out.println("ARTICULO 2 \n Damos valores necesarios ");
		arti2.setNombre("Regadera");
		arti2.setColor("Naranaja");
		arti2.setPrecio(4);
		
		
		System.out.println("ARTICULO 3 \n Damos asignamos precio ");
		System.out.println("Introduce el precio manual del articulo 3");
		precio=in.nextInt();
		arti3.setPrecio(precio);
		
		
		
		
		System.out.println("ARTICULO 1 \n Cambiamos nombre y color ");
		System.out.println("------------------------------------------------");
		System.out.println("Visualizar datos");
		System.out.println(arti1.toString());
		System.out.println(arti2.toString());
		System.out.println(arti3.toString());
		System.out.println("------------------------------------------------");
		
		System.out.println("Incrementar precio articulo 2");
		System.out.println("Cuanto lo quieres incrementar?");
		precio=in.nextDouble();
		arti2.incrementarPrecio(precio);
		
		
		
		System.out.println("Rebajar precio del articulo 1");
	    arti1.rebajarPrecio();
		
	    
		System.out.println("------------------------------------------------");
		System.out.println("Visualizar datos");
		System.out.println(arti1.toString());
		System.out.println(arti2.toString());
		System.out.println(arti3.toString());
		System.out.println("------------------------------------------------");
		

		
		
		
		
	}

	@Override
	public String toString() {
		return "Principal [toString()=" + super.toString() + "]";
	}

}

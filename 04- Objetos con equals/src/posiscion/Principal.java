package posiscion;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int x,y;
		
		System.out.println("Dame la cordenada de x");
		x=in.nextInt();
		System.out.println("Dame la cordenada de y");
		y=in.nextInt();
		
		Posicion p1=new Posicion(),p2 =new Posicion(x,y);
		      
		System.out.println(p2.getXY());
		System.out.println(p1.getXY());
		System.out.println(p2.opuestoXY().getX()+" "+p2.opuestoXY().getY());
		
		p2.inc(5, 5);
		System.out.println(p2.getXY());
		//calculo recta
	//Damos valores a p1
		System.out.println("Vamos a ingresar una nueva cordenada para calcular la recta");
		
		System.out.println("Dame la cordenada de x");
		x=in.nextInt();
		System.out.println("Dame la cordenada de y");
		y=in.nextInt();
		p1.setXY(x, y);
		
		System.out.println(p2.getXY());
		System.out.println(p1.getXY());
		
		
		
		p2.recta(p1);
		
	

	}

}

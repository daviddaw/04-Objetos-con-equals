package triangulo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner in =new Scanner(System.in),entrada=new Scanner(System.in);
		int lado1,lado2;
		System.out.println("introduce el lado del primer triangulo");
		lado1=in.nextInt();
		System.out.println("introduce el lado del segundo triangulo");
		lado2=entrada.nextInt();
		//Creamos dos triangulos.
		TrianguloEquilatero t1=new TrianguloEquilatero(lado1),t2=new TrianguloEquilatero(lado2);
		System.out.println(
				" Lado del primer triangulo "+t1.gettLado()+" base del primer triangulo "+t1.gettLado()+" Area del primer triangulo "+t1.gettArea()+" Perimetro del primer triangulo "+t1.gettPerimetro()+
				"\n \n Lado del primer triangulo "+t2.gettLado()+" base del primer triangulo "+t2.gettLado()+" Area del primer triangulo "+t2.gettArea()+" Perimetro del primer triangulo "+t2.gettPerimetro());
       
		t2.settLado(4);
		System.out.println(" Lado del primer triangulo "+t2.gettLado()+" base del primer triangulo "+t2.gettLado()+" Area del primer triangulo "+t2.gettArea()+" Perimetro del primer triangulo "+t2.gettPerimetro());

		entrada.close(); in.close();
	}

}

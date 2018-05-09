package biblio;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		Autor aut1,aut2;
		String nombre;
		String nacion;
		int anionaci;
		int aniomue;
		//AUTOR 1
		System.out.println("Introduce un nombre");
		nombre=in.next();
		System.out.println("Introduce una nacionalidad");
		nacion=in.next();
		System.out.println("	Introduce año de nacimiento");
		anionaci=in.nextInt();
		aut1 = new Autor(nombre, nacion, anionaci);
		// AUTOR 2 (muerto)
		System.out.println("Introduce un nombre");
		nombre=in.next();
		System.out.println("Introduce una nacionalidad");
		nacion=in.next();
		System.out.println("Introduce año de nacimiento");
		anionaci=in.nextInt();
		System.out.println("Introduce año de defuncion");
		aniomue=in.nextInt();
		aut2 = new Autor(nombre, nacion, anionaci);
		aut2.fallecer(aniomue);

		String isbn,titulo;
		Libro lib1,lib2;
		//LIBRO 1
		System.out.println("[Libro]Introduce un ISBN");
		isbn=in.next();
		System.out.println("[Libro]Introduce un titulo");
		titulo=in.next();
		lib1=new Libro(isbn, titulo, aut1);
		//LIBRO 2
		System.out.println("[Libro]Introduce un ISBN");
		isbn=in.next();
		System.out.println("[Libro]Introduce un titulo");
		titulo=in.next();
		lib2=new Libro(isbn, titulo, aut2);
		//MUESTRA VALORES
		System.out.println(lib1.toString());
		System.out.println(lib2.toString());
		lib1.setPrestado(true);
		lib1.prestarLibro();
		lib1.setPrestado(false);
		lib1.devolverLibro();
	}
}

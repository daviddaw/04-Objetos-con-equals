package articulo;

public class Articulo {
private static int c;	
private int codigo;
private String nombre;
private String color;
private double precio;

public Articulo(String nombre,String color,double precio) {
	c++;
	codigo=c;
	this.nombre=nombre;
	this.color=color;
	this.precio=precio;
}

public Articulo() {
	c++;
	codigo=c;
	
}
public Articulo (String nombre,String color) {
	c++;
	codigo=c;
	this.nombre=nombre;
	this.color=color;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public double getPrecio() {
	return precio;
}

public void setPrecio(double precio) {
	this.precio = precio;
}
public void incrementarPrecio(double precio) {
	this.precio = this.precio+precio;
}

public void rebajarPrecio() {
	this.precio = this.precio*(0.9);
}

@Override
public String toString() {
	return "Articulo [codigo=" + codigo + ", nombre=" + nombre + ", color=" + color + ", precio=" + precio + "]";
}


}

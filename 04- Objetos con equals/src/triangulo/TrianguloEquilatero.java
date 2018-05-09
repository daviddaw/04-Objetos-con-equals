package triangulo;

public class TrianguloEquilatero {
	//los atributos privados y se ponen dentro de la clase
	private int lado;
	
	
	public TrianguloEquilatero() {//los constructores se ponen dentro de la clase
		                            //se pone el _________ y el nombre com parentesis
	}


	public TrianguloEquilatero(int lado) {
		this.lado=lado;
	}
	
	public void settLado(int lado) {	//set recibimos un lado 	
		this.lado=lado;  //y lo establecemos como nuestro lado,configuramos,guardamos cambios
						//pero nadie pide que lo devolvamos(para eso esta el get)
		
	}
	
	public int gettLado() {//get no recibimos nada 
		 return lado;     //solo pedimos el lado
	}
   
	public double gettAlttura() {
		double altura,operacion;
		//c2+c2=h2  c=sqrt(h^2-(c/2)^2)	
		operacion=Math.pow(lado, 2)-Math.pow(lado/2, 2);
		altura=Math.sqrt(operacion);
		
		return altura;
	}
	
	public double gettArea() {
		return (lado*gettAlttura())/2;
		
	}
	public int gettPerimetro() {
		return lado*3;
	}


	/*@Override
	public String toString() {
		return "TrianguloEquilatero [lado=" + lado + ", gettAlttura()=" + gettAlttura() + ", gettArea()=" + gettArea()
				+ ", gettPerimetro()=" + gettPerimetro() + "]";
	}*/
	
	@Override 
	public String toString() {
		return "Estadisticas del triangulo:  Lado="+lado+" | Altura="+gettAlttura()+" | Area="+gettArea()
		+" | perimetro="+gettPerimetro();
		
	}
	


}


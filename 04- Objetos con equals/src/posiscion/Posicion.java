package posiscion;
import org.omg.Messaging.SyncScopeHelper;

public class Posicion {
	private int x;
	private int y;
	
	public Posicion() {
		x=0;
		y=0;
	}
	
	public Posicion(int x,int y) {
		this.x=x;
		this.y=y;
	}
	
	public Posicion (Posicion copia) {
		this.x=copia.x;
		this.y=copia.y;
	}
	
	public void setXY(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
   public int getX() {
	   return x;
   }
   
   public int getY() {
	   return y;
   }
   
   public String getXY() {
	return "	("+x+","+y+")";
	   
   }
   
   public void decXY(int x,int y) {
	   this.x=this.x-x;
	   this.y=this.y-y;
   }

   
   
   public void inc(int x,int y) {
	   this.x=this.x+x;
	   this.y=this.y+y;
   }
   
   public void recta(Posicion posicion) {	  		  
	   /* ecuacion de la recta
	    * y-y1 = m(x-x1) 
        * Siendo m la pendiente de la recta que se calcula con la siguiente fórmula:
        * m = (y2-y1) / (x2-x1)*/
	   int m;
	   m=(posicion.y-this.y)/(posicion.x-this.x);
	   System.out.println("La pendiente vale "+m);
	   int resultado,resultado2;
	     resultado= m*(this.x-posicion.x);
	     resultado2=this.y-posicion.y;
	     System.out.println(resultado+","+resultado2);
	     
	   

   }
   
   public Posicion opuestoXY() {
	   Posicion posicion;
	   posicion=new Posicion(this.x,this.y);
	   posicion.x=posicion.x*(-1);
	   posicion.y=posicion.y*(-1);
	return posicion;   
   }
   
   
	
}

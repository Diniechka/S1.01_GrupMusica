package grupmusica;
/**
 * 
 * @author dinag
 * Al ser una clase abstracta no permitirá crear una instancia de instrumento. 
 * Por esra razón: la instanciación de cada hija, dará nacimiento al instrumento por cada tipo.
 */
public abstract class Instrumento {
	//este bloque de inicialición estático permite arrancar el concierto
	//La carga puede de la clase Instrumento es provocada por la creación de la primera instancia de esta clase 
	static {
		System.out.println("¡Inicio del concierto!\n ");
	}
	 
	String nombre;
	 double precio;
	
	//constructor- las subclases hijas requerirán de este constructor
	public Instrumento(String nombre, double precio){
		this.nombre = nombre;
		this.precio = precio;
			
	}
	//getters & setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	//methods
	public abstract void tocar();

	//toString
	public String toString() {
		return "Este es un instrumento de nombre: " + nombre + " y precio: " + precio + "€. ";
	}
	
	
	
}

package grupmusica;

public class Cuerda extends Instrumento {
	
	public Cuerda(String nombre, double precio) {
		super(nombre, precio);
	}

	@Override
	public void tocar() {
		System.out.println("Esta sonando un instrumento de cuerda.");
		
	}
	public String toString() {
		return "El nombre de este instrumento es " + super.getNombre() + " y su precio es de: " 
				+ super.getPrecio() + "€.  ";
	}
	
}

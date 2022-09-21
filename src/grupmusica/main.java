package grupmusica;

public class main {
	{
		System.out.println("Inicio de la creación de primera instancia");
	}

	public static void main(String[] args) {

		//iniciamos tres instrumentos. Uno de cada tipo. 
		Viento saxofon	= new Viento("saxofon", 85);
		saxofon.tocar();
		System.out.println(saxofon.toString());	
		
		Cuerda charango = new Cuerda("charango", 150);
		charango.tocar();
		System.out.println(charango.toString());
		
		Percusion bongo = new Percusion("bongo", 50);
		bongo.tocar();
		System.out.println(bongo.toString());
		}
	

}

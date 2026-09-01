package ar.edu.unju.escmi.tp3.ejercicio2;

public class GatoSimple {
	private String color;
	private String pelaje;
	private float peso;
	private int edad; 
	private String nombre;
	private String sexo;
	private String personalidad;
	
	public GatoSimple(String color, String pelaje, float peso, int edad, String nombre, String sexo, String personalidad) {
		
		this.color = color;
		this.pelaje = pelaje;
		this.peso = peso;
		this.edad = edad;
		this.nombre = nombre;
		this.sexo = sexo;
		this.personalidad = personalidad;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPelaje() {
		return pelaje;
	}

	public void setPelaje(String pelaje) {
		this.pelaje = pelaje;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getPersonalidad() {
		return personalidad;
	}

	public void setPersonalidad(String personalidad) {
		this.personalidad = personalidad;
	}
	
	public String maullar() {
			return "Miauu";
	}
	
	public String ronronear () {
			return "prrrr";
	}
	
	public void darComida (String comida) {
		if(comida.equals("pescado")) 
			System.out.println("Que rico, ¡Gracias!");
		else
			System.out.println("Lo siento, yo solo como pescado");
	}
	
	public void pelear (GatoSimple gatoContrincante) {
		if(this.sexo.equals("macho")) {
			if(gatoContrincante.sexo.equals("hembra")){
				System.out.print("no peleo contra gatitas\n");
			} else if (gatoContrincante.sexo.equals("macho")){
				System.out.print("¡Ven aquí que te vas a enterar!\n");
			}
		}
		else if (this.sexo.equals("hembra")){
			System.out.print("No me gusta pelear\n");
		}
	}

	@Override
	public String toString() {
		return "GatoSimple [color=" + color + ", pelaje=" + pelaje + ", peso=" + peso + ", edad=" + edad + ", nombre="
				+ nombre + ", sexo=" + sexo + ", personalidad=" + personalidad + "]";
	}
	
	
	
}


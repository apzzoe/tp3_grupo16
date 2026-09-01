package ar.edu.unju.escmi.tp3.ejercicio3;

public class Empleado {
	private String nombre;
	private int legajo;
	private double salario;
	
	private static final double MIN_SALARIO =  600000.00;
	private static final double AUMENTO_SALARIO = 90000.00;
	
	public Empleado(String nombre, int legajo, double salario) {
		this.nombre = nombre;
		this.legajo = legajo;
		if (salario >= MIN_SALARIO) {
		    this.salario = salario;
		} else {
		    this.salario = MIN_SALARIO;
		}}
		
		public void aumentarSalario() {
			salario = salario + AUMENTO_SALARIO;
		}
		
		public void mostrarDatos() {
		System.out.println("Nombre del empleado: " +nombre);
		System.out.println("Legajo: "  +legajo); 
		System.out.println("Salario $: " +salario);
		}
		
		public int getLegajo() { 
			return legajo;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public double getSalario() {
			return salario;
		}

		public void setSalario(double salario) {
			this.salario = salario;
		}

		public void setLegajo(int legajo) {
			this.legajo = legajo;
		}
		
		
	}
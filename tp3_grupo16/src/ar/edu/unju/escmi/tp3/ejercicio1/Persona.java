package ar.edu.unju.escmi.tp3.ejercicio1;

import java.time.LocalDate;
import java.time.Period;

public class Persona{
	private int dni;
	private String nombre;
	private LocalDate fechaN;
	private String domicilio;
	private String provincia;
	public Persona(){ }

public Persona(int dni, String nombre, LocalDate fechaN, String domicilio, String provincia){
		this.dni=dni;
		this.nombre=nombre;
		this.fechaN=fechaN;
		this.domicilio=domicilio;
		this.provincia=provincia;
}

public Persona(int dni, String nombre, LocalDate fechaN){ 
this.dni = dni;
this.nombre = nombre;
this.fechaN = fechaN;
this.provincia = "Jujuy";
}

//DNI
public int getDni(){
	return dni;
}

public void setDni(int dni){
	this.dni=dni;
}
//NOMBRE
public String getNombre(){
	return nombre;
}

public void setNombre(String nombre){
	this.nombre=nombre;
}

//FECHA DE NACIMIENTO

public LocalDate getFechaN(){
	return fechaN;
}

public void setFechaN(LocalDate fechaN){
	this.fechaN=fechaN;
}

//DOMICILIO
public String getDomicilio(){
	return domicilio;
}

public void setDomicilio(String domicilio){
	this.domicilio=domicilio;
}
//PROVINCIA
public String getProvincia(){
	return provincia;
}

public void setProvincia(String provincia){
	this.provincia=provincia;
}

public int calcularEdad(){
	LocalDate hoy=LocalDate.now();
	Period anios=Period.between(fechaN,hoy);
	return anios.getYears();
}

public boolean mayorEdad(){
int e=calcularEdad();
if(e<18){
	return false;
}else{
	return true;
}
}

public void mostrarD(){
	System.out.println("DNI: " + dni);
	System.out.println("Nombre: " + nombre);
	System.out.println("Fecha de nacimiento: " + fechaN);
	System.out.println("Domicilio: " + domicilio);
	System.out.println("Provincia: " + provincia);
	System.out.println("Edad: " + calcularEdad());
if(mayorEdad()==true){
	System.out.println("La persona es mayor de edad");
}else{
	System.out.println("La persona no es mayor de edad"); }
}
}

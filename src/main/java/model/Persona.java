package model;

import java.time.LocalDate;
import java.util.Comparator;

public class Persona implements Comparable<Persona>{
    public static final Comparator<Persona> SORT_BY_AGE= new Comparator<>() {
        @Override
        public int compare(Persona o1, Persona o2) {
            return o1.getFechaNacimiento().compareTo(o2.getFechaNacimiento());
        }
    };
    private String DNI;
    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;

    public Persona(String DNI, String nombre, String apellidos, LocalDate fechaNacimiento) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDNI() {
        return DNI;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public void printDNI(){
        System.out.println("Desde model.Persona imprimo el DNI: " + DNI);
    }

    @Override
    public String toString(){
        return "DNI: " + DNI + " nombre completo: " + nombre + " "+ apellidos + " edad: "+ fechaNacimiento;
    }

    @Override
    public boolean equals(Object obj){
        if(obj==null) return false;
        if(!(obj instanceof Persona)) return false;
        Persona persona = (Persona) obj;
        return this.DNI.equals(persona.getDNI()) &&
            this.nombre.equals(persona.getNombre()) &&
                this.apellidos.equals(persona.getApellidos());
    }

    @Override
    public int hashCode(){
        return nombre.hashCode()+apellidos.hashCode();
    }

    @Override
    public int compareTo(Persona persona){
        if(apellidos.equals(persona.getApellidos()))
            return nombre.compareTo(persona.getNombre());
        return apellidos.compareTo(persona.getApellidos());
    }

}

package ejercicio1;

import java.time.LocalDate;

public class Trabajador implements Comparable<Trabajador>{
    private String DNI;
    private String nombre;
    private String apellido;
    private LocalDate fechaNac;

    public Trabajador(String DNI, String nombre, String apellido, LocalDate fechaNac) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
    }

    public String getDNI() {
        return DNI;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public LocalDate getFechaNac() {
        return fechaNac;
    }

    @Override
    public String toString(){
        return "Empleado: " + nombre+" "+apellido+ " DNI: "+DNI+" día nacimiento: "+fechaNac;
    }

    @Override
    public int compareTo(Trabajador trabajador){
        if(apellido.equals(trabajador.getApellido()))
            return nombre.compareTo(trabajador.getNombre());
        return apellido.compareTo(trabajador.getApellido());
    }

    @Override
    public int hashCode(){
        return DNI.hashCode()+nombre.hashCode()+apellido.hashCode();
    }

    @Override
    public boolean equals(Object o){
        if(o==null || !(o instanceof Trabajador))
            return false;
        Trabajador trabajador=(Trabajador) o;
        return (DNI.equals(trabajador.getDNI()) && nombre.equals(trabajador.getNombre())&&
                apellido.equals(trabajador.getApellido()));
    }

}

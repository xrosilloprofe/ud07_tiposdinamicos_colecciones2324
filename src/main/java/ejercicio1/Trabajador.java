package ejercicio1;

import java.time.LocalDate;
import java.util.Comparator;

public class Trabajador implements Comparable<Trabajador>{

    public static final Comparator<Trabajador> SORT_BY_AGE = new Comparator<Trabajador>() {
        @Override
        public int compare(Trabajador o1, Trabajador o2) {
            return o1.getFechaNac().compareTo(o2.getFechaNac());
        }
    };
    public static final Comparator<Trabajador> SORT_BY_AGE1 =
            (o1, o2) -> o1.getFechaNac().compareTo(o2.getFechaNac());
    public static final Comparator<Trabajador> SORT_BY_AGE2 =
            Comparator.comparing(Trabajador::getFechaNac);

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

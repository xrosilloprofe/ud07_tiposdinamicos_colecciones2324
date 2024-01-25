public class Persona {
    private String DNI;
    private String nombre;
    private String apellidos;
    private int edad;

    public Persona(String DNI, String nombre, String apellidos, int edad) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
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
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    protected void cumplirAnyos(){ this.edad++;}
    public void printDNI(){
        System.out.println("Desde Persona imprimo el DNI: " + DNI);
    }

    @Override
    public String toString(){
        return "DNI: " + DNI + " nombre completo: " + nombre + " "+ apellidos + " edad: "+edad;
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

}

package sets.exercise;

public class Bola implements Comparable<Bola>{
    private int numero;
    public Bola(int numero){
        this.numero = numero;
    }
    public int getNumero(){return numero;}

    @Override
    public String toString(){ return String.valueOf(numero);}

    @Override
    public int hashCode(){return numero;}

    @Override
    public boolean equals(Object object){
        if(object==null || !(object instanceof Bola))
            return false;
        Bola bola = (Bola) object;
        return bola.getNumero()==numero;
    }

    @Override
    public int compareTo(Bola bola){
        return numero-bola.getNumero();
    }



}

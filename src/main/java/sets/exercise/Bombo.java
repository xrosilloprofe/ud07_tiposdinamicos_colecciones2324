package sets.exercise;

import java.util.*;

public class Bombo {
    private Set<Bola> bombo;
    public Bombo(){
        bombo=new LinkedHashSet<>();
    }

    public Bombo(Collection<Bola> bolas){
        bombo=new LinkedHashSet<>(bolas);
    }

    public void initialize(){
        for (int i = 1; i <= 90; i++) {
            bombo.add(new Bola(i));
        }
    }

    public void shuffle(){
        //primero pasarlo a lista
        List<Bola> bolaList = new LinkedList<>(bombo);
        Collections.shuffle(bolaList);

        //pasarlo a bombo
        bombo.clear();
        bombo.addAll(bolaList);
    }

    public void addBola(Bola bola){ bombo.add(bola);}
    public void addBolas(Collection<Bola> bolas){ bombo.addAll(bolas);}

    public Bola getBolaLista(){
        //para quitar el primer elemento... hay que pasarlo a lista
        List<Bola> bolaList = new LinkedList<>(bombo);
        Bola bola=bolaList.remove(0);
        bombo.remove(bola);
        return bola;
    }

    public Bola getBola(){
        Bola bola=null;
        Iterator<Bola> iterador = bombo.iterator();
        //quiamos el elemento en la posición 0
        if(iterador.hasNext()){
            bola = iterador.next();
            iterador.remove();
            //bombo.remove(bola)
        }
        return bola;

    }



    @Override
    public String toString(){return bombo.toString();}

}

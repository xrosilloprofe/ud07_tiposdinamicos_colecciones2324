package tad;

import java.lang.reflect.Array;

public class ListaGenerica<E> implements ILista<E>{

    private Nodo<E> head;
    private Nodo<E> tail;
    private int size;

    public ListaGenerica(){
        head=null;
        tail=null;
        size=INITIAL_SIZE;
    }

    public ListaGenerica(E[] elements){
        this();
        addAll(elements);
    }

    @Override
    public int size(){return size;}

    @Override
    public void addHead(E elem){
        Nodo<E> nodo = new Nodo<>(elem);
        if(size==0)
            tail=nodo;
        else
            nodo.setSiguiente(head);
        head=nodo;
        size++;
    }

    public void addTail(E elem){
        Nodo<E> nodo=new Nodo<>(elem);
        if(size==0){
            head=nodo;
        } else{
            tail.setSiguiente(nodo);

        }
        tail=nodo;
        size++;
    }

    @Override
    public E removeHead(){
        if(head==null) return null;
        E elem = head.getElem();
        head=head.getSiguiente();
        size--;

        if(head==null) tail=null;
        return elem;
    }

    public E removeTail(){
        if(tail==null || head==null || size==0)
            return null;
        if(size==1 || head==tail)
            return removeHead();
        Nodo<E> nodoBeforeTail = head;
        while(nodoBeforeTail.getSiguiente()!=tail){
            nodoBeforeTail=nodoBeforeTail.getSiguiente();
        }
        nodoBeforeTail.setSiguiente(null);

        E elem=tail.getElem();
        tail=nodoBeforeTail;

        size--;
        return elem;
    }

    public void clear(){
        head=null;
        tail=null;
        size=0;
    }

    public boolean contains(E elemento){

        boolean encontrado=false;
        Nodo<E> aux=head;

        while(!encontrado && aux!=null){
            if(aux.getElem().equals(elemento))
                encontrado=true;
            else
                aux=aux.getSiguiente();
        }
        return encontrado;
    }

    public E get(int posicion){
        if(posicion<0 || posicion>=size) return null;
        Nodo<E> aux=head;
        for (int i = 0; i < posicion; i++) {
            aux=aux.getSiguiente();
        }
        return aux.getElem();
    }

    public E remove(int posicion){
        if(posicion<0 || posicion>=size) return null;
        if(posicion==0) return removeHead();
        if(posicion==size-1) return removeTail();

        Nodo<E> aux=head;
        for (int i = 0; i < posicion-1; i++) {
            aux=aux.getSiguiente();
        }
        E elemento = aux.getSiguiente().getElem();
        aux.setSiguiente(aux.getSiguiente().getSiguiente());
        size--;
        return elemento;
    }

    public void addAll(E[] elements){
        for(E element:elements)
            addTail(element);
    }

    public E[] getAsArray(Class clazz){
        E[] array = (E[]) Array.newInstance(clazz,size);
        Nodo<E> aux=head;
        for (int i = 0; i < size; i++) {
            array[i]=aux.getElem();
            aux=aux.getSiguiente();
        }
        return array;
    }

    @Override
    public String toString(){
        Nodo<E> nodoAux = head;
        String cadena = "tad.Lista con número de elementos: " + size() + " --- ";
        while(nodoAux!=null){
            cadena += nodoAux + "->";
            nodoAux=nodoAux.getSiguiente();
        }
        return cadena;
    }

    private class Nodo<E>{
        private E elem;
        private Nodo<E> siguiente;

        public Nodo(E elem){
            this.elem=elem;
            siguiente=null;
        }

        public E getElem(){return elem;}
        public Nodo<E> getSiguiente(){return siguiente;}
        public void setSiguiente(Nodo<E> nodo){
            siguiente=nodo;
        }

        @Override
        public String toString(){
            return ""+elem.toString();
        }
    }
}

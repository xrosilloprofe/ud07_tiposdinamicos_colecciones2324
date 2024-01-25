import java.lang.reflect.Array;

public class ListaDE<E> {

    private int size;
    private Nodo<E> head;
    private Nodo<E> tail;

    public ListaDE(){
        size=0;
        head=tail=null;
    }

    public void addHead(E elem){
        Nodo<E> nodo=new Nodo<>(elem);
        if(size==0){
            tail=nodo;
        }
        else{
            head.setAnterior(nodo);
            nodo.setSiguiente(head);
        }
        head=nodo;
        size++;
    }

    public void addTail(E elem){
        Nodo<E> nodo=new Nodo<>(elem);
        if(size==0)
            head=nodo;
        else{
            tail.setSiguiente(nodo);
            nodo.setAnterior(tail);
        }
        tail=nodo;
        size++;
    }

    public E removeHead(){
        if(size==0) return null;
        E elemento=head.getElem();
        head=head.getSiguiente();

        if(head==null)
            tail=null;
        else
            head.setAnterior(null);
        size--;
        return elemento;
    }

    public E[] getAsArray(Class clazz){
        E[] array = (E[]) Array.newInstance(clazz,size);
        Nodo<E> nodo = head;
        for (int i = 0; i < size; i++) {
            array[i]=nodo.getElem();
            nodo=nodo.getSiguiente();
        }
        return array;
    }

    @Override
    public String toString(){
        String cadena = "ListaDE con " + size + " valores\n";
        cadena += " Elementos: ";
        Nodo<E> nodoAux=head;
        while(nodoAux!=null){
            cadena += nodoAux + " -> ";
            nodoAux=nodoAux.getSiguiente();
        }
        cadena += "\n Elementos inversa: ";
        nodoAux=tail;
        while(nodoAux!=null){
            cadena += nodoAux + " <- ";
            nodoAux=nodoAux.getAnterior();
        }
        return cadena;
    }



    private class Nodo<E>{
        private E elem;
        private Nodo<E> siguiente;
        private Nodo<E> anterior;

        public Nodo(E elem){
            this.elem=elem;
            this.siguiente=null;
            this.anterior=null;
        }

        public void setAnterior(Nodo<E> anterior) {
            this.anterior = anterior;
        }
        public void setSiguiente(Nodo<E> siguiente){
            this.siguiente=siguiente;
        }

        public Nodo<E> getAnterior() { return anterior;}
        public Nodo<E> getSiguiente(){return siguiente;}
        public E getElem(){return elem;}

        @Override
        public String toString(){return elem.toString();}

    }
}

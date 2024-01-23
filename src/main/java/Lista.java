public class Lista {

    private Nodo head;
    private Nodo tail;
    private int size;

    public Lista(){
        head=null;
        tail=null;
        size=0;
    }

    public int size(){return size;}

    public void addHead(int elem){
        Nodo nodo = new Nodo(elem);
        if(size==0)
            tail=nodo;
        else
            nodo.setSiguiente(head);
        head=nodo;
        size++;
    }

    public void addTail(int elem){

    }

@Override
public String toString(){
        Nodo nodoAux = head;
        String cadena = "Lista con número de elementos: " + size() + " --- ";
        while(nodoAux!=null){
            cadena += nodoAux + "->";
            nodoAux=nodoAux.getSiguiente();
        }
        return cadena;
}

    private class Nodo{
        private int elem;
        private Nodo siguiente;

        public Nodo(int elem){
            this.elem=elem;
            siguiente=null;
        }

        public int getElem(){return elem;}
        public Nodo getSiguiente(){return siguiente;}
        public void setSiguiente(Nodo nodo){
            siguiente=nodo;
        }

        @Override
        public String toString(){
            return ""+elem;
        }
    }
}

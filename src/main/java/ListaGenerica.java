public class ListaGenerica<E> {

    private Nodo head;
    private Nodo tail;
    private int size;

    public Lista(){
        head=null;
        tail=null;
        size=0;
    }

    public Lista(int[] elements){
        this();
        addAll(elements);
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
        Nodo nodo=new Nodo(elem);
        if(size==0){
            head=nodo;
        } else{
            tail.setSiguiente(nodo);

        }
        tail=nodo;
        size++;
    }

    public Integer removeHead(){
        if(head==null) return null;
        int elem = head.getElem();
        head=head.getSiguiente();
        size--;

        if(head==null) tail=null;
        return elem;
    }

    public Integer removeTail(){
        if(tail==null || head==null || size==0)
            return null;
        if(size==1 || head==tail)
            return removeHead();
        Nodo nodoBeforeTail = head;
        while(nodoBeforeTail.getSiguiente()!=tail){
            nodoBeforeTail=nodoBeforeTail.getSiguiente();
        }
        nodoBeforeTail.setSiguiente(null);

        int elem=tail.getElem();
        tail=nodoBeforeTail;

        size--;
        return elem;
    }

    public void clear(){
        head=null;
        tail=null;
        size=0;
    }

    public boolean contains(int num){

        boolean encontrado=false;
        Nodo aux=head;

        while(!encontrado && aux!=null){
            if(aux.getElem()==num)
                encontrado=true;
            else
                aux=aux.getSiguiente();
        }
        return encontrado;
    }

    public Integer get(int posicion){
        if(posicion<0 || posicion>=size) return null;
        Nodo aux=head;
        for (int i = 0; i < posicion; i++) {
            aux=aux.getSiguiente();
        }
        return aux.getElem();
    }

    public Integer remove(int posicion){
        if(posicion<0 || posicion>=size) return null;
        if(posicion==0) return removeHead();
        if(posicion==size-1) return removeTail();

        Nodo aux=head;
        for (int i = 0; i < posicion-1; i++) {
            aux=aux.getSiguiente();
        }
        int num = aux.getSiguiente().getElem();
        aux.setSiguiente(aux.getSiguiente().getSiguiente());
        size--;
        return num;
    }

    public void addAll(int[] elements){
        for(int element:elements)
            addTail(element);
    }

    public int[] getAsArray(){
        int[] array = new int[size];
        Nodo aux=head;
        for (int i = 0; i < size; i++) {
            array[i]=aux.getElem();
            aux=aux.getSiguiente();
        }
        return array;
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

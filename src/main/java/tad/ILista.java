package tad;

public interface ILista<E> {
    int INITIAL_SIZE=0;
    void addHead(E elem);
    E removeHead();
    int size();

}

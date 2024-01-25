import java.util.Arrays;

public class MainDE {
    public static void main(String[] args) {
        ListaDE<String> listacadenas = new ListaDE<>();
        listacadenas.addHead("salman");
        listacadenas.addHead("vicent");
        listacadenas.addHead("alejandro");
        listacadenas.addHead("santi");
        listacadenas.addTail("carlos");
        listacadenas.addTail("lia");
        System.out.println(listacadenas);
        listacadenas.removeHead();
        listacadenas.removeHead();
        System.out.println(Arrays.toString(listacadenas.getAsArray(String.class)));


        ListaDE<Integer> listaEnteros = new ListaDE<>();
        listaEnteros.addHead(1);
        listaEnteros.addHead(2);
        listaEnteros.addHead(3);
        System.out.println(listaEnteros);

    }
}

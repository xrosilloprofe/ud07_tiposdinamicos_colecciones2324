import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListaMain {
    public static void main(String[] args) {
        List<Integer> listaIntegers = new ArrayList<>();
        listaIntegers.add(1);
        listaIntegers.add(2);
        listaIntegers.add(3);
        listaIntegers.add(4);
        listaIntegers.add(5);

        listaIntegers.stream().count();

        List<String> listaCadena = new LinkedList<>();

    }
}

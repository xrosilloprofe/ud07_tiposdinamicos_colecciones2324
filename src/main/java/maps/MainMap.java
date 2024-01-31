package maps;

import java.util.*;
import java.util.stream.Collectors;

public class MainMap {
    public static void main(String[] args) {
        Map<String,Double> fruta = new HashMap<>();
        fruta.put("platano",1.99);
        fruta.put("naranja",1.19);
        fruta.put("clementina",1.79);
        fruta.put("manzana",0.99);
        fruta.put("platano",1.79);
        fruta.put("patata",0.79);
        fruta.put("guayaba",1999.79);
        System.out.println(fruta);

        fruta.remove("patata");
        System.out.println(fruta.get("guayaba"));
        fruta.put("guayaba",null);
        System.out.println(fruta);

        System.out.println(fruta.containsKey("guallava"));
        System.out.println(fruta.containsValue(0.99));

        Set<String> claves = fruta.keySet();
        Set<String> clavesOrdenadas = new TreeSet<>(claves);
        System.out.println(claves);
        System.out.println(clavesOrdenadas);

        Collection<Double> valores = fruta.values();
        Set<Double> valores1 = new HashSet<>(valores);
        List<Double> valores2 = new ArrayList<>(valores);
        System.out.println(valores1);
        System.out.println(valores2);

        //imprimir clave valor
        for(String clave:fruta.keySet())
            System.out.print(" --> " + " key: " + clave + " valor: "+fruta.get(clave));
        System.out.println();

        //imprimir clave valor con Entry<K,V>
        for(Map.Entry<String,Double> frutaInd : fruta.entrySet())
            System.out.print(" --> " + " key: " + frutaInd.getKey() + " valor: "+frutaInd.getValue());
        System.out.println();

        //imprimir sólo las claves
        for(String claro: fruta.keySet())
            System.out.print(" -> " + claro);
        System.out.println();

        //imprimir sólo los valores
        for(Double valor:fruta.values())
            System.out.print(" -> " + valor);
        System.out.println();

        //imprimir clave-valor con el iterador
        Iterator<String> iterador = fruta.keySet().iterator();
        while(iterador.hasNext()){
            String clave = iterador.next();
            System.out.print(" --> " + " key: " + clave + " valor: "+fruta.get(clave));
        }

        //imprimir con método forEach()
        fruta.forEach((frutilla,precio) -> System.out.println(" --> " + " key: " + frutilla + " valor: "+precio));

        List<Double> preciosCaros =
                fruta.values().stream().filter(precio->precio!=null).
                        filter(precio->precio>1.00).collect(Collectors.toList());
        System.out.println(preciosCaros);

        List<Double> preciosConL = fruta.entrySet().stream().
                    filter(clau->clau.getKey().contains("l")).
                    map(Map.Entry::getValue).
                    collect(Collectors.toList());

    }
}

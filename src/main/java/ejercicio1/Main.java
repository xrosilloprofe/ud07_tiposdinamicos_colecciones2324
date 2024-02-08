package ejercicio1;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Map<Trabajador,Pais> trabajadores = new HashMap<>();

        //creo unos objetos País
        Pais españa = new Pais("España",47000000);
        Pais portugal = new Pais("Portugal",11000000);
        Pais francia = new Pais("Francia",66000000);
        Pais marruecos = new Pais("Marruecos",37000000);
        Pais mexico = new Pais("Mexico",100000000);

        //añado trabajadores-país al Map
        trabajadores.put(new Trabajador("9A","dulcinea","acme", LocalDate.of(1973,2,14)),españa);
        trabajadores.put(new Trabajador("9B","luna","acme", LocalDate.of(1983,2,14)),portugal);
        trabajadores.put(new Trabajador("9C","pepa","acme", LocalDate.of(1993,2,14)),francia);
        trabajadores.put(new Trabajador("3A","blanca","james", LocalDate.of(2003,3,13)),marruecos);
        trabajadores.put(new Trabajador("3B","linda","james", LocalDate.of(1963,3,12)),marruecos);
        trabajadores.put(new Trabajador("3C","lady","james", LocalDate.of(1979,3,11)),marruecos);
        trabajadores.put(new Trabajador("6A","mike","li", LocalDate.of(1989,4,10)),españa);
        trabajadores.put(new Trabajador("6B","mitch","li", LocalDate.of(1999,5,9)),mexico);
        trabajadores.put(new Trabajador("6C","matt","li", LocalDate.of(1968,6,8)),mexico);
        trabajadores.put(new Trabajador("7A","purple","silver", LocalDate.of(1978,7,5)),españa);
        trabajadores.put(new Trabajador("7B","orange","silver", LocalDate.of(1988,8,1)),portugal);
        trabajadores.put(new Trabajador("7C","green","silver", LocalDate.of(1998,9,4)),españa);

        //Obtener un informe con los países de los trabajadores de la empresa.
        for(Pais pais:trabajadores.values())
            System.out.print(" --> País " + pais);
        System.out.println();

        //Hazlo también sin sacar países duplicados.
        Set<Pais> paisesSet = new TreeSet<>();
        paisesSet.addAll(trabajadores.values());
        for(Pais pais:paisesSet)
            System.out.print(" --> País " + pais);
        System.out.println();

        trabajadores.values().stream().distinct().forEach(pais->System.out.print(" --> País " + pais));
        System.out.println();
        trabajadores.values().stream().distinct().forEach(System.out::println);

        //Listado de solo los trabajadores ordenados por su orden natural (alfabético).
        //Esto lo deberemos hacer al menos de dos maneras diferentes.
        //Por ejemplo, mediante un TreeSet y un ArrayList
        Set<Trabajador> trabajadorSet = new TreeSet<>(trabajadores.keySet());
        for(Trabajador trabajador:trabajadorSet)
            System.out.print(" --> Trabajador " + trabajador);
        System.out.println();

        List<Trabajador> trabajadorList = new ArrayList<>(trabajadores.keySet());
        Collections.sort(trabajadorList);
//        trabajadorList.sort(Trabajador::compareTo);
        for(Trabajador trabajador:trabajadorList)
            System.out.print(" --> Trabajador " + trabajador);
        System.out.println();
        trabajadorList.stream().sorted().forEach(trabajador->System.out.print(" --> Trabajador " + trabajador));
        System.out.println();
//        List<Trabajador> ordenados = trabajadorList.stream().sorted().collect(Collectors.toList());

        //Informe con los países por orden alfabético y sus trabajadores por edad
        // (dos informes por separado e intentarlo con un único informe)
        List<Pais> paisList = new LinkedList<>(trabajadores.values());
        Collections.sort(paisList);
        for(Pais pais:paisList)
            System.out.print(" --> País " + pais);
        System.out.println();

        List<Trabajador> trabajadorListEdad = new ArrayList<>(trabajadores.keySet());
        trabajadorListEdad.sort(Trabajador.SORT_BY_AGE2);
        for(Trabajador trabajador:trabajadorListEdad)
            System.out.print(" --> Trabajador " + trabajador);
        System.out.println();

        //Un único informe
        Map<Pais,List<Trabajador>> paisesTrabajadores = new TreeMap<>();
        for(Pais pais:trabajadores.values()){
            List<Trabajador> aux = new ArrayList<>();
            for(Trabajador trabajador:trabajadores.keySet())
                if(trabajadores.get(trabajador).equals(pais)){
                    aux.add(trabajador);
                }
            aux.sort(Trabajador.SORT_BY_AGE1);
            paisesTrabajadores.put(pais,aux);
        }
        for(Pais pais:paisesTrabajadores.keySet())
            System.out.println("Pais: " + pais + " trabajadores -->" + paisesTrabajadores.get(pais));

        //Periodo entre dos fechas --> Period.between(fechanacimiento,fecha actual).getYears()
        //Recorrer todos los trabajadores y mostrar solo aquellos con edad superior a 50 años utilizando un iterador.
        Iterator<Trabajador> trabajadorIterator = trabajadores.keySet().iterator();
        while(trabajadorIterator.hasNext()){
            Trabajador trabajador=trabajadorIterator.next();
            if(Period.between(trabajador.getFechaNac(),LocalDate.now()).getYears()>=50)
                System.out.println("Empleado: " + trabajador);
        }

        trabajadores.keySet().stream().
                filter(trabajador -> Period.between(trabajador.getFechaNac(),LocalDate.now()).getYears()>=50).
                sorted(Trabajador.SORT_BY_AGE).
                forEach(System.out::println);



    }
}

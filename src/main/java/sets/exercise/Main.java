package sets.exercise;

public class Main {
    public static void main(String[] args) {
        Bombo bombo=new Bombo();
        Tablero tablero=new Tablero();
        bombo.initialize();
        for (int i = 0; i < 15; i++) {
            bombo.shuffle();
            tablero.addBola(bombo.getBola());
        }
        System.out.println(bombo);
        System.out.println(tablero);
    }
}

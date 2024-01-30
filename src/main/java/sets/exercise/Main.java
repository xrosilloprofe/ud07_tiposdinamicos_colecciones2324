package sets.exercise;

public class Main {
    public static void main(String[] args) {
        Bombo bombo=new Bombo();
        bombo.initialize();
        for (int i = 0; i < 5; i++) {
            bombo.shuffle();
            System.out.println(bombo.getBola());
        }
        System.out.println(bombo);

    }
}

public class Main {
    public static void main(String[] args) {
        Spil spil = new Spil(new Menneskespiller("Monir"), new Computerspiller("Computer"));
        spil.start();

    }
}
import java.util.Random;

public class Computerspiller extends Spiller {

    public Computerspiller(String navn) {
        super(navn);
    }

    @Override
    public Håndtegn håndtegnSpillet() {
        Random rand = new Random();
        int computerHåndtegn = rand.nextInt(3);
        return Håndtegn.values()[computerHåndtegn];
    }
}

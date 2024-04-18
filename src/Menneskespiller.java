import java.util.Scanner;

public class Menneskespiller extends Spiller {

    public Menneskespiller(String navn) {
        super(navn);
    }

    @Override
    public Håndtegn håndtegnSpillet() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next().toUpperCase();
        return Håndtegn.valueOf(input);
    }
}

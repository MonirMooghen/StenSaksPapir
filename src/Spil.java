import java.util.Random;
import java.util.Scanner;

public class Spil {

    Spiller spiller1;
    Spiller spiller2;

    public Spil(Spiller spiller1, Spiller spiller2){
        this.spiller1 = spiller1;
        this.spiller2 = spiller2;
    }

    public void start(){
        System.out.println("Velkommen til det banebrydende spil 'Sten, saks, papir'\n" +
                "Du spiller bedst ud af tre\nSkriv 'sten', 'saks' eller 'papir'");
        int afgjortRunde = 0;

        while(afgjortRunde <3){
        Håndtegn h1 = spiller1.håndtegnSpillet();
        Håndtegn h2 = spiller2.håndtegnSpillet();

            if (h1 == h2){
                System.out.println(spiller1.getNavn() + " slog " + h1 + ". " +
                        spiller2.getNavn() + " slog " + h2);
                System.out.println("Runden er uafgjort, slå igen");
                continue;
            }

            afgjortRunde++;
            Spiller vinder;
            System.out.println(spiller1.getNavn() + " slog " + h1 + ". " +
                    spiller2.getNavn() + " slog " + h2);

            if (
                (h1 == Håndtegn.STEN && h2 == Håndtegn.SAKS) ||
                        (h1 == Håndtegn.SAKS && h2 == Håndtegn.PAPIR) ||
                        (h1 == Håndtegn.PAPIR && h2 == Håndtegn.STEN)
            ) {
                vinder = spiller1;
            } else {
                vinder = spiller2;
            }

            vinder.pointTæller();
            System.out.println(vinder.getNavn() + " vandt denne runde og har nu " + vinder.getPoint() + " point.");
        }

        //Nu er spillet afgjort, og vi henter lige de samlede point fra hver spiller
        int p1 = spiller1.getPoint();
        int p2 = spiller2.getPoint();
        Spiller vinder;

        if (p1 > p2) {
            vinder = spiller1;
        } else if (p1 < p2) {
            vinder = spiller2;
        } else {
            System.out.println("\nSpillet er uafgjort.");
            return;
        }

        System.out.println("Spillet er afgjort\n" + spiller1.getNavn() + " fik " + spiller1.getPoint() + " point\n"
                + spiller2.getNavn() + " fik " + spiller2.getPoint() + " point\n" +
                vinder.getNavn() + " vandt spillet!");
    }
}

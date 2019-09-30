import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the rock papir scissor game");
        System.out.println("Vil du spille: Ja eller nej");
        String spil = scanner.next();
        while (spil.equalsIgnoreCase("JA") ) {
            //SSP.makeYourChoise();
            /*oprettelse af ENUM */
            Haand choice = Haand.STEN;
            Haand choice2 = Haand.SAKS;
            Haand choice3 = Haand.PAPIR;

            //Her starter spillet
            SSP runde1 = new SSP();
            System.out.println(runde1.slaa(choice, choice2));
            //Computer generere en hånd
            Haand computersHaand = null;
            int haandInt = (int) (Math.random() * 3 + 1);
            if (haandInt == 1) {
                computersHaand = Haand.STEN;
            }
            if (haandInt == 2) {
                computersHaand = Haand.SAKS;
            }
            if (haandInt == 3) {
                computersHaand = Haand.PAPIR;
            }
            System.out.println("Computer slår " + computersHaand);
            //Indlæse spillernes hånd

            Haand spillerensHaand = null;
            System.out.println("Vælg venligst sten, saks eller papir");
            String spillerenString = scanner.next();

            if (spillerenString.equalsIgnoreCase("sten")) {
                spillerensHaand = Haand.STEN;
            }
            if (spillerenString.equalsIgnoreCase("saks")) {
                spillerensHaand = Haand.SAKS;
            }
            if (spillerenString.equalsIgnoreCase("papir")) {
                spillerensHaand = Haand.PAPIR;
            }
            System.out.println("Spiller slår " + spillerensHaand);

            //Sammenligne med slaa() metoden
            int resultat = runde1.slaa(computersHaand, spillerensHaand);
            String vinder = null;
            if (resultat == 0) {
                vinder = "Uafgjort";
            }
            if (resultat == 1) {
                vinder = "Computeren vinder";
            }
            if (resultat == 2) {
                vinder = "Spilleren vinder";
            } else {
                System.out.println("Forkert valg");
                ;
            }
            //udråb en vinder
            System.out.println("Spiller valgte " + spillerensHaand + " og computeren valgte "
                    + computersHaand + " derfor: " + vinder);
            System.out.println("Vil du spille: Ja eller nej");
            spil = scanner.next();
        }
    }
}
//TODO sørg for at scanneren ignorerer forskelle på store of små bogstaver
//TODO løkker der kører spillet flere gange
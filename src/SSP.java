import java.util.Scanner;
public class SSP {
    /*
    //Metode til at tage brugerens valg i tekst og omskrive til et tal
    public static int makeYourChoise(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please write your selection of Rock, Papir or Scissors");
        String choice = input.next();
        int numberChoice;
        if (choice == "Rock") {
            numberChoice = 0;
        }
        else if (choice == "Papir"){
            numberChoice = 1;
        }
        else numberChoice = 2;
        return numberChoice;
    }
    public static int computerChoise(){

    }
    public static void Compare();{

    }*/
    int slaa(Haand a, Haand b){
        int resultat = -1;
        // TODO refaktorer så det bliver kortere
        //if (a == Haand.STEN && HAAND.STEN){ resultat = 0;}
        //if (a == Haand.STEN && HAAND.SAKS){ resultat = 1;}
        if (a == Haand.STEN){
            //den anden HAAND er sten
            if(b == Haand.STEN){
                resultat = 0;
            }
            //den anden HAAND er saks
            if(b == Haand.SAKS){
                resultat = 1;
            }
            //den anden HAAND er papir
            if(b == Haand.PAPIR){
                resultat = 2;
            }
        }
        if (a == Haand.SAKS){
            //den anden HAAND er sten
            if(b == Haand.STEN){
                resultat = 2;
            }
            //den anden HAAND er saks
            if(b == Haand.SAKS){
                resultat = 0;
            }
            //den anden HAAND er papir
            if(b == Haand.PAPIR){
                resultat = 1;
            }
        }if (a == Haand.PAPIR){
            //den anden HAAND er sten
            if(b == Haand.STEN){
                resultat = 1;
            }
            //den anden HAAND er saks
            if(b == Haand.SAKS){
                resultat = 2;
            }
            //den anden HAAND er papir
            if(b == Haand.PAPIR){
                resultat = 0;
            }
        }

        return resultat;
    }

}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nbr = (int) (Math.random() * 100) +1 ;

        System.out.println("-- Jeu de devinette --");
        System.out.println("Tentez de deviner le nombre");

        for(int i=1; i<=10; i++ ){
            System.out.println("Entrez un nombre compris entre 0 et 100 : ");
            int answ = scanner.nextInt();

            if (answ == nbr){
                System.out.println("BRAVO!!! Vous avez réussi");
                break;
            } else if (answ > nbr) {
                System.out.println("Dommage, votre réponse est supérieure au nombre. Reéssayez");
            } else {
                System.out.println("Dommage, votre réponse est inférieure au nombre. Reéssayez");
            }

            if (i == 10 && answ != nbr){
                System.out.println("Désolé vous n'avez plus de tentative restante");
            }
        }

        scanner.close();
    }




}
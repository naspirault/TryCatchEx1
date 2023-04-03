import java.util.Scanner;

public class Main {

    static int [] tableau = { 17, 12, 15, 38, 29, 157, 89, -22, 0, 5 };
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y;
       /* String msg = "";
        msg = ("Entrez l'indice de l'entier à diviser: ");

        x = readInteger(msg,0,tableau.length-1);
*/
/*Allô! Je change dans l'éditeur Web*/
        /*et je veux voir s'il y aura des conflits */
        while (true){
            System.out.print("Entrez l'indice du tableau: ");
            x = sc.nextInt();
            System.out.print("Entrez le diviseur: ");
            y = sc.nextInt();
        try{
            System.out.println("Le résultat de la division est : " + Division(x,y));
            break;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception occurs");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Hors limites du tableau." + e);
        }
        catch(Exception e)
        {
            System.out.println("Parent Exception occurs");
        }
        System.out.println("Recommencez!");
    }}


    static int Division(int indice, int diviseur)
    {
        return tableau[indice] / diviseur;
    }

    public static int readInteger(String message, int min, int max) {
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine());
                if (result >= min && result <= max) {
                    return result;
                } /*else {
                    throw new IllegalStateException("La valeur doit être comprise entre "
                            + min + " et " + max + ": " + result);
                }*/
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("Une erreur est survenue: " );
                System.out.print(message);
            }
        }
    }
}

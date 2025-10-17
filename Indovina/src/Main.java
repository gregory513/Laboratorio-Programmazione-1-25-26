import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int numero = random.nextInt(1,101);
        Scanner input = new Scanner(System.in);
        int tentativi = 0;

        while (true) {


            try {
                System.out.println("Inserisci un numero: ");
                int numeroIndovinato = input.nextInt();

                if (numeroIndovinato > numero){
                    System.out.println("Il tuo tentativo " + numeroIndovinato);
                    System.out.println("Troppo alto!");
                    tentativi++;

                }
                else if (numeroIndovinato < numero){
                    System.out.println("il tuo tentativo " + numeroIndovinato);
                    System.out.println("Troppo basso!");
                    tentativi++;
                }
                else{
                    System.out.println("Bravo! hai indovinato in " + tentativi + " tentativi ");
                    break;
                }


            }
            catch (InputMismatchException ime) {
                input.nextLine();
                System.out.println("Inserisci un numero in formato numerico");
            }
            }
        input.close();
        }

    }

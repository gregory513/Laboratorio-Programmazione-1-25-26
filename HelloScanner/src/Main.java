import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int eta = 0;
        String nome = "";
        String cognome = "";
        String paese = "";
        try {
            Scanner input = new Scanner(System.in);//Creato oggetto Scanner
            System.out.print("Inserisci il tuo nome: ");
            nome = input.nextLine();// Letto input da tastiera e salvato nella variabiloe nome

            System.out.print("Inserisci il tuo cognome: ");
            cognome = input.nextLine();

            System.out.print("Inserisci la tua età: ");
            eta = input.nextInt();

            System.out.print("Inserisci il tuo paese: ");
            paese = input.nextLine();

            System.out.println("Nome: " + nome);
            System.out.println("Cognome: " + cognome);
            System.out.println("Eta: " + eta);
            System.out.println("Paese: " + paese);
        }
        catch (InputMismatchException ime) {
            System.out.print("l'età è da inserire in formato numerico  ");
        }

        //int eta = Integer.parseInt(nextLine());





    }
}
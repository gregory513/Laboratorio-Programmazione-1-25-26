import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Carrello c1 = new Carrello("Spesa");

        Alimento a = new Alimento("Tagliatelle", "Pasta", "10-10-2027", 4);
        c1.AggiungiAlimento(a);
    }
}
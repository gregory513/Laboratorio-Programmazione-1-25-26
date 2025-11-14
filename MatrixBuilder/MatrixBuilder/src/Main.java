//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Matrice c = new Matrice( 3, 4);





        c.popolaMatrice();
        c.setCella(0, 2, 0);
        c.stampaMatrice();
        System.out.println(c.getCella(0,2));
    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Il libro della giungla", "Yehor", 2025, true);
        Libro libro2 = new Libro();

        libro1.verificaDisponibilità();
        libro2.verificaDisponibilità();




    }
}
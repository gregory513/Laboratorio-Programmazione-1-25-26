//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int dimension = Integer.parseInt(args[0]);

        if(dimension == 0){
            System.out.println("Dimensione invalido");
            return;
        }
        for(int i = 0; i < dimension; i++){
            for (int j = 0; j < dimension; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
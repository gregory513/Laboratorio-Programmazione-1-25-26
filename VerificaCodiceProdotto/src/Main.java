//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("Give me arguments pleas");
        }
        for(String arg : args){// cicliamo args per vedere se sono presenti solo numeri
            try {
                if (!arg.startsWith("PROD-")) {
                    System.out.println("errore il codice deve iniziare con PROD-");
                }
                String parteNumerica = arg.substring(5, 8);
                int Numero = Integer.parseInt(parteNumerica);
            }catch (NumberFormatException nfe){
                System.out.println("errore il numero deve essere un numero");

            }
        }
    }
}
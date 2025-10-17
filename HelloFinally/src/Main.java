//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        for(String arg : args){// cicliamo args per vedere se sono presenti solo numeri
            try {
                double numero = Double.parseDouble(arg);
                System.out.println(numero);
            }catch(NumberFormatException nfe){
                System.out.println(nfe.getMessage());
            }finally {
                System.out.println("operazione eseguita");
            }



        }
    }
}
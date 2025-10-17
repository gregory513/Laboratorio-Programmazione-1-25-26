//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            for(int i = 0; i < args.length; i++) {
                float numero = Float.parseFloat(args[i]);
                verificaSegno(numero);
            }
        } catch (NumberFormatException e) {
            System.out.println("Inserire solo numeri");
            System.out.println(e.getMessage());
        }catch (IllegalArgumentException e) {
            System.out.println("Errore:\s" + e.getMessage());
        }



    }

    public static void verificaSegno(float numeroTest){
        if(numeroTest < 0){
            System.out.println("Il numero\s" + numeroTest + "\sè negativo");
        }else if(numeroTest > 0){
            System.out.println("Il numero\s" + numeroTest + "\sè positivo");
        }else{
            throw new IllegalArgumentException("Il numero non può essere 0");
        }
    }
}
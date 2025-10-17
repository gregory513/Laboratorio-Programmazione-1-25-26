/**
 * test 1 es 1
 * programma che cambia una lettera di una parola con un'altra
 *
 * Gregory Benzoni 01.10.2025
 */
public class Cifratura{
    public static void main(String[] args){
        try {
            if (args.length < 3){}
        }
        String parola = args[0];
        String parolaCodificata = parola.replace('o','i');
        System.out.print("La parola doraimon è stata codificata in " + parolaCodificata);
    }
}
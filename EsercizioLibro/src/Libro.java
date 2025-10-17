public class Libro {
    String titolo;
    String autore;
    int annoPubblicazione;
    boolean disponibile;

    public Libro(){}
    public Libro(String titolo, String autore, int annoPubblicazione, boolean disponibile) {
        this.titolo = titolo;
        this.autore = autore;
        if(annoPubblicazione>0){
            this.annoPubblicazione = 0;
        }
        this.annoPubblicazione = annoPubblicazione;
        this.disponibile = true;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titolo='" + titolo + '\'' +
                ", autore='" + autore + '\'' +
                ", annoPubblicazione=" + annoPubblicazione +
                ", disponibile=" + disponibile +
                '}';
    }
    public void verificaDisponibilità(){
        if(disponibile){
            System.out.println("Disponibile");
        }else {
            System.out.println("Non disponibile");
        }
    }
}



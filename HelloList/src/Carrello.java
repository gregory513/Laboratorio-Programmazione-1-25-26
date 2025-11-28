import java.util.ArrayList;

public class Carrello {
    private String nome;
    private ArrayList<Alimento> alimenti;

    public Carrello(String nome) {
        this.nome = nome;
        alimenti = new ArrayList<>();
    }

    public void AggiungiAlimento(Alimento alimento) {
        alimenti.add(alimento);
    }

    public void AggiungiAlimento(String nome, String categoria, String data_scadenza, int quantita){
        alimenti.add(new Alimento(nome, categoria, data_scadenza, quantita));
    }

    public void rimuoviAlimento(Alimento alimento) {
        alimenti.remove(alimento);
    }
}

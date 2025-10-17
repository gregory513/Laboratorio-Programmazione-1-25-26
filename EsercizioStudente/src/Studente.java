public class Studente {
    //Dichiariamo gli attributi
    String nome;
    int eta;
    String corso;
    boolean isPromosso; // per variabili Boolean usare isParola

    //Costruttore vuoto
    public Studente(){}
    public Studente(String nome, int eta, String corso, boolean isPromosso) {
        this.nome = nome;
        if(eta < 14){
            this.eta = 14;
            System.out.println("Età portata a 14");
        }else{
            this.eta = eta;
        }
        this.corso = corso;
        this.isPromosso = true;

    }
    // Non ci può essere public Studente(String ciao, int eta, String corso, boolean isCiao)
    // se una classe non implementa un costruttore il compilatore crea un crostuttore di defaul con valori di default
    public void Saluti(){
        System.out.println(nome + " benvenuto al corso " + corso);
    }
    public void verificaPromozione(){
        if(isPromosso){
            System.out.println("Promozione");
        }else {
            System.out.println("Non Promozione");
        }
    }

    @Override
    public String toString() {
        return "Studente{" +
                "nome='" + nome + '\'' +
                ", eta=" + eta +
                ", corso='" + corso + '\'' +
                ", isPromosso=" + isPromosso +
                '}';
    }
}

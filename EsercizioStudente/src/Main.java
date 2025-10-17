//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Studente gregory = new Studente("Gregory dcsc",16,"OOP",true);
        Studente sconosciuto = new Studente();
        gregory.Saluti();
        sconosciuto.Saluti();
        gregory.verificaPromozione();
        sconosciuto.verificaPromozione();

        System.out.println(gregory);

    }
}
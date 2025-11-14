import java.util.Random;
public class Matrice {
    private int righe;
    private int colonne;
    private int[][] matrice;

    public Matrice() {
        matrice = new int[5][5];
    }

    public Matrice(int righe, int colonne) {
        this.righe = righe;
        this.colonne = colonne;
        this.matrice = new int[this.righe][this.colonne];
    }

    public int getRighe() {
        return righe;
    }

    public int getColonne() {
        return colonne;
    }

    public void stampaMatrice() {
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j]);
            }
            System.out.println();
        }
    }

    public void popolaMatrice() {
        Random r = new Random();
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                matrice[i][j] = r.nextInt(0, 2);
            }
        }
    }

    public int getCella(int r, int c) {
        return matrice[r][c];
    }

    public void setCella(int r, int c, int valore) {
        if (valore == 0 || valore == 1) {
            matrice[r][c] = valore;
            System.out.println(valore);
        } else {
            System.out.println("Errore: il valore deve essere 0 o 1");
        }

    }
}

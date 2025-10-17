public class Punto{
    double x, y;

    public Punto(){
        this.x = 1;
        this.y = 1;
    }
    public Punto(double x, double y){
        this.x = x;
        this.y = y;
    }
    public int calcolaDistanza(){
        return (int) Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }
    public String determinaQuadrante(){
        if(this.x < 0 && this.y < 0){
            return "Quadrante 1";
        }
        else if(this.x < 0 && this.y > 0){
            return "Quadrante 2";
        }
        else if(this.x > 0 && this.y > 0){
            return "Quadrante 3";
        }else{
            return "Quadrante 4";
        }
    }

    @Override
    public String toString() {
        return "Punto{" +
                "x=" + x +
                ", y=" + y +
                ", quadrante=" + determinaQuadrante() +
                ", distanza=" + calcolaDistanza() +
                '}';
    }
}

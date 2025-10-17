public class Classe {
    double celsius;

    public Classe(double celsius){
        if(celsius < -273.15){
            this.celsius = -273.15;
            System.out.println("temperatura impostata a -272.15");
        }
    }
    public String stato(){
        if(celsius < 10){
            return "Freddo";
        }else if(celsius > 10 && celsius < 25){
            return "Temperato";
        }else{
            return "Caldo";
        }
    }
    public double inFahrenheit(){
        return (celsius * 9/5) + 32;
    }
    public double inKelvin(){
        return celsius + 273.15;
    }

}

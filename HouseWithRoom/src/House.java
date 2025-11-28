import java.util.ArrayList;

public class House {
    private ArrayList<Room> rooms;

    public House() {
        rooms = new ArrayList<>();
    }

    public void aggiungiStanza(String nome, double superficieMq) {
        rooms.add(new Room(nome, superficieMq));
    }

    public void visualizzaStanze(){
        if(rooms.size()>0){
            for (Room room : rooms) {
                System.out.println(room.getNome());
            }
        }else {
            System.out.println("Casa senza stanze");
        }

    }

}

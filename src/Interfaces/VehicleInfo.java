package Interfaces;

public class VehicleInfo extends Mercedes{
    public static void main(String[] args) {
        Mercedes m=new Mercedes();
         m.watchMovie();
         m.run();
         m.listenMusic();
         m.stop();
         m.turn();
        System.out.println();
         Vehicle v=m;
         v.turn();
         v.run();
         v.stop();
        System.out.println();
         Entertainment e=m;
         e.listenMusic();
         e.watchMovie();
    }
}

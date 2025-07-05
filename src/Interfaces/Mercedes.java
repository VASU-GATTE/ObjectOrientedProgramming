package Interfaces;

public class Mercedes implements Vehicle,Entertainment{

    @Override
    public void listenMusic() {
        System.out.println("Listening Movie");
    }

    @Override
    public void watchMovie() {
        System.out.println("Watching Movie");
    }

    @Override
    public void turn() {
        System.out.println("Turning Left");

    }

    @Override
    public void run() {
        System.out.println("Running");

    }

    @Override
    public void stop() {
        System.out.println("Stop");

    }
}

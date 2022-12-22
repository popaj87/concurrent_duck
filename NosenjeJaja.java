import java.util.concurrent.ThreadLocalRandom;

public class NosenjeJaja implements Runnable {
    String izvrsioc;
    public NosenjeJaja(String i){
        izvrsioc = i;
    }
    public void run(){
        Objekat objekat = Objekat.getInstance();

        for(;true;){

        System.out.println("Cekam gnijezdo " + izvrsioc);
        
        synchronized(objekat){
            System.out.println("Ulazim u gnijezdo - " + izvrsioc);
            System.out.println("=====================");
        try {
           Thread.sleep(2000);
        } catch (InterruptedException e) {

        }

        objekat.dodajJaja();
        System.out.println("Napustam gnijezdo - "+ izvrsioc);
        System.out.println("=====================");

        }
      }
    }
}
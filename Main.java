public class Main {
 public static void main(String args[])
    {
         Patka patkeKojeLete = new PatkeKojeLete();
         Patka patkeKojeNeLete = new PatkeKojeNeLete();
         Patka gumenaPatka = new GumenaPatka();
         Patka drvenaPatka = new DrvenaPatka();

         Thread t1 = new Thread((PatkeKojeLete)(patkeKojeLete));
         Thread t2 = new Thread((PatkeKojeNeLete)(patkeKojeNeLete));
         Thread t3 = new Thread((GumenaPatka)(gumenaPatka));
         Thread t4 = new Thread((DrvenaPatka)(drvenaPatka));
      
         t1.start();
         t2.start();
         t3.start();
         t4.start();
	
        System.out.println("Ukupna populacija pataka je: " + Patka.brojac);

     while(true){
        try {
           Thread.sleep(2000);
        } catch (InterruptedException e){

        }
      System.out.println("Ukupan broj je: " + Gnijezdo.getInstance().getBrojJaja());
     }
    }
}
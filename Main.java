public class Main {
 public static void main(String args[])
    {

        Patka patkeKojeLete = new PatkeKojeLete();
        Patka patkeKojeNeLete = new PatkeKojeNeLete();
        Patka gumenaPatka = new GumenaPatka();
        Patka drvenaPatka = new DrvenaPatka();
	
       
        System.out.println("Ukupna populacija pataka je: " + Patka.brojac);

        patkeKojeLete.getLetenje().leti();
        patkeKojeLete.getPlivanje().pliva();
        patkeKojeLete.getHodanje().hoda();
        patkeKojeLete.getProizvodimZvuk().proizvodimZvuk();
        patkeKojeNeLete.getPlivanje().pliva();
        patkeKojeNeLete.getProizvodimZvuk().proizvodimZvuk();
        patkeKojeNeLete.getHodanje().hoda();
        gumenaPatka.getProizvodimZvuk().proizvodimZvuk();
        patkeKojeLete.pocniNositiJaja();
        patkeKojeNeLete.pocniNositiJaja();


     for(;true;){
        try {
           Thread.sleep(2000);
        } catch (InterruptedException e){

        }
      System.out.println("Ukupan broj je: " + Objekat.getInstance().getBrojJaja());
     }
    }
}
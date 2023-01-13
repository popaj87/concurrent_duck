public class PatkeKojeNeLete extends Patka implements Runnable{

    public String Osobina;

    public PatkeKojeNeLete(){
      super();
      this.ponasanjeLetenja = null;
      this.ponasanjePlivanja = new PlivanjeNogama();
      this.ponasanjeProizvodimZvuk =  new ProizvodimZvukGace();
    }

    public void leti(){
      if(this.ponasanjeLetenja != null){
      this.ponasanjeLetenja.leti();
      } else {
        System.out.println("Ja ne znam letjeti");
      }
    }

    public void pliva(){
      if(this.ponasanjePlivanja != null){
        this.ponasanjePlivanja.pliva();
      } else {
        System.out.println("Ja ne znam plivati");
      }
    }

    public void proizvodimZvuk(){
      if(this.ponasanjeProizvodimZvuk != null){
        this.ponasanjeProizvodimZvuk.proizvodimZvuk();
      } else {
        System.out.println("Ja ne proizvodim zvuk");
      }
    }

    @Override
    public void display(){ 
      System.out.println("Ja sam patka koja se boji visine"); 
    }

     public synchronized void nosiJaja(){
        Gnijezdo gnijezdo = Gnijezdo.getInstance();

        while(true){

        System.out.println("Cekam gnijezdo " + "Patka koja ne leti");
        
        synchronized(gnijezdo){
            System.out.println("Ulazim u gnijezdo - " + "Patka koja ne leti");
            System.out.println("=====================");
        try {
           Thread.sleep(2000);
        } catch (InterruptedException e) {

        }

        gnijezdo.dodajJaja();
        System.out.println("Napustam gnijezdo - " + "Patka koja ne leti");
        System.out.println("=====================");

        }
      }
    }


    @Override
    public void run(){
      this.pliva();
      this.leti();
      this.proizvodimZvuk();
      this.nosiJaja();
    }

}
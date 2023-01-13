public class DrvenaPatka extends Patka implements Runnable {

    public String Osobina;

    public DrvenaPatka(){
      super();
      this.ponasanjeLetenja = new LetenjeNaRaketniPogon();
      this.ponasanjePlivanja = null;
      this.ponasanjeProizvodimZvuk = null;
    }

    @Override
    public void display(){ 
      System.out.println("Ja sam drvena patka"); 
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
    public void run(){
      this.pliva();
      this.leti();
      this.proizvodimZvuk();
    }

}
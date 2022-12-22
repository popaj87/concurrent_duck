public class DrvenaPatka extends Patka {

    public String Osobina;

    public DrvenaPatka(){
      super();
      this.ponasanjeLetenja = null;
      this.ponasanjePlivanja = null;
      this.ponasanjeProizvodimZvuk = null;
      this.ponasanjeHodanje = null;
    }

    @Override
    public void display(){ 
      System.out.println("Ja sam drvena patka"); 
    }

}
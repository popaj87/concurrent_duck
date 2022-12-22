public class GumenaPatka extends Patka {
    
    public String Osobina;

    public GumenaPatka(){
      super();
      this.ponasanjeLetenja = null;
      this.ponasanjePlivanja = null;
      this.ponasanjeProizvodimZvuk = new ProizvodimZvukPisti();
      this.ponasanjeHodanje = null;
    }

    @Override
    public void display(){ 
      System.out.println("Ja sam gumena patka"); 
    }

}
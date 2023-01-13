public class GumenaPatka extends Patka implements Runnable {
    
    public String Osobina;

    public GumenaPatka(){
      super();
      this.ponasanjeLetenja = null;
      this.ponasanjePlivanja = null;
      this.ponasanjeProizvodimZvuk = new ProizvodimZvukPisti();
    }

    @Override
    public void display(){ 
      System.out.println("Ja sam gumena patka"); 
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
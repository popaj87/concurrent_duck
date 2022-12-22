public class PatkeKojeLete extends Patka{

    public String Osobina;

    public PatkeKojeLete(){
      super();
      this.ponasanjeLetenja = new LetenjeKrilima();
      this.ponasanjePlivanja = new PlivanjeNogama();
      this.ponasanjeProizvodimZvuk =  new ProizvodimZvukGace();
      this.ponasanjeHodanje = new PonasanjeHodanje();
      this.nosenjeJaja = new NosenjeJaja("Patka koja leti");
    }

    @Override
    public void display(){ 
      System.out.println("Ja sam patka koja leti"); 
    }
}
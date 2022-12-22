public class PatkeKojeNeLete extends Patka {

    public String Osobina;

    public PatkeKojeNeLete(){
      super();
      this.ponasanjeLetenja = null;
      this.ponasanjePlivanja = new PlivanjeNogama();
      this.ponasanjeProizvodimZvuk =  new ProizvodimZvukGace();
      this.ponasanjeHodanje = new PonasanjeHodanje();
      this.nosenjeJaja = new NosenjeJaja("Patka koja ne leti");
    }

    @Override
    public void display(){ 
      System.out.println("Ja sam patka koja se boji visine"); 
    }


}
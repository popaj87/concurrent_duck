public abstract class Patka {

  public static int brojac;
  protected Letenje ponasanjeLetenja;
  protected Plivanje ponasanjePlivanja;
  protected ProizvodimZvuk ponasanjeProizvodimZvuk;
  protected Hodanje ponasanjeHodanje;
  protected NosenjeJaja nosenjeJaja;
    
    public Patka(){
       brojac++;
    }

    public abstract void display();


    public Letenje getLetenje() {
      return ponasanjeLetenja;
    }

    public Plivanje getPlivanje() {
      return ponasanjePlivanja;
    }

    public ProizvodimZvuk getProizvodimZvuk() {
      return ponasanjeProizvodimZvuk;
    }

    public Hodanje getHodanje() {
      return ponasanjeHodanje;
    }

    public NosenjeJaja getNosenjeJaja() {
      return nosenjeJaja;
    }

    public void pocniNositiJaja(){
      new Thread(nosenjeJaja).start();
    }

}




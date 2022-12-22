public class Objekat {

  private static Objekat objekat;

  private int brojJaja;

  private Objekat(){
    brojJaja = 0;
  }

  public static synchronized Objekat getInstance(){
    if(objekat == null){
      objekat = new Objekat();
    }
    return objekat;
  }

  public void dodajJaja(){
    brojJaja++;
  }

  public int getBrojJaja(){
    return brojJaja;
  }

}
public class Gnijezdo {

  private static Gnijezdo gnijezdo = new Gnijezdo();

  private int brojJaja;

  private Gnijezdo(){
    brojJaja = 0;
  }

  public static synchronized Gnijezdo getInstance(){
    return gnijezdo;
  }

  public void dodajJaja(){
    brojJaja++;
  }

  public int getBrojJaja(){
    return brojJaja;
  }

}
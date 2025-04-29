import java.util.Scanner;
public class Publikace {
    Scanner sc = new Scanner(System.in);

   private String nazev;
   private String autor;
   private int rokVydani;
   private int isbn;
   private int pocetStranek;

    public Publikace(){
        System.out.println("Zadej název knihy");
        nazev = sc.nextLine();
        System.out.println("Zadej jméno autora");
        autor = sc.nextLine();
        System.out.println("Zadej rok vydání");
        rokVydani = sc.nextInt();
        System.out.println("Zadej isbn");
        isbn = sc.nextInt();
        System.out.println("Zadej počet stránek");
        pocetStranek = sc.nextInt();
    }

    public void vypisInfo(){
        System.out.println("Kniha se jmenuje " + nazev);
        System.out.println("Jméno autora je " + autor);
        System.out.println("Kniha byla vydána v roce " + rokVydani);
        System.out.println("Za boha nevim co je ISBN, ale je to " + isbn);
        System.out.println("Kniha má " + pocetStranek + " (to je hodně 💀)");
    }

    public String getNazev(){
        return nazev;
    }
    public String getAutor(){
        return autor;
    }
    public int getRokVydani(){
        return rokVydani;
    }
    public int getIsbn(){
        return isbn;
    }
    public int getPocetStranek(){
        return pocetStranek;
    }

}

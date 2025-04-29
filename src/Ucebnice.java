public class Ucebnice extends Publikace{

    String predmet;

    public Ucebnice() {
        System.out.println("Jaký předmět učí učebnice?");
        predmet = sc.nextLine();
    }
    @Override
    public void vypisInfo(){
        super.vypisInfo();
        System.out.println("Učebnice slouží k výuce předmětu " + predmet);
    }

    public String getPredmet() {
        return predmet;
    }
}

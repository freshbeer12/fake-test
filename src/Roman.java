public class Roman extends Publikace {

    String zanr;


    public Roman() {
        System.out.println("Jaký je žánr knihy?");
        zanr = sc.nextLine();
    }
    @Override
    public void vypisInfo(){
        super.vypisInfo();
        System.out.println("Druh žánru je " + zanr);
    }

    public String getZanr() {
        return zanr;
    }
}

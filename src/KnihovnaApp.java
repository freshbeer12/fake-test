import java.util.Scanner;
import java.util.ArrayList;

public class KnihovnaApp {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);



            ArrayList<Roman> romans = new ArrayList<>();
            ArrayList<Ucebnice> ucebnices = new ArrayList<>();

            boolean pokracovat = true;


            while (pokracovat) {
                System.out.println("Zvolte co chcete přidat:");
                System.out.println("1. Přidat Romana");
                System.out.println("2. Přidat učebnici");
                System.out.println("3. Zobrazit nejstarší učebnici");
                System.out.println("4. Celkový počet stránek v učebnicích");
                System.out.println("5. Vypsat jména autorů matematických učebnic");
                System.out.println("6. Jméno autora nejdelšího Romana");
                System.out.println("7. Vypsat informaci zda se mezi romány vyskytuje žánr fantasy");
                System.out.println("8. Konec");


                int volba = sc.nextInt();
                sc.nextLine();
                switch (volba) {
                    case 1:
                        romans.add(new Roman());
                        break;
                    case 2:
                        ucebnices.add(new Ucebnice());
                        break;
                    case 3:
                        if (ucebnices.size() > 0) {
                            Ucebnice nejstarsiUcebnice = ucebnices.get(0);
                            for (Ucebnice ucebnice : ucebnices) {
                                if (ucebnice.getRokVydani() < nejstarsiUcebnice.getRokVydani()) {
                                    nejstarsiUcebnice = ucebnice;
                                }
                            }
                            nejstarsiUcebnice.vypisInfo();
                        } else {
                            System.out.println("Nebyla zadána žádná učebnice");
                        }
                        break;
                    case 4:
                        System.out.println("Celkový počet stránek: " + (romans.size() + ucebnices.size()));
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    case 8:
                        pokracovat = false;
                        break;
                    default:
                        System.out.println("Konec programu");
                        break;
                }



        }
    }
}

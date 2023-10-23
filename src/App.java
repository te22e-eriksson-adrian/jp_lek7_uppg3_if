import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tangentbord = new Scanner(System.in);

        //A
        System.out.println("Detta är ett test för att se om du är berättigad för skatteavdrag för två bostäder.");
        System.out.print("Hur långt ifrån din arbetsplats bor du (är du skriven): ");
        int distans = tangentbord.nextInt();
        tangentbord.nextLine();
        if (distans>=50){
            System.out.print("Är du ensamstående eller bor du tillsammans med någon (Svara 1 för ensam, 2 för icke ensam): ");
            int bostatus = tangentbord.nextInt();
            tangentbord.nextLine();
            System.out.println("     ");
            switch(bostatus)
            {
                case 1:
                System.out.println("Du är berättigad skatteavdrag efter att du levt ensam i 1 år i två bostäder med avståndet 50 km eller mer.");
                break;
                case 2:
                System.out.println("Du är berättigad skatteavdrag 3 år efter att du levt med din livskamrat i två bostäder med avståndet 50 km eller mer.");
                break;
                default:
                System.out.println("Fel svar!");
                break;
            }
        }else{
            System.out.println("Du är tyvärr inte berättigad skatteavdrag.");
        }
        tangentbord.close();
    }
}

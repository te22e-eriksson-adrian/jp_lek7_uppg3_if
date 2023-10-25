import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tangentbord = new Scanner(System.in);

        //A
        System.out.println("Detta är ett test för att se om du är berättigad för skatteavdrag för två bostäder.");
        System.out.print("Hur långt ifrån din arbetsplats bor du i km (är du skriven): ");
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

        //B
        System.out.println("      ");
        System.out.println("Inmata beräkning nedan (ex. 5+3 eller 5-3)");
        String beräkning = tangentbord.nextLine();
        int plus_plats = beräkning.indexOf("+");
        int svar;
        if (plus_plats==-1){
            int minus_plats=beräkning.indexOf("-");
            String tal1_text = beräkning.substring(0, minus_plats);
            String tal2_text = beräkning.substring(minus_plats+1, beräkning.length());
            System.out.println(tal1_text+"+"+tal2_text);
            int tal1 = Integer.parseInt(tal1_text);
            int tal2 = Integer.parseInt(tal2_text);
            svar = tal1-tal2;
            System.out.println("Svaret är: "+svar);
        }
        else{
            String tal1_text = beräkning.substring(0, plus_plats);
            String tal2_text = beräkning.substring(plus_plats+1, beräkning.length());
            System.out.println(tal1_text+"+"+tal2_text);
            int tal1 = Integer.parseInt(tal1_text);
            int tal2 = Integer.parseInt(tal2_text);
            svar = tal1+tal2; 
            System.out.println("Svaret är: "+svar);
        }

        //C
        System.out.println("      ");
        int[] heltal_array = new int[3];
        System.out.print("Inmata heltal 1 här: ");
        heltal_array [0] = tangentbord.nextInt();
        tangentbord.nextLine();
        System.out.print("Inmata heltal 2 här: ");
        heltal_array [1] = tangentbord.nextInt();
        tangentbord.nextLine();
        System.out.print("Inmata heltal 3 här: ");
        heltal_array [2] = tangentbord.nextInt();
        tangentbord.nextLine();
        //jj
        tangentbord.close();
    }
}

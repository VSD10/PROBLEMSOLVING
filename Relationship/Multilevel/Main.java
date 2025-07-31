import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Stall Type");
        System.out.println("1.Silver Stall");
        System.out.println("2.Gold Stall");
        System.out.println("3.Platinum Stall");

        int choice = Integer.parseInt(sc.nextLine());

        switch (choice) {
            case 1:
                System.out.println("Enter Stall details in comma separated(Stall Name,Stall Description,Owner Name,Stall Cost)");
                String[] silverInput = sc.nextLine().split(",");
                SilverStall silver = new SilverStall(silverInput[0], silverInput[1], silverInput[2], Integer.parseInt(silverInput[3]));
                silver.display();
                break;

            case 2:
                System.out.println("Enter Stall details in comma separated(Stall Name,Stall Description,Owner Name,Stall Cost,Number of TV set)");
                String[] goldInput = sc.nextLine().split(",");
                GoldStall gold = new GoldStall(goldInput[0], goldInput[1], goldInput[2], Integer.parseInt(goldInput[3]), Integer.parseInt(goldInput[4]));
                gold.display();
                break;

            case 3:
                System.out.println("Enter Stall details in comma separated(Stall Name,Stall Description,Owner Name,Stall Cost,Number of TV set,Number of Projectors)");
                String[] platinumInput = sc.nextLine().split(",");
                PlatinumStall platinum = new PlatinumStall(platinumInput[0], platinumInput[1], platinumInput[2], Integer.parseInt(platinumInput[3]),
                        Integer.parseInt(platinumInput[4]), Integer.parseInt(platinumInput[5]));
                platinum.display();
                break;

            default:
                //System.out.println("Invalid choice");
                break;
        }

        sc.close();
    }
}
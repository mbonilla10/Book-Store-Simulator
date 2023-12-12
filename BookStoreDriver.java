
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author melvinbonilla
 */
public class BookStoreDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Bookstore store = new Bookstore();
        Scanner sc = new Scanner(System.in);
        ArrayList<String> Amount = new ArrayList<>();
        
        while(!(store.getPremiumMemberList().isEmpty())) { 
       
            // Store opens
            System.out.println();
            System.out.println("Welcome to the automated BookStore System!");
            System.out.println("\t 1. Make a purchase!");
            System.out.println("\t 2. Register as a new premium member.");
            System.out.println("\t 3. Check Premium Member Status.");
            System.out.println("\t 4. Request Restock.");
            System.out.println("\t 5. Check Inventory Values.");
            System.out.println("\t 6. Compare products.");
            System.out.println("\t 7. Exit.");

            int num = sc.nextInt();
            
            switch(num) {
                
                case 1:
                    // Purchase an item
                    purchase(store, sc, Amount);
                    break;
                    
                case 2:
                    // Register a new member
                    registerNewMember(store, sc);
                    break;
                    
                case 3:
                    // Check status
                    checkMemberStatus(store, sc);
                    break;
                    
                case 4:
                    // Restock requested
                    store.restockProduct(sc);
                    break;
                    
                case 5:
                    // Value if items in stock
                    store.inventoryValue(sc);
                    break; 
                    
                case 6:
                    // Compares two objects
                    compareObjects(store, sc);
                    break;
                    
                case 7:
                    // Quit
                    System.out.println();
                    System.out.println("Goodbye, enjoy the rest of your day!");
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("Sorry, but you need to enter a 1, 2, 3 or a 4");
                    break;
                    
            }
        }
    }
    
    private static void checkMemberStatus(Bookstore store, Scanner sc) {
        System.out.println();
        System.out.println("**** PREMIUM MEMBERS ***");
            
        for(int i = 0; i < store.getPremiumMemberList().size(); i++) {
            System.out.println(" Member: " + store.getPremiumMemberList().get(i).getName() + ", "
                    + "Dues Paid: " + store.getPremiumMemberList().get(i).hasPaidDues());
        }
    }
    
    private static void purchase(Bookstore store, Scanner sc, ArrayList<String> Amount) {
        // Fix
        System.out.println("*** Which of the following would you like to purchase? ***");
        System.out.println("ID #001: The Dark Knight - DVD - $7.00 - Stock: " + store.getDVDInventory().get(0).getStock());
        System.out.println("ID #002: Currents : Tame Impala - CD - $10.50 - Stock: " + store.getCDInventory().get(0).getStock());
        System.out.println("ID #003: 12 Rules for Life : Jordan Peterson - BOOK - $8.25 - Stock: " + store.getBookInventory().get(0).getStock());
        System.out.println("ID #004: A Tale of Two Cities : Charles Dickens - BOOK - $13.75 - Stock: " + store.getBookInventory().get(1).getStock());
        
        int choice = sc.nextInt();
        int cartSize = 0;
        double completeTotal = 0.00;
        
        switch(choice) {
            
            case 1:
                cartSize += store.getDVDInventory().get(choice - 1).getStock();
                completeTotal += store.getDVDInventory().get(choice - 1).getPrice();
                break;
            case 2:
                cartSize += store.getCDInventory().get(choice - 2).getStock();
                completeTotal += store.getCDInventory().get(choice - 2).getPrice();
                break;
            case 3:
                cartSize += store.getBookInventory().get(choice - 3).getStock();
                completeTotal += store.getBookInventory().get(choice - 3).getPrice();
                break;
            case 4:
                cartSize += store.getBookInventory().get(choice - 4).getStock();
                completeTotal += store.getBookInventory().get(choice - 4).getPrice();
                break;
        }
        
        System.out.println("You have " + cartSize + " item(s) in your cart. Are you done shopping? (Y/N)");
        
        char letter = sc.next().charAt(0);
        
        if(letter == 'Y' || letter == 'y') {
            System.out.println("Thank you for shopping with us. Your total is: $" + completeTotal);
            System.out.println();
            System.out.println("Please select which member is making the purchase: ");
            System.out.println("\t 1. Melvin");
            System.out.println("\t 2. Codie");
            System.out.println("\t 3. Nadia");
            System.out.println("\t 4. Register a new member.");
            
            int next = sc.nextInt();
            
            while(next < 5) {
                
                switch(next) {
                    
                    case 1:
                        System.out.println("Thank you for shopping with us, " + store.getPremiumMemberList().get(0).getName()
                                + ". Your total, including this month's premium fee, is : $" + (completeTotal + 5.00));
                        System.exit(0);
                    case 2:
                        System.out.println("Thank you for shopping with us, " + store.getPremiumMemberList().get(1).getName()
                                + ". Your total is, including this month's premium fee, : $" + (completeTotal + 5.00));
                    case 3:
                        System.out.println("Thank you for shopping with us, " + store.getPremiumMemberList().get(2).getName()
                                + ". Your total is, including this month's premium fee, : $" + (completeTotal + 5.00));
                        System.exit(0);
                    case 4:
                        System.out.println("Premium membership costs $5, this will be added to your total.");
                        System.out.println("Let's get you registered as a new member!");
                        System.out.println("Would you like to register as a premium member?");
                        System.out.println("\t 1. Continue as a free-tier");
                        System.out.println("\t 2. @*@*@ Premium @*@*@");
                        
                        int further = sc.nextInt();
                        
                        switch(further) {
                            case 1:
                                System.out.println("Please enter your name:");
                                String name = sc.next();
                                System.out.println();
                                System.out.println("Thank you for shopping with us, " + name + ". Your total is : $" + completeTotal 
                                        + ". Being a premium member allows for many benefits.");
                                System.exit(0);
                            case 2:
                                System.out.println("Please enter your name:");
                                String premiumName = sc.next();
                                System.out.println();
                                System.out.println("Thank you for shopping with us, " + premiumName + ". Your total (including premium) is : $" 
                                        + (completeTotal + 5.00));
                                System.out.println("You have earned *~* 10 reward points *~* and a 20% off coupon for your next purchase!");
                                store.addNewMember(premiumName, further, true);
                                break;
                        }
                }
            }
        }
    }
    
    private static void registerNewMember(Bookstore store, Scanner sc) {
        System.out.println("Let's get you registered as a new member!");
        System.out.println("Would you like to register as a premium member?");
        System.out.println("\t 1. Continue as free-tier");
        System.out.println("\t 2. @*@*@ Premium @*@*@");
        
        int num = sc.nextInt();
        
        switch(num) {
            case 1:
                System.out.println();
                System.out.println("What's your name?");
                String secondCName = sc.next();
                System.out.println("Sorry " + secondCName + ", free-tier members do not get any benefits. "
                        + "If you join as a premium member, you can check your status anytime, and get rewards! ");
                System.out.println();
                break;
            case 2:
                System.out.println();
                System.out.println("Please enter the name you wish to register:");
                String secondCPremiumName = sc.next();
                System.out.println("Thank you for joining us, " + secondCPremiumName + ". We will send you"
                        + " our best deals & rewards! Feel free to check your status anytime.");
                System.out.println();
                store.addNewMember(secondCPremiumName, num, true);
        }
    }
    
    private static void compareObjects(Bookstore store, Scanner sc) {
        System.out.println();
        System.out.println("Enter the ID of product 1: ");
        int firstProduct = sc.nextInt();
        System.out.println("Enter the ID of product 2: ");
        int secondProduct = sc.nextInt();
                    
        if(firstProduct == 001 && secondProduct == 002) {
            store.getDVDInventory().get(0).compareTo(store.getCDInventory().get(0));
        } else if(firstProduct == 001 && secondProduct == 003) {
            store.getDVDInventory().get(0).compareTo(store.getBookInventory().get(0));
        } else if(firstProduct == 001 && secondProduct == 004) {
            store.getDVDInventory().get(0).compareTo(store.getBookInventory().get(1));
        } else if(firstProduct == 002 && secondProduct == 001) {
            store.getCDInventory().get(0).compareTo(store.getDVDInventory().get(0));
        } else if(firstProduct == 002 && secondProduct == 003) {
            store.getCDInventory().get(0).compareTo(store.getBookInventory().get(0));
        } else if(firstProduct == 002 && secondProduct == 004) {
            store.getCDInventory().get(0).compareTo(store.getBookInventory().get(1));
        } else if(firstProduct == 003 && secondProduct == 001) {
            store.getBookInventory().get(0).compareTo(store.getDVDInventory().get(0));
        } else if(firstProduct == 003 && secondProduct == 002) {
            store.getBookInventory().get(0).compareTo(store.getCDInventory().get(0));
        } else if(firstProduct == 003 && secondProduct == 004) {
            store.getBookInventory().get(0).compareTo(store.getBookInventory().get(1));
        } else if(firstProduct == 004 && secondProduct == 001) {
            store.getBookInventory().get(1).compareTo(store.getDVDInventory().get(0));
        } else if(firstProduct == 004 && secondProduct == 002) {
            store.getBookInventory().get(1).compareTo(store.getCDInventory().get(0));
        } else if(firstProduct == 004 && secondProduct == 003) {
            store.getBookInventory().get(1).compareTo(store.getBookInventory().get(0));
        }
    }
}
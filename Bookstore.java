
import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author melvinbonilla
 */
public class Bookstore implements BookstoreSpecification {
    
    private ArrayList<Books> bookInventory = new ArrayList<Books>();
    private ArrayList<CDs> cdInventory = new ArrayList<CDs>();
    private ArrayList<DVDs> dvdInventory = new ArrayList<DVDs>();
    private ArrayList<Member> memberList = new ArrayList<Member>();
    private ArrayList<Premium> premiumMemberList = new ArrayList<Premium>();
    
    /**
     * Bookstore constructor, generates inventory and members.
     */
    Bookstore() {
        generateInventory();
        generateMembers();
    }
    
    /**
     * Generates store inventory.
     */
    private void generateInventory() {
        DVDs object1 = new DVDs("The Dark Knight - DVD", "Action", 7.00, 5);
        dvdInventory.add(object1);
        CDs object2 = new CDs("Currents - CD", "Tame Impala", 10.50, 10);
        cdInventory.add(object2);
        Books object3 = new Books("12 Rules for Life - BOOK", "Jordan Peterson", 8.25, 4);
        bookInventory.add(object3);
        Books object4 = new Books("A Tale of Two Cities - BOOK", "Charles Dickens", 13.75, 11);
        bookInventory.add(object4);
    }
    
    /**
     * Generates members of the store.
     */
    private void generateMembers() {
        Premium person1 = new Premium("Melvin", 5, true);
        premiumMemberList.add(person1);
        Premium person2 = new Premium("Codie", 4, true);
        premiumMemberList.add(person2);
        Premium person3 = new Premium("Nadia", 2, true);
        premiumMemberList.add(person3);
    }

    /**
     * Adds members to premiumMemberList.
     * @param name
     * @param noPurchases
     * @param hasPaidDues 
     */
    public void addNewMember(String name, int noPurchases, boolean hasPaidDues) {
        Premium person5 = new Premium(name, noPurchases, hasPaidDues);
        premiumMemberList.add(person5);
    }
    
    /**
     * Getter method for bookInventory.
     * @return bookInventory
     */
    public ArrayList<Books> getBookInventory() {
        return bookInventory; 
    }
    
    /**
     * Getter method for CDInventory.
     * @return CDInventory
     */
    public ArrayList<CDs> getCDInventory() {
        return cdInventory; 
    }
    
    /**
     * Getter method for DVDInventory.
     * @return dvdInventory
     */
    public ArrayList<DVDs> getDVDInventory() {
        return dvdInventory; 
    }
    
    /**
     * Getter method for memberList.
     * @return memberList
     */
    public ArrayList<Member> getMemberList() {
        return memberList; 
    }
    
    /**
     * Getter method for premiumMemberList.
     * @return premiumMemberList
     */
    public ArrayList<Premium> getPremiumMemberList() {
        return premiumMemberList; 
    }
    
    /**
     * Decrements inventory by one.
     * @param item 
     */
    public void decrementInventory(int item) {
        int lessInventory;
        
        if(item <= bookInventory.size()) {
            lessInventory = bookInventory.size() - 1;
        } else if(item <= cdInventory.size()) {
            lessInventory = cdInventory.size() - 1;
        } else {
            lessInventory = dvdInventory.size() - 1;
        }
    }
    
    /**
     * Gets choice of media wanted.
     * @param item
     * @return mediaChoice
     */
    public String getCartItem(int item) {
        String mediaChoice = "";
        
        if(item <= bookInventory.size()) {
            mediaChoice = bookInventory.get(item - 1).getName() + ", " + bookInventory.get(item - 1).getType();
        } else if(item <= cdInventory.size()) {
            mediaChoice = cdInventory.get(item - 1).getName() + ", " + cdInventory.get(item - 1).getType();
        } else {
            mediaChoice = dvdInventory.get(item - 1).getName() + ", " + dvdInventory.get(item - 1).getType();
        }
        return mediaChoice;
    }
    
    /**
     * Displays the status of the member.
     * @param memberNum 
     */
    public void displayMemberStatus(int memberNum) {
       boolean currentStatus; 
       
       if(memberNum <= premiumMemberList.size()) {
           currentStatus = premiumMemberList.get(memberNum - 1).hasPaidDues();
           System.out.println(currentStatus);
       }
    }

    /**
     * Given a product id and a product quantity, update
     * stock by adding amount to existing product quantity.
     * @param sc
     * @return 
     */
    @Override
    public int restockProduct(Scanner sc) {
        System.out.println("Enter Product ID you wish to request a restock for: ");
        int productId = sc.nextInt();
        
        System.out.println("Enter the amount you want restocked: ");
        int amount = sc.nextInt();
        
        if(productId == 001) {
            amount += dvdInventory.get(0).getStock();
            System.out.println("The stock for item #001 will be updated to: " + amount + ", by the end of next week!");
        } else if(productId == 002) {
            amount += cdInventory.get(0).getStock();
            System.out.println("The stock for item #002 will be updated to: " + amount + ", by the end of next week!");
        } else if(productId == 003) {
            amount += bookInventory.get(0).getStock();
            System.out.println("The stock for item #003 will be updated to: " + amount + ", by the end of next week!");
        } else if(productId == 004) {
            amount += bookInventory.get(1).getStock();
            System.out.println("The stock for item #004 will be updated to: " + amount + ", by the end of next week!");
        }
        return 1;
    }

    /**
     * Calculate and return dollar amount for current inventory
     * of products that are in stock.
     * @param sc
     * @return total in stock value
     */
    @Override
    public double inventoryValue(Scanner sc) {
        if(!(dvdInventory.isEmpty())) {
            System.out.println();
            System.out.println("#001 DVD Inventory Total Dollar Amount: $" + (dvdInventory.get(0).getPrice() * dvdInventory.get(0).getStock()));
            System.out.println();
            System.out.println("#002 CD Inventory Total Dollar Amount: $" + (cdInventory.get(0).getPrice() * cdInventory.get(0).getStock()));
            System.out.println();
            System.out.println("#003 Book Inventory Total Dollar Amount: $" + (bookInventory.get(0).getPrice() * bookInventory.get(0).getStock()));
            System.out.println();
            System.out.println("#004 Book Inventory Total Dollar Amount: $" + (bookInventory.get(1).getPrice() * bookInventory.get(1).getStock()));
        }
        return 1;
    }
    
}

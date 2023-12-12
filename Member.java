
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author melvinbonilla
 */
public abstract class Member {
    
    private String name;
    private int numPurchases;
   
    /**
     * Constructor for member.
     * @param name
     * @param numPurchases 
     */
   Member(String name, int numPurchases) {
        this.name = name;
        this.numPurchases = numPurchases;
    }
  
   /**
    * Getter method for member name.
    * @return name
    */
   public String getName() {
       return name;
    }

   /**
    * Setter method for member name.
    * @param name 
    */
   public void setName(String name) {
       this.name = name;
    }
   
   /**
    * Getter method for member number of purchases.
    * @return numPurchases
    */
   public int getNumPurchases() {
       return numPurchases;
    }

   /**
    * Setter method for member number of purchases.
    * @param numPurchases 
    */
   public void setPurchases(int numPurchases) {
       this.numPurchases = numPurchases;
    }
   
}

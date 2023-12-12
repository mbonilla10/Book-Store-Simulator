
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author melvinbonilla
 */
public interface BookstoreSpecification {
   
    /**
     * Given a product id and a product quantity, update
     * stock by adding amount to existing product quantity.
     * @param sc
     * @return 
     */
   public int restockProduct(Scanner sc);
   
   /**
    * Calculate and return dollar amount for current inventory
    * of products that are in stock.
    * @param sc
    * @return total in stock value
    */
   public double inventoryValue(Scanner sc);
    
}

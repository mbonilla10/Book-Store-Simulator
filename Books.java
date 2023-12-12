/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author melvinbonilla
 */
public class Books extends Product {
    
    /**
     * Constructor for Books, extending from Product.
     * @param bookName
     * @param bookAuthor
     * @param bookPrice
     * @param bookNum 
     */
    Books(String bookName, String bookAuthor, double bookPrice, int bookNum) {
        super(bookName, bookAuthor, bookPrice, bookNum);
    }
   
}
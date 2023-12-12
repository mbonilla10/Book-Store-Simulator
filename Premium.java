/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author melvinbonilla
 */
public class Premium extends Member {
    
    private boolean hasPaidDues;
    
    /**
     * Constructor for premium member, extending from member.
     * @param pName
     * @param noPurchases
     * @param hasPaidDues 
     */
    Premium(String pName, int noPurchases, boolean hasPaidDues) {
        super(pName, noPurchases);
        this.hasPaidDues = hasPaidDues;
    }
    
    /**
     * Getter method for hasPaidDues.
     * @return hasPaidDues
     */
    public boolean hasPaidDues() {
        return hasPaidDues;
    }
    
    /**
     * Setter method for hasPaidDues.
     * @param hasPaidDues 
     */
    public void setPaidDues(boolean hasPaidDues) {
        this.hasPaidDues = hasPaidDues;
    }
    
}

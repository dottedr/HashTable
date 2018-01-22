/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

/**
 *
 * @author sabinaadamska
 */
public class DataStructures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SetHash setHash = new SetHash(5);
        setHash.delete(26);
        setHash.printList();
        setHash.search(26);
        setHash.printList();
    }
    
}

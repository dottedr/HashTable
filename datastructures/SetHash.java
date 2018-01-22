/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

import java.util.Arrays;

/**
 *
 * @author sabinaadamska
 */
public class SetHash {

    private static int[] table; 
    private int size = 5;

    public SetHash(int size) {
        table = new int[size];
        table[0]=-1;
        table[1]=26;
        table[2]=11;
        table[3]=3;
        table[4]=26;
    }

    public boolean search(int key) {
        for (int i = key % table.length; i < size-1; i = (i + 1) % table.length) {
            
            if (table[i]==key) {
                System.out.print(key+" found at position "+i);
                return true;
            }
            else if (table[i]==-2){
           //dont look at -2
           //search again
            }
        }
        System.out.print("dupa, not here");
        return false;
    }
    
    public boolean delete(int key){
        for (int i = key % table.length; i < size-1; i = (i + 1) % table.length) {
            
            if (table[i]==key) {
                System.out.print(key+" found at position "+i);
                table[i]=-1;
                System.out.print("\n deleted "+key);
                return true;
            }
            
        }
        System.out.print("ain't such number");
        return false;
    
    }
    
    public void printList(){
        System.out.println(Arrays.toString(table));
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inventorytracker;

/**
 *
 * @author LorenzoSJ
 */
public class InventoryTracker {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    
    public int checkStockLevel(String stock) {
        return 0;
    }
    
    public void alertLowStock(String stock, int currentLevel, int threshold) {
        if (currentLevel <= threshold) {
            System.out.println("LOW STOCK ALERT for " + stock + ": " + currentLevel);
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        Gadget gadget1 = new Gadget("Laptop", "Asus");
        

        gadget1.informasi();
        gadget1.nyala(true);
        System.out.println();
        
        Laptop laptop1 = new Laptop("Asus ROG Strix G15", "Asus", "15.6 inch", "AMD Ryzen 7 6800H", "16GB DDR5");
        laptop1.informasi();
        
        Smartwatch appleWatch = new Smartwatch("Apple Watch Ultra", "Apple", 75.0);
        appleWatch.nyala(true);
        

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Laptop extends Gadget {
    private String ukuranLayar;
    private String prosesor;
    private String ram;

    public Laptop(String nama, String merek, String ukuranLayar, String prosesor, String ram) {
        super(nama, merek);  // Call Gadget constructor with required parameters
        this.ukuranLayar = ukuranLayar;
        this.prosesor = prosesor;
        this.ram = ram;
    }

    @Override
    public void informasi() {
        super.informasi();  // Call base class information method
        System.out.println("Ukuran Layar: " + ukuranLayar);
        System.out.println("Prosesor: " + prosesor);
        System.out.println("RAM: " + ram);
    }
}


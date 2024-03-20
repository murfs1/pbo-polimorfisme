/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Smartwatch extends Gadget {
    private double baterai;

    public Smartwatch(String nama, String merek, double baterai) {
        super(nama, merek);
        this.baterai = baterai;
    }

    public void cekBaterai() {
        System.out.println("Sisa baterai " + nama + ": " + baterai + "%");
    }

    // Overriding: metode 'toString' dari kelas Gadget untuk menyertakan informasi baterai
    @Override
    public String toString() {
        return super.toString() + "\nSisa Baterai: " + baterai + "%";
    }

    // Overloading: metode 'nyala' dengan 1 parameter (boolean)
    public void nyala(boolean isOn) {
        super.nyala(isOn);
        if (isOn) {
            System.out.println("Menghidupkan layar smartwatch...");
        } else {
            System.out.println("Mematikan layar smartwatch...");
        }
    }

    // Overloading: metode 'nyala' dengan 2 parameter (String, boolean)
    public void nyala(String mode, boolean isAlwaysOn) {
        System.out.println("Smartwatch " + nama + " dihidupkan dengan mode " + mode);
        if (isAlwaysOn) {
            System.out.println("Aktifkan mode always-on.");
        } else {
            System.out.println("Gunakan mode normal.");
        }
    }
}


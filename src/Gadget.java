/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Gadget {
    String nama;
    private String merek;

    public Gadget(String nama, String merek) {
        this.nama = nama;
        this.merek = merek;
    }

    public void informasi() {
        System.out.println("Nama Gadget: " + nama);
        System.out.println("Merek Gadget: " + merek);
    }

    // Overloading: metode 'nyala' dengan 1 parameter (boolean)
    public void nyala(boolean isOn) {
        if (isOn) {
            System.out.println("Gadget " + nama + " dinyalakan!");
        } else {
            System.out.println("Gadget " + nama + " dimatikan!");
        }
    }

    // Overloading: metode 'nyala' dengan 2 parameter (String, int)
    public void nyala(String mode, int durasi) {
        System.out.println("Gadget " + nama + " dihidupkan dengan mode " + mode + " selama " + durasi + " menit.");
    }

    // Overriding: metode abstrak 'toString' dari kelas Object
    @Override
    public String toString() {
        return "Informasi Gadget: " + nama + " (" + merek + ")";
    }
}






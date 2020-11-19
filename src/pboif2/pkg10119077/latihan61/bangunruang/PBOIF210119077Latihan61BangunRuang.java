/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119077.latihan61.bangunruang;

/**
 *
 * @author RAF
 * Nama             : Ridhwan Anwar Fauzan
 * NIM              : 10119077
 * Kelas            : IF - 2
 * Deskripsi        : Menghitung Volume Bangun Ruang
 */
public class PBOIF210119077Latihan61BangunRuang {

    
    public static void main(String[] args) {
        BolaBasket objB = new BolaBasket();
        objB.setR(7);
        System.out.println("Jari-Jari Bola Basket = "+objB.getR()+" cm");
        System.out.printf("Volume Bola Basket = %.1f cm^3 \n",objB.hitungVolume());
        System.out.println("");
        
        Tabung objT = new Tabung();
        objT.setR(10); objT.setT(21);
        System.out.println("Jari-Jari Tabung = "+objT.getR()+" cm");
        System.out.println("Tinggi Tabung = "+objT.getT()+" cm");
        System.out.printf("Volume Tabung = %.1f cm^3 \n",objT.hitungVolume());
        System.out.println("");
        
        Kerucut objK = new Kerucut();
        objK.setR(14);
        objK.setT(9);
        System.out.println("Jari-Jari Tabung = "+objK.getR()+" cm");
        System.out.println("Tinggi Tabung = "+objK.getT()+" cm");
        System.out.printf("Volume Tabung = %.1f cm^3 \n", objK.hitungVolume());
    }
    
}

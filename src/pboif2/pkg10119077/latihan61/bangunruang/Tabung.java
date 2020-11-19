/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119077.latihan61.bangunruang;

/**
 *
 * @author RAF
 */
public class Tabung extends BangunRuang{
    public int t;

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }
    
    public int getR() {
    return r;
    }

    public void setR(int r) {
        this.r = r;
    }
        
    @Override
    public double hitungVolume() {
        return Math.PI * Math.pow(r, 2) * t;
    }
}

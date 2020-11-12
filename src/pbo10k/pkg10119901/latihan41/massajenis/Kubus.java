/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119901.latihan41.massajenis;

/**
 *
 * @author User
 */
public class Kubus 
{
    private int sisi, massa;
    
    public int getSisi()
    {
        return sisi;
    }
    
    public void setSisi(int sisi)
    {
        this.sisi = sisi;
    }
    
    public int getMassa()
    {
        return massa;
    }
    
    public void setMassa(int massa)
    {
        this.massa = massa;
    }
    
    public int hitungVolume(int sisi)
    {
        return sisi * sisi * sisi;
    }
    
    public int hitungMassaJenis(int massa, int volume)
    {
        return massa / volume;
    }
}

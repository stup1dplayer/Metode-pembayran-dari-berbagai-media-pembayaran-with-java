/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_teori;

/**
 *
 * @author Asus
 */
public interface MetodeBayarPakeAplikasi extends MetodeBayar{
    public double bayarGopay (int idUser, double saldo, double belanjaTotal);
    public double bayarShopeePay (int idUser, double saldo, double belanjaTotal);
    
    
            
}

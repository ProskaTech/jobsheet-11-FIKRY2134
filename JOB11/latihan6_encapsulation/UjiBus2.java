/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JOB11.latihan6_encapsulation;

/**
 *Created by 21343007_M.fikry
 * @author HP
 */
public class UjiBus2 {
    public static void main(String args[]){
        bus2 busBesar = new bus2(40);
        busBesar.cetak();
        
        busBesar.addPenumpang(15);
        busBesar.cetak();
        
        busBesar.addPenumpang(5);
        busBesar.cetak();
        
        busBesar.addPenumpang(26);
        busBesar.cetak();
    }
}

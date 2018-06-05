/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class tugas2 {
    public static void main (String[] args){
        System.out.println ("Nama : chindi sefira");
        System.out.println("Nim : E1E117066");
        System.out.println("tugas : Membuktikan apakah ==untuk string benar atau salah");
        System.out.println(" ");
        String s1 = "saya suka menyanyi";
        String s2 = "saya suka menyanyi ";
        String s3 = "saya";
        String s4 = "suka";
        String s5 = "menyanyi";
        String s6 = s3+s4+s5;
        System.out.println("s1"+"="+s1);
        System.out.println("s6"+"="+s6);
        System.out.println(" ");
        System.out.println("untuk percobaan dengan");
        
        if(s6==s1){
            System.out.println("benar, s6==s1 tidak terbukti");
            System.out.println("maka dari itu, dibuktikan s1.equals(s6)");
            System.out.println(" ");
            System.out.println(" s1.equals(s6)");
            
            if(s1.equals(s6)){
                System.out.println("benar " + s1 + "=" + s6);
            }
        }
    }
    
}

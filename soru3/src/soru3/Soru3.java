/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soru3;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Soru3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sayi,asal;
        Scanner deger=new Scanner(System.in);
        System.out.print("Bir sayı Giriniz: ");
        sayi=deger.nextInt();        
       ikizSayilar(sayi);
        
        
       
    }
    public static void ikizSayilar(int sayi)
{
    for (int i = 0; i < sayi; i++) 
    {
        if (asalSayi(i)&&asalSayi(i+2)) 
        {
            System.out.println(i+" "+(i+2));
        }
    }
   
}
    public static boolean asalSayi(int sayi)
    {   
        if (sayi<2) {
            return false;
        }
            for (int i = 2; i < sayi; i++) 
            {
                if (sayi%i==0) 
                {
                    return false;
                }
            }
            return true;
        }     
    
        
    }
    


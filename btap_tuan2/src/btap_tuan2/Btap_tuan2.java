/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package btap_tuan2;

import java.util.Scanner;

/**
 *
 * @author yassu
 */
public class Btap_tuan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        tinhTich();
        

    }
    public  static void tinhchia(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap gia tri a: ");
        int a = sc.nextInt();
        System.out.println("nhap gia tri b: ");
        int b = sc.nextInt();
        System.out.println("tong = "+(a/b));

    }
    public  static void tinhtong(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap gia tri a: ");
        int a = sc.nextInt();
        System.out.println("nhap gia tri b: ");
        int b = sc.nextInt();
        System.out.println("tong = "+(a+b));

    }
    public static void tinhTich(){
         Scanner sc = new Scanner(System.in);
         System.out.println("nhap gia tri a: ");
          double a = sc.nextDouble();
          System.out.println("nhap gia tri b: ");
          double b = sc.nextDouble();
          double tich = a* b;
          System.out.println("Tich = "+tich);
        
    }
    
  
 }
    


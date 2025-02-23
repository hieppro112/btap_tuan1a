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
       tinhThuong();
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
        System.out.println("Nhap so thu nhat: ");
        double a = sc.nextDouble();
        System.out.println("Nhap so thu hai: ");
        double b = sc.nextDouble();
        
        double ketQua = a * b;
        System.out.println("Tich = "+ketQua);
                
    }
    public static void tinhHieu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap gia tri a : ");
        double a = sc.nextDouble();
        System.out.println("nhap gia tr b : ");
        double b = sc.nextDouble();
        double ketqua = a-b;
        System.out.println("Hieu = "+ketqua);
    }
    public static void tinhThuong(){
        Scanner sc = new Scanner(System.in);
        System.err.println("Nhap gia tri a : ");
        double a = sc.nextDouble();
        System.err.println("Nhap gia tri b : ");
        double b = sc.nextDouble();
        double ketQua = a/b;
        System.out.println("Ket qua = "+ketQua);
        

    }
    
}

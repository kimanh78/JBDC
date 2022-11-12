package org.example.main;

import org.example.service.DonHangService;

import java.util.Scanner;

public class mainDonHang {
    public static void main(String[] args) {

    }
    public static void menu(){
        while (true){
            System.out.println("1. Create Don Hang");
            System.out.println("2. Update don hang");
            System.out.println("3. Delete don hang");
            System.out.println("4. Select All");
            System.out.println("5. Select One");
            System.out.println("6. Exit");
            int c = input();
            DonHangService dhsv = new DonHangService();
            if(c == 1){
                dhsv.createDonHang();
            }else if(c==2){
                dhsv.updateDonHang();
            } else if (c==3) {
                dhsv.deleteDonHang();

            } else if (c==4) {
                dhsv.getAllDonHang();

            } else if (c==5) {
                dhsv.getOneDonHang();
            } else if (c==6) {
                break;
            }else {
                System.out.println("nhap lai");
            }
        }


    }
    public static int input(){
        while (true){
           try {
               System.out.println("nhap so");
               int c = new Scanner(System.in).nextInt();
           }catch (Exception e){
               System.out.println("khong phai so");
           }

        }
    }

}

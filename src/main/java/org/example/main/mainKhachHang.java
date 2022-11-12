package org.example.main;

import org.example.service.KhachHangService;

import java.util.Scanner;

public class mainKhachHang {
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        System.out.println("hello");
        while (true){
            System.out.println("1. Create Khach hang");
            System.out.println("2. Update khach hang");
            System.out.println("3. Delete khach hang");
            System.out.println("4. Select All");
            System.out.println("5. Select One");
            System.out.println("6. Exit");
            int c = input();
            KhachHangService khsv = new KhachHangService();
            if(c==1){
                khsv.createKhachHang();
            }else if(c==2){
                khsv.updateKhachHang();
            }else if(c==3){
                khsv.deleteKhachHang();
            }else if(c==4){
                khsv.getAllKhachHang();
            }else if (c==5){
                khsv.getOneKhachHang();
            }else if(c==6){
               break;
            }else {
                System.out.println("nhap lai");
            }
        }
    }
    public static int input(){
        while (true){
            try {
                System.out.println("nhap so : ");
                int c = new Scanner(System.in).nextInt();
                return c;
            }catch (Exception e){
                System.out.println("nhap sai");
            }
        }

    }
}

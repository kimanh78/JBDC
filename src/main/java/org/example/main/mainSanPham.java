package org.example.main;

import org.example.service.SanPhamService;

import java.util.Scanner;

public class mainSanPham {
    public static void main(String[] args) {
      menu();
    }
    public static void menu(){
        System.out.println("hello");
        while (true){
            System.out.println("1. Create San Pham");
            System.out.println("2. Update San pham");
            System.out.println("3. Delete san Pham");
            System.out.println("4. Select All");
            System.out.println("5. Select One");
            System.out.println("6. Exit");
            int c = input();
            SanPhamService spsv = new SanPhamService();
            if(c==1){
                spsv.createSanPham();
            }else if(c==2){
                spsv.updateSanPham();
            }else if(c==3){
                spsv.deleteSanPham();
            }else if(c==4){
                spsv.getAllSanPham();
            }else if (c==5){
                spsv.getOneSanPham();
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

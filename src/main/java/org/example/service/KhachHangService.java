package org.example.service;

import org.example.model.KhachHang;
import org.example.repo.KhachHangRepo;


import java.sql.SQLException;
import java.util.Scanner;

public class KhachHangService {
    public void createKhachHang(){
        System.out.println("create khach hang");
        System.out.println("ma khach hang, ten , dia chi");
        KhachHang kh = input();
        KhachHangRepo khrp = new KhachHangRepo();
        try {
            khrp.create(kh);
            System.out.println("thanh cong");
        } catch (SQLException e) {
            System.out.println("that bai");
            throw new RuntimeException(e);
        }
    }
    public void updateKhachHang(){
        System.out.println("update khach hang");
        System.out.println("ma khach hang, ten , dia chi");
        KhachHang kh = input();
        KhachHangRepo khrp = new KhachHangRepo();
        try {
            khrp.update(kh);
            System.out.println("thanh cong");
        } catch (SQLException e) {
            System.out.println("that bai");
            throw new RuntimeException(e);
        }
    }
    public void deleteKhachHang(){
        System.out.println("xoa khach hang");
        System.out.println("nhap id khach hang");
        int maKhachHang = new Scanner(System.in).nextInt();
        KhachHangRepo khrp = new KhachHangRepo();
        try {
            khrp.delete(maKhachHang);
            System.out.println("xoa thanh cong");
        } catch (SQLException e) {
            System.out.println("xoa That bai");
            throw new RuntimeException(e);
        }
    }
    public void getAllKhachHang(){
        System.out.println("in tat ca khach hang");
        KhachHangRepo khrp = new KhachHangRepo();
        try {
            khrp.getAll();

        } catch (SQLException e) {
            System.out.println("in that bai");
            throw new RuntimeException(e);
        }
    }
    public void  getOneKhachHang(){
        System.out.println("tim kiem khach hang");
        System.out.println("nhap id khach hang");
        int maKhachHang = new Scanner(System.in).nextInt();
        KhachHangRepo khrp = new KhachHangRepo();
        try {
            khrp.getOne(maKhachHang);

        } catch (SQLException e) {
            System.out.println("khong tim thay");
            throw new RuntimeException(e);
        }
    }

    public KhachHang input(){
        KhachHang kh = new KhachHang();
        kh.setMaKhachHang(new Scanner(System.in).nextInt());
        kh.setTen(new Scanner(System.in).nextLine());
        kh.setDiaChi(new Scanner(System.in).nextLine());
        return kh;
    }
}

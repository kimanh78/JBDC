package org.example.service;

import org.example.model.DonHang;
import org.example.repo.DonHangRepo;

import java.sql.SQLException;
import java.util.Scanner;

public class DonHangService {
public void createDonHang(){
    System.out.println("create do hang");
    System.out.println("ma don, ma khach hang, ma san pham");
    DonHang dh = input();
    DonHangRepo dhrp = new DonHangRepo();
    try {
        dhrp.create(dh);
        System.out.println("tao thanh cong");
    } catch (SQLException e) {
        System.out.println("tao that bai");
        throw new RuntimeException(e);
    }
}
public void updateDonHang(){
    System.out.println("update don hang");
    System.out.println("ma don, ma khach hang , ma san pham");
    DonHang dh = input();
    DonHangRepo dhrp = new DonHangRepo();
    try {
        dhrp.update(dh);
        System.out.println("update thanh cong");
    } catch (SQLException e) {
        System.out.println("update that bai");
        throw new RuntimeException(e);
    }
}
public void deleteDonHang(){
    System.out.println("delete don hang");
    System.out.println("ma don hang");
    int maDonHang = new Scanner(System.in).nextInt();
    DonHangRepo dhrp = new DonHangRepo();
    try {
        dhrp.delete(maDonHang);
        System.out.println("xoa thanh cong");
    } catch (SQLException e) {
        System.out.println("xoa that bai");
        throw new RuntimeException(e);
    }
}
public void getAllDonHang(){
    System.out.println("in tat ca don hang");
    DonHangRepo dhrp = new DonHangRepo();
    try {
        dhrp.getAll();
    } catch (SQLException e) {
        System.out.println("in that bai");
        throw new RuntimeException(e);
    }
}
public void getOneDonHang(){
    System.out.println("tin don hang");
    System.out.println("mhap ma don");
    int maDonHang = new Scanner(System.in).nextInt();
    DonHangRepo dhrp = new DonHangRepo();
    try {
        dhrp.getOne(maDonHang);
    } catch (SQLException e) {
        System.out.println("that bai");
        throw new RuntimeException(e);

    }
}
public DonHang input(){
    DonHang dh = new DonHang();
    dh.setMaDon(new Scanner(System.in).nextInt());
    dh.setMaKhachHang(new Scanner(System.in).nextInt());
    dh.setMaSanPham(new Scanner(System.in).nextInt());
    return dh;
}
}

package org.example.service;

import org.example.model.SanPham;
import org.example.repo.SanPhamRepo;

import java.sql.SQLException;
import java.util.Scanner;

public class SanPhamService {
    public void createSanPham(){
        System.out.println("create san pham");
        SanPham sp = input();
        SanPhamRepo spr = new SanPhamRepo();
        try {
            spr.create(sp);
            System.out.println("them thanh cong");
        } catch (SQLException e) {
            System.out.println("them that bai");
            throw new RuntimeException(e);

        }
    }
    public void updateSanPham(){
        System.out.println("update san pham");
        SanPham sp = input();
        SanPhamRepo spr = new SanPhamRepo();
        try {
            spr.update(sp);
            System.out.println("update thanh cong");
        } catch (SQLException e) {
            System.out.println("update that bai");
            throw new RuntimeException(e);
        }
    }
    public void deleteSanPham(){
        System.out.println("xoa san pham");
        int maSanPham = new Scanner(System.in).nextInt();
        SanPhamRepo spr = new SanPhamRepo();
        try {
            spr.delete(maSanPham);
            System.out.println("xoa thanh cong");
        } catch (SQLException e) {
            System.out.println("xoa that bai");
            throw new RuntimeException(e);
        }
    }
    public void getAllSanPham(){
        System.out.println("get all");
        SanPhamRepo spr = new SanPhamRepo();
        try {
            spr.selectAll();
        } catch (SQLException e) {
            System.out.println("in ra that bai");
            throw new RuntimeException(e);
        }
    }
    public void getOneSanPham(){
        System.out.println("get one");
        int maSanPham = new Scanner(System.in).nextInt();
        SanPhamRepo spr = new SanPhamRepo();
        try {
            spr.getOne(maSanPham);
        } catch (SQLException e) {
            System.out.println("in ra that bai");
            throw new RuntimeException(e);
        }
    }
    public SanPham input(){
        SanPham sp = new SanPham();
        sp.setMaSanPham(new Scanner(System.in).nextInt());

        sp.setTenSanPham(new Scanner(System.in).nextLine());
        sp.setSoLuong(new Scanner(System.in).nextInt());
        return sp;
    }
}


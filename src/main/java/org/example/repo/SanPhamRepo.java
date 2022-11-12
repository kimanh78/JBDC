package org.example.repo;

import org.example.model.SanPham;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.example.repo.Connect.getConnect;

public class SanPhamRepo {
    public void  create(SanPham sanPham) throws SQLException {

        String sql = "INSERT INTO sanpham(ma_san_pham,ten_san_pham,so_luong) VALUE (?, ?,?);";
        Connection conn = getConnect();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1,sanPham.getMaSanPham());
        stm.setObject(2,sanPham.getTenSanPham());
        stm.setObject(3,sanPham.getSoLuong());
        stm.executeUpdate();

    }
    public void update(SanPham sanPham) throws SQLException {
        String sql = "UPDATE sanpham SET ten_san_pham = ?,So_luong = ? WHERE ma_san_pham = ?";
        Connection conn = getConnect();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1,sanPham.getMaSanPham());
        stm.setObject(2,sanPham.getTenSanPham());
        stm.setObject(3,sanPham.getSoLuong());
        stm.executeUpdate();
    }
    public void delete(int maSanPham) throws SQLException {
        String sql = "DELETE FROM SanPham WHERE ma_san_pham = ?";
        Connection conn = getConnect();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1,maSanPham);
        stm.executeUpdate();
    }
    public void selectAll() throws SQLException {
        String sql = "SELECT * FROM sanpham";
        Connection conn = getConnect();
        PreparedStatement stm = conn.prepareStatement(sql);
        ResultSet rs = stm.executeQuery();

        while (rs.next()){
            System.out.println(rs.getString("ma_san_pham")+" "
                    +rs.getString("ten_san_pham")+" " +rs.getString("so_luong"));

        }
    }
    public void getOne(int maSanPham) throws SQLException {
        String sql = "SELECT * FROM sanpham WHERE ma_san_pham = ?";
        Connection conn = getConnect();
        PreparedStatement stm = conn.prepareStatement(sql);
        ResultSet rs = stm.executeQuery();
        if(rs!=null){
            System.out.println(rs.getString("ma_san_pham")+" "
                    +rs.getString("ten_san_pham")+" " +rs.getString("so_luong"));
        }
    }

}

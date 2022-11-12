package org.example.repo;

import org.example.model.DonHang;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static org.example.repo.Connect.getConnect;

public class DonHangRepo {
    public void create(DonHang dh) throws SQLException {
        String sql = "INSERT INTO donhang(ma_don,ma_khach_hang, ma_san_pham) VALUE (?, ?,?);";
        Connection conn = getConnect();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1,dh.getMaDon());
        stm.setObject(2,dh.getMaKhachHang());
        stm.setObject(3,dh.getMaSanPham());
        stm.executeUpdate();
    }
    public void update(DonHang dh ) throws SQLException {
        String sql = "UPDATE donhang SET ma_khach_hang=?, ma_khach_hang= ? WHERE ma_don= ?;";
        Connection conn = getConnect();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1,dh.getMaSanPham());
        stm.setObject(2,dh.getMaKhachHang());
        stm.setObject(3,dh.getMaDon());
        stm.executeUpdate();
    }
    public void delete(int maDon) throws SQLException {
        String sql = "DELETE * FROM WHERE ma_don = ?;";
        Connection conn = getConnect();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1,maDon);
        stm.executeUpdate();
    }
    public void getAll() throws SQLException {
        String sql = "SELECT * FROM donhang;";
        Connection conn = getConnect();
        PreparedStatement stm = conn.prepareStatement(sql);
        ResultSet rs = stm.executeQuery();
        while (rs.next()){
            System.out.println(rs.getString("ma_don")+" "+rs.getString("ma_khach_hang")+
                    " "+rs.getString("ma_san_pham"));
      }
    }
    public void getOne(int maDon) throws SQLException {
        String sql = "SELECT * FROM donhang WHERE ma_don =?;";
        Connection conn = getConnect();
        PreparedStatement stm = conn.prepareStatement(sql);
        ResultSet rs = stm.executeQuery();
        if(rs!=null){
            System.out.println(rs.getString("ma_don")+" "+rs.getString("ma_khach_hang")+
                    " "+rs.getString("ma_san_pham"));
        }
    }
}

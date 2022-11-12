package org.example.repo;

import org.example.model.KhachHang;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

import static org.example.repo.Connect.getConnect;

public class KhachHangRepo {
    public void create(KhachHang kh) throws SQLException {
        String sql = "INSERT INTO khachhang(ma_khach_hang,ten,dia_chi) VALUE (?, ?,?);";
        Connection conn = getConnect();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1,kh.getMaKhachHang());
        stm.setObject(2,kh.getTen());
        stm.setObject(3,kh.getDiaChi());
        stm.executeUpdate();
    }
    public void update(KhachHang kh) throws SQLException {
        String sql = "UPDATE khachhang SET ten=?,dia_chi=? WHERE ma_khach_hang=?";
        Connection conn = getConnect();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1,kh.getTen());
        stm.setObject(2,kh.getDiaChi());
        stm.setObject(3,kh.getMaKhachHang());
        stm.executeUpdate();
    }
    public void delete(int maKhachHang) throws SQLException {
        String sql = "DELETE * FROM khachhang WHERE ma_khach_hang=?";
        Connection conn = getConnect();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1,maKhachHang);
        stm.executeUpdate();
    }
    public void getAll() throws SQLException {
        String sql ="SELECT * FROM khachhang";
        Connection conn = getConnect();
        PreparedStatement stm = conn.prepareStatement(sql);
        ResultSet rs = stm.executeQuery();
        while (rs.next()){
            System.out.println(rs.getString("ma_khach_hang")+" "+rs.getString("ten")+
                    " "+rs.getString("dia_chi"));
        }
    }
    public void getOne(int maKhachHang) throws SQLException {
        String sql = "SELECT * FROM khachhang WHERE ma_khach_hang= ? ";
        Connection conn = getConnect();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1,maKhachHang);
        ResultSet rs = stm.executeQuery();
        if(rs!=null){
            System.out.println(("ma_khach_hang")+" "+rs.getString("ten")+
                    " "+rs.getString("dia_chi"));
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {
    private static Connection con;

    public static Connection connect() {
        if (con == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/warungseptya"; // Ganti dengan nama database Anda
                String user = "root"; // Ganti dengan user database Anda
                String password = ""; // Ganti dengan password database Anda

                Class.forName("com.mysql.cj.jdbc.Driver"); // Load driver MySQL
                con = DriverManager.getConnection(url, user, password);
                System.out.println("Koneksi berhasil!");
            } catch (ClassNotFoundException e) {
                System.out.println("Driver tidak ditemukan: " + e.getMessage());
            } catch (SQLException e) {
                System.out.println("Koneksi gagal: " + e.getMessage());
            }
        }
        return con;
    }
}



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kucharkatestinsert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author kuba
 */
public class KucharkaTestINSERT {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        try (Connection spojeni = DriverManager.getConnection("jdbc:mysql://localhost/cooking?user=root&password=paradise");    
            PreparedStatement dotaz = spojeni.prepareStatement("SELECT COUNT(*) FROM recept");) {
            ResultSet vysledek = dotaz.executeQuery();
            vysledek.next();
            System.out.println(vysledek.getInt(1));           
        } catch (SQLException ex) {
            System.out.println("Chyba při komunikaci s databází");
        }
    }    
}

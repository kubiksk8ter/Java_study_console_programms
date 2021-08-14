/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kucharkatest;

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
public class KucharkaTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej název receptu, který chceš vymazat: ");
        String nazev = sc.next();
        try (Connection spojeni = DriverManager.getConnection("jdbc:mysql://localhost/cooking?user=root&password=paradise");    
            PreparedStatement dotaz = spojeni.prepareStatement("DELETE FROM recept WHERE NazevReceptu=?");) {
            dotaz.setString(1, nazev);
            if(dotaz.executeUpdate() == 1) {System.out.println("Vymazání proběhlo úspěšně.");}
            else{System.out.println("Při vymazání nastala chyba!");}
        } catch (SQLException ex) {
            System.out.println("Chyba při komunikaci s databází");
        }
    }    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package youtubetest;

import java.sql.*;
import java.util.TimeZone;

/**
 *
 * @author kuba
 */
public class YouTubeTest {
private static final String CON_STRING="jbdc:mysql://localhost:3306/youTube";
    
    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        try{conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + TimeZone.getDefault().getID(), "root", "paradise");
            System.out.println("Connected!");
        }catch(SQLException e) {
            System.err.print(e);
        }
    }
    
}

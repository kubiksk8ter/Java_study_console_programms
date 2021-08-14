/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wrapper;
import DB.Database;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author kuba
 */
public class Wrapper {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{Database database = new Database("osoby", "root","paradise");
            String[] columns3 = {"jmeno","jazyk"};
            Object[] params3 = {"Java"};
            ResultSet rs = database.select("programatori", columns3, "jazyk = ?", params3);
            while(rs.next()){
                System.out.println(rs.getString("jmeno")+" - "+rs.getString("jazyk"));}
        }
        catch(SQLException e) {System.out.println("error - " + e.getMessage());}

    }
}    

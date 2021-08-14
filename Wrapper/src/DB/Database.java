/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
*
* @author Milan Gallas
*/

public class Database {

     //připojení k databázi
     protected Connection connection;

     //instance třídy query
     protected Query query;

     /**
     * Konstruktor třídy Database
     * @param db
     * @param userName
     * @param password
     * @throws SQLException
     */
     public Database(String db, String userName, String password) throws SQLException{

          connection = DriverManager.getConnection("jdbc:mysql://localhost/"+db, userName, password);

     }
     
      //atribut třídy
      //metody třídy

     /**
     *
     * @param query
     * @param params
     * @return
     * @throws SQLException
     */
    private int query(String query, Object[] params) throws SQLException{
        PreparedStatement ps = connection.prepareStatement(query);
        if (params != null){
           int index = 1;
           for(Object param : params){
            ps.setObject(index, param);
            index++;
            }
        }
        return ps.executeUpdate();
    }
    
    //atribut třídy
    //metody třídy

    /**
     * Vymaže údaje z databázové tabulky
     * @param table
     * @param requirement
     * @param param
     * @return
     * @throws SQLException
     */
    public int delete(String table, String requirement, Object[] param) throws SQLException{
        query = new Query();
        query.delete(table).where(requirement);
        return query(query.getQuery(), param);
    }
    
    //atribut třídy
    //metody třídy

    /**
     * Uloží do databázové tabulky 1 subjekt
     * @param table
     * @param params
     * @return
     * @throws java.sql.SQLException
     */
    public int insert(String table, Object[] params) throws SQLException{
        query = new Query();
        query.insert(table).values(params);
        return query(query.getQuery(), params);
    }
    
    //atribut třídy
      //metody třídy

    /**
     * Aktualizuje data uložená v databázové tabulce
     * @param table
     * @param columns
     * @param requirement
     * @param params
     * @return
     * @throws SQLException
     */
    public int update(String table, String[] columns, String requirement, Object[] params) throws SQLException{
        query = new Query();

        query.update(table)
             .set(columns)
             .where(requirement);

        return query(query.getQuery(), params);
    }
    
    //atribut třídy
    //metody tříd
    /**
     * Vrací údaje z databázové tabulky
     * @param table
     * @param columns
     * @param params
     * @return
     * @throws SQLException
     */
    public ResultSet select(String table, Object[] columns, Object[] params) throws SQLException{
        return this.select(table, columns, "", params);
    }

    /**
     * Vrací údaje z databázové tabulky
     * @param table
     * @param columns
     * @param requirement
     * @param params
     * @return
     * @throws SQLException
     */
    public ResultSet select(String table, Object[] columns, String requirement, Object[] params) throws SQLException{
        query = new Query();
        query.select(columns)
             .from(table)
             .where(requirement);

        PreparedStatement ps = connection.prepareStatement(query.getQuery());
        if(params != null){
            int index = 1;
            for(Object param : params){
            ps.setObject(index, param);
            index++;
            }
        }

        ResultSet rs = ps.executeQuery();
        return rs;
    }
    
    //atribut třídy
    //metody tříd

    /**
     *
     * @param table
     * @return
     * @throws SQLException
     */
    public int count(String table) throws SQLException{
        PreparedStatement ps = connection.prepareStatement("SELECT COUNT(*) FROM "+table);
        ResultSet result = ps.executeQuery();
        result.next();
        return result.getInt(1);
    }
}

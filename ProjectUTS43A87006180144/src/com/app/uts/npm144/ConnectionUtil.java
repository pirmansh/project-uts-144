/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.uts.npm144;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pirmansyah
 */
public class ConnectionUtil {
     private static Connection connection;
     static{
         MysqlDataSource ds = new MysqlDataSource();
            ds.setServerName("localhost");
            ds.setDatabaseName("db_bengkel");
            ds.setUser("root");
            ds.setPassword("root");
         
         
         try {
             connection = ds.getConnection();
         } catch (SQLException ex) {
             Logger.getLogger(ConnectionUtil.class.getName()).log(Level.SEVERE, null, ex);
         }
         
         
         
     }
     
     public static Connection getConnection(){
            return connection;
        }
}

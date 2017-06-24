/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conectaBD;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public  class Conecta_Inventarios {
    Connection conect;
    Statement Stm;
    

  public Conecta_Inventarios() throws Exception{
   
     
      try{
          Class.forName("com.mysql.jdbc.Driver");
        Connection conect= DriverManager.getConnection("jdbc:mysql://localhost/inventarios","root","5210");
        Statement Stm=conect.createStatement();
        ResultSet rs=Stm.executeQuery("select * from clientes");
      
        while(rs.next()){
            System.out.println(rs.getString("idclientes"));
            System.out.println(rs.getString("NombresCliente"));
            System.out.println(rs.getString("Apellidoscliente"));
            
        }
      
      }catch(ClassNotFoundException exc){
          exc.printStackTrace();
          
   
      }catch(SQLException ex){
          Logger.getLogger(Connection.class.getName()).log(Level.SEVERE,null,ex);
      }
  
  }}
      

          
               
          
               
               
          


        



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class UserCrud {
    
    private Connection conexion;
    
    public UserCrud(){
        conexion=   ConexionMySQL.conectar();
    }
    
     public boolean InsertUsuario(String nombre, String correo, String contra){
        
        String insertSQL= " INSERT INTO usuarios (nombre, correo, contrasena) VALUES(?,?,?)";
        
        try{
            
            PreparedStatement ps= conexion.prepareStatement(insertSQL);
            ps.setString(1, nombre);
            ps.setString(2, correo);
            ps.setString(3, contra);
            return ps.executeUpdate()>0;
        }
        catch(SQLException e){
            
            System.out.print("Error al crear el usuario " + e.getMessage());
            return false;
        }
    }
     
      //metodo para Consultar por ID
    public ResultSet buscarporId(int id){
        String sqlBuscar=  "SELECT * FROM usuarios WHERE id= ?";
        
        try{
            PreparedStatement ps= conexion.prepareStatement(sqlBuscar);
            ps.setInt(1, id);
            return ps.executeQuery();
        }
        catch(SQLException e){
            System.out.print("Error al buscar por ID " + e.getMessage());
            return null;
        }
        
    }//fin del consulta ID
    
    public ResultSet obtenerTodos (){
    
        String sqlTodos = "SELECT * FROM usuarios";
        
        try{
            PreparedStatement ps = conexion.prepareStatement(sqlTodos);
            return ps.executeQuery();
        }
        catch(SQLException s){
            System.out.println("Error al consultar todos" + s.getMessage());
            return null;
        }    
            
    }//
    
}

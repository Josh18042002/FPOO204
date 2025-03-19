/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class UserCRUD {
   
    private Connection conexion;
    
    //constructor de la clase arranca la conexion a BD
    public UserCRUD(){
        conexion=   ConexionMySQL.conectar();
    }
    
    public boolean InsertUsuario(String nombre, String correo, String contra){
        
        //preparamos la sentencia SQL para INSERT
        String insertSQL= " INSERT INTO usuarios (nombre, correo, contrasena) VALUES(?,?,?)";
        
        try{
            //asignamos la sentencia y parametros para su ejeuccion
            PreparedStatement ps= conexion.prepareStatement(insertSQL);
            ps.setString(1, nombre);
            ps.setString(2, correo);
            ps.setString(3, contra);
            return ps.executeUpdate()>0;
        }
        catch(SQLException e){
            //imprimimos en consola en caso de que no se ejecute el INSERT
            System.out.print("Error al crear el usuario " + e.getMessage());
            return false;
        }
    }
    
}


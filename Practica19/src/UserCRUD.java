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
import java.sql.ResultSet;

public class UserCRUD {
    
    private Connection conexion;
    
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
    }//Fin del insert
    
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
            
    }// fin obtener todos
    
    public boolean eliminarUsuario(int id) {
    String sql = "DELETE FROM usuarios WHERE id = ?";
    try (Connection conn = ConexionMySQL.conectar();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {

        pstmt.setInt(1, id);
        int filasAfectadas = pstmt.executeUpdate();

        return filasAfectadas > 0;

    } catch (SQLException e) {
        System.out.println("Error al eliminar usuario: " + e.getMessage());
        return false;
    }
  }
   
}

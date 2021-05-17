package Modelo;

import Configuracion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class LabPaciente {
    
    Connection conexion;
    
    public LabPaciente(){
        Conexion con = new Conexion();
        con.getConexion();
        
                
    }
    
    
    public List<Lab> listaLab(){
        PreparedStatement ps;
        ResultSet rs;
        
        List<Lab> lista = new ArrayList<>();
        
        try{
            ps = conexion.prepareStatement("SELECT id, Codigo,Ruc, Empresa,Ciudad, Direccion, Telefono,Correo,Celular FROM Lab");
            rs=ps.executeQuery();
            
            while (rs.next()){
                
                int id= rs.getInt("id");
                String Codigo=rs.getString("Codigo");
                String Ruc=rs.getString("Ruc");
                String Empresa=rs.getString("Empresa");
                String Ciudad=rs.getString("Ciudad");
                String Direccion=rs.getString("Direccion");
                String Telefono=rs.getString("Telefono");
                String Correo=rs.getString("Correo");
                String Celular=rs.getString("Celular");
                
                
                
                Lab laboratorio = new Lab( id, Codigo,Ruc, Empresa,Ciudad,Direccion,Telefono, Correo, Celular);
                
                
                lista.add(laboratorio);
            }
                
                return lista;
            
        
        
    } catch(SQLException e){
        System.out.println(e.toString());
        return null;
    }
    
}

    

public Lab MostrarLaboratorios(int _id){
        PreparedStatement ps;
        ResultSet rs;
        
        Lab laboratorios= null;
        
        
       try{
            ps = conexion.prepareStatement("SELECT id, Codigo,Ruc, Empresa,Ciudad, Direccion, Telefono,Correo,Celular FROM Lab");
           ps.setInt(1,_id);
            rs=ps.executeQuery();
            
            while (rs.next()){
                
                int id= rs.getInt("id");
                String Codigo=rs.getString("Codigo");
                String Ruc=rs.getString("Ruc");
                String Empresa=rs.getString("Empresa");
                String Ciudad=rs.getString("Ciudad");
                String Direccion=rs.getString("Direccion");
                String Telefono=rs.getString("Telefono");
                String Correo=rs.getString("Correo");
                String Celular=rs.getString("Celular");
                
                
                  laboratorios = new Lab( id, Codigo,Ruc, Empresa,Ciudad,Direccion,Telefono, Correo, Celular);
                
                
               
            }
                
                return laboratorios;
            
        
        
    } catch(SQLException e){
        System.out.println(e.toString());
        return null;
    }
    
}

public boolean InsertarLaboratorios(Lab lab){
        PreparedStatement ps;
       
        
              
        try{
            ps = conexion.prepareStatement("Insert into productos ( id, Codigo,Ruc, Empresa,Ciudad, Direccion, Telefono,Correo,Celular)  values (?,?,?,?,?,?,?,?,?)");
            
                         ps.setString(1,lab.getCodigo());
                         ps.setString(2,lab.getRuc());
                         ps.setString(3,lab.getEmpresa());
                         ps.setString(4,lab.getCiudad());
                         ps.setString(5,lab.getDireccion());
                         ps.setString(6,lab.getTelefono());
                         ps.setString(7,lab.getCorreo());
                         ps.setString(8,lab.getCelular());
                         
                         ps.execute();
                         return true;
         
                
                        
    } catch(SQLException e){
        System.out.println(e.toString());
        return false;
    }
    
}

public boolean ActualizarLaboratorios(Lab lab){
        PreparedStatement ps;
       
        
        try{
            ps = conexion.prepareStatement("Actualizar Laboratorios set id=?, Codigo=?,Ruc=?, Empresa=?,Ciudad=?, Direccion=?, Telefono=?,Correo=?,Celular=? WHERE id=?");
            
                         ps.setString(1,lab.getCodigo());
                         ps.setString(2,lab.getRuc());
                         ps.setString(3,lab.getEmpresa());
                         ps.setString(4,lab.getCiudad());
                         ps.setString(5,lab.getDireccion());
                         ps.setString(6,lab.getTelefono());
                         ps.setString(7,lab.getCorreo());
                         ps.setString(8,lab.getCelular());
                         ps.execute();
                         return true;
         
                
                        
    } catch(SQLException e){
        System.out.println(e.toString());
        return true;
    }
    
}

public boolean EliminarProductos(int _id){
        PreparedStatement ps;
       
        
              
        try{
            ps = conexion.prepareStatement("Eliminar From WHERE id=?");
            
                         ps.setInt(1, _id);
                         ps.execute();
                         return true;
         
                
                        
    } catch(SQLException e){
        System.out.println(e.toString());
        return false;
    }
    





}
}



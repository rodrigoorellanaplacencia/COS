/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Chocolate;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ivo
 */
public class Registro {
    private static Registro registro = null;
    private static ArrayList<Chocolate> chocolates = new ArrayList();
    Connection conexion = Conexion.getConnection();
    
    private Registro()
    {
        String sentencia = "SELECT codigo,nombre, descripcion, precio, cantidad, tipo, sabor, marca, azucar FROM CHOCOLATE"; 
        try {
            Connection conexion = Conexion.getConnection();
            Statement statement = conexion.createStatement();
            ResultSet resultado = statement.executeQuery(sentencia);
            
            while (resultado.next()){
   
                int codigo =Integer.parseInt(resultado.getString("codigo"));
                String nombre =resultado.getString("nombre");
                String descripcion =resultado.getString("descrpcion");
                int precio =Integer.parseInt(resultado.getString("precio"));
                int cantidad =Integer.parseInt(resultado.getString("cantidad"));
                String tipo =resultado.getString("tipo");
                String sabor =resultado.getString("sabor");
                String marca =resultado.getString("marca");
                boolean azucar =Boolean.parseBoolean(resultado.getString("azucar"));
                chocolates.add(new Chocolate(codigo,nombre, descripcion, precio, cantidad, tipo, sabor, marca, azucar));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public static Registro getInstance()
    {
         if( registro == null )
        {
            registro = new Registro();   
        }
         else
         {
             registro = new Registro();
         }
        return registro;
    }
    
    public void agregar(Chocolate chocolate) throws SQLException
    {
        chocolates.add(chocolate);
        System.out.println("Insertando registros...");
        Connection conexion = Conexion.getConnection();
        Statement statement = conexion.createStatement();
        String consulta = "insert into CHOCOLATE (codigo,nombre, descripcion, precio, cantidad, tipo, sabor, marca, azucar) values('"+chocolate.getCodigo()+"','"+chocolate.getNombre()+"','"+chocolate.getDescripcion()+"','"+chocolate.getPrecio()+"','"+chocolate.getCantidad()+"','"+chocolate.getTipo()+"','"+chocolate.getSabor()+"','"+chocolate.getMarca()+"','"+String.valueOf(chocolate.isAzucar())+"')";
        statement.executeUpdate(consulta);
    }
    
    public void eliminar(int codigo ) throws SQLException
    {
        System.out.println("Eliminando registros...");
        Connection conexion = Conexion.getConnection();
        Statement statement = conexion.createStatement();
        String consulta = "delete from CHOCOLATE where(codigo = '"+codigo+"')";
        statement.executeUpdate(consulta);
    }
    
    public Chocolate buscar(int codigo)
    {
        Chocolate chocolate = null;
        int indice = 0;
        for(Chocolate tmp : chocolates)
        {
            if(tmp.getCodigo() == codigo)
            {
                chocolate = tmp;
                indice = chocolates.indexOf(tmp);
                
            }
        }
        return chocolate;
    }
   
    public int buscarIndice(int codigo)
    {
        Chocolate chocolate = null;
        int indice = 0;
        for(Chocolate tmp : chocolates)
        {
            if(tmp.getCodigo() == codigo)
            {
                chocolate = tmp;
                indice = chocolates.indexOf(tmp);
            }
        }
        return indice;
    }
    
    public ArrayList<Chocolate> listar()
            {
                return chocolates;  
            }
    
    public void modificar(int codigo, int campo,String valor) throws SQLException
    {
        switch(campo)
        {
           case 0:
               for(Chocolate tmp : chocolates)
                {
                    if(tmp.getCodigo() == codigo)
                    {
                        tmp.setNombre(valor);
                        Statement dec;
                        dec=conexion.createStatement();
                        String query="UPDATE CHOCOLATE SET NOMBRE='"+valor+"' WHERE CODIGO='"+codigo+"'";
                        dec.executeUpdate(query);
                    }
                    break;
                }
               break;
           case 1:
               for(Chocolate tmp : chocolates)
                {
                    if(tmp.getCodigo() == codigo)
                    {
                        tmp.setDescripcion(valor);
                        Statement dec;
                        dec=conexion.createStatement();
                        String query="UPDATE CHOCOLATE SET DESCRIPCION='"+valor+"' WHERE CODIGO='"+codigo+"'";
                        dec.executeUpdate(query);
                    }
                    break;
                }
               break;
           case 2:
               for(Chocolate tmp : chocolates)
                {
                    if(tmp.getCodigo() == codigo)
                    {
                        tmp.setPrecio(Integer.parseInt(valor));
                        Statement dec;
                        dec=conexion.createStatement();
                        String query="UPDATE CHOCOLATE SET PRECIO='"+valor+"' WHERE CODIGO='"+codigo+"'";
                        dec.executeUpdate(query);
                    }
                    break;
                }
               break;
           case 3:
               for(Chocolate tmp : chocolates)
                {
                    if(tmp.getCodigo() == codigo)
                    {
                        tmp.setCantidad(Integer.parseInt(valor));
                        Statement dec;
                        dec=conexion.createStatement();
                        String query="UPDATE CHOCOLATE SET CANTIDAD='"+valor+"' WHERE CODIGO='"+codigo+"'";
                        dec.executeUpdate(query);
                    }
                    break;
                }
               break;
           case 4:
               for(Chocolate tmp : chocolates)
                {
                    if(tmp.getCodigo() == codigo)
                    {
                        tmp.setTipo(valor);
                        Statement dec;
                        dec=conexion.createStatement();
                        String query="UPDATE CHOCOLATE SET TIPO='"+valor+"' WHERE CODIGO='"+codigo+"'";
                        dec.executeUpdate(query);
                    }
                    break;
                }
               break;
           case 5:
               for(Chocolate tmp : chocolates)
                {
                    if(tmp.getCodigo() == codigo)
                    {
                        tmp.setSabor(valor);
                        Statement dec;
                        dec=conexion.createStatement();
                        String query="UPDATE CHOCOLATE SET SABOR='"+valor+"' WHERE CODIGO='"+codigo+"'";
                        dec.executeUpdate(query);
                    }
                    break;
                }
               break;
           case 6:
               for(Chocolate tmp : chocolates)
                {
                    if(tmp.getCodigo() == codigo)
                    {
                        tmp.setMarca(valor);
                        Statement dec;
                        dec=conexion.createStatement();
                        String query="UPDATE CHOCOLATE SET MARCA='"+valor+"' WHERE CODIGO='"+codigo+"'";
                        dec.executeUpdate(query);
                    }
                    break;
                }
               break;
           case 7:
               for(Chocolate tmp : chocolates)
                {
                    if(tmp.getCodigo() == codigo)
                    {
                        tmp.setAzucar(Boolean.parseBoolean(valor));
                        Statement dec;
                        dec=conexion.createStatement();
                        String query="UPDATE CHOCOLATE SET AZUCAR='"+valor+"' WHERE CODIGO='"+codigo+"'";
                        dec.executeUpdate(query);
                    }
                    break;
                }
               break;
           
           default:
               System.out.println("error");
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Clases.TiendaPr;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author alumnossur
 */
public class TiendaDAO {

    
    private Connection con;
    private Statement state;
    private TiendaPr p = new TiendaPr();
    
    public TiendaDAO() {
    }
    
    public boolean conectar(){
        boolean conectado =true;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tiendadepc","root","");
            state = con.createStatement();
        }catch(Exception ex ){
            
            conectado =false;
        }
        return conectado;
    }
    ///Procesador
        public ResultSet listar(){
        try{
            String sql= "select * from productos; ";
            
            PreparedStatement st= con.prepareCall(sql);
            ResultSet rs= st.executeQuery();
            return rs; 
        }catch(Exception ex){
            return null;
        }
    
    }
         
        public String agregar(TiendaPr p) {
        String mensaje = "";
        try {
            String sql = "insert into productos values("+ p.getCodigo()+",'" + p.getProcesador()+"',"+ 
                    "'" + p.getMoBo()+ "'," + "'" +p.getRam()+ "'," + "'"+ p.getGPU()+ "'," + 
                    "'" +p.getAlmacenamiento()+ "',"
                    +"'"+ p.getGabinete()+ "', "+ "'"+ p.getFuenteP()+"'," + p.getPrecio()+ ")";
            state.execute(sql);
            mensaje ="Producto agregado";
        } catch (Exception ex) {
            mensaje ="El Producto no pudo agregarse";
        }
        return mensaje;
    }
        
    public TiendaPr buscar(int codigo) {
        TiendaPr p = new TiendaPr();
            try{
            String sql = "select * from productos " +
                         " where codigo = "+ codigo;
            
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                p.setCodigo(rs.getInt("codigo"));
                p.setProcesador(rs.getString("procesador"));
                p.setMoBo(rs.getString("mobo"));
                p.setRam(rs.getString("ram"));
                p.setGPU(rs.getString("gpu"));
                p.setAlmacenamiento(rs.getString("almacenamiento"));
                p.setGabinete(rs.getString("gabinete"));
                p.setFuenteP(rs.getString("fuenteP"));
                p.setPrecio(rs.getInt("precio"));
            }
            }catch(Exception ex){
                
            }
        return p;
    }
    
    public String eliminar( int codigo) {
        String mensaje = "";
        try {
            String sql = "delete from productos where codigo=" + codigo;
            state.execute(sql);
            mensaje ="Producto eliminado";
        } catch (Exception ex) {
            mensaje ="Producto No pudo eliminar";
        }
        return mensaje;
    }
        
        
        
}
        
        
    
         ///Placa Madre
   /* public ResultSet listaMoBo() {
        try {
            String sql = "select * from MoBo; ";

            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            return rs;
        } catch (Exception ex) {
            return null;
        }
    }
    ///Ram
    public ResultSet listaRam() {
        try {
            String sql = "select * from ram; ";

            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            return rs;
        } catch (Exception ex) {
            return null;
        }
    }
    
    public ResultSet listaGpu() {
        try {
            String sql = "select * from gpu; ";

            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            return rs;
        } catch (Exception ex) {
            return null;
        }
    }
    ///Almacenamiento
    public ResultSet listaalmacenamiento() {
        try {
            String sql = "select * from almacenamiento; ";

            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            return rs;
        } catch (Exception ex) {
            return null;
        }
    }
    ///GAbinete
    public ResultSet listaGabinete() {
        try {
            String sql = "select * from gabinete; ";

            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            return rs;
        } catch (Exception ex) {
            return null;
        }
    }
    
    public ResultSet listaFuenteP() {
        try {
            String sql = "select * from fuentep; ";

            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            return rs;
        } catch (Exception ex) {
            return null;
        }
    }
     */    
         

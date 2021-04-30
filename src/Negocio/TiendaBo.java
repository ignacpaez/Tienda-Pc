/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Clases.TiendaPr;
import Datos.TiendaDAO;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author alumnossur
 */
public class TiendaBo {

    private TiendaDAO tiendaDAO= new TiendaDAO();
    
    public boolean conectar(){
        
        return tiendaDAO.conectar();
    }
    
    public String agregar(TiendaPr p){
        
        return tiendaDAO.agregar(p);
    }
    
    public TiendaPr buscar(int codigo){
        return tiendaDAO.buscar(codigo);
    }
    public String eliminar(int codigo){
        
        return tiendaDAO.eliminar(codigo);
    }
    
    ///Procesador
    public ResultSet listar(){
        return tiendaDAO.listar();
    }
    

    /*
    public ResultSet listaMoBo(){
        
        return tiendaDAO.listaMoBo();
    }
    
    public ResultSet listaRam(){
        
        return tiendaDAO.listaRam();
    }
    
    public ResultSet listaGpu(){
        
        return tiendaDAO.listaGpu();
    }
    
    public ResultSet listaalmacenamiento(){
        
        return tiendaDAO.listaalmacenamiento();
    }
    
    public ResultSet listaGabinete(){
        
        return tiendaDAO.listaGabinete();
    }
    
    public ResultSet listaFuenteP(){
        
        return tiendaDAO.listaFuenteP();
    }
    */
    
}

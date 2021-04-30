/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author alumnossur
 */
public class TiendaPr {
    private int codigo;
    private String Procesador;
    private String MoBo;
    private String Ram;
    private String GPU;
    private String Almacenamiento;
    private String Gabinete;
    private String FuenteP;
    private int Precio;

    public TiendaPr(int codigo, String Procesador, String MoBo, String Ram, String GPU, String Almacenamiento, String Gabinete, String FuenteP, int Precio) {
        this.codigo = codigo;
        this.Procesador = Procesador;
        this.MoBo = MoBo;
        this.Ram = Ram;
        this.GPU = GPU;
        this.Almacenamiento = Almacenamiento;
        this.Gabinete = Gabinete;
        this.FuenteP = FuenteP;
        this.Precio = Precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getProcesador() {
        return Procesador;
    }

    public void setProcesador(String Procesador) {
        this.Procesador = Procesador;
    }

    public String getMoBo() {
        return MoBo;
    }

    public void setMoBo(String MoBo) {
        this.MoBo = MoBo;
    }

    public String getRam() {
        return Ram;
    }

    public void setRam(String Ram) {
        this.Ram = Ram;
    }

    public String getGPU() {
        return GPU;
    }

    public void setGPU(String GPU) {
        this.GPU = GPU;
    }

    public String getAlmacenamiento() {
        return Almacenamiento;
    }

    public void setAlmacenamiento(String Almacenamiento) {
        this.Almacenamiento = Almacenamiento;
    }

    public String getGabinete() {
        return Gabinete;
    }

    public void setGabinete(String Gabinete) {
        this.Gabinete = Gabinete;
    }

    public String getFuenteP() {
        return FuenteP;
    }

    public void setFuenteP(String FuenteP) {
        this.FuenteP = FuenteP;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    @Override
    public String toString() {
        return "TiendaPr{" + "codigo=" + codigo + ", Procesador=" + Procesador + ", MoBo=" + MoBo + ", Ram=" + Ram + ", GPU=" + GPU + ", Almacenamiento=" + Almacenamiento + ", Gabinete=" + Gabinete + ", FuenteP=" + FuenteP + ", Precio=" + Precio + '}';
    }
    
    public TiendaPr() {
    }
  
    
}

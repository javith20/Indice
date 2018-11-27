/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

/**
 *
 * @author Javith
 */
public class Canton {
    private String nombre;
    private int num;
    private String superficie;
    private String descripcion;
    private String rutaImagen;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Canton(String _nombre, String _superficie, String _descripcion, String _rutaImagen,int _num) {
        this.nombre = _nombre;
        this.superficie = _superficie;
        this.descripcion = _descripcion;
        this.num = _num;
        this.rutaImagen = _rutaImagen;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSuperficie() {
        return superficie;
    }

    public void setSuperficie(String superficie) {
        this.superficie = superficie;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }
    
}

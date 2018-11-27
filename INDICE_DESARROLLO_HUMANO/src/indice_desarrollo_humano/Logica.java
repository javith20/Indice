/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indice_desarrollo_humano;

import Archivos.Canton;

/**
 *
 * @author Javith
 */


public class Logica {
 public static Archivos.AdministradorArchivos archivos ;
    public Logica(String ruta) {
        archivos = new Archivos.AdministradorArchivos(ruta);
    }
    
    
    public Canton buscarElemento(int numero){
        for (int i = 0; i < archivos.getElementos().size(); i++) {
             System.out.println(archivos.getElementos().size());
            if (archivos.getElementos().get(i).getNum() == numero ){
                return archivos.getElementos().get(i);
            }
        }
        return null;
        
    }
    public void abrirVentana(int numero) {
        java.awt.EventQueue.invokeLater(() -> {
            new VentanaInfo.GUI_Canton(buscarElemento(numero));
        });
    }
}

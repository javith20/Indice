/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import java.io.File;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Javith
 */
public class AdministradorArchivos {

    private final File dirElementos;

    private LectorXML lectorXML;

    private ArrayList<Canton> Cantones = new ArrayList<>();

    public AdministradorArchivos(String ruta) {
        
        dirElementos = new File(ruta);

        lectorXML = new LectorXML();
        cargarElementos();
    }

    private void cargarElementos() {
        ArrayList<String> aux;

        for (int indice = 0; dirElementos.list().length > indice; indice++) {
            aux = lectorXML.getListaElementos(dirElementos.getAbsolutePath() + "\\" + dirElementos.list()[indice], "Canton");
            
            Canton nuevo;
            nuevo = new Canton(aux.get(0), aux.get(1), aux.get(2), aux.get(3),Integer.parseInt(aux.get(4)));
            aux.clear();
            Cantones.add(nuevo);
        }
    }

    public ArrayList<Canton> getElementos() {
        return Cantones;
    }

}

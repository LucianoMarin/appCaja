/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.Label;
import java.awt.TextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Luciano
 */
public class metodosInput {
    
    
    public void limpiarCamposProductos(JTextField codigo, JTextField descripcion, JTextField cantidad, JTextField precio_neto, JTextField precio_bruto){
    
        codigo.setText("");
        descripcion.setText("");
        cantidad.setText("");
        precio_neto.setText("");
        precio_bruto.setText("");
    
        
    }
    
    
    public void limpiarCampoCodigo(JTextField codigo){
       codigo.setText("");
    }
    
}

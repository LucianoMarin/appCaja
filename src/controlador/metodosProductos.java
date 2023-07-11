/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.TextField;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import modelo.Conexion;
import modelo.Producto;

/**
 *
 * @author Luciano
 */
public class metodosProductos {

    public int crearProducto(Producto productos) throws ClassNotFoundException, SQLException {
        Conexion conexion = new Conexion();
        int validar = 0;
        String sql = "INSERT INTO PRODUCTOS VALUES(?,?,?,?,?,?)";
        PreparedStatement pstm = conexion.CrearConexion().prepareStatement(sql);
        pstm.setString(1, productos.getCodigo());
        pstm.setString(2, productos.getDescripcion());
        pstm.setInt(3, productos.getCantidad());
        pstm.setFloat(4, productos.getPrecio_neto());
        pstm.setFloat(5, productos.getPrecio_bruto());
        pstm.setString(6, productos.getFecha_ingreso());
        validar = pstm.executeUpdate();
        conexion.CrearConexion().close();
        return validar;

    }

    public ResultSet mostrarProductos() throws ClassNotFoundException, SQLException {
        Conexion cn = new Conexion();
        Statement st;
        ResultSet rs;
        String sql = "SELECT * FROM PRODUCTOS";
        st = cn.CrearConexion().createStatement();
        rs = st.executeQuery(sql);
        return rs;
    }

    public void CargarTablaPrecios(String codigo, JTable ventas, JLabel labelTotal) throws ClassNotFoundException, SQLException {

        Conexion cn = new Conexion();

        DefaultTableModel model = (DefaultTableModel) ventas.getModel();

        Object fila[] = new Object[4];

        int cont = 0;
        int valor;
        int valorTotal = 0;

        Statement st;
        ResultSet rs;
        String sql = "SELECT * FROM PRODUCTOS WHERE CODIGO=" + codigo + " ";
        st = cn.CrearConexion().createStatement();
        rs = st.executeQuery(sql);

        for (int i = 0; i < model.getRowCount(); i++) {

            if (model.getValueAt(i, 0).equals(codigo)) {
                cont++;
                valor = (int) model.getValueAt(i, 3);
                cont = (int) model.getValueAt(i, 2);
                valor *= cont;
                model.removeRow(i);
            }

        }

        if (rs.next()) {
            fila[0] = rs.getString(1);
            fila[1] = rs.getString(2);
            fila[2] = cont + 1;
            fila[3] = rs.getInt(4) * (cont + 1);
            model.addRow(fila);

        } else {

            JOptionPane.showMessageDialog(ventas, "NO SE ENCONTRO EL CODIGO!");
        }

        for (int i = 0; i < model.getRowCount(); i++) {
            valorTotal += (int) model.getValueAt(i, 3);
            this.mostrarTotal(labelTotal, valorTotal);
        }

    }

    public int mostrarTotal(JLabel tPagar, int valorTotal) {
        tPagar.setText(String.valueOf(valorTotal));
        int total = Integer.parseInt(tPagar.getText());

        return total;
    }

    public int totalVenta(JTextField inVuelto, JTable taProductos) {
        int total = 0;
        for (int i = 0; i < taProductos.getRowCount(); i++) {
            total += (int) taProductos.getValueAt(i, 3);

        }

        return total;
    }
    
    public int Vuelto(int totalBoleta, int dinero){
    
      int vuelto=0;
      vuelto=dinero-totalBoleta;
      
      
      return vuelto;
    
    }

}

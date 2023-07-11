/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Luciano
 */
public class metodosFecha {

    public String ObtenerFecha() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("y/M/d");
        LocalDateTime fecha = LocalDateTime.now();
        String fechaActual = formato.format(fecha);

        return fechaActual;
    }

}

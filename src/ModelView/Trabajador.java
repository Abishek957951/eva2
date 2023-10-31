/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModelView;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author abish
 */
public class Trabajador{
    
    public void manejadorTrabajadores(int idT, String nombre) {
        //Mapa que contiene la lista de todos los trabajadores, siendo su clave su idT, y el valor siendo su nombre
        Map<Integer, String> ListaTrabajadores = new HashMap<>();
        ListaTrabajadores.put(idT, nombre); 
    }
    
    
}

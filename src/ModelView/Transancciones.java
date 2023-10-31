/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModelView;

import java.util.ArrayList;

/**
 *
 * @author abish
 */
public class Transancciones {
    //Se inizializa lista la cual va a contener todas las operaciones
    ArrayList<Object> Transacciones;
    
    //Función que crea la lista que contiene los registros
    public Transancciones() {
        Transacciones = new ArrayList<>();
    }

       //Función que agrega items a la lista si son string
    public void registrar(String Operacion) {
        this.Transacciones.add(Operacion);
        this.Transacciones.add("\n");
    }
    
    //Funcion que agrega items a la lista si son double[]
    public void registrar(double[] Operacion) {
        this.Transacciones.add(Operacion);
    }

    //Funcion que retorna la lista para ser leida
    public ArrayList<Object> getTransacciones() {
        return Transacciones;
    }
}

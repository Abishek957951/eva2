/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModelView;

/**
 *
 * @author abish
 */

//Se importan los otras partes del código desde sus paquetes respectivos
import View.FormEntrada;
import View.Ingreso;
import View.Ventana1;
import View.Ventana2;  


public class MainHub {
    
//Se crean instancias de cada uno de las partes del programa 
    static Ingreso ingreso= new Ingreso();
    static FormEntrada mainHub = new FormEntrada();
    static Ventana1 ventana1 = new Ventana1();
    static Ventana2 ventana2 = new Ventana2();
    public static Transancciones inventario = new Transancciones();
    
//Se inicia lep programa mostrando el formulario de entrada
    public static void main(String[] args) {
        ingreso.setVisible(true);
        ingreso.setLocation(350,50);
    }
    
//Funcion que permite guardar cadenas de string
    public static void guardar(String operacion) {
        inventario.registrar(operacion);
    }
 
//Funcion que abre el formulario de entrada
    public static void MostrarMainHub() {
        mainHub.setVisible(true);
        mainHub.setLocation(350,50);
    }
//Funcion que abre el formulario de historial
    public static void MostrarVentana1() {
        ventana1.setVisible(true);
        ventana1.setLocation(350,50);
    }
//Funcion que abre el formulario de operaciones   
    public static void MostrarVentana2() {
        ventana2.setVisible(true);
        ventana2.setLocation(350,50);
    }
//Funcion que cierra el formulario de entrada   
     public static void CerrarIngreso() {
        ingreso.setVisible(false);
    }
//Funcion que cierra el formulario de entrada   
     public static void CerrarMainHub() {
        mainHub.setVisible(false);
    }
//FUncion que cierra el fomrulario de historial
    public static void CerrarVentana1() {
        ventana1.setVisible(false);
    }
//Funcion que cierra el formulario de operaciones   
    public static void CerrarVentana2() {
        ventana2.setVisible(false);
    }
    
}

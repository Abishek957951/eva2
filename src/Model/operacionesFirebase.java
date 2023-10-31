/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author abish
 */
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.GenericTypeIndicator;
import com.google.firebase.database.ValueEventListener;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class operacionesFirebase {
    //Operacion de guardado de items uqe acepta el id
    public void saveItem(String id, Object operaciones ){
        FirebaseDatabase conexion = null;
       try {
           //Se conecta a la base de datos
           conexion = FirebaseConnection.getConnection();
           DatabaseReference ref = conexion.getReference("/");
           //Se ubica la referencia hija llamada operaciones
           DatabaseReference childReference = ref.child("operaciones/"+id);
           //Se guarda el valot item 
        childReference.setValue(operaciones);
        //El retrasode tiempo
        Thread.sleep(2000);
        } catch (InterruptedException ex) {
           Logger.getLogger(operacionesFirebase.class.getName()).log(Level.SEVERE, null,
        ex);
        }
    };
}

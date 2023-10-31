/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.database.FirebaseDatabase;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 *
 * @author abish
 */
public class FirebaseConnection {
    private static FirebaseDatabase firebaseDB = null;

    public static FirebaseDatabase getConnection() {
        try {
            if (firebaseDB == null) {
                FirebaseOptions firebaseOptions = new FirebaseOptions.Builder()
                        //El link de acceso all la base de datos de firebase
                        .setDatabaseUrl("https://ejemplo-oop-default-rtdb.firebaseio.com/")
                        //Dirección del archivo donde se encuentra la clave privada
                        .setServiceAccount(new FileInputStream(new File("C:\\Users\\abish\\OneDrive\\Escritorio\\OOP\\ejemplo-oop-firebase-adminsdk-xbgpm-b3cb05332c.json")))
                        .build();

                FirebaseApp.initializeApp(firebaseOptions);
                firebaseDB = FirebaseDatabase.getInstance();
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        return firebaseDB;
    }
    
}


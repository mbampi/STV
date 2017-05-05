/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.auth.FirebaseCredentials;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 *
 * @author matheus
 */
public class DataBaseManager {
    
    public static DatabaseReference getDataBaseReference(){
        try{
        FileInputStream serviceAccount = new FileInputStream("/Users/matheus/NetBeansProjects/FirebaseTest/src/firebasetest/Unknown");
        FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredential(FirebaseCredentials.fromCertificate(serviceAccount))
                .setDatabaseUrl("https://stock-trail-vancouver-d8d38.firebaseio.com/")
                .build();

        FirebaseApp app = FirebaseApp.initializeApp(options);
        FirebaseDatabase database = FirebaseDatabase.getInstance(app);
        return database.getReference();
        }catch(FileNotFoundException ex){ System.out.println("FileNotFound Exception in DataBaseManager.java");return null; }
    }
    
    public static void sleep(){
        try {
            Thread.sleep(14);
        } catch (InterruptedException ex) {
            System.out.println("InterruptedException in DataBaseManager.java");
        }
    }
    
}

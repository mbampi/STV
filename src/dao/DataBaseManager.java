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
public abstract class DataBaseManager {
    public static FirebaseApp app;
    
    public static boolean createDataBase(){
        try{
        FileInputStream serviceAccount = new FileInputStream("/Users/matheus/NetBeansProjects/STV/src/doc/serviceAccountKey.json");
        FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredential(FirebaseCredentials.fromCertificate(serviceAccount))
                .setDatabaseUrl("https://stock-trail-vancouver-d8d38.firebaseio.com/")
                .build();

        DataBaseManager.app = FirebaseApp.initializeApp(options);
        return true;
        }catch(FileNotFoundException ex){ System.out.println("FileNotFound Exception in DataBaseManager.java"); return false; }
    }
    
    public static DatabaseReference getDataBaseReference(){
        if(DataBaseManager.app != null){
            FirebaseDatabase database = FirebaseDatabase.getInstance(app);
            return database.getReference();
        }else{
            System.out.println("DataBaseManager.app == null");
            return null;
        }
    }
    
//    public static void sleep(int time){
//        try {
//            Thread.sleep(time);
//        } catch (InterruptedException ex) {
//            System.out.println("InterruptedException in DataBaseManager.java");
//        }
//    }
    
}

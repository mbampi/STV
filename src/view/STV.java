/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.google.firebase.*;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseCredentials;
import com.google.firebase.database.FirebaseDatabase;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author matheus
 */
public class STV extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        
        
        
        
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
        
        // FIREBASE CONFIG
        try{
            FileInputStream serviceAccount =
            new FileInputStream("doc/serviceAccountKey.json");
        

        FirebaseOptions options = new FirebaseOptions.Builder()
          .setCredential(FirebaseCredentials.fromCertificate(serviceAccount))
          .setDatabaseUrl("https://stock-trail-vancouver-d8d38.firebaseio.com")
          .build();

        FirebaseApp.initializeApp(options);
        // END OF FIREBASE CONFIG
        
        // OAUTH 2.0
        // CLIENT ID: 932786064771-ed78f26riqn79u5puetarbc106b5so9o.apps.googleusercontent.com
        // CLIENT SECRET KEY: unth-P23xd-MQ9Uj5nqCuD5F
        
        FileInputStream refreshToken = new FileInputStream("path/to/refreshToken.json");

        FirebaseOptions options = new FirebaseOptions.Builder()
          .setCredential(FirebaseCredentials.fromRefreshToken(refreshToken))
          .setDatabaseUrl("https://stock-trail-vancouver-d8d38.firebaseio.com")
          .build();

        FirebaseApp.initializeApp(options);
        
        //END OF OAUTH 2.0
        // INITIALIZE APP
        // Initialize the default app
        FirebaseApp defaultApp = FirebaseApp.initializeApp(defaultOptions);

        System.out.println(defaultApp.getName());  // "[DEFAULT]"

        // Retrieve services by passing the defaultApp variable...
        FirebaseAuth defaultAuth = FirebaseAuth.getInstance(defaultApp);
        FirebaseDatabase defaultDatabase = FirebaseDatabase.getInstance(defaultApp);

        // ... or use the equivalent shorthand notation
        FirebaseAuth defaultAuth = FirebaseAuth.getInstance();
        FirebaseDatabase defaultDatabase = FirebaseDatabase.getInstance();
        // END OF INITIALIZE APP
        
        }catch(FileNotFoundException e){
            
        }
        
    }
    
}

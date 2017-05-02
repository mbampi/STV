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
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
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
        // CLIENT ID: 932786064771-1j3pc0ulilatujh6rh156l4s1n1984gc.apps.googleusercontent.com
        // CLIENT SECRET KEY: wOeyt9JryVc2tS61bEKCqd3F
        
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
        
        //
        
        //
        
        try {
            // URL TO USER AUTHORIZATION
            URL myURL = new URL("https://accounts.google.com/o/oauth2/v2/auth?"
                    + "scope=email%20profile&"      
                    + "response_type=code&"
                    + "state=security_token%3D138r5719ru3e1%26url%3Dhttps://oauth2.example.com/token&"
                    + "redirect_uri=http://127.0.0.1:9004&" 
                    + "client_id=client_id");
            URLConnection myURLConnection = myURL.openConnection();
            myURLConnection.connect();
        }catch (MalformedURLException e) { 
            // new URL() failed
            // ...
        } catch (IOException e) {   
            // openConnection() failed
            // ...
        }        
                
                
                
                
        }catch(FileNotFoundException e){
            
        }
        
    }
    
}

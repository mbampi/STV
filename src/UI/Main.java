package UI;

import dao.DataBaseManager;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by madoka on 2017/05/09.
 */
public class Main extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Application.launch(Main.class, (java.lang.String[])null);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            DataBaseManager.createDataBase();
//            Parent root = FXMLLoader.load(Main.class.getResource("SearchPage.fxml"));
            Parent root = FXMLLoader.load(Main.class.getResource("SignInPage.fxml"));
            //Parent root = FXMLLoader.load(Main.class.getResource("Detail.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setTitle("STV");
            primaryStage.show();
            
            
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}




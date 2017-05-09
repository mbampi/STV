package UI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.layout.StackPane;

import static javafx.application.Application.launch;

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

    /**
     * SignIn class instance
     */
    private static Main instance;

    /**
     * stage
     */
    private Stage stage;

    public void start(Stage primaryStage) throws Exception {

        //instance
        instance = this;

        //load panel
        Parent root = FXMLLoader.load(getClass().getResource("SignInPage.fxml"));
        Scene scene = new Scene(root, 1920, 1080);

        primaryStage.setTitle("Welcome to STV");
        primaryStage.setScene(scene);

        //goto SignInpage
        sendSignInController("SignInPage");

        primaryStage.show();
    }


    public void sendSignInController(String labelText) {
        SignInController controller = new SignInController(labelText);
        this.replaceSceneContent(controller);
    }

    /**
     * change scene
     * @param controller
     */
    private void replaceSceneContent(Parent controller) {
        Scene scene = stage.getScene();
        if (scene == null) {
            scene = new Scene(controller);
            stage.setScene(scene);
        } else {
            stage.getScene().setRoot(controller);
        }
    }

    /**
     * Get Instance
     *
     * @return
     */
    public static Main getInstance() {
        return instance;
    }

}


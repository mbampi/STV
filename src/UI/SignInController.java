package UI;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
//import controller.LoginController;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Created by madoka on 2017/05/09.
 */
public class SignInController extends AnchorPane implements Initializable {

    //create button signIn
    private Button btnSignIn;


    /** display label text */
    private final String labelText;

    /** label */
    @FXML
    private Label label;

    /**
     *constructor
     * @param labelText
     */
    public SignInController(String labelText) {
        this.labelText = labelText;

        loadFXML();
    }

    /**
     * FXMLのロード
     */
    private void loadFXML() {

        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("SignInPage.fxml"));
        fxmlLoader.setRoot(this);

        // Set controller by myself
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }



    public void initialize(URL fxmlFileLocation, ResourceBundle resources) {
        assert btnSignIn != null : "fx:id=\"btnSignIn\" was not injected: check your FXML file 'SignInPage.fxml'.";

        btnSignIn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            //go to next page
            public void handle(ActionEvent event) {
                //SignIn.getInstance().sendMainPageController("MainPage");
                System.out.println("Hello!");
            }
        });

    }
}

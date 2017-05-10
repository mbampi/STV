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
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
//import STV.src.img.*;

/**
 * Created by madoka on 2017/05/09.
 */
public class SignInController extends AnchorPane implements Initializable {

    @FXML
    //  fx:id="btnSignIn"
    private Button btnSignIn;// Value injected by FXMLLoader
    private AnchorPane rootPane;


    @Override // This method is called by the FXMLLoader when initialization is complete
    public void initialize(URL fxmlFileLocation, ResourceBundle resources) {
        assert btnSignIn != null : "fx:id=\"btnSignIn\" was not injected: check your FXML file 'SignInPage.fxml'.";

        // initialize your logic here: all @FXML variables will have been injected

        btnSignIn.setOnAction(new EventHandler<ActionEvent>() {
            @FXML
            private AnchorPane content;

            @Override
            public void handle(ActionEvent event) {
                //jump to next page
                try {
                    AnchorPane pane = FXMLLoader.load(getClass().getResource("MainPage.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                rootPane.getChildren().setAll(rootPane);
            }
        });

    }

}

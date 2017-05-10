package UI;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

/**
 * Created by madoka on 2017/05/09.
 */
public class MainPageController extends AnchorPane implements Initializable {
    @FXML
    //  fx:id="btn"
    private Button btnBeginner;// Value injected by FXMLLoader
    private Button btnDogfriendly;
    private Button btnbtnRated;
    private Button btnCamp;
    private Button btnTransit;
    private Button btnSearch;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        //some actions
        assert btnSearch != null : "fx:id=\"btnSearch\" was not injected: check your FXML file 'Mainpage.fxml'.";

        // initialize your logic here: all @FXML variables will have been injected

        //btnSearch action
        btnSearch.setOnAction(new EventHandler<ActionEvent>() {
            @FXML
            private AnchorPane content;

            @Override
            public void handle(ActionEvent event) {
                //next page
                try {
                    AnchorPane pane = FXMLLoader.load(getClass().getResource("ResultPage.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}

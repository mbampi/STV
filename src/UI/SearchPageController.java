/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Slider;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author madoka
 */
public class SearchPageController implements Initializable {

    @FXML
    private CheckBox dog_checkBox;
    @FXML
    private CheckBox rated_checkBox;
    @FXML
    private CheckBox camp_checkBox;
    @FXML
    private CheckBox transit_checkBox;
    @FXML
    private Slider distance_slider;
    @FXML
    private Slider time_slider;
    @FXML
    private Slider elevation_slider;
    @FXML
    private TextField search_field;
    @FXML
    private Button mypage_btn;
    @FXML
    private Button search_btn;
    @FXML
    private SplitMenuButton order_btn;
    @FXML
    private MenuItem descending_btn;
    @FXML
    private MenuItem ascending_btn;
    @FXML
    private ListView<?> trailList_listview;

    //need list date
    observableList<String> list = FXCollections.observableList("Picture","TrailName","Location","Rated","Level","Time","Distance","Season");

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        //setItem(list);
        trailList_listview.setItems(list);
    }    

    @FXML
    //jump to myPage
    private void myPageClicked(ActionEvent event) {
    }

    @FXML
    //search
    private void searchClicked(ActionEvent event) {
        String search = search_field.getText();
    }

    @FXML
    private void descendingClicked(ActionEvent event) {
    }

    @FXML
    private void descendingChoice(Event event) {
    }

    @FXML
    private void ascendingCliked(ActionEvent event) {
    }

    @FXML
    private void ascendingChoice(Event event) {
    }

    @FXML
    private void orderClicked(ActionEvent event) {
    }
    
}

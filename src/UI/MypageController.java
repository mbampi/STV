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
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;


/**
 * FXML Controller class
 *
 * @author madoka
 */
public class MypageController implements Initializable {

    @FXML
    private Text userName_label;
    @FXML
    private Text eMail_label;
    @FXML
    private Hyperlink profile_btn;
    @FXML
    private Hyperlink post_btn;
    @FXML
    private Label completed_label;
    @FXML
    private Label bookmark_label;
    @FXML
    private ListView<?> completed_listview;
    @FXML
    private ListView<?> bookmark_listview1;
    
   //need list date
    //observableList<String> list1 = FXCollections.observableList("Picture","TrailName","Location","Rated","Level","Time","Distance","Season");
    //observableList<String> list2 = FXCollections.observableList("Picture","TrailName","Location","Rated","Level","Time","Distance","Season");

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        //setItem(list);
//        completed_listview.setItems(list1);
//        bookmark_listview1.setItems(list2);
    }    

    @FXML
    private void profileClicked(ActionEvent event) {
    }

    @FXML
    //go to post page
    private void postClicked(ActionEvent event) {
    }

    @FXML
    //go to myTrail page
    private void completedCliked(MouseEvent event) {
    }

    @FXML
    //go to detailPage
    private void bookmarkCliked(MouseEvent event) {
    }
    
}

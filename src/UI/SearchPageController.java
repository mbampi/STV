/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import dao.HikeDAO;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Slider;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import model.Hike;

/**
 * FXML Controller class
 *
 * @author matheus
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
    private TableView<TOHike> table;
    
    private ObservableList<TOHike> data;

    /**
     * Initializes the controller class.
     */
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        //private final TableView<TOHike> table = new TableView<>();
        
        
        

//        TableColumn firstNameCol = new TableColumn("Name");
//        firstNameCol.setMinWidth(100);
//        firstNameCol.setCellValueFactory(
//        new PropertyValueFactory<TOHike, String>("HName"));
// 
//        TableColumn lastNameCol = new TableColumn("Distance");
//        lastNameCol.setMinWidth(100);
//        lastNameCol.setCellValueFactory(
//                new PropertyValueFactory<TOHike, String>("HDistance"));
// 
//        TableColumn emailCol = new TableColumn("Time");
//        emailCol.setMinWidth(200);
//        emailCol.setCellValueFactory(
//                new PropertyValueFactory<TOHike, String>("HTime"));
//        
//        TableColumn ratingCol = new TableColumn("Rating");
//        emailCol.setMinWidth(200);
//        emailCol.setCellValueFactory(
//                new PropertyValueFactory<TOHike, String>("HRating"));
// 
//        table.getColumns().addAll(firstNameCol, lastNameCol, emailCol, ratingCol);
        
        
    }    

    @FXML
    private void myPageClicked(ActionEvent event) {
    }

    @FXML
    private void searchClicked(ActionEvent event) {
        String search = search_field.getText();
        HikeDAO hike_dao = new HikeDAO();
        hike_dao.allHikes(new HikeDAO.hikeListCallback(){
            @Override
            public void done(List<Hike> hikeList) {
////                data =
////            FXCollections.observableArrayList(
////            //new TOHike("Jacob", "Smith", "jacob.smith@example.com"),
////            );
////            for(Hike hike : hikeList){
////                TOHike hiketo = new TOHike(hike.getName(), hike.getDistance(), hike.getTime(), hike.getRating().toString());
////                 data.add(hiketo);
////            }
////               table.setItems(data);
            }
        }); 
        
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
    
    
    //Table Object Class Hike
    
    public static class TOHike {
 
        private final SimpleStringProperty HName;
        private final SimpleStringProperty HDistance;
        private final SimpleStringProperty HTime;
        private final SimpleStringProperty HRating;
 
        private TOHike(String HName, String HDistance, String HTime, String HRating) {
            this.HName = new SimpleStringProperty(HName);
            this.HDistance = new SimpleStringProperty(HDistance);
            this.HTime = new SimpleStringProperty(HTime);
            this.HRating = new SimpleStringProperty(HRating);
        }

        public SimpleStringProperty getHName() {
            return HName;
        }

        public SimpleStringProperty getHDistance() {
            return HDistance;
        }

        public SimpleStringProperty getHTime() {
            return HTime;
        }

        public SimpleStringProperty getHRating() {
            return HRating;
        }
        
        
    }
    
}

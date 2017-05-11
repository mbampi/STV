/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import dao.UserDAO;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import model.User;

/**
 * FXML Controller class
 *
 * @author matheus
 */
public class SignInPageController implements Initializable {

    @FXML
    private Tab signUp_tab;
    @FXML
    private Button signUp_btn;
    @FXML
    private TextField signUpName_field;
    @FXML
    private TextField signUpUserName_field;
    @FXML
    private TextField signUpEmail_field;
    @FXML
    private PasswordField signUpPassword_field;
    @FXML
    private PasswordField signUpConfirmPassword_field;
    @FXML
    private Tab signIn_tab;
    @FXML
    private TextField signInUserName_field;
    @FXML
    private PasswordField signInPassword_field;
    @FXML
    private Button signIn_btn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void signUpClicked(ActionEvent event) {
        String username = this.signUpUserName_field.getText();
        String name = this.signUpName_field.getText();
        String email =  this.signUpEmail_field.getText();
        String password = this.signUpPassword_field.getText();
        
        User new_user = new User(username, email, password, name);
        UserDAO user_dao = new UserDAO();
        user_dao.insertUser(new_user, new UserDAO.messageCallback() {
            @Override
            public void done(String message) {
                System.out.println(message);
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Information Dialog");
                alert.setContentText(message);
                alert.showAndWait();
            }
        });
        
    }

    @FXML
    private void signInClicked(ActionEvent event) {
        String username = this.signInUserName_field.getText();
        String password = this.signInPassword_field.getText();
        UserDAO user_dao = new UserDAO();
        user_dao.getUserByUsername(username, new UserDAO.userCallback() {
            @Override
            public void done(User user) {
                if(user.getPassword().equals(password)){
                    try {
                        System.out.println("Login");
                        Alert alert = new Alert(AlertType.INFORMATION);
                        alert.setTitle("Information Dialog");
                        alert.setContentText("Login");
                        alert.showAndWait();
                        //open searchpageController
                            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SearchPage.fxml"));
                            Parent root1 = (Parent) fxmlLoader.load();
                            Stage stage = new Stage();
                            stage.initModality(Modality.APPLICATION_MODAL);
                            stage.initStyle(StageStyle.UNDECORATED);
                            stage.setScene(new Scene(root1));  
                            stage.show();
                        }catch(Exception e){ System.out.println("aaaa");
                        System.out.println(e.getStackTrace().toString());
                        System.out.println(e.getMessage());}
                    
                }else{
                    System.out.println("Incorrect Login");
                    Alert alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Information Dialog");
                    alert.setContentText("Incorrect Login!");
                    alert.showAndWait();
                }
            }
        });
    }
    
}

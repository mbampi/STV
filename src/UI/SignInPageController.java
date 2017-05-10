/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import dao.DataBaseManager;
import dao.UserDAO;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import model.User;

/**
 * FXML Controller class
 *
 * @author matheus
 */
public class SignInPageController implements Initializable {

    @FXML
    private Tab SignUpTab;
    @FXML
    private Button btnSignUp;
    @FXML
    private TextField username_field;
    @FXML
    private TextField email_field;
    @FXML
    private TextField password_field;
    @FXML
    private TextField confirm_password_field;
    @FXML
    private Tab SignInTab;
    @FXML
    private Button btnSignIn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void signUpClicked(ActionEvent event) {
        UserDAO user_dao = new UserDAO();
        DataBaseManager.createDataBase();
        System.out.println("You clicked me!");
        String username = username_field.getText();
        String email = email_field.getText();
        String password = password_field.getText();
        String name = "asdasdas";
        User new_user = new User(username, email, password, name);
        
        user_dao.insertUser(new_user, new UserDAO.messageCallback() {
            @Override
            public void done(String message) {
                System.out.println(message);
            }
        });

    }

}

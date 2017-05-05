
import dao.UserDAO;
import model.User;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matheus
 */
public class TestMain {
    
    
    public static void main(String[] args) {
        User user = new User("mbampi", "matt@email.com", "123123", "Matheus D Bampi");
        UserDAO user_db =  new UserDAO();
        user_db.insertUser(user);
        user_db.findByUsername(user.getUsername());
        System.out.println("the end");
    }
}

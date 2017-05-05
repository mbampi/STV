
import dao.DataBaseManager;
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
        User user1 = new User("mario", "mario@email.com", "234234", "Mario Kart");
        UserDAO user_db =  new UserDAO();
        DataBaseManager.createDataBase();
        user_db.insertUser(user);
        user_db.insertUser(user1);


        user_db.findByUsername(user.getUsername(), new UserDAO.Callback() {
            @Override
            public void done(User user) {
                System.out.println(user.getName());
                System.out.println("look: " + user.getEmail());
                System.out.println("the end");
            }
        });
        
         System.out.println("wait...");
    }
    

}

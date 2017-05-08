
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
        //User user1 = new User("mario", "mario@email.com", "234234", "Mario Kart");
        UserDAO user_dao =  new UserDAO();
        DataBaseManager.createDataBase();
        /*
        //function to insert user
        user_dao.insertUser(user, new UserDAO.messageCallback() {
            
            @Override
            public void done(String message) {
                System.out.println("entra");
                System.out.println(message);
                //print message
            }
        });
        //DataBaseManager.sleep(20);*/
        String username = "mbampi"; //test
        //function to get user by username
        user_dao.findByUsername(username, new UserDAO.userCallback() {
            @Override
            public void done(User user) { 
                System.out.println("entra");
                System.out.println(user.getName());
                System.out.println(user.getPassword());
                //print User informations
            }
        });
        
        System.out.println("wait...");
    }
    

}

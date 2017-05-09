
import dao.DataBaseManager;
import dao.HikeDAO;
import dao.UserDAO;
import java.util.Scanner;
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
        // ------    CONFIG     ------
        //User user = new User("mbampi", "matt@email.com", "123123", "Matheus D Bampi");
        //User user1 = new User("mario", "mario@email.com", "234234", "Mario Kart");
        UserDAO user_dao = new UserDAO();
        HikeDAO hike_dao = new HikeDAO();
        DataBaseManager.createDataBase();
        
        Scanner scan = new Scanner(System.in);
        
        
        // ------    end CONFIG     ------
        
        
        // ------    SIGNUP     ------
        /*
        user_dao.insertUser(user, new UserDAO.messageCallback() {
            
            @Override
            public void done(String message) {
                System.out.println("entra");
                System.out.println(message);
                //print message
            }
        });
*/
        // ------    end SIGNUP     ------
        
        
        //DataBaseManager.sleep(20);
        
        
        // ------    LOGIN     ------
        System.out.println("username: ");
        String username = scan.next();
        System.out.println("password: ");
        String password = scan.next();
        
        user_dao.getUserByUsername(username, new UserDAO.userCallback() {
            @Override
            public void done(User user) { 
                System.out.println("entra");
                System.out.println(user.getName());
                System.out.println(user.getPassword());
                if(user.getPassword().equals(password)){
                    System.out.println("LOGIN");
                }else{
                    System.out.println("INCORRECT PASSWORD");
                }
                //print User informations
            }
        });
        // ------    end LOGIN     ------
        
        System.out.println("wait...");
    }
    

}

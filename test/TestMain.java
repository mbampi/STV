
import dao.DataBaseManager;
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
        
        
        
        
        
        // ------------    CONFIG     ------------
        User user = new User("mbampi", "matt@email.com", "123123", "Matheus D Bampi");
        User user1 = new User("mario", "mario@email.com", "234234", "Mario Kart");
        UserDAO user_dao = new UserDAO();
        DataBaseManager.createDataBase();
        
        Scanner scan = new Scanner(System.in);
        // ------------    end CONFIG     ------------
        
        
        
        
        
        // ------------    SIGNUP     ------------
        user_dao.insertUser(user, new UserDAO.messageCallback() {
            @Override
            public void done(String message) {
                System.out.println(message);
            }
        });
        // ------------    end SIGNUP     ------------
        // ------------    SIGNUP     ------------
        user_dao.insertUser(user1, new UserDAO.messageCallback() {
            @Override
            public void done(String message) {
                System.out.println(message);
            }
        });
        // ------------    end SIGNUP     ------------
        
        
        
        
        // ------------    LOGIN     ------------
        System.out.println("username: ");
        String username = scan.next().trim();
        System.out.println("password: ");
        String password = scan.next();
        
        user_dao.getUserByUsername(username, new UserDAO.userCallback() {
            @Override
            public void done(User user) {
                if(user.getPassword().equals(password)){
                    System.out.println("LOGIN");
                }else{
                    System.out.println("INCORRECT PASSWORD");
                }
            }
        });
        // ------------    end LOGIN     ------------
        
        
        
        
        
        // ------------    DELETE ACCOUNT     ------------
        System.out.println("delete username: ");
        username = scan.next().trim();
        user_dao.deleteUser(username, new UserDAO.messageCallback() {
            @Override
            public void done(String message) {
                System.out.println(message);
            }
        });
        // ------------    end DELETE ACCOUNT     ------------
        // ------------    DELETE ACCOUNT     ------------
        System.out.println("delete username: ");
        username = scan.next().trim();
        user_dao.deleteUser(username, new UserDAO.messageCallback() {
            @Override
            public void done(String message) {
                System.out.println(message);
            }
        });
        // ------------    end DELETE ACCOUNT     ------------
        
        System.out.println("wait...");
    }
    

}

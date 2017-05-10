package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class Main extends Application {
    private Scene scene;
    @Override
    public void start(Stage primaryStage) throws Exception{
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
//        primaryStage.setTitle("Hello World");
//        primaryStage.setScene(new Scene(root, 300, 275));
//        primaryStage.show();

        


        WebView browser = new WebView();
        WebEngine webEngine = browser.getEngine();
        String start = "";
//        String end = "49.285756,-123.112204";
        String end = "trailway";
        webEngine.load("https://www.google.ca/maps/dir/"+start+"/"+end+"?hl=en&hl=en");
        scene = new Scene(browser,750,500, Color.web("#666970"));
        primaryStage.setScene(scene);
        scene.getStylesheets().add("webviewsample/BrowserToolbar.css");
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);

    }

//    @Override
//    public void start(Stage stage) {
//        stage.setTitle("HTML");
//        stage.setWidth(500);
//        stage.setHeight(500);
//        Scene scene = new Scene(new Group());
//        VBox root = new VBox();
//        final WebView browser = new WebView();
//        final WebEngine webEngine = browser.getEngine();
//        String url_address = "https://www.google.ca/maps/dir//Waterfront+Station,+Vancouver,+BC/";
//        webEngine.load(url_address);
////        Hyperlink hpl = new Hyperlink("open google ");
////        hpl.setOnAction(new EventHandler<ActionEvent>() {
////          @Override public void handle(ActionEvent e) {
////              webEngine.load(url_address);
////          }
////      });
//
//
//
//        root.getChildren().addAll(browser);
//        scene.setRoot(root);
//
//        stage.setScene(scene);
//        stage.show();
//    }

//    public static void main(String[] args) {
//        launch(args);
//    }
}
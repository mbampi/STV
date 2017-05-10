package UI;

import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by madoka on 2017/05/09.
 */
public class PostController extends AnchorPane implements Initializable {
    private Hyperlink linkProfile;
    private Hyperlink linkPost;
    private TextField textTrail;
    private DatePicker Date;
    private TextField textTime;
    private TextField textRating;
    private TextArea textComment;
    private Button btnPicture;
    private Button btnSave;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}

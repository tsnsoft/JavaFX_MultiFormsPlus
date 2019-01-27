package multiframesprogramm;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import static multiframesprogramm.MultiFramesProgramm.stageMain;

public class FXMLFrame1Controller implements Initializable {

    // Инициализация окна
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        stageMain.setTitle("Добро пожаловать!");
    }

    // Кнопка перехода на 2 окно
    @FXML
    private void frame1nextbutton_Action(ActionEvent event) throws IOException {
        stageMain.setScene(new SceneBuilder().getScene("2"));
    }

    // Кнопка выхода из программы
    @FXML
    private void exitframe1button_Action(ActionEvent event) {
        stageMain.close();
    }
    
}

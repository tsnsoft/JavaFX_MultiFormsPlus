package multiframesprogramm;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

import static multiframesprogramm.MultiFramesProgramm.stageMain;
import static multiframesprogramm.MultiFramesProgramm.checkBoxAnswer;

public class FXMLFrame4Controller implements Initializable {

    @FXML
    private CheckBox checkBox1;
    @FXML
    private CheckBox checkBox3;
    @FXML
    private CheckBox checkBox2;
    @FXML
    private CheckBox checkBox4;
    @FXML
    private Label checkBoxLabel;

    // Инициализация окна и компонент
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        stageMain.setTitle("Языки");
        checkBox_Action(null);
    }

    // Выбор значения-"галочки"
    @FXML
    private void checkBox_Action(ActionEvent event) {
        checkBoxAnswer = "";
        if (checkBox1.isSelected()) {
            checkBoxAnswer += " Русский";
        }
        if (checkBox2.isSelected()) {
            checkBoxAnswer += " Казахский";
        }
        if (checkBox3.isSelected()) {
            checkBoxAnswer += " Английский";
        }
        if (checkBox4.isSelected()) {
            checkBoxAnswer += " Немецкий";
        }
        checkBoxLabel.setText("Выбрано: " + checkBoxAnswer);
    }

    // Кнопка перехода на 3 окно
    @FXML
    private void frame4backbutton_action(ActionEvent event) throws IOException {
        stageMain.setScene(new SceneBuilder().getScene("3"));
    }

    // Кнопка перехода на 5 окно
    @FXML
    private void frame4nextbutton_action(ActionEvent event) throws IOException {
        stageMain.setScene(new SceneBuilder().getScene("5"));
    }

}

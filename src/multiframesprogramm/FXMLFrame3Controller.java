package multiframesprogramm;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

import static multiframesprogramm.MultiFramesProgramm.stageMain;
import static multiframesprogramm.MultiFramesProgramm.radioButtonAnswer;

public class FXMLFrame3Controller implements Initializable {

    @FXML
    private ToggleGroup group1;
    @FXML
    private Label radioButtonLabel;
    @FXML
    private RadioButton radioButton1;

    // Инициализация окна и компонент
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        stageMain.setTitle("Игры");
        group1.selectToggle(radioButton1);
        radioButton_Action(null);
    }

    // Выбор значения radioButton через group1
    @FXML
    private void radioButton_Action(ActionEvent event) {
        RadioButton selectedRadioButton = (RadioButton) group1.getSelectedToggle();
        String toogleGroupId = selectedRadioButton.getId();
        radioButtonAnswer = "";
        if (toogleGroupId.equals("radioButton1")) {
            radioButtonAnswer = "Assassin's Creed";
        }
        if (toogleGroupId.equals("radioButton2")) {
            radioButtonAnswer = "The Witcher";
        }
        if (toogleGroupId.equals("radioButton3")) {
            radioButtonAnswer = "Grand Theft Auto";
        }
        if (toogleGroupId.equals("radioButton4")) {
            radioButtonAnswer = "Dota";
        }
        radioButtonLabel.setText("Выбрано: " + radioButtonAnswer);
    }

    // Кнопка перехода на 2 окно
    @FXML
    private void frame3backbutton_action(ActionEvent event) throws IOException {
        stageMain.setScene(new SceneBuilder().getScene("2"));
    }

    // Кнопка перехода на 4 окно
    @FXML
    private void frame3nextbutton_action(ActionEvent event) throws IOException {
        stageMain.setScene(new SceneBuilder().getScene("4"));

    }

}

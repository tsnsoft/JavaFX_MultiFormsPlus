package multiframesprogramm;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

import static multiframesprogramm.MultiFramesProgramm.comboBoxAnswer;
import static multiframesprogramm.MultiFramesProgramm.stageMain;

public class FXMLFrame2Controller implements Initializable {

    private ObservableList<String> arr = FXCollections.observableArrayList(
            "Супермен",
            "Бэтмен",
            "Флэш",
            "Чудо женщина",
            "Зеленый фонарь",
            "Аквамен",
            "Железный человек",
            "Капитан Америка",
            "Халк",
            "Росомаха",
            "Черная вдова",
            "Тор"
    );

    @FXML
    private ComboBox<String> combobox;
    @FXML
    private Label comboBoxLabel;

    // Инициализация окна и компонент
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        stageMain.setTitle("Комикcы");
        combobox.setItems(arr);
        combobox.getSelectionModel().selectFirst();
        combobox_action(null);
    }

    // Изменение выбора в компоненте combobox
    @FXML
    private void combobox_action(ActionEvent event) {
        String line = combobox.getSelectionModel().getSelectedItem();
        comboBoxAnswer = line;
        comboBoxLabel.setText("Выбрано: " + line);
    }

    // Кнопка перехода на 1 окно
    @FXML
    private void frame2backbutton_action(ActionEvent event) throws IOException {
        stageMain.setScene(new SceneBuilder().getScene("1"));
    }

    // Кнопка перехода на 3 окно
    @FXML
    private void frame2nextbutton_action(ActionEvent event) throws IOException {
        stageMain.setScene(new SceneBuilder().getScene("3"));
    }

}

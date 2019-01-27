package multiframesprogramm;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

import static multiframesprogramm.MultiFramesProgramm.stageMain;
import static multiframesprogramm.MultiFramesProgramm.jListAnswer;

public class FXMLFrame5Controller implements Initializable {

    private ObservableList<String> items = FXCollections.observableArrayList(
            "Аниме",
            "Боевик",
            "Биографический",
            "Вестерн",
            "Военный",
            "Детектив",
            "Документальный",
            "Драма",
            "Исторический",
            "Кинокомикс",
            "Комедия",
            "Короткометражный",
            "Мелодрамма",
            "Приключения",
            "Семейный",
            "Спорт",
            "Триллер",
            "Ужасы",
            "Фантастика");
    @FXML
    private Label jListLabel;
    @FXML
    private ListView<String> jList;

    // Инициализация окна и компонент
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        stageMain.setTitle("Кино");
        jList.setItems(items);
        jList.getSelectionModel().selectFirst();
        jList_action(null);
    }

    // Выбор значения в jList
    @FXML
    private void jList_action(MouseEvent event) {
        jListAnswer = jList.getSelectionModel().getSelectedItem();
        jListLabel.setText("Выбрано: " + jListAnswer);
    }

    // Кнопка перехода на 4 окно
    @FXML
    private void frame5backbutton_action(ActionEvent event) throws IOException {
        stageMain.setScene(new SceneBuilder().getScene("4"));
    }

    // Кнопка перехода на 6 окно
    @FXML
    private void frame5nextbutton_action(ActionEvent event) throws IOException {
        stageMain.setScene(new SceneBuilder().getScene("6"));
    }

}

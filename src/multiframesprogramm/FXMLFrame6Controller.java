package multiframesprogramm;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;

import static multiframesprogramm.MultiFramesProgramm.stageMain;
import static multiframesprogramm.MultiFramesProgramm.comboBoxAnswer;
import static multiframesprogramm.MultiFramesProgramm.radioButtonAnswer;
import static multiframesprogramm.MultiFramesProgramm.checkBoxAnswer;
import static multiframesprogramm.MultiFramesProgramm.jListAnswer;

public class FXMLFrame6Controller implements Initializable {

    @FXML
    private TableView<String[]> table;

    // Инициализация окна и компонент
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        stageMain.setTitle("Результаты");
        Utils.buildTable(table, 4, 2, 35, 399, false, new String[]{"Вопрос", "Ответ"});
        table.getItems().get(0)[0] = "Ваш любимый персонаж комиксов ?";
        table.getItems().get(1)[0] = "Ваша любимая серия игр ?";
        table.getItems().get(2)[0] = "Какие языки вы знаете ?";
        table.getItems().get(3)[0] = "Ваш любимый жанр кино ?";
        table.getItems().get(0)[1] = comboBoxAnswer;
        table.getItems().get(1)[1] = radioButtonAnswer;
        table.getItems().get(2)[1] = checkBoxAnswer;
        table.getItems().get(3)[1] = jListAnswer;
    }

    // Кнопка перехода на 5 окно
    @FXML
    private void frame6backbutton_action(ActionEvent event) throws IOException {
        stageMain.setScene(new SceneBuilder().getScene("5"));
    }

    // Кнопка выхода из программы
    @FXML
    private void frame6exitbutton_action(ActionEvent event) {
        stageMain.close();
    }

}

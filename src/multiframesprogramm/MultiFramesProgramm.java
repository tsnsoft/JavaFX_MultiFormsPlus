package multiframesprogramm;

import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class MultiFramesProgramm extends Application {

    static Stage stageMain; // Общая переменная для доступа главной сцене
    static String comboBoxAnswer = ""; // Общая переменная для сохранения текста
    static String radioButtonAnswer = ""; // Общая переменная для сохранения текста
    static String checkBoxAnswer = ""; // Общая переменная для сохранения текста
    static String jListAnswer = ""; // Общая переменная для сохранения текста

    @Override
    public void start(Stage stage) throws Exception {
        stageMain = stage; // Сохраняем ссылку на главную сцену в общей переменной
        stage.getIcons().add(new Image("/images/icon.png"));
        stage.setScene(new SceneBuilder().getScene("1")); // Переход на первое окно
        stage.setResizable(false); // Запрещаем изменение размеров окна
        stage.show(); // Активируем видимость программы
    }

    public static void main(String[] args) {
        launch(args);
    }

}

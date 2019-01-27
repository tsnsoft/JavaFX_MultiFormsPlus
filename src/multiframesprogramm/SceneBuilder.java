package multiframesprogramm;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

/**
 * КЛАСС СОЗДАНИЯ "СЦЕНЫ"
 */
public class SceneBuilder {

    /**
     * Получение объекта сцены
     * @param num Номер окна, шаблон "FXMLForm*"
     * @return сцена
     * @throws IOException
     */
    public Scene getScene(String num) throws IOException {
        return new Scene(FXMLLoader.load(getClass().getResource("FXMLFrame" + num + ".fxml")));
    }
}

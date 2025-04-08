package multiframesprogramm;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.event.EventHandler;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.util.Callback;

/**
 *
 * @author Talipov S.N.
 * @version 2
 */
public class Utils {

    /**
     * СОЗДАТЕЛЬ ДАННЫХ ТАБЛИЦЫ TableView
     *
     * @param tableView компонент типа TableView
     * @param rowCount количество строк
     * @param colCount количество колонок
     * @param rowHeight высота строк
     * @param colWidth ширина колонок
     * @param editable разрешение редактирования ячеек таблицы
     * @param titles названия колонок таблицы (или null)
     */
    static public void buildTable(TableView tableView, int rowCount, int colCount,
            int rowHeight, int colWidth, boolean editable, String[] titles) {

        // Установка разрешения на редактирование
        tableView.setEditable(editable);

        // Установка высоты строк
        tableView.setFixedCellSize(rowHeight);

        // Выбираем выделение в режиме одиночной ячейки
        tableView.getSelectionModel().setCellSelectionEnabled(true);

        // Добавляем в таблицу пустой список с ячейками нужной размерностью rowCount * colCount
        tableView.setItems(FXCollections.observableArrayList(new String[rowCount][colCount]));

        // Убираем заголовок у таблицы если требуется
//        if (titles == null) {
//            tableView.skinProperty().addListener((a, b, newSkin) -> {
//                TableHeaderRow headerRow = ((TableViewSkinBase) newSkin).getTableHeaderRow();
//                headerRow.setVisible(false);
//                headerRow.setPrefHeight(0);
//                headerRow.setMaxHeight(0);
//            });
//        }

        // Запрещаем перемещать колонки в таблице
//        tableView.widthProperty().addListener(new ChangeListener<Number>() {
//            @Override
//            public void changed(ObservableValue<? extends Number> source, Number oldWidth, Number newWidth) {
//                TableHeaderRow header = (TableHeaderRow) tableView.lookup("TableHeaderRow");
//                header.reorderingProperty().addListener(new ChangeListener<Boolean>() {
//                    @Override
//                    public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
//                        header.setReordering(false);
//                    }
//                });
//            }
//        });

        // Создаем столбцы в таблице
        for (int col = 0; col < colCount; col++) {
            TableColumn tableColumn;
            if ((titles == null)) {
                tableColumn = new TableColumn(); // Создаем новый столбец
            } else {
                if (col < titles.length) {
                    tableColumn = new TableColumn(titles[col]);
                } else {
                    tableColumn = new TableColumn(); // Создаем новый столбец
                }
            }

            // Устанавливаем столбцу запрет сортировки, запрет изменения размера и значение ширины
            tableColumn.setSortable(false);
            tableColumn.setResizable(false);
            tableColumn.setPrefWidth(colWidth);
            tableColumn.setMinWidth(colWidth);

            // Делаем обработчкик для отображения столбца в таблице
            int columnNumber = col;
            tableColumn.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<String[], String>, ObservableValue<String>>() {
                @Override
                public ObservableValue<String> call(TableColumn.CellDataFeatures<String[], String> p) {
                    return new SimpleStringProperty((p.getValue()[columnNumber]));
                }
            });

            // Делаем обработчик для редактирования ячеек в таблице
            tableColumn.setCellFactory(TextFieldTableCell.forTableColumn());
            tableColumn.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent>() {
                @Override
                public void handle(TableColumn.CellEditEvent ev) {
                    String[] row = (String[]) tableView.getItems().get(ev.getTablePosition().getRow());
                    row[ev.getTablePosition().getColumn()] = ev.getNewValue().toString();
                }

            });

            // Добавляем столбец в таблицу
            tableView.getColumns().add(tableColumn);
        }

    }

}

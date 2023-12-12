import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {launch(args);}

    @Override
    public void start(Stage primaryStage) {
        TableView<Mahasiswa> tableView = new TableView<>();

        TableColumn<Mahasiswa, String> column1 = new TableColumn<>("Nim");
        column1.setCellValueFactory(new PropertyValueFactory<>("Nim"));

        TableColumn<Mahasiswa, String> column2 = new TableColumn<>("Nama");
        column2.setCellValueFactory(new PropertyValueFactory<>("Nama"));

        tableView.getColumns().addAll(column1, column2);

        tableView.getItems().add(new Mahasiswa(1, "2210817220007", "Aisya"));
        tableView.getItems().add(new Mahasiswa(2, "2210817220008", "Anindia"));
        tableView.getItems().add(new Mahasiswa(3, "2210817220009", "Septha"));
        tableView.getItems().add(new Mahasiswa(4, "2210817220034", "Wanda"));
        tableView.getItems().add(new Mahasiswa(5, "2210817220035", "Karliyanti"));
        tableView.getItems().add(new Mahasiswa(6, "2210817220036", "Siti"));
        tableView.getItems().add(new Mahasiswa(7, "2210817220037", "Ainur"));
        tableView.getItems().add(new Mahasiswa(8, "2210817220038", "Rahmawati"));
        tableView.getItems().add(new Mahasiswa(9, "2210817220029", "Helena"));
        tableView.getItems().add(new Mahasiswa(10, "2210817120011", "Maulida"));

        VBox vbox = new VBox(tableView);

        Scene scene = new Scene(vbox);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
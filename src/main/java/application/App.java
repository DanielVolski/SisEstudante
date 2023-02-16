package application;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class App extends Application {

    /**
     * Cria um objeto static denominado root do tipo BorderPane para passar ao controller
     */
    private static BorderPane root = new BorderPane();

    /**
     * Cria um método static denominado getRoot para retornar root para o controller usar
     */
    public static BorderPane getRoot() {
        return root;
    }

    @Override
    public void start(Stage stage) throws IOException {

        /** Carrega e analisa sintaticamente o arquivo menus.fxml
         *   e retorna o objeto do tipo MenuBar
         */
        MenuBar menuBar = FXMLLoader.load(getClass().getResource("menus.fxml"));
        /**
         * constrói a scene usando o root static
         */
        root.setTop(menuBar);

        Scene scene = new Scene(root, 640, 480);
        // Adiciona uma imagem a IU

        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}

package controller;

import java.io.IOException;
import application.App;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;

public class MenusController {
    @FXML
    private MenuItem menuEstudanteInclui; // Value injected by FXMLLoader

    @FXML
    private MenuItem menuEstudanteAltera;

    @FXML
    private MenuItem menuEstudanteSair;

    @FXML
    private MenuItem menuProfessorSair;

    @FXML
    private MenuItem menuTelaVazia;

    /**
     * Event handler for MenuItem menuEstudanteInclui
     */
    @FXML
    private void incluiOnAction(ActionEvent event) {
        try {
            BorderPane bpInclui = FXMLLoader.load(getClass().getResource("/application/incluiEstudante.fxml"));
            BorderPane border = App.getRoot();
            border.setCenter(bpInclui);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void alteraOnAction(ActionEvent event) {
        try {
            BorderPane bpInclui = FXMLLoader.load(getClass().getResource("/application/alteraEstudante.fxml"));
            BorderPane border = App.getRoot();
            border.setCenter(bpInclui);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void exluiOnAction(ActionEvent event) {
        try {
            BorderPane bpInclui = FXMLLoader.load(getClass().getResource("/application/excluiEstudante.fxml"));
            BorderPane border = App.getRoot();
            border.setCenter(bpInclui);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Event handler for MenuItem telaVazia
     */
    @FXML
    private void telaVaziaOnAction(ActionEvent event) {
        try {
            BorderPane borderTelaVazia = FXMLLoader.load(getClass().getResource("/application/telaVazia.fxml"));
            BorderPane border = App.getRoot();
            border.setCenter(borderTelaVazia);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Event handler for MenuItem menuEstudanteSair
     */
    @FXML
    private void sairOnAction(ActionEvent event) {
        Platform.exit();
    }
}

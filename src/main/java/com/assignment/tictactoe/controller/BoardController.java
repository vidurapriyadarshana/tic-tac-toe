package com.assignment.tictactoe.controller;

import com.assignment.tictactoe.service.BoardUi;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class BoardController implements BoardUi {
    @FXML
    private Button bt00;

    @FXML
    private Button bt01;

    @FXML
    private Button bt02;

    @FXML
    private Button bt10;

    @FXML
    private Button bt11;

    @FXML
    private Button bt12;

    @FXML
    private Button bt20;

    @FXML
    private Button bt21;

    @FXML
    private Button bt22;

    @FXML
    void handleButtonAction(ActionEvent event) {

    }
}

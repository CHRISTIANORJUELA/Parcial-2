package com.example.proyecto.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TableColumn<?, ? > ageCl;

    @FXML
    private TableColumn<?, ?> nameCl;

    @FXML
    private TableView<?> tableCl;

    @FXML
    private TextField tfAge;

    @FXML
    private TextField tfName;
    @FXML
    private TextField tfPaste;

    @FXML
    private TextField tfSearchName;


    ModelFactoryController mfc = ModelFactoryController.getInstance();

    @FXML
    void add(ActionEvent event) {
         String name = tfName.getText();
         String age = tfAge.getText();

         if (name != null && age != null){
             mfc.addClient(name,age);
         }

    }

    @FXML
    void seeList(ActionEvent event) {
         tfPaste.setText("");
         mfc.seeClient(tfPaste);
    }
    @FXML
    void search(ActionEvent e){
        String name = tfSearchName.getText();
        if (name != null){
            mfc.searchName(name);
        }
    }
    }
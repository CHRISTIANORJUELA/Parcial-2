package com.example.proyecto.controllers;

import Application.Laboratory;
import Application.ModelFactoryService;
import javafx.scene.control.TextField;

public class ModelFactoryController implements ModelFactoryService {
    Laboratory laboratory;
    //-----------------------------
    private static class SingletonHolder {
        private final static ModelFactoryController eINSTANCE = new ModelFactoryController();
    }
    // Método para obtener la instancia de nuestra clase
    public static ModelFactoryController getInstance() {
        return SingletonHolder.eINSTANCE;
    }
    public ModelFactoryController() {
        laboratory = new Laboratory();
    }


    public  void addClient(String tfName, String tfAge){
        laboratory.getClientServiceImpl().addClient(tfName,tfAge);
    }

    public void  seeClient(TextField tfSee){
        laboratory.getClientServiceImpl().seeClient(tfSee);
    }

    public  void searchName(String name){
        laboratory.getClientServiceImpl().searchName(name);
    }



}

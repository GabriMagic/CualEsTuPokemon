package com.suilerstudios.cetp.controller;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.FlowPane;

public class TableroFichasController {

    @FXML
    private FlowPane main;

    
    
    public TableroFichasController() {

		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/TableroView.fxml"));
			loader.setController(this);
			main=loader.load();
			
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
    
    public FlowPane getMain() {
		return main;
	}
}


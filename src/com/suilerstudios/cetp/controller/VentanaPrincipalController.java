package com.suilerstudios.cetp.controller;

import java.util.Optional;

import com.suilerstudios.cetp.component.JugadorComponent;
import com.suilerstudios.cetp.modelo.Partida;
import com.suilerstudios.moverVentanaComponent.controller.VMBox;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class VentanaPrincipalController {

	private HBox root;
	private TableroController tablero;
	private VMBox movimiento;
	private InfoController info;
	private JugadorComponent jugadorComponent;
	private Partida p;
	public VentanaPrincipalController(Stage primaryStage, Partida p) {
		this.p = p;
		jugadorComponent = new JugadorComponent();
		info = new InfoController();
		root = new HBox();

		ImageView logo = new ImageView();
		logo.setFitWidth(25);
		logo.setFitHeight(25);
		logo.setImage(new Image(getClass().getResourceAsStream("../img/logo.png")));

		tablero = new TableroController();
		tablero.getMain().setPrefSize(840, 616);
		movimiento = new VMBox(primaryStage);
		movimiento.getVMBox().setPrefSize(50, 125);
		movimiento.getVMBox().getChildren().add(0, logo);
		root.setStyle("-fx-background-color: rgba(255, 255, 255, 0);");
		info.getMain().setStyle("-fx-background-color: #22313F; ");

		BorderPane izquierda = new BorderPane();
		izquierda.setTop(info.getMain());
		izquierda.setCenter(jugadorComponent.getView());
		izquierda.setStyle("-fx-background-color: #22313F ");
		root.getChildren().add(izquierda);
		root.getChildren().add(tablero.getMain());
		root.getChildren().add(movimiento.getVMBox());

		jugadorComponent.getImagePokemon().setImage(new Image(getClass().getResourceAsStream("../img/"+p.getJ1().getPokemon().getCodigoPokemon()+".png")));
		jugadorComponent.getLabelNombrePokemon().setText(p.getJ1().getPokemon().getNombre());
		
		jugadorComponent.getPreguntarButton().setOnAction(e->{
			
			Object obj = jugadorComponent.getC2().getValue();
			
			if (obj.toString().equals("Si")) {
				obj = true;
			}else if(obj.toString().equals("No")){
				obj = false;
			}
			
			System.out.println(p.getIa().comprobarDato(jugadorComponent.getC1().getValue().toLowerCase(), obj));
			Object[][] biObj = p.getIa().generarPregunta();
			Alert alert = new Alert(AlertType.CONFIRMATION);
			alert.setTitle("Confirmation Dialog");
			alert.setHeaderText("Look, a Confirmation Dialog");
			alert.setContentText("Es" + biObj[0][0] + " "+ biObj[0][1]);

			Optional<ButtonType> result = alert.showAndWait();
			if (result.get() == ButtonType.OK){
			   p.getIa().flitrarPokemons(biObj[0][0].toString(), biObj[0][1], true);
			} else {
				   p.getIa().flitrarPokemons(biObj[0][0].toString(), biObj[0][1], false);

			}
			
			System.out.println(p.getIa().getListaPartidaPokes().size());
			
			if (p.getIa().getListaPartidaPokes().size() == 1) {
				System.out.println(p.getIa().getListaPartidaPokes().get(0));

			}
			
			
		});
		
	}

	public TableroController getTablero() {
		return tablero;
	}

	public HBox getRoot() {
		return root;
	}

	public InfoController getInfo() {
		return info;
	}
}

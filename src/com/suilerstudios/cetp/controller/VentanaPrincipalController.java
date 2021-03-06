package com.suilerstudios.cetp.controller;

import com.suilerstudios.cetp.component.JugadorComponent;
import com.suilerstudios.cetp.modelo.Partida;
import com.suilerstudios.moverVentanaComponent.controller.VMBox;

import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class VentanaPrincipalController {

	private HBox root;
	private TableroController tablero;
	private VMBox movimiento;
	private InfoController info;
	private JugadorComponent jugadorComponent;
	private Alert alert;
	private Object[][] biObj;

	public VentanaPrincipalController(Stage primaryStage, Partida p) {
		jugadorComponent = new JugadorComponent();
		info = new InfoController();
		root = new HBox();

		Stage st = new Stage();
		MenuController sc = new MenuController(st);
		st.initStyle(StageStyle.TRANSPARENT);
		st.setScene(new Scene(sc.getRoot()));

		ImageView logo = new ImageView();
		logo.setFitWidth(25);
		logo.setFitHeight(25);
		logo.setImage(new Image(getClass().getResourceAsStream("/com/suilerstudios/cetp/img/logo.png")));

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

		jugadorComponent.getImagePokemon().setImage(new Image(getClass().getResourceAsStream(
				"/com/suilerstudios/cetp/img/" + p.getJ1().getPokemon().getCodigoPokemon() + ".png")));
		jugadorComponent.getLabelNombrePokemon().setText(p.getJ1().getPokemon().getNombre());

		jugadorComponent.getPreguntarButton().setOnAction(e -> {

			Object obj = jugadorComponent.getC2().getValue();

			if (obj.toString().equals("Si")) {
				obj = true;
			} else if (obj.toString().equals("No")) {
				obj = false;
			}

			jugadorComponent.getPreguntaLabel()
					.setText("�" + jugadorComponent.getC1().getValue() + " " + jugadorComponent.getC2().getValue()
							+ "? " + p.getIa().comprobarDato(jugadorComponent.getC1().getValue().toLowerCase(), obj));

			/**
			 * A BOUND CANNOT BE SET
			 */
			jugadorComponent.getPreguntarButton().setVisible(false);
			jugadorComponent.getPasarTurnoButton().setVisible(true);

		});

		Stage resolverStage = new Stage();
		Scene scenePokemon = new Scene(new VBox());
		resolverStage.setScene(scenePokemon);
		RespuestaController r = new RespuestaController();

		jugadorComponent.getResolverButton().setOnAction(e -> {
			scenePokemon.setRoot(r.getRoot());
			resolverStage.showAndWait();
		});

		jugadorComponent.getPasarTurnoButton().setOnAction(e -> {
			jugadorComponent.getPasarTurnoButton().setVisible(false);
			alert = new Alert(AlertType.CONFIRMATION);
			alert.initModality(Modality.NONE);
			alert.setTitle("Confirmaci�n");
			alert.setHeaderText("�Es cierto?");
			biObj = p.getIa().generarPregunta();
			alert.setContentText("�" + biObj[0][0] + " " + biObj[0][1] + " ?");

			if (alert.showAndWait().get() == ButtonType.OK) {
				p.getIa().flitrarPokemons(biObj[0][0].toString(), biObj[0][1], true);
			} else {
				p.getIa().flitrarPokemons(biObj[0][0].toString(), biObj[0][1], false);

			}

			System.out.println(p.getIa().getListaPartidaPokes().size());

			if (p.getIa().getListaPartidaPokes().size() == 1) {

				Alert alerta = new Alert(AlertType.INFORMATION);
				alerta.setTitle("Tu pokemon es");
				alerta.setHeaderText("HAS PERDIDO");
				alerta.setContentText(p.getIa().getListaPartidaPokes().get(0).getNombre() + "");

				alerta.showAndWait();
				primaryStage.close();
				st.show();
			} else if (p.getIa().getListaPartidaPokes().size() == 0) {

				Alert alerta = new Alert(AlertType.INFORMATION);
				alerta.setTitle("MENTIROSO");
				alerta.setHeaderText("ME HAS MENTIDO");
				alerta.setContentText(
						"SERE UNA IA QUE REPITE PREGUNTAS PERO NO SOY TONTA... GTFO! VETE DE AQUI CON TU FUCKING "
								+ p.getJ1().getPokemon().getNombre().toUpperCase() + " \"�_� ");

				alerta.showAndWait();
				primaryStage.close();
				st.show();
			}
			/**
			 * A BOUND CANNOT BE SET
			 */

			jugadorComponent.getPreguntarButton().setVisible(true);
		});

		r.getAceptarButton().setOnAction(e -> {
			Alert alerta = new Alert(AlertType.INFORMATION);
			alerta.setTitle("Tu pokemon es");

			if (p.getIa().resolver(r.getSc().getPokemon())) {
				alerta.setContentText("HAS GANADO");
			} else {
				alerta.setContentText("HAS PERDIDO");
			}
			alerta.showAndWait();
			resolverStage.close();
			primaryStage.close();

			st.show();

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

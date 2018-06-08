package application;

import java.io.IOException;

import Modelo.DataAgenda;
import Modelo.Persona;
import controlador.ControladorMain;
import vista.VCEdicion;
import vista.VCprincipal;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class Main extends Application {
	private static Stage stagePrincipal;
	private AnchorPane rootPane;
	private ControladorMain CMiMain;

	@Override
	public void start(Stage stagePrincipal) throws Exception {
		Main.stagePrincipal = stagePrincipal;
		mostrarAgenda();

	}

	public static void main(String[] args) {
		launch(args);
	}

	public void mostrarAgenda() {
		try {
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("../vista/vistaPrincipal.fxml"));
			rootPane = (AnchorPane) loader.load();
			Scene scene = new Scene(rootPane);
			stagePrincipal.setTitle("Agenda");
			stagePrincipal.setScene(scene);

			VCprincipal controller = loader.getController();
			controller.setProgramaPrincipal(this);
			// controller.setCM(CMiMain);

			stagePrincipal.show();
		} catch (IOException e) {
			System.out.print("ERROR 1------>  ");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.print("ERROR 2------>  ");
			e.printStackTrace();
		}
	}

	public void mostrarEditorModifica(Persona pers, int index) {
		try {
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("../vista/vistaEdicion.fxml"));
			AnchorPane ventanaDos;

			ventanaDos = (AnchorPane) loader.load();

			/* Creamos la segunda ventana como otro stage */
			Stage ventana = new Stage();
			ventana.setTitle("Editar");

			/* Le decimos a la ventana quién es la ventana original */
			ventana.initOwner(stagePrincipal);
			Scene scene = new Scene(ventanaDos);
			ventana.setScene(scene);

			VCEdicion controller2 = loader.getController();
			controller2.setStagePrincipal(ventana);
			controller2.setTfApellido(pers.getApellido());
			controller2.setTfNombre(pers.getNombre());
			controller2.setTfTelefono(pers.getTelefono());
			controller2.setIndex(index);

			ventana.show();

			ControladorMain.setdata(pers);
			mostrarAgenda();
		} catch (IOException e) {
			System.out.print("ERROR 3------>  ");
			e.printStackTrace();
			
		} catch (Exception e) {
			System.out.print("ERROR 4------>  ");
			e.printStackTrace();
		}

	}

	public void mostrarEditorInsertar() {

		try {
			
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("../vista/vistaEdicion.fxml"));
			AnchorPane ventanaDos = (AnchorPane) loader.load();
			
			/* Creamos la segunda ventana como otro stage */
			Stage ventana = new Stage();
			ventana.setTitle("Editar");
			
			/* Le decimos a la ventana quién es la ventana original */
			ventana.initOwner(stagePrincipal);
			Scene scene = new Scene(ventanaDos);
			ventana.setScene(scene);

			VCEdicion controller2 = loader.getController();
			controller2.setStagePrincipal(ventana);

			ventana.show();

		} catch (IOException e) {
			System.out.print("ERROR 5------>  ");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.print("ERROR 6------>  ");
			e.printStackTrace();
		}
	}
}

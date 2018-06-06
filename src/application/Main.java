package application;
	
import java.io.IOException;

import vista.VCEdicion;
import vista.VCprincipal;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;


public class Main extends Application {
	private static Stage stagePrincipal;
    private AnchorPane rootPane;

    @Override
    public void start(Stage stagePrincipal) throws Exception {
        Main.stagePrincipal = stagePrincipal;
        mostrarVentanaPrincipal();

    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
    public void mostrarVentanaPrincipal() {
        try {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("../vista/vistaPrincipal.fxml"));
            rootPane=(AnchorPane) loader.load();
            Scene scene = new Scene(rootPane);
            stagePrincipal.setTitle("Ventana Principal");
            stagePrincipal.setScene(scene);

            VCprincipal controller = loader.getController();
            controller.setProgramaPrincipal(this);

            stagePrincipal.show();
        } catch (IOException e) {
            System.out.println("ERROR 1------>" +  e.getMessage());
        }catch(Exception e) {
        	System.out.println("ERROR +++++++++++> " + e.getMessage());
        }
   }
    
    public void mostrarVentanaSecundaria() {
    	
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

        } catch (Exception e) {
        	 System.out.println("ERROR 2------>" +  e.getMessage());
        }
    }
    
}

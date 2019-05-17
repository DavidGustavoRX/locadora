package apresentacao;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.StackPane;
import util.NovaCena;

public class FrmPrincipal implements Initializable{

    @FXML
    private StackPane paneInterno;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}
	
    @FXML
    private void cadastrarCliente(ActionEvent event) {
    	paneInterno.getChildren().clear();
    	paneInterno.getChildren().add(new NovaCena().getNode("/fxml/frmCadSocio.fxml"));
    }

    @FXML
    private void listarSocio(ActionEvent event) {
    	paneInterno.getChildren().clear();
    	paneInterno.getChildren().add(new NovaCena().getNode("/fxml/frmListarSocio.fxml"));
    }

}

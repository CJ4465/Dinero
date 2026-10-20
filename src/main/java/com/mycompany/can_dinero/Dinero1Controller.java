package com.mycompany.can_dinero;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Dinero1Controller implements Initializable {

    @FXML
    private TextField txtDinero;
    @FXML
    private Button btnLimpiar;
    @FXML
    private Button btnDesglosar;
    @FXML
    private Label lbl500;
    @FXML
    private Label lbl200;
    @FXML
    private Label lbl100;
    @FXML
    private Label lbl50;
    @FXML
    private Label lbl20;
    @FXML
    private Label lbl10;
    @FXML
    private Label lbl5;
    @FXML
    private Label lbl2;
    @FXML
    private Label lbl1;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    

    @FXML
    private void limpiarCampos(ActionEvent event) {
        txtDinero.setText("");
        lbl500.setText("0");
        lbl200.setText("0");
        lbl100.setText("0");
        lbl50.setText("0");
        lbl20.setText("0");
        lbl10.setText("0");
        lbl5.setText("0");
        lbl2.setText("0");
        lbl1.setText("0");
        txtDinero.requestFocus();
    }

    @FXML
    private void desglosarDinero(ActionEvent event) {
        try {
            int cantidad = Integer.parseInt(txtDinero.getText());
            
            int b500 = cantidad / 500;
            cantidad = cantidad % 500;
            
            int b200 = cantidad / 200;
            cantidad = cantidad % 200;
            
            int b100 = cantidad / 100;
            cantidad = cantidad % 100;
            
            int b50 = cantidad / 50;
            cantidad = cantidad % 50;
            
            int b20 = cantidad / 20;
            cantidad = cantidad % 20;
            
            int m10 = cantidad / 10;
            cantidad = cantidad % 10;
            
            int m5 = cantidad / 5;
            cantidad = cantidad % 5;
            
            int m2 = cantidad / 2;
            cantidad = cantidad % 2;
            
            int m1 = cantidad;
            
            lbl500.setText(String.valueOf(b500));
            lbl200.setText(String.valueOf(b200));
            lbl100.setText(String.valueOf(b100));
            lbl50.setText(String.valueOf(b50));
            lbl20.setText(String.valueOf(b20));
            lbl10.setText(String.valueOf(m10));
            lbl5.setText(String.valueOf(m5));
            lbl2.setText(String.valueOf(m2));
            lbl1.setText(String.valueOf(m1));
            
        } catch (NumberFormatException e) {
            e.printStackTrace();
            lbl500.setText("0");
            lbl200.setText("0");
            lbl100.setText("0");
            lbl50.setText("0");
            lbl20.setText("0");
            lbl10.setText("0");
            lbl5.setText("0");
            lbl2.setText("0");
            lbl1.setText("0");
        }
    }
}
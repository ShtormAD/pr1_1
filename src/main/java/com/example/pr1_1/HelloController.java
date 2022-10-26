package com.example.pr1_1;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label Res;
    @FXML
    private TextField TF_a;
    @FXML
    private TextField TF_b;
    @FXML
    private TextField TF_h;
    @FXML
    private TextField TF_m;

    @FXML
    protected void onHelloButtonClick() {
        double a,b,h,m;
        try{
            a = Double.parseDouble(TF_a.getText().replace(',','.'));
            b = Double.parseDouble(TF_b.getText().replace(',','.'));
            h = Double.parseDouble(TF_h.getText().replace(',','.'));
            m = Double.parseDouble(TF_m.getText().replace(',','.'));
            if(a<0||b<0||h<0||m<0){
                throw new Exception("Отрицательный размер/масса");
            }
            Res.setText("p="+m/((a*b)/2*h));
        } catch (Exception e){
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Внимание!");
            alert.setHeaderText(null);
            alert.setContentText("Проверьте правильность заполнения полей!");
            alert.showAndWait();
        }
    }

    @FXML
    protected void onEtAction(TextField tf){

    }
}
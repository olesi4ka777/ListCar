package com.example.listcar;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class HelloController {

    ObservableList<String>List1;
        @FXML
        private Button addCar;

        @FXML
        private ChoiceBox<Car> choice1;

        @FXML
        private ListView<?> infoCar;

        @FXML
        private TextField textC;

        @FXML
        void colorL(MouseEvent event) {
        }

        @FXML
        void modelL(MouseEvent event) {
        }

        @FXML
        void speed(MouseEvent event) {
        }
 public void initialize () throws IOException {

     for (int i=0;i<3;i++){
         
     }
        Cars.add( new Car("bmv")
       rotPane.getChildren().add(but));
     Object CarInfo;
     addCar.setOnAction(actionEvent -> infoCar.txt.addFirst(textC.getText()));
               choice1.setValue("");

     void initChoice1(){
         infoCar = FXCollections.observableArrayList(); //Использование стандартного способа создания коллекции
         ListView.infoCar((Files.readAllLines(Path.of("CarInfo.txt"));
         choice1.setItems();

}
     }
}

// загрузить список Машинок из файла- каждая машинка описывается названием, цветом, скоростью
//    отобразить в ListView
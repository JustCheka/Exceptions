package Controller;

import Model.DataParsing;

import java.util.Scanner;

public class Controller {

    public void parsing(String data){
        DataParsing dataParsing = new DataParsing(data);
        if (dataParsing.tryParse()) {
            dataParsing.fillPersonData();
            dataParsing.savePersonData();
        }

    }
}

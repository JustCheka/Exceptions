package Model;

import Model.Checking.Check;
import Model.Checking.CheckBirthDay;
import Model.Checking.CheckName;
import Model.Checking.CheckNumber;
import Model.FileParsing.SaveData;

import java.io.IOException;
import java.util.Arrays;

public class DataParsing {
    private String data;
    private String[] parsedData;
    private int countOfValues;
    Check check = new Check();
    PersonInformation personInformation = new PersonInformation();
    SaveData saveData = new SaveData();

    public DataParsing(String data){
        countOfValues = 6;
        this.data = data;
    }



    public boolean tryParse(){
        parsedData = data.split(" ");
        //System.out.println(Arrays.toString(parsedData));
        if (parsedData.length == 6){
            return true;
        }
        else {
            System.out.println("Введено неверное колчисество данных (количество данных должно равняться: " + countOfValues +
                    ") у вас их: " + parsedData.length);
            return false;
        }
    }

    public void fillPersonData(){
        if (check.fullCheck(parsedData)){
            personInformation.setSurname(parsedData[0]);
            personInformation.setName(parsedData[1]);
            personInformation.setPatronymicSurname(parsedData[2]);
            personInformation.setbDay(parsedData[3]);
            personInformation.setNumber(parsedData[4]);
            personInformation.setSex(parsedData[5].charAt(0));


        }
    }

    public void savePersonData(){
        String savePath = personInformation.getSurname() + ".txt";
        try {
            saveData.save(personInformation, savePath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

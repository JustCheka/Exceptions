package Model.FileParsing;

import Model.PersonInformation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SaveData {
    public void save(PersonInformation personInformation, String path) throws IOException {
        try (FileWriter writter = new FileWriter(path, true)) {

            writter.write("<" + personInformation.getSurname() + "> <" +
                    personInformation.getName() + "> <" +
                    personInformation.getPatronymicSurname() + "> <" +
                    personInformation.getbDay() + "> <" +
                    personInformation.getNumber() + "> <" +
                    personInformation.getSex() + ">\n");

        }
        catch (IOException e) {
            throw new IOException();
        }

        System.out.println("Успешно сохранено\n");
    }
}

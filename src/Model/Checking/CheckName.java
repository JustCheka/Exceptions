package Model.Checking;

import java.util.Scanner;

public class CheckName  implements Checking{


    @Override
    public boolean check(String name){
        for (int i = 0; i < name.length(); i++) {
            if (Character.isDigit(name.charAt(i))) {
                System.out.println("В вашей фамилии/имени/отчестве присутсвует(ют) цифры");
                return false;
            }
        }
        return true;
    }



}

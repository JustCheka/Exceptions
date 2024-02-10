package View;

import Controller.Controller;

import java.util.Scanner;

public class View {
    Controller controller = new Controller();

    public void start(){
        while (true){
            System.out.println("Введите данные через пробел <Фамилия> <Имя> <Отчество> <датарождения> <номертелефона> <пол>");
            System.out.println("Для выхода напишите exit");
            Scanner scanner = new Scanner(System.in);
            String data = scanner.nextLine();
            if (data.equals("exit")){
                break;
            }
            System.out.println(data);
            controller.parsing(data);
        }

    }
}

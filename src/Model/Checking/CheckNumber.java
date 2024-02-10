package Model.Checking;

public class CheckNumber  implements Checking{

    @Override
    public boolean check(String data) {

        if (data.length() != 10) {
            throw new RuntimeException("Неправильно указан номер (должно быть 10 цифр)");
        }

        for (int i = 0; i < data.length(); i++) {
            if (!Character.isDigit(data.charAt(i))){
                throw new RuntimeException("В вашем номере присутсвуют символы, исправьте данные");
            }
        }


        return true;
    }
}

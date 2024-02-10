package Model.Checking;

public class CheckSex  implements  Checking{
    @Override
    public boolean check(String data) {

        if (data.length() != 1) {
            throw new RuntimeException("Ваши данные слишком длинные (нужна одна буква f или m)");
        };

        if (data.equals("f") || data.equals("m")) {
            return true;
        }
        else {
            throw new RuntimeException("Неправильно указан пол (нужна одна буква f или m)");
        }

    }
}

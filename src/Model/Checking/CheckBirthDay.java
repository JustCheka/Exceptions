package Model.Checking;

import java.time.Year;

public class CheckBirthDay implements Checking{

    private int[] daysOfMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private String[] date;
    private int[] intDate = new int[3];

    @Override
    public  boolean check(String data) {
        date = data.split("\\.");


        for (int i = 0; i < 3; i++) {
            try{
                int num = Integer.parseInt(date[i]);
                intDate[i] = num;

            } catch (NumberFormatException e){
                throw new NumberFormatException(date[i] + " это не числовое значение");

            } catch (IndexOutOfBoundsException e){
                throw  new IndexOutOfBoundsException("В году всего 12 месяцев");

            }
        }

        int currentYear = Year.now().getValue();


        if (intDate[1] > 12){
            throw new RuntimeException("на момент 2024 года существует всего 12 месяцев ");
        }
        int daysOfThisMonth = daysOfMonth[intDate[1] - 1];
        if (intDate[0] > daysOfThisMonth) {
            throw new RuntimeException(String.format("В этом месяце %s дней, а не %s%n", daysOfThisMonth, intDate[0]));
        }

        if (intDate[2] > currentYear || Math.abs(intDate[2] - currentYear) > 120){
            throw new RuntimeException("Проверьте свой год рождения! Вы либо еще не родились, либо Вам за 120");
        }



        return true;
    }
}

package Model;

public class PersonInformation {
    private String surname;
    private String name;
    private String patronymicSurname;
    private String bDay;
    private String number;
    private char sex;


    public void setSurname(String surname){
        this.surname = surname;
    }

    public void setName(String name){
        this.name = name;
        //System.out.println(this.name);
    }

    public void setPatronymicSurname(String patronymicSurname){
        this.patronymicSurname = patronymicSurname;
    }

    public void setbDay(String bDay){
        this.bDay = bDay;
    }

    public void setNumber(String number){
        this.number = number;
    }

    public void setSex(char sex){
        this.sex = sex;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymicSurname() {
        return patronymicSurname;
    }

    public String getbDay() {
        return bDay;
    }

    public String getNumber() {
        return number;
    }

    public char getSex() {
        return sex;
    }

//    public void printInfo(){
//
//        System.out.printf("фамилия: %s, имя: %s, отчество: %s, дата рождения: %s, номер телефона: %s, пол: %s",
//                surname, name, patronymicSurname, bDay, number, sex);
//
//
//    }
}

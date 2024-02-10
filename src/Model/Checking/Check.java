package Model.Checking;

public class Check {
    CheckName checkName = new CheckName();
    CheckBirthDay checkBirthDay = new CheckBirthDay();
    CheckNumber checkNumber = new CheckNumber();
    CheckSex checkSex = new CheckSex();

    public boolean fullCheck(String[] data){

        if (!checkName.check(data[0]) || !checkName.check(data[1]) || !checkName.check(data[2])) {
            return false;
        }
        if (!checkBirthDay.check(data[3])) {
            return false;
        }
        if (!checkNumber.check(data[4])){
            return false;
        }
        if (!checkSex.check(data[5])) {
            return false;
        }

        return true;
    }

}

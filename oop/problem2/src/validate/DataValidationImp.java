package validate;

import model.Data;

public class DataValidationImp {
    public boolean validate(Data data) {
        if (data.getNum1()%2==0 && data.getNum2()%2==0 && data.getNum3()%2==0) {
            return true;
        }
        return false;
    }

}

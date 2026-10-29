package Service;

import model.Data;
import validate.DataValidationImp;

public class ProcessServiceImp implements ProcessService {

    @Override
    public int sum(Data data) {
        DataValidationImp dataValidationImp = new DataValidationImp();
        if(dataValidationImp.validate(data)){
            return data.getNum1() + data.getNum2() + data.getNum3();
        }
        return -1;
    }
}

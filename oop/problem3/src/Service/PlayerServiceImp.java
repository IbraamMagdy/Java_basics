package Service;

import model.Player;
import validate.ValidationService;

public class PlayerServiceImp implements PlayerService{

    @Override
    public void print (Player player){
        ValidationService validationService = new ValidationService();
        if(validationService.validatePlayer(player)){
            System.out.println(player.getId() + " " + player.getName() + " " + player.getNumber());
        }
        else {
            System.out.println("invalid data");
        }


    }
}

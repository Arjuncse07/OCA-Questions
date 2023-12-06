package Predicate;

public class UserModel {

    private String payBand ;
    private String unitService ;
    private String userService ;


    public String getPayBand() {
        return payBand;
    }

    public void setPayBand(String payBand) {
        this.payBand = payBand;
    }

    public String getUnitService() {
        return unitService;
    }

    public void setUnitService(String unitService) {
        this.unitService = unitService;
    }

    public String getUserService() {
        return userService;
    }

    public void setUserService(String userService) {
        this.userService = userService;
    }

    public static UserModel userModelDetails(){
        userModelDetails().payBand = "2500";
        userModelDetails().userService = "ArmedForces";
        userModelDetails().unitService = "ARMY";
        return userModelDetails();
    }

}

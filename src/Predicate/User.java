package Predicate;

public class User {
    private String name;
    private int id;
    private int age;
    private String category;
    private String payBand;
    private String unitService;
    private String userService;

    public User(String name, int id, int age, String category, String payBand, String unitService, String userService) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.category = category;
        this.payBand = payBand;
        this.unitService = unitService;
        this.userService = userService;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

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



}

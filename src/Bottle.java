public class Bottle {
    private Integer capacity, availableLiquid;
    private boolean open;

    public Bottle(Integer capacity, Integer initialAvailableLiquid, boolean open) {
        this.capacity = capacity;
        this.availableLiquid = initialAvailableLiquid;
        this.open = open;
    }

    public Integer getAvailableLiquid() {
        return availableLiquid;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public boolean hasLiquid() {
        return availableLiquid > 0;
    }

    public String openBottle() {
        if (this.open) {
            System.out.println("Bottle is already open.");
        } else {
            this.open = true;
            return "Bottle is opened.";
        }
        return "";
    }

    public String closeBottle() {
        if (!this.open) {
            System.out.println("Bottle is already closed.");
        } else {
            this.open = false;
            return "Bottle is closed.";
        }
        return "";
    }

    public String drinkLiquid(Integer liquidDrinked) {
        if (!this.open) {
            System.out.println("You have to open the bottle to drink from it!");
        } else if (availableLiquid <= 0) {
            System.out.println("There is no more liquid in the bottle.");
        } else{
            availableLiquid -= liquidDrinked;
            return "You have drinked " + liquidDrinked + "ml and have " + availableLiquid + "ml left of liquid remaining.";
        }

        return "";
    }
}

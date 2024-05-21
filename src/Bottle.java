public class Bottle {
    private Integer capacity, availableLiquid;
    private boolean open;

    public Bottle(Integer capacity, Integer initialAvailableLiquid, boolean open) {
        if (initialAvailableLiquid > capacity) {
            System.out.println("Available liquid can't be more than the bottle's capacity!");
        } else {
            this.availableLiquid = initialAvailableLiquid;
        }
        this.capacity = capacity;
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
        } else if (liquidDrinked > availableLiquid || liquidDrinked > capacity) {
            System.out.println("You can't drink that much! It's more ml than you have in the bottle / You don't have that much liquid left inside.");
        } else {
            availableLiquid -= liquidDrinked;
            return "You have drinked " + liquidDrinked + "ml and have " + availableLiquid + "ml left of liquid remaining.";
        }

        return "";
    }
}

public class coffee_machine {
    public boolean light = false;
    public float balance;
    public boolean BusyState = false;
    public boolean power = false;
    private final float price = 12;
    public int coffeeAmount;
    public String addMoney(float money) {
        if (power) {
            this.balance = money;
            return "money is added ";
        } else {
            return "turn the machine on";
        }
    }
    public String machineOff() {
        if (power) {
            light = false;
            power = false;
            return "Lights off" + "Power off";
        } else {
            return "Error!";
        }
    }
    public String machineOn() {
        if (!power) {
            power = true;
            light = true;
            return "Power on" + "Lights on";
        } else {
            return "Error!";
        }
    }

    public String makingCoffee(int coffeeAmount) {
        if (power) {
            int i = 0;
            if (balance >= price) {
                while (balance >= price && coffeeAmount > 0) {
                    balance = balance - price;
                    BusyState = true;
                    coffeeAmount--;
                    i++;
                }
            }
            else{
                return "Insufficient balance";
            }
            BusyState = false;
            return i + " Coffee is made";
        } else {
            return "turn the machine on";
        }
    }

}

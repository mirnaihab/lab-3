public class deposit {
    public double deposit(double deposit, double money){
        if(deposit<=0)
            return money;
        money = money + deposit;
        return money;
    }

}

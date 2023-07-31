public class RewardValue {
    double cashValue;
    double milesValue;

    public RewardValue(double cashValue){
        this.cashValue=cashValue;
        this.milesValue=cashValue*100;
    }
    public RewardValue(double cashValue, double milesValue){
        this.cashValue=cashValue;
        this.milesValue=milesValue;
    }
    public double getCashValue(){
        return cashValue;
    }

    public double getMilesValue(){
        return milesValue;
    }
}

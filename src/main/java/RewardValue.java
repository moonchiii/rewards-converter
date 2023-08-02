public class RewardValue {
    double cashValue;

    public RewardValue(double cashValue){
        this.cashValue=cashValue;
    }
    public RewardValue(int milesValue){
        this.cashValue=convertToCash(milesValue);
    }

    public static int convertToMiles (double cashValue){
        return (int) (cashValue/0.0035);
    }

    public static double convertToCash (int milesValue) {
        return milesValue * 0.0035;
    }
    public double getCashValue(){
        return cashValue;
    }

    public double getMilesValue(){
        return convertToMiles(this.cashValue);
    }
}

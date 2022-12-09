public class BonusMilesServise {
    public int calculate(int cost) {
        int result;
        int amount = cost / 100;
        if (cost < 1000) {
            result = 0;
        }
        else {
            result = amount;
        }
        return result;
    }
}

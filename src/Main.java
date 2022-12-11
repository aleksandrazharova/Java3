public class Main {
    public static void main(String[] args) {
        BonusMilesServiсe servise = new BonusMilesServiсe();
        int price = 10000;
        int miles = servise.calculate(price);
        System.out.println(miles);
    }
}
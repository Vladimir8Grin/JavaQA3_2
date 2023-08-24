public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightKg = 70;
        double heightSm = 1.78;
        int bmi;
        bmi = service.calculate(weightKg, heightSm);
        System.out.println(bmi);
    }

}

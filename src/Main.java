public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightKilo = 98;
        double heightM = 1.87;
        System.out.println("Килограмм: " + weightKilo + " Сантиметров: " + heightM);
        int bmi = service.calculate(heightM, weightKilo);
        System.out.println("BMI: " + bmi);

        weightKilo = 65;
        heightM = 1.67;
        System.out.println("Килограмм: " + weightKilo + " Сантиметров: " + heightM);
        bmi = service.calculate(heightM, weightKilo);
        System.out.println("BMI: " + bmi);
        

    }
}

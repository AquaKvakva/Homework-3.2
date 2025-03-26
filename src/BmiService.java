public class BmiService {
    public int calculate(double heightM, int weightKilo) {
        int bodyMassIndex = (int) (weightKilo / (heightM * heightM));
        return bodyMassIndex;
    }
}

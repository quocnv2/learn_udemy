package code;

public class BodyMassIndex {
    public static int calculateBMI(float height, float weight) {
        float bmi = weight / (height * height);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Normal");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
        return (int) bmi;
    }

    public static void main(String[] args) {
            calculateBMI(1.61F,71);
    }
}

public class SumArray {

    public static double sum(double[] numbers) {
        double suma = 0;
        for (int i = 0; i < numbers.length; i++) {
            suma += numbers[i];

        }
        return suma;
    }
    public static void main(String [] args) {
        double[] array1 = {1,5.2f,4,0,-1};
        System.out.println(sum(array1));
    }
}
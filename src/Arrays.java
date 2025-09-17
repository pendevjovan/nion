public class Arrays {
    public static void main(String[] args) {
        int[] numbers = {45, 22, 89, 16, 90, 33};
        int min = numbers[0];
        int max = numbers[0];
        for(int i = 0; i<numbers.length; i++){
            if(numbers[i]<min) min = numbers[i];
            if(numbers[i]>max) max = numbers[i];
        }
        System.out.println("Minimum number is "+ min);
        System.out.println("Maximum number is "+ max);
    }
}

package exercises.Arrays;
//Define a testing class with a main() method where you: -Define an array of strings called carBrands that is populated with 5 famous car brand names
//
//Print in console the number of items of the carBrands array
//Print in console the 3rd item of carBrands array
//Declare an empty array of integers called primeNumbers with a predefined size of 6 items
//Insert one by one the values of the first 6 prime numbers, populating primeNumbers array -Print in console all the content of the already populated primeNumbers array
public class Arrays {
    public static void main(String[] args) {

        String[] carBrands = {"AlfaRomeo" , "Audi" , "BMW" , "Mercedes" , "Toyota"};
        System.out.println(carBrands.length);
        System.out.println(carBrands[2]);

        int[] primeNumbers = new int[6];
        primeNumbers[0] = 1;
        primeNumbers[1] = 2;
        primeNumbers[2] = 3;
        primeNumbers[3] = 5;
        primeNumbers[4] = 7;
        primeNumbers[5] = 11;

        for (int primeNumber : primeNumbers) {
            System.out.println(primeNumber);
        }














    }
}

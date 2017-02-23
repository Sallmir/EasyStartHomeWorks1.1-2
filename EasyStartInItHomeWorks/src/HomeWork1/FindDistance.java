package HomeWork1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class FindDistance {
    public static void main(String[] args) throws IOException {

        ArrayList<Integer> numbers = new ArrayList<>();

        inputNumbers(numbers);

        System.out.println(numbers);

        minNumbers(numbers);

    }

    public static void inputNumbers(ArrayList<Integer> numbers) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = "0";

        System.out.println("Введите число: (для заввершения ввода наберите \"end\" ");
        while (!number.equals("end")){
            number = reader.readLine();
            if (checkString(number)) {
                numbers.add(Integer.parseInt(number));
            }
            else
                System.out.println("некоректное значение");
        }
    }

    public static boolean checkString(String string) {

        if (string == null || string.length() == 0) return false;

        int i = 0;
        if (string.charAt(0) == '-') {
            if (string.length() == 1) {
                return false;
            }
            i = 1;
        }

        char c;
        for (; i < string.length(); i++) {
            c = string.charAt(i);
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
        }
        return true;
    }

    public static void minNumbers(ArrayList<Integer> numbers) {
        int min = numbers.get(0);
        int min2 = numbers.get(0);
        int indEl = 0;
        int indEl2 = 0;

        for (int i = 0; i < numbers.size(); i++) {

            if (min > numbers.get(i)) {
                min = numbers.get(i);
                indEl = i;

            }
        }
        for (int i = 0; i < numbers.size(); i++) {

            if ((min2 > numbers.get(i)) && (indEl != i)) {
                min2 = numbers.get(i);
                indEl2 = i;
            }
        }

            System.out.println("Min = "+min + " - index - " + indEl);
            System.out.println("Min2 = "+min2 + " - index2 - " + indEl2);
            System.out.println("Разница -  "+Math.abs(indEl-indEl2));

    }
}


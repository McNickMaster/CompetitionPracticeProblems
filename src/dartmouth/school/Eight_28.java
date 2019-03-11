package dartmouth.school;

import java.util.Scanner;

public class Eight_28 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String input;

        int x = 0, y = 0;

        do {
            input = scanner.nextLine();
            String[] temp = new String[2];
            temp = input.split(" ");
            x = Integer.parseInt(temp[0]);
            y = Integer.parseInt(temp[1]);
            System.out.println(calc(x));

        }while(!input.equals("0 0"));

        int num = x;




    }

    public static int calc(int num){
        int output;
        boolean result;

        int lastSum = 0;

        int sq = num * num;
        String temp = String.valueOf(sq);
        String[] digits = temp.split("");
        //System.out.println(temp + " " + " " + sq);

        int[] numbers = new int[temp.length()];

        for(int i = 0; i < temp.length(); i++){
             numbers[i] = Integer.parseInt(digits[i]);
             System.out.println(numbers[i]);
        }

        int sum = 0;

        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }

        lastSum = sum;


        do{

            sq = sum * sum;

            temp = String.valueOf(sq);
            digits = temp.split("");

            numbers = new int[temp.length()];

            for(int i = 0; i < temp.length(); i++){
                numbers[i] = Integer.parseInt(digits[i]);
                System.out.println(numbers[i]);
            }


            for(int i = 0; i < numbers.length; i++){
                sum += numbers[i];
            }



        }
        while(lastSum != sum);

        return sum;
    }
}

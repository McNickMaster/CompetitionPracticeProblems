package dartmouth.school;

import java.util.Scanner;

public class Three_28 {

    public static void main(String[] args) {

        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'}; //0-11, 12-26
        String input = "", output = "";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Go ");

        input = scanner.nextLine();

        char[] inputChar = new char[input.length()];
        char[] outputChar = new char[input.length()];
        int[] pre = new int[input.length()];
        int [] post  = new int[input.length()];

        for (int i = 0; i < input.length(); i++){

            inputChar[i] = input.charAt(i);

        }
        //System.out.println("Go ");
        for (int i = 0; i < inputChar.length; i++){
            
            pre[i] = new String(alphabet).indexOf(inputChar[i]);
            
        }
        //System.out.println("Go ");
        for(int i = 0; i < pre.length; i++){

            post[i] = wrap(addSomething(pre[i]));
            //System.out.println(post[i]);
        }
        //System.out.println("Go ");


        for(int i = 0; i < post.length; i++){
            outputChar[i] = alphabet[post[i]];
        }

        for(char i : outputChar){
            //System.out.println(i);
            output += i;
        }

        System.out.println(output);

    }

    public static int wrap(int index){

        int newIndex = index;

        while(newIndex > 25){
            newIndex -= 25;
            //System.out.println(newIndex);
        }
        System.out.println("\n: " + newIndex + " : " + (newIndex + 1));
        return newIndex;
    }
    public static int addSomething(int x){

        int newX = x+1;

        newX+= newX;

        if(newX > 13){
            newX += 1;
        }

      //  System.out.println("f\n" + newX);
        return newX-1;
    }
}

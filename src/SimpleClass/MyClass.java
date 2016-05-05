package SimpleClass;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        String a;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of cell array");
        int numArray = scan.nextInt();
        int[] array = new int [numArray];
        for(int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random()*numArray);
        }
        do{
            System.out.println("Continue - enter \"no\"");
            a = scan.next();
            if(a.equals("no")){
                System.out.println("Enter the array index from 0 - "+(numArray - 1));
                int b = scan.nextInt();
                try {
                    System.out.println(array[b]);
                }catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("Enter the correct index array");
                }
            }
        }while(a.equals("no"));
    }
}

import java.util.Random;
import java.util.Scanner;
public class RandomStudents {
    public RandomStudents(){};
    public static  void  randStud(String[] stringArroy ) {
        Scanner reader = new Scanner(System.in);
        Random randNum = new Random();
        System.out.println("Input a number between 0 and 9:");
        Integer firstBond = Integer.valueOf(reader.nextInt());
        System.out.println("Input a number between 0 and 9:");
        Integer secondtBond = Integer.valueOf(reader.nextInt());
        if(firstBond<secondtBond){
            Integer index = randNum.nextInt(firstBond, secondtBond);
            System.out.println(" Random Student name from "+firstBond+" position to "+(secondtBond-1)+ " position is:" +
                    " \n position: " + index +" name: " + stringArroy[index]);
        } else if (firstBond>secondtBond){
            Integer index = randNum.nextInt(secondtBond, firstBond);
            System.out.println(" Random Student name from "+secondtBond+" position to "+(firstBond-1)+ " position is:" +
                    " \n position:" +
                    " " + index +" name: " + stringArroy[index]);
        }
        else {
            System.out.println("Studennt in position "+firstBond+ " is with name: "+stringArroy[firstBond]);
        }
    }
}

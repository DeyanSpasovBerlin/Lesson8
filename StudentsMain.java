import java.util.Random;
import java.util.Scanner;
public class StudentsMain {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String[] namesOfStudent = new String[10];
        namesOfStudent[0] = "a";
        namesOfStudent[1] = "b";
        namesOfStudent[2] = "c";
        namesOfStudent[3] = "d";
        namesOfStudent[4] = "e";
        namesOfStudent[5] = "f";
        namesOfStudent[6] = "g";
        namesOfStudent[7] = "h";
        namesOfStudent[8] = "j";
        namesOfStudent[9] = "k";
        RandomStudents person = new RandomStudents();
        person.randStud(namesOfStudent);
        System.out.println("Input temperatur in Celsius:");
        Double temperatur = Double.valueOf(reader.nextDouble());
        Converter temperaturCelsius = new Converter(temperatur);
        temperaturCelsius.runFahrenheitConverter(temperatur);
        temperaturCelsius.runKelvinConverter(temperatur);
    }
}




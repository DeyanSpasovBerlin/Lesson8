public class Converter {
    private double temperatur;
    Converter(Double temperatur){
        this.temperatur = temperatur;
    }
    public void runKelvinConverter(double baseValue){
        System.out.println("The temperatur in Kelvin is :"+(baseValue+273.15));
    }
    public void runFahrenheitConverter(double baseValue){
        System.out.println("The temperatur in Fahrenheid is :"+(baseValue*9/5+32));
    }
}

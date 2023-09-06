import java.util.Random;
public class Main {
    public static void main(String[] args) {
        System.out.println(ageAndTemperature(23,37));
        System.out.println(ageAndTemperature(18,25));
        System.out.println(ageAndTemperature(35,27));
        System.out.println(ageAndTemperature(37,-7));
        System.out.println(ageAndTemperature(generateRandomAge(),35));
        System.out.println(generateRandomAge());
    }

    public static String ageAndTemperature(int Age, int temperature) {
        if (Age > 20 && Age < 45 && temperature > -20 && temperature < 30) {
            return "Можно идти гулять";
        } else if (Age < 20 && temperature > 0 && temperature < 28) {
            return "Можно идти гулять";
        } else if (Age > 45 && temperature > -10 && temperature < 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }
    //Дз на сообразительность
    public static int generateRandomAge(){
        Random ageCharacter=new Random();
        int ageOfGrandpa=ageCharacter.nextInt(60);
        return ageOfGrandpa;
    }
}
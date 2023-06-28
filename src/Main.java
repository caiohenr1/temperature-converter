public class Main {
    public static void main(String[] args) {

//      Escreva um programa que converta uma temperatura em graus Celsius para Fahrenheit

        int currentTemperature = 32;
        double temperatureConvertedToFahrenheit = (currentTemperature * 1.8) + 32;

        System.out.println(temperatureConvertedToFahrenheit);


//      Crie uma variável inteira para exibir a temperatura em Fahrenheit sem casas decimais. Lembre-se que provavelmente você precisará fazer um casting de valores.

        int temperaturaFahrenheit = (int) temperatureConvertedToFahrenheit;
        System.out.println(String.format("""
                A temperatura convertida é : %d
                """, temperaturaFahrenheit));
    }
}
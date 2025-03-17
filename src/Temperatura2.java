public class Temperatura2 {
    double celsiusParaFahrenheit(double c){
        return 9.0 * c / 5.0 + 32.0;
    }
    double FahrenheitParaCelsius(double f) {
        return 5.0 * ( f - 32.0 ) / 9.0;
    }

    public static void main(String[] args){
        Temperatura2 nova = new Temperatura2();
        System.out.println(nova.celsiusParaFahrenheit(40));
        System.out.println(nova.FahrenheitParaCelsius(104));
    }
}

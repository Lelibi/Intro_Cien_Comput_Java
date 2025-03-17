public class Temperatura3 {
    double celsiusParaFahrenheit(double c){
        return 9.0 * c / 5.0 + 32.0;
    }
    double FahrenheitParaCelsius(double f) {
        return 5.0 * ( f - 32.0 ) / 9.0;
    }
    double KelvinParaCelsius(double k) {
        return k - 273; 
    }

    public static void main(String[] args){
        Temperatura3 nova = new Temperatura3();
        System.out.println(nova.celsiusParaFahrenheit(40));
        System.out.println(nova.FahrenheitParaCelsius(104));
        System.out.println(nova.KelvinParaCelsius(273));
    }
}
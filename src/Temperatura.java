class Temperatura {
    int celsiusParaFahre(int celsius) {
        return 9 * celsius / 5 + 32;
    }
    public static void main(String[] args){
    Temperatura nova = new Temperatura();
    System.out.println(nova.celsiusParaFahre(40));

    }

}
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Moedas {

    private double euro;
    private double dolar;
    private double pesoChileno;
    private double pesoArgentino;
    private double real;
    private double libra;

    public void atualizarValores() {
        try {
            URL url = new URL("https://api.exchangerate-api.com/v4/latest/BRL");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            int responseCode = conn.getResponseCode();
            if (responseCode == 200) {

                Scanner scanner = new Scanner(url.openStream());
                String resposta = scanner.useDelimiter("\\A").next();
                scanner.close();

                double taxaEuro = Double.parseDouble(resposta.split("\"EUR\":")[1].split(",")[0]);
                double taxaDolar = Double.parseDouble(resposta.split("\"USD\":")[1].split(",")[0]);
                double taxaPesoChileno = Double.parseDouble(resposta.split("\"CLP\":")[1].split(",")[0]);
                double taxaPesoArgentino = Double.parseDouble(resposta.split("\"ARS\":")[1].split(",")[0]);
                double taxaLibra = Double.parseDouble(resposta.split("\"GBP\":")[1].split(",")[0]);

                euro = taxaEuro;
                dolar = taxaDolar;
                pesoChileno = taxaPesoChileno;
                pesoArgentino = taxaPesoArgentino;
                libra = taxaLibra;

                System.out.println("Valores das moedas atualizados com sucesso.");
            } else {
                System.out.println("Não foi possível obter as taxas de câmbio.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Moedas moedas = new Moedas();
        moedas.atualizarValores();

        System.out.println("Taxa do Euro: " + moedas.getEuro());
        System.out.println("Taxa do Dólar: " + moedas.getDolar());
        System.out.println("Taxa do Peso Chileno: " + moedas.getPesoChileno());
        System.out.println("Taxa do Peso Argentino: " + moedas.getPesoArgentino());
        System.out.println("Taxa da Libra: " + moedas.getLibra());
    }
    
    public double getEuro() {
        return euro;
    }

    public void setEuro(double euro) {
        this.euro = euro;
    }

    public double getDolar() {
        return dolar;
    }

    public void setDolar(double dolar) {
        this.dolar = dolar;
    }

    public double getPesoChileno() {
        return pesoChileno;
    }

    public void setPesoChileno(double pesoChileno) {
        this.pesoChileno = pesoChileno;
    }

    public double getPesoArgentino() {
        return pesoArgentino;
    }

    public void setPesoArgentino(double pesoArgentino) {
        this.pesoArgentino = pesoArgentino;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getLibra() {
        return libra;
    }

    public void setLibra(double libra) {
        this.libra = libra;
    }
}

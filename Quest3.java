import java.io.*;
import java.util.Scanner;

public class Quest3{ 
    private String p;
    private String tipo;
    private int horaent; 
    private int horasaida; 
    private double v;

    public String getP() {
        return p;
    }
    public void setP(String a) {
        this.p = a;
    }
    public String getType() {
        return tipo;
    }
    public void setType(String a) {
        this.tipo = a;
    }
    public int getEntrar() {
        return horaent;
    }
    public void setEntrar(int a) {
        this.horaent = a;
    }
    public int getSair() {
        return horasaida;
    }
    public void setSair(int a) {
        this.horasaida = a;
    }
    public void Comeco(){
        this.p = "";
        this.tipo = "";
        this.horaent = 0;
        this.horasaida = 0;
    }
    public void Dinheiro(){
        int i = this.horaent;
        int j = this.horasaida; 
        this.v = (horasaida - horaent)*1.5;
    }
    public void LD(){
        System.out.println("Placa: " + this.p);
        System.out.println("Tipo do carro: " + this.tipo);
        System.out.println("Entrada: " + this.horaent +);
        System.out.println("Saida: " + this.horasaida +);
        System.out.println("Custo do estacionamento: " + this.v);
    }

    public static void main(String args[]) throws IOException {
        Estacionamento obj = new Estacionamento();

        Scanner l = new Scanner(System.in);
        String end = l.nextLine();
        BufferedReader vis = new BufferedReader(new FileReader(end));

        obj.Comeco();
        obj.p = vis.readLine(); 
        obj.tipo = vis.readLine(); 
        String x = vis.readLine();
        obj.entrada = Integer.parseInt(x);
        String y = vis.readLine();
        obj.saida = Integer.parseInt(y);
        obj.Dinheiro();
        obj.LD();
        leitura.close();
        ler.close();
    }
}
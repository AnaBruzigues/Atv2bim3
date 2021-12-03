import java.io.*;
import java.util.Scanner;

public class Quest1{ 
    private String n;
    private int birth;
    private int h; 
    private int id; 

    public String getName() {
        return n;
    }
    public int getNas() {
        return birth;
    }
    public int getHight() {
        return h;
    }
    public void setName(String x) {
        this.n = x;
    }
    public void setNas(int ano) {
        this.birth = ano;
    }
    public void setHight(int a) {
        this.h = a;
    }
    public void Year(){
        int i = this.birth;
        this.id = 2021-i;
    }
    public void LD(){
        System.out.println("nome: " + this.n);
        System.out.println("idade: " + this.id);
        System.out.println("altura: " + this.h);
    }

    public static void main(String args[]) throws IOException {
        Quest1 obj = new Quest1();
        Scanner l = new Scanner(System.in);
        String end = l.nextLine();
        BufferedReader vis = new BufferedReader(new FileReader(end));

        obj.n = vis.readLine();
        String x = vis.readLine();
        obj.birth = Integer.parseInt(x);
        String y = vis.readLine();
        obj.h = Integer.parseInt(y);
        obj.Year(); 
        obj.LD(); 
        vis.close();
        l.close();
    }
}
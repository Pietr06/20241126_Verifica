/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg20241126_4id_leoni_verifica;
import java.util.Scanner;


/**
 *
 * @author ospite
 */
public class Studente {
    private String Nome;
    private String Cognome;
    private int Mat;
    private int Ing;
    private int Stor;
    private int i;
    
    public Studente(int i){
        this.i = i;
    }
    
    public void ScanStudente(){
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("\ninserire nome alunno "+i+": ");
        this.Nome = scanner1.nextLine();
        System.out.println("inserire cognome alunno "+i+": ");
        this.Cognome = scanner1.nextLine();
        System.out.println("inserire voto matematica: ");
        this.Mat = scanner1.nextInt();
        System.out.println("inserire voto inglese: ");
        this.Ing = scanner1.nextInt();
        System.out.println("inserire voto storia: ");
        this.Stor = scanner1.nextInt();
    }
    
    public void PrintStudente(){
        int Media=(Mat+Ing+Stor)/2;
        
        System.out.print("|   "+i+"\t\t\t");
        System.out.print("|   "+Nome+"\t\t");
        System.out.print("|   "+Cognome+"\t\t\t");
        System.out.print("|   "+Mat);
        if(Stor<6){
            System.out.print("/SI\t\t");
        }else{
            System.out.print("/NO\t\t");
        }
        
        System.out.print("|   "+Ing);
        if(Stor<6){
            System.out.print("/SI\t\t");
        }else{
            System.out.print("/NO\t\t");
        }
        
        System.out.print("|   "+Stor);
        if(Stor<6){
            System.out.print("/SI\n");
        }else{
            System.out.print("/NO\n");
        }
        
    }
    
}

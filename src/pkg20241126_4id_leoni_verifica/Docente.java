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
public class Docente {
    private String Nome;
    private String Cognome;
    private String Materia;
    int i;
    public Docente(int i){
        this.i = i;
    }
    
    public void ScanDocente(){
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("\ninserire nome docente "+i+": ");
        this.Nome = scanner1.nextLine();
        System.out.println("inserire cognome docente "+i+": ");
        this.Cognome = scanner1.nextLine();
        System.out.println("inserire materia insegnata: ");
        this.Materia = scanner1.nextLine();
    }
    
    public void PrintDocente(){
        System.out.print("|   "+i+"\t\t");
        System.out.print("|   "+Nome+"\t\t");
        System.out.print("|   "+Cognome+"\t\t\t");
        System.out.print("|   "+Materia+"\n");
    }
    
}

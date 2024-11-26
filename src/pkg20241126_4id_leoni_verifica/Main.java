/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg20241126_4id_leoni_verifica;

/**
 *
 * @author ospite
 */
public class Main {

    public static void main(String[] args) {
        int i=1;
        Docente docente1 = new Docente(i);
        i++;
        Docente docente2 = new Docente(i);
        i++;
        Docente docente3 = new Docente(i);
        i=1;
        Studente studente1 = new Studente(i);
        i++;
        Studente studente2 = new Studente(i);
        
        docente1.ScanDocente();
        docente2.ScanDocente();
        docente3.ScanDocente();
        studente1.ScanStudente();
        studente2.ScanStudente();
        
        System.out.print("DOCENTI\n");
        System.out.print("|DOCENTE NUMERO\t");
        System.out.print("|NOME DOCENTE\t");
        System.out.print("|COGNOME DOCENTE\t");
        System.out.print("|MATERIA INSEGNATA\n");
        System.out.print("-------------------------------------------------------------------------\n");
        docente1.PrintDocente();
        System.out.print("-------------------------------------------------------------------------\n");
        docente2.PrintDocente();
        System.out.print("-------------------------------------------------------------------------\n");
        docente3.PrintDocente();
        
        System.out.print("\nSTUDENTI\n");
        System.out.print("|STUDENTE NUMERO\t");
        System.out.print("|NOME STUDENTE\t");
        System.out.print("|COGNOME STUDENTE\t");
        System.out.print("|VOTO MATEMATICA/DEBITO\t");
        System.out.print("|VOTO INGLESE/DEBITO\t");
        System.out.print("|VOTO STORIA/DEBITO\t\n");
        System.out.print("--------------------------------------------------------------------------------------------------------------------------\n");
        studente1.PrintStudente();
        System.out.print("--------------------------------------------------------------------------------------------------------------------------\n");
        studente2.PrintStudente();
        
        
        
    }
}

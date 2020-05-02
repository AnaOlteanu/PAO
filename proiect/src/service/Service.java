package service;

import model.Cat;
import model.Dog;
import model.Employee;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

public class Service {
    private String filePathCaini = "D:\\An 2\\PAO\\proiect\\proiect\\src\\reports\\RaportCaini.csv";
    private String filePathAngajati = "D:\\An 2\\PAO\\proiect\\proiect\\src\\reports\\RaportAngajatiAfabetic.csv";
    private String filePathCainiAdoptie = "D:\\An 2\\PAO\\proiect\\proiect\\src\\reports\\RaportCainiAdoptie.csv";
    private String filePathPisici = "D:\\An 2\\PAO\\proiect\\proiect\\src\\reports\\RaportPisici.csv";


    public void writeDataToReportCaini(Dog d){
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePathCaini,true))){
            bufferedWriter.append(d.getName());
            bufferedWriter.append("  ");
            bufferedWriter.append(Integer.toString(d.getAge()));
            bufferedWriter.append("  ");
            bufferedWriter.append(Double.toString(d.getWeight()));
            bufferedWriter.append("\n");
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
    public void initReportCaini(){
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePathCaini))){
            bufferedWriter.append("Nume");
            bufferedWriter.append(" ");
            bufferedWriter.append("Varsta");
            bufferedWriter.append(" ");
            bufferedWriter.append("Greutate");
            bufferedWriter.append("\n");
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }

    public void writeDataToReportPisici(Cat c){
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePathPisici,true))){
            bufferedWriter.append(c.getName());
            bufferedWriter.append("  ");
            bufferedWriter.append(Integer.toString(c.getAge()));
            bufferedWriter.append("  ");
            bufferedWriter.append(Double.toString(c.getWeight()));
            bufferedWriter.append("\n");
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
    public void initReportPisici(){
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePathPisici))){
            bufferedWriter.append("Nume");
            bufferedWriter.append("  ");
            bufferedWriter.append("Varsta");
            bufferedWriter.append("  ");
            bufferedWriter.append("Greutate");
            bufferedWriter.append("\n");
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }

    public void writeDataToReportAngajati(Employee e){
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePathAngajati,true))){
            bufferedWriter.append(e.getNume());
            bufferedWriter.append("  ");
            bufferedWriter.append(e.getPrenume());
            bufferedWriter.append("  ");
            bufferedWriter.append(e.getType());
            bufferedWriter.append("  ");
            bufferedWriter.append(Integer.toString(e.getSalary()));
            bufferedWriter.append("\n");
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
    public void initReportAngajati(){
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePathAngajati))){
            bufferedWriter.append("Nume");
            bufferedWriter.append("  ");
            bufferedWriter.append("Prenume");
            bufferedWriter.append("  ");
            bufferedWriter.append("Tip");
            bufferedWriter.append("  ");
            bufferedWriter.append("Salariu");
            bufferedWriter.append("\n");
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }

    public void writeDataToReportCainiAdoptie(Dog d){
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePathCainiAdoptie,true))){
            bufferedWriter.append(d.getName());
            bufferedWriter.append("   ");
            bufferedWriter.append(Integer.toString(d.getAge()));
            bufferedWriter.append("     ");
            bufferedWriter.append(Double.toString(d.getWeight()));
            bufferedWriter.append("           ");
            bufferedWriter.append(Integer.toString(d.adoptionGrade()));
            bufferedWriter.append("\n");
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }

    public void initReportCainiAdoptie(){
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePathCainiAdoptie))){
            bufferedWriter.append("Nume");
            bufferedWriter.append("  ");
            bufferedWriter.append("Varsta");
            bufferedWriter.append("  ");
            bufferedWriter.append("Greutate");
            bufferedWriter.append("  ");
            bufferedWriter.append("Grad adoptie");
            bufferedWriter.append("\n");
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}

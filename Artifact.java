import java.util.ArrayList;

public class Artifact{

 
public String name;
 public String desc;
 public double value;
 //Artifact starts in room ArrayList then when user picks up - .remove from room Arraylist --> .add Inventory ArrayList
 public static ArrayList<Artifact> artifactsR1;
 public ArrayList<Artifact> artifactsR2;
 public ArrayList<Artifact> artifactsR3;
 public ArrayList<Artifact> artifactsR4;
 public ArrayList<Artifact> artifactsR5;
 public ArrayList<Artifact> artifactsR6;
 

 public Artifact(String name , String desc, double value){
    this.name = name;
    this.desc = desc; 
    this.value = value;
    this.artifactsR1 = new ArrayList<Artifact>();
    this.artifactsR2 = new ArrayList<Artifact>();
    this.artifactsR3 = new ArrayList<Artifact>();
    this.artifactsR4 = new ArrayList<Artifact>();
    this.artifactsR5 = new ArrayList<Artifact>();
    this.artifactsR6 = new ArrayList<Artifact>();
    Artifact A1 = new Artifact("Victorian Painting ", "beautiful painting by.....", 10);
    artifactsR1.add(A1);
 }
 public String toString() {
   return name + " is a " + desc ;
 }
 
 public static void main(String[] args) {
  System.out.println(artifactsR1);
 }
 





}
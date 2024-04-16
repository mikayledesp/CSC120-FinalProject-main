import java.util.ArrayList;

public class Artifact{

 public String name;
 public String desc;
 public double value;
 public ArrayList<Artifact> artifacts;
 

 public Artifact(String name , String desc, double value){
    this.name = name;
    this.desc = desc; 
    this.value = value;
    this.artifacts = new ArrayList<Artifact>();
 }
 
 public static void main(String[] args) {
    Artifact A1 = new Artifact("", null, 0);
    System.out.println(A1);
 }





}
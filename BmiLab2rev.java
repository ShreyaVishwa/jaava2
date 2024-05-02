import java.util.Scanner;

public class BmiLab2rev {
    private String name;
    private int age;
    private double weight;
    private double height;
    public BmiLab2rev(String name,int age, double weight,double height){
        this.name=name;
        this.age=age;
        this.weight=weight;
        this.height=height;
    }
    public BmiLab2rev(String name,double weight,double height){
        this(name,20,weight,height);
    }
    public double getBmi(){
        return weight/weight*height;
    }
    public String getStatus(){
        double bmi = getBmi();
        if(bmi < 18.5){
            return "underweight";
        }
        else if(bmi<25){
            return "normal weight";
        }
        else if(bmi<30){
            return "over weight";
        }
        else{
            return "obese";
        }

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter name: ");
        String n = s.next();
        System.out.println("enter age: ");
        int a = s.nextInt();
        System.out.println("enter weight: ");
        double w = s.nextDouble();
        System.out.println("enter height: ");
        double h = s.nextDouble();
        BmiLab2rev person1 = new BmiLab2rev(n, a, w, h);
        BmiLab2rev person2 = new BmiLab2rev(n, w, h);
        System.out.println(person1.getBmi());
        System.out.println(person1.getStatus());
        System.out.println(person2.getBmi());
        System.out.println(person2.getStatus());
    }
    
    
}


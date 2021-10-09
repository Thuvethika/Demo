
package prac.pkg10;


public class Person {
    private double weight;
    private double height;
    
    public double getBMI(){
    return weight / (height * height);
    
    }

    public double getWeightInKg() {
        return weight;
    }

    public void setWeightInKg(double weight) {
        this.weight = weight;
    }
    public double getWeightInPound() {
        return weight;
    }

    public void setWeightInPound(double weight) {
        this.weight = weight/2.2;
    }

    public double getHeightInMeter() {
        return height;
    }

    public void setHeightInMeter(double height) {
        this.height = height;
    }
    public double getHeightInInches() {
        return height;
    }

    public void setHeightInInches(double height) {
        this.height = height/39;
    }
    
    
}

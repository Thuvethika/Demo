
package prac.pkg10;


public class BMIcalculator {
    
    public static void main(String[] args) {
        
        Person p1 = new Person();
        Person p2 = new Person();
        
        p1.setHeightInMeter(1.78);
        p1.setWeightInKg(60);
        p2.setHeightInInches(1.78*39);
        p2.setWeightInPound(60*2.2);
        
        System.out.println("The BMI value is:" + p1.getBMI());
        System.out.println("The BMI value is:" + p2.getBMI());
        
        
    }
    
    
}

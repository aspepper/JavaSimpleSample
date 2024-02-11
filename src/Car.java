public class Car {
    private String make; 
    private String model; 
    private int year; 

    public Car(String make, String model, int year) { 
        this.make = make; 
        this.model = model; 
        this.year = year; 
    } 

    public void Accelerate () { 
        System.out.println("Vroom, vroom! Speeding up the " + make+ " " + model + " year " + year); 
    } 

    public void Brake () { 
        System.out.println("Hold on! Braking the " + make+ " " + model); 
    } 
}

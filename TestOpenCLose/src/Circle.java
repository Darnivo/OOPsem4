public class Circle implements Shape{
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    
    
    @Override
    public double calculateArea() {
    	return Math.PI * Math.pow(radius,2);	            
    }
    
}
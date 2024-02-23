public class Main
{
    public double length;
    public double breadth;
    public double thickness;
    
    public Main(double length, double breadth, double thickness)
    {
        this.length = length;
        this.breadth = breadth;
        this.thickness = thickness;
    }
    
    public double volume()
    {
        return length * breadth * thickness;
    }
    
    public static void main(String args[])
    {
        Main box = new Main(2,3,4);
        System.out.println(box.volume());
    }
}

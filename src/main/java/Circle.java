/**
 * This class provides a simple Circle type that
 * creates and tracks instances of circles.
 *
 * @author (You Me)
 * @version (2018-02-05)
 */
public class Circle
{
    //instance variables
    private double x;
    private double y;
    private double radius;

    /**
     * Defualt constructor that initializes an instance of Circle
     * to (0,0) with a radius of 1.0.
     */
    public Circle()
    {
        // instance variable
        x = 0;
        y = 0;
        radius = 1;
    }

    /**
     * Constructor that initializes an instance of Circle to (0,0)
     * with a radius given by the parameter radius.
     *
     * @param radius the radius of this circle.
     */
    public Circle(double radius)
    {
        x = 0;
        y = 0;
        this.radius = radius;
    }

    /**
     * Constructor that initializes an instance of Circle to (x,y)
     * with a radius given by the parameter radius.
     *
     * @param x the location of the center of this circle along the x coordiante
     * @param y the location of the center of this circle along the y coordiante
     * @param radius the radius of this circle.
     */
    public Circle(double x, double y, double radius)
    {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    //accessors
    /**
     * Returns the radius of this circle.
     *
     * @return The radius of this circle.
     */
    public double getRadius()
    {
        return radius;
    }

    /**
     * Returns the x coordinate of this circle.
     *
     * @return The x coordinate of this circle.
     */
    public double getX()
    {
        return x;
    }

    /**
     * Returns the y coordinate of this circle.
     *
     * @return The y coordinate of this circle.
     */
    public double getY()
    {
        return y;
    }

    // mutator methods
    /**
     * Sets the radius of this circle.
     *
     * @param radius The new radius of this circle.
     */
    public void setRadius(double radius)
    {
       this.radius = radius;
    }

    /**
     * Sets the x coordinate of this circle.
     *
     * @param x The new x coordinate of this circle.
     */
    public void setX(double x)
    {
        this.x = x;
    }

    /**
     * Sets the y coordinate of this circle.
     *
     * @param y The new y coordinate of this circle.
     */
    public void setY(double y)
    {
        this.y = y;
    }

    //================== DO NOT TOUCH CODE BELOW THIS LINE ==========================
    public String toString()
    {
        return "("+x+","+y+";"+radius+")";
    }
}
package cecs277ipi.CECS277IPI;

//import java.math.MathContext;
/**
 *
 * @author Naveene Raya Carlos Alvarenga
 * @date 9/18/19
 */
public class Point {
    private final double xCoord;
    private final double yCoord;
    private double dist;
    
    /**
     * default constructor
     */
    public Point(){
        xCoord = 0;
        yCoord = 0;
    }
    
    /**
     * constructor for a point with 2 coordinates
     * @param xCoord
     * @param yCoord
     */
    public Point(double xCoord, double yCoord){
        this.xCoord = xCoord;
        this.yCoord = yCoord;
    }
    
    public double distance(Point P){
        
        return dist;
    }
    
    @Override
    public String toString(){
        return "";
    }
}

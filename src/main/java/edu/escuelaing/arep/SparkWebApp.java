package edu.escuelaing.arep;
import static spark.Spark.get;
/**
 * Hello world!
 *
 */
public class SparkWebApp 
{
    public static void main( String[] args )
    {
        System.out.println( "Initialing server... Ready!" );
        get("/hello", (req, res) -> "Hello Heroku");

       



    }



}

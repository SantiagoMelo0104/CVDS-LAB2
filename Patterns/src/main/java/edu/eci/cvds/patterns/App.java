package edu.eci.cvds.patterns;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String name = "";
        for(String parametro: args){
            name += parametro + " ";
        }
        if ("".contentEquals(name)){
            System.out.println( "Hello World!" );
        } else {
            System.out.println( "Hello " + name + "!" );
        }

    }
}

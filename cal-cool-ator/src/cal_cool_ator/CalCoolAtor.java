/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cal_cool_ator;

/**
 * @author Matúš Švancár
 * @author Martin Rakovický
 */
public class CalCoolAtor {
    
    /**
     * Addition of two numbers.
     * @param a {double} floating point number 
     * @param b {double} floating point number
     * @return The sum of a and b. 
     */
    public static double add(double a, double b)
       {
              return (a+b);
       }

    /**
     * Subtraction of two numbers.
     * @param a {double} floating point number 
     * @param b {double} floating point number
     * @return The difference of a and b.
     */
    public static double sub(double a, double b)
       {
              return (a-b);
       }

    /**
     * Negation of number.
     * @param a {double} floating point number
     * @return Negative value of number.
     */
    public static double neg(double a)
       {
              return (a*-1);
       }

    /**
     * Multiplication of two numbers.
     * @param a {double} floating point number 
     * @param b {double} floating point number
     * @return The product of a and b.
     */
    public static double multiply(double a, double b)
       {
              return (a*b);
       }

    /**
     * Dividing of two numbers.
     * @param a {double} floating point number 
     * @param b {double} floating point number
     * @throws IllegalArgumentException if b is null
     * @return The part of a and b.
     */
    public static double divide(double a, double b)
       {    if(b==0) throw new IllegalArgumentException("Ajajajaja delenie nulou");
              return (a/b);
       }

    /**
     * Exponentiation of number.
     * @param a {double} floating point number 
     * @param b {double} floating point number
     * @return Multiplied number.
     */
    public static double power(double a, long b)
       {
              return (Math.pow(a,b));
       }

    /**
     * Root from number.
     * <p>
     * @param a {double} floating point number 
     * @param b {double} floating point number
     * @throws IllegalArgumentException if b is null
     * @throws IllegalArgumentException if a is less then null and
     * if b%2 is equal to null 
     * @return Rooted number, or negative value of rooted number 
     * if a is less then null and if b%2 is equal to null
     */
    public static double root(double a, long b)
       {
            if(b==0) throw new IllegalArgumentException("");
            double c = divide(1,(double)b);
            if(a<0){
                if (b%2==0)
                    throw new IllegalArgumentException("Odmocnina zo zaporneho cisla");
                a=-a;
                
                return (Math.pow(a,c)*-1);
            }
            else
                return (Math.pow(a,c));
       }

    /**
     * Factorial of number.
     * @param a {double} integer number 
     * @return result of factorial, or 0 if a is lower then null, 
     * or 1 if a is equal 0 or 1.
     */
    public static long factorial(int a)
        {
            long vysledok;
            if(a<0) return 0;
            if(a==0 || a==1)
            return 1;

       vysledok = factorial(a-1) * a;
       return vysledok;
       }
}
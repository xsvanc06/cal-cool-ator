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
     * 
     * @return The sum of a and b.
     */
    public static double add(double a, double b)
       {
              return (a+b);
       }

    /**
     * Subtraction of two numbers.
     * 
     * @return The difference of a and b.
     */
    public static double sub(double a, double b)
       {
              return (a-b);
       }

    /**
     * Negation of number.
     * 
     * @return Negative value of number.
     */
    public static double neg(double a)
       {
              return (a*-1);
       }

    /**
     * Multiplication of two numbers.
     * 
     * @return The product of a and b.
     */
    public static double multiply(double a, double b)
       {
              return (a*b);
       }

    /**
     * Dividing of two numbers.
     * 
     * @return The part of a and b.
     */
    public static double divide(double a, double b)
       {    if(b==0) throw new IllegalArgumentException("Ajajajaja delenie nulou");
              return (a/b);
       }

    /**
     * Exponentiation of number.
     * 
     * @return Multiplied number.
     */
    public static double power(double a, long b)
       {
              return (Math.pow(a,b));
       }

    /**
     * Root from number.
     * 
     * @return Rooted number.
     */
    public static double root(double a, long b)
       {
            double c = divide(1,(double)b);
            if(b==0) throw new IllegalArgumentException("");
            if (b%2==0)
                if(a<0) throw new IllegalArgumentException("Odmocnina zo zaporneho cisla");
            return (Math.pow(a,c));
       }

    /**
     * Factorial of number.
     * 
     * @return Result of factorial.
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

    public static void main(String[] args)
       {
       
       }
}

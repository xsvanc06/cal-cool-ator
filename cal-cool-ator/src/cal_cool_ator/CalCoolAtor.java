/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cal_cool_ator;

/**
 *
 * @author Matúš Švancár
 */
public class CalCoolAtor {
    
    /**
     * 
     * Addition of two numbers.
     * Sčítanie dvoch čísel.
     * @return The sum of a and b.
     * @return Súčet čísel a, b.
     */
    public static double add(double a, double b)
       {
              return (a+b);
       }

    /**
     *
     * Subtraction of two numbers.
     * Odčítanie dvoch čísel.
     * @return The difference of a and b.
     * @return Rozdiel čísel a, b.
     */
    public static double sub(double a, double b)
       {
              return (a-b);
       }

    /**
     *
     * Negation of number.
     * Negácia čísla.
     * @return Negative value of number.
     * @return Negovaná hodnota čísla.
     */
    public static double neg(double a)
       {
              return (a*-1);
       }

    /**
     *
     * Multiplication of two numbers.
     * Násobenie dvoch čísel.
     * @return The product of a and b.
     * @return Súčin čísel a, b.
     */
    public static double multiply(double a, double b)
       {
              return (a*b);
       }

    /**
     * 
     * Dividing of two numbers.
     * Delenie dvoch čísel.
     * @return The part of a and b.
     * @return Rozdiel čísel a, b.
     */
    public static double divide(double a, double b)
       {    if(b==0) throw new IllegalArgumentException("Ajajajaja delenie nulou");
              return (a/b);
       }

    /**
     *
     * Exponentiation of number.
     * Umocňovanie čísla.
     * @return 
     * @return Umocnené číslo.
     */
    public static double power(double a, double b)
       {
              return (Math.pow(a,b));
       }

    /**
     *
     * Odmocnina z čísla.
     * 
     * @return
     * @return Odmocnené číslo.
     */
    public static double root(double a)
       { //if(a==0)return 0
            if(a<0) throw new IllegalArgumentException("Odmocnina zo zaporneho cisla");
            return (Math.sqrt(a));
       }

    /**
     *
     * Factorial of number.
     * Faktorial z čísla.
     * @return Výsledok ...
     */
    public static long factorial(int a)
        {
            long vysledok;
            if(a<0) throw new IllegalArgumentException("Faktorial zo zaporneho cisla");
            if(a==0 || a==1)
            return 1;

       vysledok = factorial(a-1) * a;
       return vysledok;
       }

    /**
     *
     * @param args
     */
    public static void main(String[] args)
       {
              
    
       }
}

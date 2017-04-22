/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cal_cool_ator;

import java.util.*;
/**
 *
 * @author Marek
 */
public class profiling {
 
    public static void main(String[] args){
        double suma = 0;
        
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Vector<Double> vector = new Vector<>();
        for(int i=0; i<N;i++)
           vector.add(scan.nextDouble());
        for(int i=0;i<N;i++){
            suma=CalCoolAtor.add(vector.get(i), suma);
        }
        double average=CalCoolAtor.divide(suma, N);
        suma = 0;
        for(int i=0;i<N;i++){
            double x = CalCoolAtor.sub(vector.get(i), average);
            x=CalCoolAtor.power(x, 2);
            suma=CalCoolAtor.add(x, suma);
        }
        double x=CalCoolAtor.divide(1,CalCoolAtor.sub(N, 1));
        double s = CalCoolAtor.root(x, 2);
        System.out.println(s);
    }
}

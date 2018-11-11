
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rober
 */
public class Questao8 {

    public static void main(String... args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite A: ");
    
        int A = s.nextInt();
        
        System.out.println("Digite B: ");
    
        int B = s.nextInt();
        
        Questao8.proccess(A, B);
    }

    private static int proccess(Integer A, Integer B) {

        // int A = 10256;
        // int B = 512;
        int C = 0;

        while (true) {

            if (C > 1000000) {
                return -1;
            }
        }
    }

}

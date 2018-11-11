package s2it;


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
public class Questao9 {

    public static void main(String... args) {

        Scanner s = new Scanner(System.in);

        int A = 0, B = 0, C = 0;

        while (A == 0) {
            System.out.println("Digite A, deve ser maior que 0: ");
            A = s.nextInt();

            if (A <= 0) {
                System.err.println("A deve ser maior que 0");
            }
            break;
        }

        while (B == 0) {
            System.out.println("Digite B: ");
            B = s.nextInt();

            if (B <= 0) {
                System.out.println("Digite B, deve ser maior que 0: ");
            }
            break;
        }
        while (C == 0) {
            System.out.println("Digite C: ");
            C = s.nextInt();
            break;
        }
        Integer result = Questao9.gerarC(Integer.toString(A), Integer.toString(B), C);

        if (result == -1) {
            System.out.println("-1");
        } else {
            System.out.println("C = " + result);
        }

    }

    private static Integer gerarC(String A, String B, int C) {

        String cString = "";
        String aStringDiff = "";
        String diff = "";

        cString = A.substring(0, 1);
        cString += B.substring(0, 1);

        if (Integer.parseInt(A) > 10) {
            cString += A.substring(1, 2);
        }

        if (Integer.parseInt(B) > 10) {
            cString += B.substring(1, 2);
        }

        if (A == null ? B != null : !A.equals(B)) {

            if (Integer.parseInt(A) > Integer.parseInt(B)) {

                if (Integer.parseInt(A) > 100) {
                    diff = A.substring(2, A.length());
                }
            }
            if (Integer.parseInt(B) > Integer.parseInt(A)) {

                if (Integer.parseInt(B) > 100) {
                    diff = B.substring(2, B.length());
                }
            }

        }

        C = Integer.parseInt(cString + C + diff);

        if (C > 1000000) {
            return -1;
        }
        return C;

    }

}

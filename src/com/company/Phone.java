package com.company;
import java.util.Scanner;

public class Phone {
    public static void main(String[] Args){

        char number2[] = { 'A', 'B', 'C' };
        char number3[] = { 'D', 'E', 'F' };
        char number4[] = { 'G', 'H', 'I' };
        char number5[] = { 'J', 'K', 'L' };
        char number6[] = { 'M', 'N', 'O' };
        char number7[] = { 'P', 'R', 'S' };
        char number8[] = { 'T', 'U', 'V' };
        char number9[] = { 'W', 'X', 'Y' };
        char Letter0[] = { ' ',' ',' ' };
        char Letter1[] = { ' ',' ',' ' };
        char Letter2[] = { ' ',' ',' ' };
        char Letter3[] = { ' ',' ',' ' };
        char Letter4[] = { ' ',' ',' ' };
        char Letter5[] = { ' ',' ',' ' };
        char Letter6[] = { ' ',' ',' ' };

        Scanner scanner = new Scanner( System.in );
        Character phoneArray[] = new Character[ 7 ];
        System.out.print( "Enter a phone: " );
        String phoneNumber = scanner.nextLine();

        for( int i = 0; i < (phoneNumber.length() - 1  ) ; i++ ) {
            phoneArray[i]=(new Character(phoneNumber.charAt( i )));
        }
        for (int i = 0 ; i < (phoneArray.length - 1 ) ; i++) {
            if ( phoneArray[i].equals('0') ){
                System.out.println("Invalid Input (0)");
                System.exit(1);
            }
            else if ( phoneArray[i].equals('1') ){
                System.out.println("Invalid Input (1)");
                System.exit(1);
            }
        }
        if (phoneArray[0].equals('2'))
            System.arraycopy(number2, 0, Letter0, 0, Letter0.length);
        else if (phoneArray[0].equals('3'))
            System.arraycopy(number3, 0, Letter0, 0, Letter0.length);
        else if (phoneArray[0].equals('4'))
            System.arraycopy(number4, 0, Letter0, 0, Letter0.length);
        else if (phoneArray[0].equals('5'))
            System.arraycopy(number5, 0, Letter0, 0, Letter0.length);
        else if (phoneArray[0].equals('6'))
            System.arraycopy(number6, 0, Letter0, 0, Letter0.length);
        else if (phoneArray[0].equals('7'))
            System.arraycopy(number7, 0, Letter0, 0, Letter0.length);
        else if (phoneArray[0].equals('8'))
            System.arraycopy(number8, 0, Letter0, 0, Letter0.length);
        else if (phoneArray[0].equals('9'))
            System.arraycopy(number9, 0, Letter0, 0, Letter0.length);

        if (phoneArray[1].equals('2'))
            System.arraycopy(number2, 0, Letter1, 0, Letter1.length);
        else if (phoneArray[1].equals('3'))
            System.arraycopy(number3, 0, Letter1, 0, Letter1.length);
        else if (phoneArray[1].equals('4'))
            System.arraycopy(number4, 0, Letter1, 0, Letter1.length);
        else if (phoneArray[1].equals('5'))
            System.arraycopy(number5, 0, Letter1, 0, Letter1.length);
        else if (phoneArray[1].equals('6'))
            System.arraycopy(number6, 0, Letter1, 0, Letter1.length);
        else if (phoneArray[1].equals('7'))
            System.arraycopy(number7, 0, Letter1, 0, Letter1.length);
        else if (phoneArray[1].equals('8'))
            System.arraycopy(number8, 0, Letter1, 0, Letter1.length);
        else if (phoneArray[1].equals('9'))
            System.arraycopy(number9, 0, Letter1, 0, Letter1.length);

        if (phoneArray[2].equals('2'))
            System.arraycopy(number2, 0, Letter2, 0, Letter2.length);
        else if (phoneArray[2].equals('3'))
            System.arraycopy(number3, 0, Letter2, 0, Letter2.length);
        else if (phoneArray[2].equals('4'))
            System.arraycopy(number4, 0, Letter2, 0, Letter2.length);
        else if (phoneArray[2].equals('5'))
            System.arraycopy(number5, 0, Letter2, 0, Letter2.length);
        else if (phoneArray[2].equals('6'))
            System.arraycopy(number6, 0, Letter2, 0, Letter2.length);
        else if (phoneArray[2].equals('7'))
            System.arraycopy(number7, 0, Letter2, 0, Letter2.length);
        else if (phoneArray[2].equals('8'))
            System.arraycopy(number8, 0, Letter2, 0, Letter2.length);
        else if (phoneArray[2].equals('9'))
            System.arraycopy(number9, 0, Letter2, 0, Letter2.length);

        if (phoneArray[3].equals('2'))
            System.arraycopy(number2, 0, Letter3, 0, Letter3.length);
        else if (phoneArray[3].equals('3'))
            System.arraycopy(number3, 0, Letter3, 0, Letter3.length);
        else if (phoneArray[3].equals('4'))
            System.arraycopy(number4, 0, Letter3, 0, Letter3.length);
        else if (phoneArray[3].equals('5'))
            System.arraycopy(number5, 0, Letter3, 0, Letter3.length);
        else if (phoneArray[3].equals('6'))
            System.arraycopy(number6, 0, Letter3, 0, Letter3.length);
        else if (phoneArray[3].equals('7'))
            System.arraycopy(number7, 0, Letter3, 0, Letter3.length);
        else if (phoneArray[3].equals('8'))
            System.arraycopy(number8, 0, Letter3, 0, Letter3.length);
        else if (phoneArray[3].equals('9'))
            System.arraycopy(number9, 0, Letter3, 0, Letter3.length);

        if (phoneArray[4].equals('2'))
            System.arraycopy(number2, 0, Letter4, 0, Letter4.length);
        else if (phoneArray[4].equals('3'))
            System.arraycopy(number3, 0, Letter4, 0, Letter4.length);
        else if (phoneArray[4].equals('4'))
            System.arraycopy(number4, 0, Letter4, 0, Letter4.length);
        else if (phoneArray[4].equals('5'))
            System.arraycopy(number5, 0, Letter4, 0, Letter4.length);
        else if (phoneArray[4].equals('6'))
            System.arraycopy(number6, 0, Letter4, 0, Letter4.length);
        else if (phoneArray[4].equals('7'))
            System.arraycopy(number7, 0, Letter4, 0, Letter4.length);
        else if (phoneArray[4].equals('8'))
            System.arraycopy(number8, 0, Letter4, 0, Letter4.length);
        else if (phoneArray[4].equals('9'))
            System.arraycopy(number9, 0, Letter4, 0, Letter4.length);

        if (phoneArray[5].equals('2'))
            System.arraycopy(number2, 0, Letter5, 0, Letter5.length);
        else if (phoneArray[5].equals('3'))
            System.arraycopy(number3, 0, Letter5, 0, Letter5.length);
        else if (phoneArray[5].equals('4'))
            System.arraycopy(number4, 0, Letter5, 0, Letter5.length);
        else if (phoneArray[5].equals('5'))
            System.arraycopy(number5, 0, Letter5, 0, Letter5.length);
        else if (phoneArray[5].equals('6'))
            System.arraycopy(number6, 0, Letter5, 0, Letter5.length);
        else if (phoneArray[5].equals('7'))
            System.arraycopy(number7, 0, Letter5, 0, Letter5.length);
        else if (phoneArray[5].equals('8'))
            System.arraycopy(number8, 0, Letter5, 0, Letter5.length);
        else if (phoneArray[5].equals('9'))
            System.arraycopy(number9, 0, Letter5, 0, Letter5.length);

        if (phoneArray[6].equals('2'))
            System.arraycopy(number2, 0, Letter6, 0, Letter6.length);
        else if (phoneArray[6].equals('3'))
            System.arraycopy(number3, 0, Letter6, 0, Letter6.length);
        else if (phoneArray[6].equals('4'))
            System.arraycopy(number4, 0, Letter6, 0, Letter6.length);
        else if (phoneArray[6].equals('5'))
            System.arraycopy(number5, 0, Letter6, 0, Letter6.length);
        else if (phoneArray[6].equals('6'))
            System.arraycopy(number6, 0, Letter6, 0, Letter6.length);
        else if (phoneArray[6].equals('7'))
            System.arraycopy(number7, 0, Letter6, 0, Letter6.length);
        else if (phoneArray[6].equals('8'))
            System.arraycopy(number8, 0, Letter6, 0, Letter6.length);
        else if (phoneArray[6].equals('9'))
            System.arraycopy(number9, 0, Letter6, 0, Letter6.length);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        for (int m = 0; m < 3; m++) {
                            for (int n = 0; n < 3; n++) {
                                for (int o = 0; o<3; o++) {
                                    System.out.print(Letter0[i]);
                                    System.out.print(" ");
                                    System.out.print(Letter1[j]);
                                    System.out.print(" ");
                                    System.out.print(Letter2[k]);
                                    System.out.print(" ");
                                    System.out.print(Letter3[l]);
                                    System.out.print(" ");
                                    System.out.print(Letter4[m]);
                                    System.out.print(" ");
                                    System.out.print(Letter5[n]);
                                    System.out.print(" ");
                                    System.out.print(Letter6[o]);
                                    System.out.println();
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
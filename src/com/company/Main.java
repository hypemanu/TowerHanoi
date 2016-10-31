/**
 *
 * This program prints the steps needed to solve the Towers of Hanoi puzzle
 * given the number of disks. This program prompts
 * the user for the number of disks. Then it displays the
 * steps, one per line. Each step indicates which peg to move
 * a disk from, and which peg to move the disk to. The steps are also
 * be sequentially numbered
 */

package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of disks: ");
        int nDisks =scan.nextInt();

        //Loops the program until user enters 0
        while(nDisks != 0) {
            Hanoi.solve(nDisks, 'A', 'B', 'C',0);
            System.out.println("Enter the number of disks: ");
            System.out.println("To exit program enter: 0 ");
            nDisks = scan.nextInt();
        }


    }

}
    /**
     * Created by Jeremiah on 9/28/16.
     *
     *
     *
     * FUNCTION solve(disk, source, dest, spare):
     *  IF disk == 0, THEN:
     *    move disk from source to dest
     *  ELSE:
     *    solve(disk - 1, source, spare, dest)   // Step 1 above
     *    move disk from source to dest          // Step 2 above
     *    solve(disk - 1, spare, dest, source)   // Step 3 above
     *
     *
     *
     */

     class Hanoi {


        public static void solve(int topN, char from, char inter, char to, int add) {
            if (topN == 1){
                add= 1 +  add;
                System.out.println(add+ ": " + "Disk 1 fromllll " + from + " to " + to);

            }else {
                solve(topN - 1, from, to, inter, add);
                add = 1+add;
                System.out.println((add+=1) + ": "+ "Disk " + topN + " from " + from + " to " + to);
                solve(topN - 1, inter, from, to, add);

            }
        }
    }





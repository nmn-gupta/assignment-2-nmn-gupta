/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.main;

import problem5.circularqueue.MyCircularQueue;
import problem5.node.Node;
import problem5.student.Student;

import java.util.Scanner;

//executable class
public class MyMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyCircularQueue cq = new MyCircularQueue();

        System.out.println("Enter number of records : ");
        int noOfRecords = sc.nextInt();
        while (noOfRecords != 0) {
            Student student = new Student();
            Node node = new Node();

            System.out.println("Enter the Name : ");
            student.setName(sc.next().trim());
            System.out.println("Enter the Roll Number :");
            student.setRollNum(sc.nextInt());
            System.out.println("Enter backlogs");
            int totalBackLogs = sc.nextInt();
            if (totalBackLogs > 2) {
                System.out.println("This student is not allowed");
                continue;
            }
            student.setBackLogCounter(totalBackLogs);

            node.setStudent(student);

            cq.enQueue(node);

            noOfRecords--;
        }




    }
}

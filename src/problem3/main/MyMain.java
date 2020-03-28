/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;

import problem3.myqueue.MyPriorityQueue;
import problem3.node.Node;
import problem5.student.Student;

import java.util.Scanner;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyPriorityQueue pq = new MyPriorityQueue();
        System.out.println("Enter the  number of nodes ");
        int noOfNodes = sc.nextInt();
        while (noOfNodes-- > 0) {
            Student student = new Student();
            System.out.println("Enter the name ");
            String name = sc.next().trim();
            System.out.println("Enter the roll number");
            int rollNo = sc.nextInt();
            student.setName(name);
            student.setRollNum(rollNo);
            Node node = new Node();
            node.setStudent(student);

            pq.enQueue(node);


        }
        System.out.println("Printing Queue : ");

        Node node = pq.deQueue();
        while (node != null) {
            System.out.println(node);
            node = pq.deQueue();
        }


    }
}

package _12_Encapsulation.Ex7;

import java.util.Scanner;

public class _01_Encapsulation1<Scaner> {

    public static void main(String[] args) {


/* TODO
    Burada iki adet class vardır. Biri Main, diğeri ise student ,
    student classı içinde;
    String name(isim) ve int age(yaş) isminde variables(değişkenler) oluşturunuz.
    getter ve setter ( alıcı ve ayarlayıcı ) oluşturunuz.

todo  Main classın içinde;
    Örnek:
    age 12'dir.
    name Steven'dır.

todo  name(isim) olarak;
    "Student name is Steven"
    ve
    age(yaş) olarak da;
    "He is 12 years old"
 */

        Scanner scan = new Scanner(System.in);

        String n1 = scan.nextLine();

        int i1 = scan.nextInt();

        //BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.

        student student = new student();
        student.setName(n1);
        student.setAge(i1);
        System.out.println("Student name is " + student.getName());
        System.out.println("He is " + student.getAge() + " years old");

    }
}


class student {

    private String name;
    private int age;

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }
}



package _12_Encapsulation.Ex8;

import java.util.Scanner;

public class _02_Encapsulation2 {

/* TODO
    Burada iki adet class vardır. Biri Main diğeri ise Employees,
    Employees(Çalışanlar) class'ında;
    Bu variable'ları oluşturunuz;
    private String name,
    private int salary,
    private String dob (date of birth) (Doğum tarihi)
    getter ve setter oluşturunuz.

 Main class'ın içinde; kullanicidan name dob ve slary bilgilerini alip
    Eğer employee 18 yaşında büyükse, Welcome to our company Fernando your salary is 80000. yazdırınız.
    Eğer Fernando 18 yaşından küçükse, come back when you are 18 years old. yazdırınız.
    Eğer Fernando 18 yaşındaysa,  we can have inter with you after that you can have a 80000 salary yazdırınız.
  Örnek:
    Name is Fernando
    dob is 11/23/2000
    Salary is 80000
todo  ageCalculator isminde bir method oluşturunuz. Şuanki tarih - doğum yılı = employee age
*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("adınızı giriniz : ");
        String name = scan.nextLine();
        System.out.print("d tarihinzi MM/dd/yyyy formatında giriniz : ");
        String dob = scan.nextLine();

        System.out.print("maas talebinizi giriniz : ");
        int salary = scan.nextInt();

//  BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ ve employees class'ında setter'ı ayarlarken bu variable'ları kullanınız.

        Employees calisan = new Employees();
        calisan.setName(name);
        calisan.setDob(dob);
        calisan.setSalary(salary);

        int elemanYas = calisan.YasHesapla(dob);


        if (elemanYas > 18) {
            System.out.println(" Welcome to our company " + name + " your salary is " + salary + ".");
        }

       else if (elemanYas < 18) {
            System.out.println("come back when you are 18 years old.");

        }

       else  {
            System.out.println("we can have inter with you after that you can have a " + salary + " salary");
        }
    }
}


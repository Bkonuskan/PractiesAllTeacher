package _12_Encapsulation.Ex8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Employees {

    private String name;
    private String dob; // doğum tarihi
    private int salary;

   public int YasHesapla(String dob) {



      DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate dTarih = LocalDate.parse(dob, format);


        LocalDate bugun = LocalDate.now();
//        Period fark = Period.between(tarih,bugun);
//        int yas = fark.getYears();

        int yas = bugun.getYear() - dTarih.getYear();
        return yas;

    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

}

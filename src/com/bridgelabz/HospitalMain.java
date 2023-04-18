package com.bridgelabz;
import java.util.Scanner;
//Create multiple Hospitals -> Create Patients with details(name, age, phoneNumber,city,state, department) ->
// Create an Enum for Department(Values-> ONCOLOGY, NEUROLOGY , CARDIOLOGY , GYNOCOLOGY)->
// Add multiple Patients in each Hospital -> Also Maintain a MAP of Hospitals through a Map(key->HospitalName , value-> Hospital-Object)  ->
// Create 3 classes - Hospital , Patient and HospitalMain
public class HospitalMain {
    Hospital hospital = new Hospital();
    void addPatient(){
        Patient patient1 = new Patient();
        hospital.patient = patient1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Patient Name : ");
        String name = scanner.next();
        System.out.println("Enter patient Age : ");
        int age  = scanner.nextInt();
        System.out.println("Enter Patient Phone Number : ");
        long phoneNumber = scanner.nextLong();
        System.out.println("Enter Patient City : ");
        String city = scanner.next();
        System.out.println("Enter Patient State : ");
        String state = scanner.next();
        System.out.println("Enter Patient Department : ");
        String department = scanner.next();

        patient1.setName(name);
        patient1.setAge(age);
        patient1.setPhoneNumber(phoneNumber);
        patient1.setCity(city);
        patient1.setState(state);
        patient1.setDepartment(department);
    }

    public static void main(String[] args) {
        HospitalMain hospitalMain = new HospitalMain();
        hospitalMain.addPatient();
        System.out.println(hospitalMain.hospital);
    }
}

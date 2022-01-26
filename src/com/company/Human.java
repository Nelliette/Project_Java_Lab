package com.company;

import java.time.LocalDate;

public class Human
{
        String firstName;
        String lastName;
        Animal pet;
        Car typeOfCar;
        private Double salary;
        private LocalDate lastSalaryInformation;
        private Double previousBalance;

        public Human()
        {
                this.salary = 3500.00;
                this.lastSalaryInformation = LocalDate.now();
                this.previousBalance = this.salary;

        }

        public Double getSalary()
        {
                System.out.println("Ostatnie dane dotyczące wynagrodzenia pochodzą z "+this.lastSalaryInformation+" Saldo wynosiło : "+this.previousBalance+" zł.");
                return salary;
        }

        public void setSalary(Double salary)
        {
                if (salary <= 0)
                {
                        System.out.println("Na szczeście jeszcze nie ma możliwości przelania ujemnego wynagrodzenia -> wprowadź prawidłową kwotę");
                }
                else
                {
                        System.out.println("Nowe dane zostały przekazane księgowości.");
                        System.out.println("Aneks do umowy można odebrać u Pani Hani z kadr w godzinach od 8:00 do 10:00 z wyłączeniem przerwy na kawe w godzinach 9-10.");
                        System.out.println("inwigilacja przez ZUS i US przebiegła pomyślnie, Twoje podatki zostały przeliczone");
                        this.salary = salary;
                }
        }

        void showHumanInformation()
        {
                System.out.println("Imię :"+firstName);
                System.out.println("Nazwisko :"+lastName);


        }

}

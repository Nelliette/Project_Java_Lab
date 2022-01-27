package com.company;

import com.company.devices.Car;
import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;

public class Human
{
        String firstName;
        String lastName;
        Animal pet;
        private Car typeOfCar;
        private Double salary;
        private LocalDate lastSalaryInformation;
        private Double previousBalance;
        Double cash;

        public Human()
        {
                this.salary = 3500.00;
                this.lastSalaryInformation = LocalDate.now();
                this.previousBalance = this.salary;
                this.typeOfCar = null;
                this.pet = null;

        }

        public Human(String firstName, String lastName,Double cash)
        {
                this.firstName = firstName;
                this.lastName = lastName;
                this.cash = cash;
        }

       public Car gettypeOfCar()
        {
               return typeOfCar;
        }
        public Double getCash()
        {
                return cash;
        }
        public void setCash(Double cash)
        {
                this.cash = cash;
        }
        public void carBuyer(Car purchaser)
        {
                this.typeOfCar = purchaser;
        }
        public void carSeller(Car dealer)
        {
                this.typeOfCar = null;
        }


        public void settypeOfCar(Car typeOfCar)
        {
                if (this.salary > typeOfCar.value)
                {
                        System.out.println("Udało Ci się zakupić samochód za gotówkę");
                        this.typeOfCar = typeOfCar;
                } else if (this.salary > (typeOfCar.value / 12))
                {
                        System.out.println("Udało Ci się wpakować w kredyt ... ale masz to auto !");
                        this.typeOfCar = typeOfCar;
                } else
                {
                        System.out.println("Pomyśl o samochodzie jak będzie Cię na niego stać ,a teraz do roboty !!!");
                }
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



        public boolean equals(Object obj)
        {
                System.out.println("Zakaz handlu ludzmi !!!");
                return super.equals(obj);
        }


        @Override
        public String toString()
        {
                return "Human{" +
                        "firstName='" + firstName + '\'' +
                        ", lastName='" + lastName + '\'' +
                        ", pet=" + pet +
                        ", typeOfCar=" +typeOfCar +
                        ", salary=" + salary +
                        ", lastSalaryInformation=" + lastSalaryInformation +
                        ", previousBalance=" + previousBalance +
                        '}';
        }
}

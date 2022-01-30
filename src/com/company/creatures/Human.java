package com.company.creatures;

import com.company.devices.Car;


import java.time.LocalDate;

public class Human extends Animal
{
        private static final int DEFAULT_GARAGE_SIZE = 4;
        private static final String HUMAN_SPECIES = "Homo Sapiens";
        public String firstName;
        public String lastName;
        public  Animal pet;
        public Car [] garage;
        private Car typeOfCar;
        private Double salary;
        private final LocalDate lastSalaryInformation;
        private final Double previousBalance;
        public Double cash;


        public Human(String firstName, String lastName,Double cash,int garageSize,Car typeOfCar)
        {
            super(HUMAN_SPECIES);
            this.firstName = firstName;
            this.lastName = lastName;
            this.cash = cash;
            this.salary = 3500.00;
            this.lastSalaryInformation = LocalDate.now();
            this.previousBalance = this.salary;
            this.garage = new Car [garageSize];
            this.pet = null;
            this.typeOfCar = typeOfCar;


        }


       public Car getTypeOfCar()
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
        public Car getgarageSize(int size)
        {
             return garage[size];
        }

        public void settypeOfCar(Car typeOfCar, int size)
        {
               if(size >= garage.length)
               {
                   System.out.println("Nie masz miejsca na to auto ");

               }
               else if(garage[size] != null)
               {
                   this.garage[size] = typeOfCar;
                   System.out.println("Umieściłeś auto w garażu");
               }
               else
               {
                   System.out.println("Proszę wybrać inne miejsce na tym już stoi auto");
               }

        }

    public boolean addNewCar(Car typeOfCar)
    {
        for (int i = 0; i< garage.length;i++)
        {
            if(garage[i] == null)
            {
                garage[i] = typeOfCar;
                return true;

            }
        }
        return false;
    }
        public void iWantCar(Car typeOfCar)
        {
            if(cash > typeOfCar.value)
            {

                int i = 0;
                while(garage[i] == null)
                {
                    this.garage[i] = typeOfCar;
                }
            }
            else if (cash /12 > typeOfCar.value)
            {
                if(addNewCar(typeOfCar))
                {
                    System.out.println("Brakuje miejsca na to auto");
                }
                System.out.println("Zakupiłeś to auto na raty.");
            }

        }
        public void priceOfCar()
        {
            int price = 0;
            for (Car car : garage)
            {
                if (car != null)
                {
                    price += car.value;
                }
            }
            System.out.println("Kupujący "+firstName+ " w swoim garażu ma samochody o wartosci :"+price);
        }
        public boolean iHaveThisOne( Car typeOfCar)
        {
            for (Car car:garage)
            {
                if (car != null && car.equals(typeOfCar))
                {
                    return true;
                }
            }
            return false;
        }
        public boolean doIhaveSpaceForCar()
        {
            for (Car car : garage)
                if (car == null)
                {
                    return true;
                }
            return false;
        }
        public void iSellMyCar(Car byebye)
        {
            for (int i = 0 ; i<garage.length;i++)
            {
                if (garage[i].equals(byebye))
                {
                    garage[i] = null;
                }
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
    public void beEten()
    {

    }

    @Override
        public String toString()
        {
                return "Human{" +
                        "firstName='" + firstName + '\'' +
                        ", lastName='" + lastName + '\'' +
                        ", pet=" + pet +
                        ", salary=" + salary +
                        ", lastSalaryInformation=" + lastSalaryInformation +
                        ", previousBalance=" + previousBalance +
                        '}';
        }
}

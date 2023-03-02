package com.UTN.Java.Class1.A2;

public class Exercise1 {

    public static void main(String[] args) {

        double incomePerson1 = 748382.07;
        int mt2Person1 = 30;
        int energyPerson1= 3330;

        if ((incomePerson1 > 0 && incomePerson1 <= 748382.07) && (mt2Person1 > 0 && mt2Person1 <= 30) && (energyPerson1 > 0 && energyPerson1 <= 3330)){
            System.out.println("CATEGORIA A");
        } else if ((incomePerson1 > 0 && incomePerson1 <= 1112459.83) && (mt2Person1 > 0 && mt2Person1 <= 45) && (energyPerson1 > 0 && energyPerson1 <= 5000)) {
            System.out.println("CATEGORIA B");
        }else if ((incomePerson1 > 0 &&  incomePerson1 <= 1557443.75) && (mt2Person1 > 0 && mt2Person1 <= 60) && (energyPerson1 > 0 && energyPerson1 <= 6700)){
            System.out.println("CATEGORIA C");
        } else if ((incomePerson1 > 0 && incomePerson1 <= 1934273.04) && (mt2Person1 > 0 && mt2Person1 <= 85) && (energyPerson1 > 0 && energyPerson1 <= 10000)) {
            System.out.println("CATEGORIA D");
        } else if ((incomePerson1 > 0 && incomePerson1 <= 2277684.56) && (mt2Person1 > 0 && mt2Person1 <= 110) && (energyPerson1 > 0 && energyPerson1 <= 13000)) {
            System.out.println("CATEGORIA E");
        }
        else {
            System.out.println("NO PERTENECE A NINGUNA CATEGORIA DEL MONOTRIBUTO");
        }
    }
}
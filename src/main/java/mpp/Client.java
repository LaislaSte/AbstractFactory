package mpp;

import mpp.abstracts.CarFactory;
import mpp.abstracts.HatchCar;
import mpp.abstracts.SedanCar;
import mpp.factory.FiatFactory;
import mpp.factory.VolksFactory;

public class Client {
    public static void main(String[] args) {
        CarFactory fiatFactory = new FiatFactory();
        CarFactory volksFactory = new VolksFactory();

        SedanCar fiatSedanCar = fiatFactory.buildSedanCar();
        HatchCar fiatHatchCar = fiatFactory.buildHatchCar();

        SedanCar volksSedanCar = volksFactory.buildSedanCar();
        HatchCar volksHatchCar = volksFactory.buildHatchCar();

        System.out.println("From Fiat Factory: ");
        fiatSedanCar.showSedanCarInformation();
        fiatHatchCar.showHatchCarInformation();

        System.out.println("From Volks Factory: ");
        volksSedanCar.showSedanCarInformation();
        volksHatchCar.showHatchCarInformation();
    }
}

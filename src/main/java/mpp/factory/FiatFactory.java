package mpp.factory;

import mpp.abstracts.CarFactory;
import mpp.abstracts.HatchCar;
import mpp.abstracts.SedanCar;
import mpp.cars.Palio;
import mpp.cars.Siena;

public class FiatFactory extends CarFactory{

    @Override
    public HatchCar buildHatchCar() {
        return new Palio();
    }

    @Override
    public SedanCar buildSedanCar() { 
        return new Siena();
    }
    
}

package mpp.factory;

import mpp.abstracts.CarFactory;
import mpp.abstracts.HatchCar;
import mpp.abstracts.SedanCar;
import mpp.cars.Gol;
import mpp.cars.Voyage;

public class VolksFactory extends CarFactory {

    @Override
    public HatchCar buildHatchCar() {
        return new Gol();
    }

    @Override
    public SedanCar buildSedanCar() {
        return new Voyage();
    }
    
}

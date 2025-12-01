package joshsatrionachemya.uas.ppbo25.controllers;

import java.util.ArrayList;

import joshsatrionachemya.uas.ppbo25.exception.EmptyListException;
import joshsatrionachemya.uas.ppbo25.exception.InvalidInputException;
import joshsatrionachemya.uas.ppbo25.models.Device;

public class DeviceController implements IDeviceController {
    ArrayList<Device> deviceController = new ArrayList<>();

    
    public void add(Device dev){
        deviceController.add(dev);
    }

    
    public void validateInput(int choice) throws InvalidInputException{
         if (choice < 1 || choice > 3) {
            throw new InvalidInputException(choice);
        }
    }


    @Override
    public ArrayList<Device> getArrayList() throws EmptyListException {
        if(deviceController.isEmpty()){
            throw new EmptyListException();
        }
        return deviceController;
    }
}

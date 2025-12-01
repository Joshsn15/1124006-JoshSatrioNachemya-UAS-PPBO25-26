package joshsatrionachemya.uas.ppbo25.controllers;

import java.util.ArrayList;

import joshsatrionachemya.uas.ppbo25.exception.EmptyListException;
import joshsatrionachemya.uas.ppbo25.exception.InvalidInputException;
import joshsatrionachemya.uas.ppbo25.models.Device;

public interface IDeviceController {
    public void validateInput(int choice) throws InvalidInputException;
    public void add(Device dev);
    public ArrayList<Device> getArrayList() throws EmptyListException;
}


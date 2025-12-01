package joshsatrionachemya.uas.ppbo25.views;

import joshsatrionachemya.uas.ppbo25.exception.EmptyListException;
import joshsatrionachemya.uas.ppbo25.exception.InvalidInputException;
import joshsatrionachemya.uas.ppbo25.models.Device;
import joshsatrionachemya.uas.ppbo25.models.Fedora;
import joshsatrionachemya.uas.ppbo25.models.Ubuntu;
import joshsatrionachemya.uas.ppbo25.models.Windows;
import joshsatrionachemya.uas.ppbo25.utils.CLIUtil;

public class DeviceView {
    joshsatrionachemya.uas.ppbo25.controllers.DeviceController DeviceController;

    public DeviceView() {
        DeviceController = new joshsatrionachemya.uas.ppbo25.controllers.DeviceController();
    }

    CLIUtil util = new CLIUtil();

    public void render() throws InvalidInputException, EmptyListException {
        System.out.println("Menu :");
        System.out.println("1. Tambah Device");
        System.out.println("2. Tampilkan semua Device");
        System.out.println("3. Tampilkan semua Device terurut bedasarkan OS");
        System.out.println("0. Keluar");
        this.handleMenuInput(util.nextInt());
    }

    public void handleMenuInput(int choice) throws InvalidInputException, EmptyListException {
        switch (choice) {
            case 1:
                System.out.println("Masukan nama");
                String nama = util.nextLine();
                System.out.println("Pilih OS : 1.Windows 2.Ubuntu 3.Fedora");
                int inputOS = util.nextInt();
                DeviceController.validateInput(inputOS);
                System.out.println("Masukan Versi :");
                String inputVersion = util.nextLine();

                if (inputOS == 1) {
                    Windows win = new Windows(inputVersion);
                    Device device = new Device(nama, win);
                    DeviceController.add(device);
                    break;

                } else if (inputOS == 2) {
                    System.out.println("desktop Environment (Optional) :");
                    String desktopEnvironment = util.nextLine();
                    if (desktopEnvironment.length() != 0) {
                        Ubuntu ubuntu = new Ubuntu(inputVersion, desktopEnvironment);
                        Device device = new Device(nama, ubuntu);
                        DeviceController.add(device);
                        break;

                    }
                    Ubuntu ubuntu = new Ubuntu(inputVersion);
                    Device device = new Device(nama, ubuntu);
                    DeviceController.add(device); // lebay euy

                } else if (inputOS == 3) {
                    System.out.println("desktop Environment (Optional) :");
                    String desktopEnvironment = util.nextLine();
                    if (desktopEnvironment.length() != 0) {
                        Fedora Fedora = new Fedora(inputVersion, desktopEnvironment);
                        Device device = new Device(nama, Fedora);
                        DeviceController.add(device);
                        break;
                    }
                    Fedora Fedora = new Fedora(inputVersion);
                    Device device = new Device(nama, Fedora);
                    DeviceController.add(device);
                }
                break;

            default:
                break;
            case 2:
                try{
                    DeviceController.getArrayList();
                }catch(EmptyListException e){
                    throw new EmptyListException();
                }
                break;
            case 3:
                break;
        }
    }
}

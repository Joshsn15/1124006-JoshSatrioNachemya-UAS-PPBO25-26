package joshsatrionachemya.uas.ppbo25.views;

import joshsatrionachemya.uas.ppbo25.utils.CLIUtil;

public class MenuView {

    CLIUtil util = new CLIUtil();

    public void render() {
        System.out.println("Menu :");
        System.out.println("1. Tambah Device");
        System.out.println("2. Tampilkan semua Device");
        System.out.println("3. Tampilkan semua Device terurut bedasarkan OS");
        System.out.println("0. Keluar");
        this.handleMenuInput(util.nextInt());
    }

    public void handleMenuInput(int choice) {
        switch (choice) {
            case 1:
                
                break;

            default:
                break;
        }
    }
}

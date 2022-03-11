
package mod3KPL;

import java.util.Scanner;

public class main_DoorMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        door_Machine pintu = new door_Machine();
        System.out.println(pintu.getState());
        System.out.print("Perintah : ");
        String c = input.nextLine();
        pintu.pintu(c);
        System.out.println(pintu.getState());
        System.out.print("Perintah : ");
        c = input.nextLine();
        pintu.pintu(c);
        System.out.println(pintu.getState());
        input.close();        
    }
}

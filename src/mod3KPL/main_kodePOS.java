package mod3KPL;
import java.util.Scanner;

public class main_kodePOS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama kelurahan : ");
        String kl = input.nextLine();
        System.out.println(kode_POS.getKodePos(kl));
        input.close();
    }
}

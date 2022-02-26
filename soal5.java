import java.util.ArrayList;
import java.util.Scanner;

public class soal5 {
    public static void main(String[] args) {
        ArrayList<String> nama = new ArrayList<String>();
        nama.add("l");
        nama.add("l");
        nama.add("a");
        nama.add("h");

        System.out.println("Array sekarang = "+nama);

        char pilihan;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("berikut pilihan tindakan soal no 5 ");
            System.out.printf("pilihan 1 : remove(0), pilihan 2 : remove(3), pilihan 3 : remove(2).(1/2/3)= ");
            pilihan = input.next().charAt(0);
        }
        switch(pilihan){
            case '1':
            //remove(0)
        nama.remove(0);
        System.out.println("\nArray setelah di remove = "+nama);
            break;
            case '2':
            //remove(3)
        nama.remove(3);
        System.out.println("\nArray setelah di remove = "+nama);
            break;
            case '3':
            //remove(2)
        nama.remove(2);
        System.out.println("\nArray setelah di remove = "+nama);
            break;
            default:
            System.out.println("harusnya saudara inputkan angka 1/2/3");
            break;
        }
        
    }
    
}

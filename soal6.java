import java.util.ArrayList;

public class soal6 {
    public static void main(String[] args) {
        ArrayList<String> nama = new ArrayList<String>();
        nama.add("l");
        nama.add("l");
        nama.add("a");
        nama.add("h");

        //add(0,e)
        nama.add(0,"e");
        System.out.println("array setelah elemen e ditambahkan pada index 0 : "+nama);
        //add(2,f)
        nama.add(2,"f");
        System.out.println("array setelah elemen f ditambahkan pada index 2 : "+nama);
        //add(3,g)
        nama.add(3,"g");
        System.out.println("array setelah elemen g ditambahkan pada index 3 : "+nama);
        //add(4,h)
        nama.add(4,"h");
        System.out.println("array setelah elemen h ditambahkan pada index 4 : "+nama);
        //add(6,h)
        nama.add(6,"h");
        System.out.println("array setelah elemen h ditambahkan pada index 6 : "+nama);
        //add(-3,j)
        nama.add(-3,"j");
        System.out.println("array setelah elemen j ditambahkan pada index -3 : "+nama);
    }
}

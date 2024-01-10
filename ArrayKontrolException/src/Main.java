import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Diziyi tanımla
        Scanner kullaniciGirisi = new Scanner(System.in); //Kullanıcı girdisi al
        System.out.println("Hangi indeksteki elemanı döndürelim: ");
        int index = kullaniciGirisi.nextInt();
        //burada getElemEntAtIndex methodunu dene
        try {
            int element = getElementAtIndex(myArray, index);
            System.out.println("Dizideki eleman: " + element);
        }   // hata alınması halinde Exception at e nesnesiyle
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static int getElementAtIndex(int[] array, int index) throws Exception {
        if (index < 0 || index >= array.length) {
            throw new Exception("Geçersiz indeks: " + index);
        }
        return array[index];
    }
}

package queue;
import java.util.Scanner;
public class mainqueue {
    static void menu (){
        System.out.println("Pilihan Operasi Queue");
        System.out.println("1. enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. print");
        System.out.println("4. keluar");
    }
    public static void main(String[]args){
        Scanner scan = new Scanner (System.in);
        int pil = 0;
        System.out.print("Massukan nilai maksimal queue : ");
        int m = scan.nextInt();
        queue qq = new queue(m);
         do{
            menu();
            pil = scan.nextInt();
            switch (pil) {
                case 1:
                    System.out.print("Masukan Nilai Data : ");
                    int dataIn = scan.nextInt();
                    qq.enqueqeu(dataIn);
                    break;
                case 2:
                    int dataOut = qq.dequeue();
                    if (dataOut != 0) {
                        System.out.print("Data Yang Terambil : " + dataOut);
                    }
                    break;
                case 3:
                    qq.print();
                    break;
            }
        }while (pil!=4);
    }
}

# JAVA
import java.util.Scanner;

public class GreedyCoin {
    public static void main(String[] args) {
        GreedyCoin a = new GreedyCoin();
//        a.tukar(2000);
//        a.tukar(3950);
//        a.tukar(1300);
//        a.tukar(8);
//        GreedyCoin b = new GreedyCoin(new int[]{200, 500, 700});
//        b.tukar(80000);
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Uang : ");
        
        try{
            a.tukar(in.nextInt());
        }catch(java.util.InputMismatchException e){
            System.out.println("Input salah!");
        }
        
    }

    int[] jenisPecah;
    int[] jmlPecah;
    int jmlAwal;
    int sisa;

    public GreedyCoin(int[] jns) {
        jenisPecah = jns;
        jmlPecah = new int[jns.length];
    }

    public GreedyCoin() {
        jenisPecah = new int[]{100, 200, 500};
        jmlPecah = new int[3];
    }

    private int[] tukar(int jml) {
        jmlAwal = jml;
        int i = jenisPecah.length-1;
        do{
            jmlPecah[i] = jml/jenisPecah[i];
            jml -= jmlPecah[i]*jenisPecah[i];
            i--;
        }while(i >= 0);
        sisa = jml;
        show();
        return jmlPecah;
    }

    private void show() {
        System.out.println("Nilai awal  : "+jmlAwal);
        System.out.println("Nilai sisa  : "+sisa);
        System.out.println("Nilai pecah : ");
        for (int i = 0; i < jenisPecah.length; i++) {
            System.out.println("Pecahan "+jenisPecah[i]+" = "+jmlPecah[i]);
        }
        System.out.println();
    }
}

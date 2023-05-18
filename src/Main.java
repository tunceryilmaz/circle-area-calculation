import java.util.Scanner;
        public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double pi,r,aci,dairedilimialani,daireninalani,daireninCevresi;
        pi=Math.PI;
        System.out.print("Yarıçapı giriniz :");
        r= input.nextDouble();
        System.out.print("Açıyı giriniz :");
        aci= input.nextDouble();

        daireninalani=pi *r*r;
        daireninCevresi =2 * pi * r;

        dairedilimialani=(pi * (r*r) * aci) / 360;
        System.out.println("DAİRE DİLİMİNİN ALANI :"+dairedilimialani);
        System.out.println("DAİRENİN ALANI :"+daireninalani);
        System.out.println("DAİRENİN ÇEVRESİ :"+daireninCevresi);

    }
}
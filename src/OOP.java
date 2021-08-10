import java.util.Scanner;
public class OOP {
    public static class Nguoi
    {
        String ten;
        int tuoi;
        float chieucao;
    }
    public static int Nhapso(){
        int n = 0;
        boolean check = false;
        Scanner input = new Scanner(System.in);
        while (check==false){
            try{
                n = input.nextInt();
                check = true;
                if(n<0) {
                    System.out.println("Nhập sai! Hãy nhập 1 số nguyên dương :");
                    check = false;
                }
            }catch (Exception t1){
                System.out.println("Nhập sai! Hãy nhập 1 số nguyên dương : ");
                input.nextLine();
            }
        }
        return n;
    }
    public static String Nhapchu(){
        String m = "";
        boolean check = false;
        Scanner input = new Scanner(System.in);
        while (check==false){
            m = input.nextLine();
            if(!m.matches("\\D*")){
                System.out.println("Nhập sai định dạng, hãy nhập kí tự là chữ : ");
                check = false;
            }
            else check =true;
        }
        return m;
    }
    public static float Nhapchieucao(){
        float k=0f;
        boolean check = false;
        Scanner input = new Scanner(System.in);
        while (check==false){
            try {
                k = input.nextFloat();
                check = true;
            }catch (Exception t1){
                System.out.println("Nhập sai định dạng! Hãy nhập một số thực: ");
                input.nextLine();
            }
        }
        return k;
    }

    public static void main(String[] args) {
        System.out.println("Nhập số lượng người trong danh sách: ");
        int b =0;
        int a=0;
        a = Nhapso();
        Scanner inp = new Scanner(System.in);
        Nguoi[] mang = new Nguoi[a];
        for (int i = 0; i < a; i++) {
            b = i+1;
            System.out.println("Nhập thông tin người "+b);
            mang[i] = new Nguoi();
            System.out.println("Họ và tên :");
            mang[i].ten = Nhapchu();
            System.out.println("Tuổi :");
            mang[i].tuoi = Nhapso();
            System.out.println("Chiều cao: ");
            mang[i].chieucao = Nhapchieucao();
        }
        System.out.println("Danh sách thông tin người là :");
        for (int i = 0; i < a; i++) {
            b=i+1;
            System.out.println("Người "+b);
            System.out.println("Tên: " +mang[i].ten);
            System.out.println("Tuổi: "+mang[i].tuoi);
            System.out.println("Chiều cao: "+mang[i].chieucao);
            System.out.println("*********");
        }
    }
}

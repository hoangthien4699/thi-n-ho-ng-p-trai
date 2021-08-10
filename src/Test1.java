/*  Kiến thức java căn bản : gồm khái niệm về các cú pháp, kiểu dữ liệu, biến, toán tử, ...) */
public class Test1 {
    public static void main(String[] args)  /* cú pháp nhanh psvm */
    {
    /* - Biến trong Java*/
    String name;            /* name là một biến */
    float height;
    int age;
    name = "Thien";
    height = 1.7f;
    age = 22;
        System.out.printf("Thông tin :\n"); /* cú pháp nhanh : souf ( in ra dòng có printf không tự động xuống dòng*/
        System.out.println("tên :"+name);         /* cú pháp nhanh : sout ( in ra dòng có println tự động xuống dòng) */
        System.out.println("chiều cao:"+height);
        System.out.println("tuổi : "+age); /* trong print dùng dấu + để nối */
    /* - Các kiểu dữ liệu trong Java */
    boolean TrueAndFalse;       /* trả về 2 giá trị là true hoặc false */
    byte KieuSoNguyen1;         /* kiểu số nguyên byte có giá trị -128 đến 127*/
    short KieuSoNguyen2;        /* kiểu số nguyên short có giá trị từ -32.768 đến 32.767*/
    int KieuSoNguyen3;          /* kiểu số nguyên int có giá trị từ - 2.147.483.648 đến 2.147.483.647 */
    long KieuSoNguyen4;         /* kiểu số nguyên long có giá trị từ -9.223.372.036.854.775.808 đến 9.223.372.036.854.775.807 có kí tự "l" phía sau */
    float KieuSoThuc1;          /* kiểu số thực float có giá trị 4 byte, có chữ "f" phía sau*/
    double KieuSoThuc2;         /* kiểu số thực double có giá trị 8 byte , có chữ "d" phía sau */
    char KieuKiTu1;             /* kiểu kí tự char có giá trị 2 byte */
    /* Ngoài ra còn kiểu String và kiểu dữ liệu tham chiếu (Reference Types) */

    /* - Toán tử cơ bản trong Java
    - Phép cộng : "+"
    - Phép trừ : "-"
    - Phép nhân : "*"
    - Phép chia lấy phần nguyên : "/"
    - Phép chia lấy phần dư : "%"
    - Tăng lên 1 đơn vị : "++"
    - Giảm giá trị xuống 1 đơn vị : "--"
    - Chú ý : "++a" và "a++" là giống nhau chỉ khác chỗ "++a" tăng lên rồi mới thực hiện các việc khác, "a++" thì làm các việc khác rồi mới tăng lên 1 đơn vị.
     Tương tự với "a--" và "--a"
    */
    int a = 1;
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(1+a++);
        System.out.println(++a+1);
    /* Toán tử quan hệ trong Java
    - Toán tử "==" : kiểm tra 2 toán hạng có bằng nhau không, nếu bằng thì trả ra true không thì trả ra false.
    - Toán tử "!=" : kiểm tra 2 toán hạng có khác nhau không, nếu khác thì trả ra true không thì trả ra false.
    - Toán tử ">"  : toán tử so sánh kiểm tra có lớn hơn không nếu có thì true còn không thì false.
    - Toán tử "<"  : toán tử so sánh kiểm tra có nhỏ hơn không nếu có thì true còn không thì false.
    - Toán tử ">=" : toán tử lớn hơn hoặc bằng đúng thì true không thì false.
    - Toán tử "<=" : toán tử bé hơn hoặc bằng đúng thì true không thì false.
     */
    /* Toán tử logic
    - Toán tử "&&" : trả ra kết quả với điều kiện các biểu thức đều có giá trị là true.
    - Toán tử "||" : trả ra kết quả với điều kiện 1 trong các biểu thức có giá trị là true.
    - Toán tử "!"  : trả ra kết quả với điều kiện các giá trị phải ngược với biểu thức đã cho.
     */
    /* Toán tử gán trong java
    - Toán tử "=" : gán giá trị bên phải cho bên trái.
    - Toán tử "+=": cộng 2 toán hạng rồi gán cho bên trái.
    - Toán tử "-=": trừ 2 toán hạng rồi gán cho bên trái.
    - Toán tử "*=": nhân 2 toán hạng rồi gán cho bên trái.
    - toán tử "/=": chia 2 toán hạng rồi gán cho bên trái.
    - toán tử "%=": chia lấy dư rồi gán cho bên trái.
    - toán tử "<<=" : nhân toán hạng trái với 2 mũ số hạng phải rồi gán kết quả cho số hạng trái.
    - toán tử ">>=" : chia toán hạng trái với 2 mũ số hạng phải rồi gán kết quả cho số hạng trái.
    - toán tử "&=":
     */
    int A = 456;
    int B = 4;
    int C = 5;
    A <<= B;
        System.out.println(A);
    A >>= C;
        System.out.println(A);
    int D = 12;
    int E = 7;
    D &= E;
        System.out.println(D);
    /* Toán tử khác trong java
    - Toán tử instanceof : kiểm tra kiểu dữ liệu mình dự đoán có đúng không, đúng thì true không thì false */
    String HoTen = "Ngo Hoang Thien";
    boolean LaKieuString = name instanceof String;
        System.out.println(LaKieuString);
    /* Toán tử điều kiện
    _ Dạng : ( biểu thức ) ? (kết quả 1) : ( kết quả 2) nếu đúng in ra "kết quả 1", nếu sai in ra "kết quả 2". */
    int c = 5;
    int d = 6;
    int e = c > d ? 7 : 8;
        System.out.println(e);

        /* Hằng trong java
    - Cú pháp : final <KIỂU DỮ LIỆU> <TÊN BIẾN> = <HẰNG SỐ>;
    - Hằng số không thể thay đổi giá trị. */
    final double PI = 3.1415926d;
    int r = 3;
        System.out.println(r*r*PI);
    /* Ép kiểu trong Java
    - Ép kiểu là thay đổi kiểu dữ liệu của một biết thành một kiểu dữ liệu mới.
    - Có kiểu ép kiểu : ép kiểu ngầm định và ép kiểu tường minh, ép kiểu ngầm định là chuyển từ kiểu dữ liệu nhỏ sang
    kiểu dữ liệu lớn hơn( chúng ta không cần làm gì việc chuyển đổi sẽ được thực hiện bởi compiler( trình biên dịch),
    ép kiểu tường minh ngược lại chuyển từ kiểu dữ liệu lớn về kiểu dữ liệu nhỏ và chúng ta phải là người chuyển đổi.
     */
    /* Ép kiểu ngầm định */
    int h = 5;
    long k = h;
        System.out.println(k);
    /* Ép kiểu tường minh */
    long i = 10;
    int j = (int) i;
        System.out.println(j);
    /* Khi ép kiểu char sang số thì ép kiểu ngầm định và ngược lại */
    char m = 'A';
    int n = m;
    char p = (char) n;
        System.out.println(n);
        System.out.println(p);
    /* Cấu trúc rẻ nhánh ( câu điều kiện if, else)
    - Cú pháp : if ( BIỂU THỨC ĐIỀU KIỆN) < CÂU LỆNH ĐIỀU KIỆN ĐÚNG > else < CÂU LỆNH ĐIỀU KIỆN SAI > */
    int tuoi = 18;
    if (tuoi >= 18)
        System.out.println(" đã đủ tuổi đi tù");
    else System.out.println(" chưa đủ tuổi đi tù");
    int tuoi1 = 17;
    if (tuoi1 >= 18) System.out.println("đã đủ tuổi đi tù");
    else System.out.println("chưa đủ tuổi đi tù");
    /* Vòng lập trong java
    - Vòng lập While : có 2 dạng là while và do while
    - Vòng lập For
     */
    /* vòng lập while và do while */
    int x = 0;
    while (x<5)
    {
        System.out.println(x);
        x += 1;
    }
    int y = 6;
    do {
        System.out.println(y);
        y += 1;
    }
    while (y<5);
    /* Vòng lập For trong java
    - Cú pháp : for(<KHỞI TẠO BIẾN CHAY>;<BIỂU THỨC ĐIỀU KIỆN>;<THAY ĐỔI BIẾN CHẠY>)
    { < KHỐI LỆNH LẶP LẠI>}
    - Trình tự thực hiện :
    + B1: Khởi tạo biến chạy.
    + B2: Kiểm tra điều kiện.
    + B3: Thực hiện khối lệnh.
    + B4: Thay đổi biến chạy.
    + B5: Quay lại B2 và B3 đến khi không thõa điều kiện.
     */
    for(int v=1;v<10;v+=2)
    {
        System.out.println(v);
    }
    /* Mảng trong Java
    - Cú pháp khai báo                          : <KIỂU DỮ LIỆU> [] <TÊN MẢNG>;
    - Cú pháp cấp phát bộ nhớ để tạo mảng       : <TÊN MẢNG> = new <KIỂU DỮ LIỆU> [KÍCH CỠ MẢNG]
    - Cú pháp kết hợp rút gọn                   : <KIỂU DỮ LIỆU> [] <TÊN MẢNG> = new <KIỂU DỮ LIỆU> [KÍCH CỠ MẢNG]
    */
    int[] ARRAY = new int[10];
    int l = 10;
    for(int z = 0; z<l;z++)
    {
        System.out.println(ARRAY[z]);
        ARRAY[z] = 2;
    }
    char[] BRAY = {'n','h','t'} ;
        System.out.println(BRAY);
    int[] CRAY = {1,2,3,4};
        System.out.println(CRAY);
    /* Vòng lặp Foreach trong java
    - Cú pháp For(<KIỂU DỮ KIỆU> <TÊN BIẾN> : <TÊN MẢNG>{ <KHỐI LỆNH LẶP LẠI>}
     */
    int[] mang = {1,2,3,4,5,6};
            for (int f : mang){
                System.out.println(f);
            }
    String[] name1 = {"Thiện, Hoàng, thiên Sinh, Sinh Thiên,besst"};
            for (String x1 : name1){
                System.out.println(x1);
            }
    /* Java hướng đối tượng OOP
    - Thay vì việc làm tất cả trong hàm main và khai báo các biến 1 cách rời rạc thì bây giờ chúng ta sẽ khai báo một dối
    tượng có các thuộc tính và phương thức.
    - Ví dụ :
    public class Nguoi(){
        String ten;
        int tuoi;
        float chieucao;
        String diachi;
    }
     */

    }
}



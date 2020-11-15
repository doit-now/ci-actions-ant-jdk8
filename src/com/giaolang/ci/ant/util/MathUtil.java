package com.giaolang.ci.ant.util;

/**
 *
 * @author giao-lang | fb/giao.lang.bis version 20.1115
 */
public class MathUtil {
    
    //Class này chứa các hàm tiện ích dùng chung cho mọi nơi - ta chơi static
    //Fake class Math của JDK   
    public static final double PI = 3.1415;
    
    //Hàm tính n giai thừa với n >= 0 && n <= 20
    //Nếu n quá 20 sẽ tràn kiểu long; và nhớ là không có giai thừa của số âm  
    //Quy ước: 0! = 1! = 1 ; n! = 1.2.3...n
    public static long getFactorial(int n) {
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("n must be between 0..20");
            //Đưa đầu vào cà chớn, mình hok thèm cho hàm trả về 1 giá trị 
            //ám chỉ đầu vào sai rồi hok thể tính được, mà mình chửi luôn
        
        if (n == 0 || n == 1)
            return 1; //0! = 1! = 1
        
        //Sống sót đến đây, thì đã có n > 1 và n <= 20 rồi,  xài else trừ điểm
        long result = 1;        
        for (int i = 2; i <= n; i++)
            result *= i; 
        
        return result;    
    }   //Phần nâng cao sẽ dùng đệ quy để hiện thực hóa quy trình Regression Test
}

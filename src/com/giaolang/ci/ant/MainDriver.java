package com.giaolang.ci.ant;

import static com.giaolang.ci.ant.util.MathUtil.*; //mới à nhen, chỉ chơi với static

/**
 *
 * @author giao-lang | fb/giao.lang.bis version 20.1115
 */
public class MainDriver {

    public static void main(String[] args) {
        
        //Căn bản: Test bằng mắt từng trường hợp sử dụng hàm (test cases)
        //để biết hàm chạy đúng sai
        
        //Nâng cao: Xem phần JUnit ở package [Test Packages] của cùng dự án
        //để hiểu kĩ thuật TDD và CI đảm bảo chất lượng code thế nào ...
        //Ta chỉ nhìn duy nhất 1 màu XANH - ĐỎ để kết luận hàm đúng sai
        //bất chấp bao nhiêu tình huống sử dụng hàm
        //XANH: tất cả các test cases phải cùng XANH, hàm ý hàm pass hết test cases
        //ĐỎ  : chỉ một test case sai là ĐỎ liền, 
        //      coi như hàm toang vì không pass hết test cases 
        
        //DÙNG MẮT LUẬN ANH HÙNG - LUẬN KẾT QUẢ TÍNH TOÁN ĐÚNG SAI CỦA HÀM
        long expected = 120;
        long actual = getFactorial(5);
        System.out.println("5! ? expected: " + expected + " | actual: " + actual);
        
        //0! ? expected: 1 | actual: <chạy thử rồi nhìn bằng mắt kết quả trả về
        //                            của hàm để kết luận>
        System.out.println("0! ? (expected: 1), actual: " + getFactorial(0));
       
        //-5! ? expected: ngoại lệ IllegalArgumentException được ném ra
        System.out.println("Check if the IllegalArgumentException is thrown");
        getFactorial(-5); //nếu ném ra ngoại lệ, thì hàm ko có giá trị trả về, chẳng thể in 
    
    }
    
}

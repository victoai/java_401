package day14.ioEx;
import java.io.*;

public class Test2 {
    public static void main(String[] args) {
        try {
            PrintWriter writer = new PrintWriter("res/numbers.txt");
            
            // 여러 숫자들을 파일에 씁니다.
            int[] numbers = { 10, 20, 30, 40, 50 };
            for (int number : numbers) {
                writer.println(number);
            }
            
            writer.close(); // 파일 쓰기 종료
            
            System.out.println("숫자들을 파일에 성공적으로 썼습니다.");
        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다: " + e.getMessage());
        }
    }
}

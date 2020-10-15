package introduction.simulation;

import java.util.Scanner;

/**
 * B1011：A + B 和 C
 * 题目描述：
 * 给定区间[-2^31, 2^31]内的三个正整数A、B和C，请判断 A + B 是否大于 C
 * 输入格式：
 * 第一行给出正整数T（T <= 10），即测试用例的个数。随后给出T组测试用例，每组
 * 占一行，顺序给出A、B和C。整数间以空格分隔。
 * 输出格式：
 * 对每组测试用例，如果A + B > C，在一行中输出“Case #X: true”；否则给出
 * “Case #X: false”，其中X是测试用例的编号（从1开始）。
 * 输入样例：
 * 4
 * 1 2 3
 * 2 3 4
 * 2147483647 0 2147483646
 * 0 -2147483648 -2147483647
 * 输出样例：
 * Case #1: false
 * Case #2: true
 * Case #3: true
 * Case #4: false
 */
public class B1011 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.wSolution(3);
    }

}
// this class is used to test case
class Solution {

    // write by QuakeWang
    /**
     * @param T 表示需要判断的次数
     */
    public void wSolution(int T) {
        System.out.println("please input three number：");
        Scanner scanner = new Scanner(System.in);
        long a = 0;
        long b = 0;
        long c = 0;
        int tCase = 1;
        while (T != 0) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();
            if (a + b > c) {
                System.out.printf("Case #%d: true", tCase++);
                System.out.println();
            } else {
                System.out.printf("Case #%d: false", tCase++);
                System.out.println();
            }
            T--;
        }
    }

}

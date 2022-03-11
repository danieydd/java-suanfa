package com.suanfa.demo.temp.leetcode.leetcodebook.primary.string;

/**
 * @ClassName Test09
 * @Description 字符串转换整数 (atoi)
 * 请你来实现一个 myAtoi(string s) 函数，使其能将字符串转换成一个 32 位有符号整数（类似 C/C++ 中的 atoi 函数）。
 * <p>
 * 函数 myAtoi(string s) 的算法如下：
 * <p>
 * 读入字符串并丢弃无用的前导空格
 * 检查下一个字符（假设还未到字符末尾）为正还是负号，读取该字符（如果有）。 确定最终结果是负数还是正数。 如果两者都不存在，则假定结果为正。
 * 读入下一个字符，直到到达下一个非数字字符或到达输入的结尾。字符串的其余部分将被忽略。
 * 将前面步骤读入的这些数字转换为整数（即，"123" -> 123， "0032" -> 32）。如果没有读入数字，则整数为 0 。必要时更改符号（从步骤 2 开始）。
 * 如果整数数超过 32 位有符号整数范围 [−231,  231 − 1] ，需要截断这个整数，使其保持在这个范围内。具体来说，小于 −231 的整数应该被固定为 −231 ，大于 231 − 1 的整数应该被固定为 231 − 1 。
 * 返回整数作为最终结果。
 * 注意：
 * <p>
 * 本题中的空白字符只包括空格字符 ' ' 。
 * 除前导空格或数字后的其余字符串外，请勿忽略 任何其他字符。
 * 输入：s = "42"
 * 输出：42
 * 解释：加粗的字符串为已经读入的字符，插入符号是当前读取的字符。
 * 第 1 步："42"（当前没有读入字符，因为没有前导空格）
 * ^
 * 第 2 步："42"（当前没有读入字符，因为这里不存在 '-' 或者 '+'）
 * ^
 * 第 3 步："42"（读入 "42"）
 * ^
 * 解析得到整数 42 。
 * 由于 "42" 在范围 [-231, 231 - 1] 内，最终结果为 42 。
 * 0 <= s.length <= 200
 * s 由英文字母（大写和小写）、数字（0-9）、' '、'+'、'-' 和 '.' 组成
 * tips:
 * 这道题就算了吧
 * @Author danie
 * @Date 2022-03-11 10:57
 */
public class Test09 {
    public static int myAtoi(String s) {
        s = s.trim();
        int count = 0, isEnd = 0, isSymbol = 0; //isEnd表示还没找到第一个数字
        char[] ch = s.toCharArray();
        for(int i = 0; i < s.length(); i++){
            if(isSymbol == 1 && (ch[i] == '-' || ch[i] == '+')){
                break;
            }
            if((ch[i] < '0' || ch[i] > '9') &&(ch[i] != '-' && ch[i] != '+')){
                break;
            }
            if(ch[i] >= '0' && ch[i] <= '9'){
                count++;
                isEnd = 1;
            }
            if(ch[i] == '+' && isEnd == 0){
                isEnd = 1;
                isSymbol = 1;
            }
            if(ch[i] == '-' && isEnd == 0){
                isEnd = 1;
                isSymbol = 1;
                count++;
            }else if(ch[i] == '-' && isEnd == 1){
                break;
            }
            if((ch[i] < '0' || ch[i] > '9') && ch[i] != '-' && ch[i] != '+' && isEnd == 1){
                break;
            }
        }
        if(count == 0){
            return 0;
        }
        char[] result = new char[count];
        int sum = 0;
        for(int i = 0; i < s.length() && sum < count; i++){
            if(ch[i] == '-' || (ch[i] >= '0' && ch[i] <= '9')){
                result[sum]= ch[i];
                sum++;
            }
        }
        long sum1 = 0;
        if(result[0] == '-'){
            for(int i = 1; i < count; i++){
                result[i] -= 48;
                sum1 = sum1 * 10 + (result[i]);
                if((0 - sum1) <= Integer.MIN_VALUE){
                    return Integer.MIN_VALUE;
                }
            }
            sum1 = 0 - sum1;
        }else{
            for(int i = 0; i < count; i++){
                result[i] -= 48;
                sum1 = sum1 * 10 +result[i];
                if(sum1 >= Integer.MAX_VALUE){
                    return Integer.MAX_VALUE;
                }
            }
        }
        return (int)sum1;

    }

    public static void main(String[] args) {
        int num = myAtoi("1.2344");
        System.out.println("num=" + num);

    }
}

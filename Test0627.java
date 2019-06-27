/*题目描述
给定一个递增序列，a1 <a2 <...<an 。定义这个序列的最大间隔为d=max{ai+1 - ai }(1≤i<n),
现在要从a2 ,a3 ..an-1 中删除一个元素。问剩余序列的最大间隔最小是多少？
输入描述:
第一行，一个正整数n(1<=n<=100),序列长度;接下来n个小于1000的正整数，表示一个递增序列。
输出描述:
输出答案。
示例1
输入
5
1 2 3 7 8
输出
4
*/
package lianxi0627;

import java.util.*;

public class Test0627{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            int[] nums = new int[n];
            for(int i = 0;i<n;i++){
                nums[i] = in.nextInt();
            }
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for(int i = 1; i<n;i++){
                int a = nums[i] -nums[i-1];
                max = Math.max(a,max);
            }
            for(int i = 1;i<n-1;i++){
                int a = nums[i+1] -nums[i-1];
                min = Math.min(min,Math.max(a,max));
            }
            System.out.println(min);
        }

    }
}

/*
import java.util.*;

public class Test0627{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            int[] nums = new int[n];
            for(int i = 0;i<n;i++){
                nums[i] = in.nextInt();
            }
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for(int i = 1; i<n;i++){
                int a = nums[i] -nums[i-1];
                max = a > max ? a : max;
            }
            for(int i = 1;i<n-1;i++){
                int a = nums[i+1] -nums[i-1];
                int b = a>max?a:max;
                min = b < min ? b:min;
            }
            System.out.println(min);
        }

    }
}*/

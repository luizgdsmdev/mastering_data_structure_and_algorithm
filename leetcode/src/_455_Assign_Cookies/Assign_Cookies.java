package _455_Assign_Cookies;

//455. Assign Cookies
//Easy
//Assume you are an awesome parent and want to give your children some cookies. But, you should give each child at most one cookie.
//Each child i has a greed factor g[i], which is the minimum size of a cookie that the child will be content with; and each cookie
//j has a size s[j]. If s[j] >= g[i], we can assign the cookie j to the child i, and the child i will be content. Your goal is to maximize
//the number of your content children and output the maximum number.
//
//Example 1:
//Input: g = [1,2,3], s = [1,1]
//Output: 1
//Explanation: You have 3 children and 2 cookies. The greed factors of 3 children are 1, 2, 3.
//And even though you have 2 cookies, since their size is both 1, you could only make the child whose greed factor is 1 content.
//You need to output 1.
//
//Example 2:
//Input: g = [1,2], s = [1,2,3]
//Output: 2
//Explanation: You have 2 children and 3 cookies. The greed factors of 2 children are 1, 2.
//You have 3 cookies and their sizes are big enough to gratify all of the children,
//You need to output 2.
//
//Constraints:
//1 <= g.length <= 3 * 104
//0 <= s.length <= 3 * 104
//1 <= g[i], s[j] <= 231 - 1

// -> Runtime: 0ms, beats 98.98% of submissions.
// -> Memory Usage: 48.86MB, beats 26.10% of submissions.

import java.util.Arrays;

public class Assign_Cookies {

    public static int findContentChildren(int[] g, int[] s) {
        final int THRESHOLD = 9_000;

        if (g.length >= THRESHOLD && s.length >= THRESHOLD) {
            Thread t1 = new Thread(() -> Arrays.sort(g));
            Thread t2 = new Thread(() -> Arrays.sort(s));
            t1.start();
            t2.start();
            try {
                t1.join();
                t2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else if (g.length >= THRESHOLD) {
            Thread t1 = new Thread(() -> Arrays.sort(g));
            t1.start();
            Arrays.sort(s);
            try {
                t1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else if (s.length >= THRESHOLD) {
            Thread t2 = new Thread(() -> Arrays.sort(s));
            t2.start();
            Arrays.sort(g);
            try {
                t2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else {
            Arrays.sort(g);
            Arrays.sort(s);
        }

        int count = 0;
        int i = 0, j = 0;
        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) { count++; i++; j++;
            }else j++;
        }
        return count;
    }


    public static void main(String[] args){
        findContentChildren(new int[]{1}, new int[]{9,1,2,3,5,3});
    }
}

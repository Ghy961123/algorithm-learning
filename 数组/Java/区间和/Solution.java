import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] vec = new int[n];
        int[] p = new int[n];
        
        int presum = 0;
        for(int i = 0;i<n;i++)
        {
            vec[i] = scanner.nextInt();
            presum+=vec[i];
            p[i] = presum;
        }

        while(scanner.hasNextInt())
        {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            
            int sum;
            if(a == 0)
            {
                sum = p[b];
            }
            else{
                sum = p[b] - p[a-1];
            }
            System.out.println(sum);
        }
        scanner.close();
    }
}

// 前缀和之差。如果只做一次查询，和直接遍历没有区别，但是如果查询为n次，直接遍历的时间复杂度为O(n^2),前缀和之差方法仅为O(n).

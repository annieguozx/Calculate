package com.edu.niit.calculate;

/**
 * Created by annie on 2017/3/14.
 */
public class MaxSubArray {
    int maxSum;
    int left;
    int right;

    public int getMaxSubArray1(int[] arr){
        maxSum=-2147483648;
        int sum;
        int len = arr.length;
        for(int i=0;i<len;i++){
            sum=0;
            for(int j=i;j<len;j++){
                sum+=arr[j];
                if(sum>maxSum){
                    maxSum=sum;
                    left=i;
                    right=j;
                }
            }
        }
        System.out.print("MaxSubAray1 Sum is "+maxSum+"!");
        System.out.print("left is "+left+",right is "+right);
        return maxSum;
    }

    public int getMaxSubArray2(int[] arr){
        int cursum=arr[0];
        maxSum=arr[0];
        int len = arr.length;
        int pos=0;
        pos=0;
        for(int i=1;i<len;i++){
            cursum+=arr[i];
            if(cursum<arr[i])
            {
                pos=i;
                cursum=arr[i];
            }
            if(cursum>maxSum)
            {
                maxSum=cursum;
                left=pos;
                right=i;
                }
            }
        System.out.print("MaxSubAray2 Sum is "+maxSum+"!");
        System.out.print("left is "+left+",right is "+right);
        return maxSum;
    }


}

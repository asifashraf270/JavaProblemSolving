package com.androiddevelopoer.Arrays;

public class Arrays {
    private int[][] array={{1,2,3},{4,5,6},{7,8,9}};
    public void display2DArrayData()
    {
        for (int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                System.out.println(array[i][j]+".....record");
            }
        }
    }

    public void sum(int[] arr)
    {
        int sum=0;
        for (int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        System.out.println("Sum is:"+sum);
    }
    public int[] returnArray()
    {
        return new int[]{1,2,3};
    }

}

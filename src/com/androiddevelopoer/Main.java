package com.androiddevelopoer;

import com.androiddevelopoer.Arrays.*;

public class Main {
    private static final String TAG = "Main";

    public static void main(String[] args) {
      int [] arr={1,3,5,7,9};
      int n=arr.length;
      int k=2;
      PrintLeftRotation rotation=new PrintLeftRotation();
      rotation.leftRotate(arr,n,k);
      k=3;
      rotation.leftRotate(arr,n,k);
      k=4;
      rotation.leftRotate(arr,n,k);

     }


}

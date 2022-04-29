package com.androiddevelopoer;

import com.androiddevelopoer.Arrays.*;

public class Main {
    private static final String TAG = "Main";

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int rotations = 2;
        int[][] ranges = {{0, 2}, {0, 3}};
        int index = 1;
        FindElementAfterRotation rotation = new FindElementAfterRotation();
        System.out.println(rotation.findElement(arr, ranges, rotations, index));


    }
}

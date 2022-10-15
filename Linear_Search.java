/*A given array numbers= {2,4,6,8,10,12,14,16}, we have to find index position of 10 in this given array*/

import java.util.*;
public class Main
{
    public static int linear_Search(int numbers[], int key) {
        for(int i=0;i<9;i++) {
            if (numbers[i]==key) {
                return i;
            }
        }
        return -1;
    }
	public static void main(String[] args) {
	int numbers[]={2,4,6,8,10,12,14,16};
	int key=10;
	int index=linear_Search(numbers,key);
	if(index==-1) {
	    System.out.println("not found");
	}
	else
		System.out.println(index);
	}
}

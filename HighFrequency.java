package java_examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HighFrequency {

	public static void main(String[] args) {
		int[] A= {1, 4, 1, 7, 1, 7, 1, 1};
        System.out.println(solvez(A));
	}
	public static int solvez(int[] nums) {
        List<Integer> l= new ArrayList<>();
        int count=0;
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
             if(nums[i]==nums[j]){
               count= count+1;
            }
             l.add(count);
            }
            count=0;
        }
        Collections.sort(l);  
        System.out.println(l);
       int element=l.get(l.size()-1);  
       return element;  
    }
}

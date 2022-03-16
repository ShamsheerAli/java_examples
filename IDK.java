package java_examples;

import java.util.*;
public class IDK {
      static void build_tree(int[] b, int [] seg_tree,
                int l, int r, int vertex)
      {
    
    
      if (l == r) {
          seg_tree[vertex] = b[l];
          return;
      }
    
    
    int mid = (l + r) / 2;
    
    
    build_tree(b, seg_tree, l, mid,
               2 * vertex);
    build_tree(b, seg_tree, mid + 1,
               r, 2 * vertex + 1);
    
    
    seg_tree[vertex] = __gcd(seg_tree[2 * vertex],
                             seg_tree[2 * vertex + 1]);
    }
    static int __gcd(int a, int b) 
    { 
    return b == 0? a:__gcd(b, a % b);    
    }
    
    
    static int range_gcd(int [] seg_tree, int v,
              int tl, int tr,
              int l, int r)
    {
  
    if (l > r)
        return 0;
    if (l == tl && r == tr)
        return seg_tree[v];
    
  
    int tm = (tl + tr) / 2;
    
    
    return __gcd(
        range_gcd(seg_tree, 2 * v, tl,
                  tm, l, Math.min(tm, r)),
    
        range_gcd(seg_tree, 2 * v + 1,
                  tm + 1, tr,
                  Math.max(tm + 1, l), r));
    }
    
    
    static void maxSubarrayLen(int arr[], int n)
    {
    
    int []seg_tree = new int[4 * (n) + 1];
    
    
    build_tree(arr, seg_tree, 0, n - 1, 1);
    
    
    int maxLen = 0;
    
    
    int l = 0, r = 0;
    
    while (r < n && l < n) {
    
        
        if (range_gcd(seg_tree, 1, 0,
                      n - 1, l, r)
            == 1) {
            l++;
        }
    
       
        maxLen = Math.max(maxLen, r - l + 1);
        r++;
    } 
    System.out.print(maxLen);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) {
          arr[i]=sc.nextInt();
        }
        int N = arr.length;
        maxSubarrayLen(arr, N);
    }
}
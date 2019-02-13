class Solution {
    public int trap(int[] height) {
        int n = height.length;
        if(n<2)
            return 0;
        int [] left = new int [n];
        int [] right = new int [n];
       left[0]=0;
        for(int i=1;i<n;i++)
        {
            left[i]=Math.max(height[i-1],left[i-1]);
        }
         right[n-1]=0;
        for(int i=n-2;i>-1;i--)
        {
            right[i]=Math.max(height[i+1],left[i+1]);
        }
        int a=0;
        for(int i=0;i<n;i++)
            a+=Math.min(left[i],right[i]);
            return a;
    }
}

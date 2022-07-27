package datastructure;

public class Solution {
    public static void main(String[] args) {
       int []nums1= {20,40,20,70,30};
       int []nums2={50,20,50,40,20};
        int n=nums1.length;

        //初始化
        int maxsum=nums2[0]-nums1[0];
        int l=0;
        int r=0;
        while(r<n){
            if(l==r){
                r++;
                if(r<n)
                maxsum=Math.max(maxsum,maxsum+nums2[r]-nums1[r]);
            }
            else if(r+1<n&&nums2[r+1]>nums1[r+1]){
                r++;
                maxsum=Math.max(maxsum,maxsum+nums2[r]-nums1[r]);
            }
            else {
                l++;
                if(l<n)
                maxsum=Math.max(maxsum,maxsum-nums2[l-1]+nums1[l-1]);
            }
        }
        int maxsum2=nums1[0]-nums2[0];
        l=0;
        r=0;
        while (l<n){
            if(l==r){
                r++;
                if(r<n)
                    maxsum2=Math.max(maxsum2,maxsum2+nums1[r]-nums2[r]);
            }
            else if(r+1<n&&nums1[r+1]>nums2[r+1]){
                r++;
                maxsum2=Math.max(maxsum2,maxsum2+nums2[r]-nums1[r]);
            }
            else {
                l++;
                if(l<n)
                    maxsum2=Math.max(maxsum2,maxsum2-nums1[l-1]+nums2[l-1]);
            }
        }
        System.out.println(maxsum);
        System.out.println(maxsum2);
    }
}
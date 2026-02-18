class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int a=nums1.length;
        int b=nums2.length;
        //size of nums1 is greater
        int[] hash=new int[1001];
        if(a>=b){
            for(int i=0;i<b;i++){
                hash[nums2[i]]++;
            }
            ArrayList<Integer> list=new ArrayList<>();
            for(int i=0;i<a;i++){
                if(hash[nums1[i]]==0) continue;
                else {
                    hash[nums1[i]]--;
                    list.add(nums1[i]);
                }
            }
            return list.stream().mapToInt(i->i).toArray();

        }
        for(int i=0;i<a;i++){
            hash[nums1[i]]++;
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<b;i++){
            if(hash[nums2[i]]==0) continue;
            else {
                hash[nums2[i]]--;
                list.add(nums2[i]);
            }
        }
        return list.stream().mapToInt(i->i).toArray();

    }
}
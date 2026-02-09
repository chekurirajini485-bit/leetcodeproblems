class Solution {
    List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int idx=0;
        pri(k,n,arr,new ArrayList<>(),idx);
        return list;
    }
    public void pri(int k,int n,int arr[],List<Integer> curr,int idx)
    {
        if(idx>arr.length-1 ||k==0||n<=0)
        {
            if(k==0 && n==0)
            {
                list.add(new ArrayList<>(curr));
                return ;
            }
            else
            return;
        }
        curr.add(arr[idx]);
        pri(k-1,n-arr[idx],arr,curr,idx+1);
        curr.remove(curr.size()-1);
        pri(k,n,arr,curr,idx+1);
        

    }
}
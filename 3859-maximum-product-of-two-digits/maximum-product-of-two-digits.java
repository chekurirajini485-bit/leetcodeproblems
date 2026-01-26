class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> store =new ArrayList<>();
        while(n!=0)
        {
            store.add(n%10);
            n=n/10;
        }
        Collections.sort(store);
        int last=store.get(store.size()-1);
        int secondlast =store.get(store.size()-2);
        return last*secondlast;
    }
}
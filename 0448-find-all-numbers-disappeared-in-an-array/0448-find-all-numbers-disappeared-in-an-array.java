class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        HashSet<Integer> hashSet = new HashSet<>();


        for (int x: nums
             ) {
            hashSet.add(x);
        }


        for(int i = 1 ;i<=nums.length;i++){
            if(!hashSet.contains(i)){
                arrayList.add(i);
            }
            
        }

        return arrayList;
    }
}
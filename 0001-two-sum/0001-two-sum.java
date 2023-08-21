class Solution {
    public int[] twoSum(int[] nums, int target) {

         int[] dizi  = new int[2];
        int index1=0;
        int index2=0;

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int value : nums) {
            arrayList.add(value);
        }

        for(int i = 0 ; i<arrayList.size();i++){




            int result = target-arrayList.get(i);

            if(arrayList.contains(result)){

                index1=i;
                index2 = arrayList.indexOf(result);

                if(index1 !=index2){
                   
                    break;
                }
            }


        }

        dizi[0]=index1;
        dizi[1]=index2;



        return dizi;
        
    }
}
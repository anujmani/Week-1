public class Duplicate {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 4, 3, 4};
        Duplicate s = new Duplicate();
        System.out.println(s.getSingNum(nums));
    }



    public int getSingNum(int[] arr2) {
        int temp = -1;
        for (int i = 0; i < arr2.length; i++) {
            Integer num = arr2[i];
            temp = -1;
            for (int j = 0; j < arr2.length; j++) {
                if (i == j) {
                    continue;
                }
                if (num.equals(arr2[j])) {
                    temp = -1;
                    break;
                } else {
                    temp = arr2[i];
                }
            }
            if (temp != -1) {
                break;
            }
        }
        return temp;
    }
}

//    public int getSingNum(int[] nums) {
//        int e = 0;
//        int[]arr=new int[nums.length];
//        boolean n = true;
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums.length; j++) {
//                if (i != j) {
//                    if (nums[i] == nums[j]) {
//                        n = false;
//                        System.out.println(nums[i]);
//                        arr[i]=nums[i];
//                        break;
//
//                    }
//                }
//            }
//            }
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums.length; j++) {
//                if (i != j) {
//                    if (arr[i] != nums[j]) {
//                       e=arr[i];
//
//                    }
//                }
//            }
//        }
//
//
//        return e;
//    }


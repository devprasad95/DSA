class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        int i = num.length -1;
        int carry = 0;
        while(i>=0 || k> 0 || carry > 0){
            carry +=(i<0 ? 0 : num[i]) + k % 10;
            list.addFirst(carry % 10);
            carry /= 10;
            k /=10;
            i--;
        }
        return list;
    }
}

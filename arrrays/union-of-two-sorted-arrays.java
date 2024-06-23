//brute force
class Solution
{
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        HashSet<Integer> set = new HashSet<Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < n; i++){
            set.add(arr1[i]);
        }
        for(int i = 0; i < m; i++){
            set.add(arr2[i]);
        }
        list.addAll(set);
        Collections.sort(list);
        return list;
    }
}

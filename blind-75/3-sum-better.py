class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        n = len(nums)
        st = set()
        for i in range(n):
            hashSet = set()
            for j in range(i + 1, n):
                third = -(nums[i] + nums[j])
                if third in hashSet:
                    temp = [nums[i],nums[j],third]
                    temp.sort()
                    st.add(tuple(temp))
                hashSet.add(nums[j])
        ans = [list(tpl) for tpl in st]
        return ans
        

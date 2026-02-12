class Solution:
    def findMaxAverage(self, nums: List[int], k: int) -> float:
        k_sum = sum(nums[:k])
        w_sum = k_sum
        for i in range(k,len(nums)):
            k_sum += nums[i]
            k_sum -= nums[i-k]
            w_sum = max(w_sum,k_sum)
        return w_sum/k 
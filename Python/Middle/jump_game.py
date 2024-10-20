class Solution(object):
    def canJump(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        max_next = 0
        n = len(nums)
        
        for index in range(n):
            if index > max_next:
                return False
            else:
                max_next = max(max_next, index + nums[index])
                if max_next >= n - 1:
                    return True
                
        return False
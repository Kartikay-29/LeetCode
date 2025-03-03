class Solution(object):
    def mergeArrays(self, nums1, nums2):
        nums1.extend(nums2)
        nums1.sort()
        result=[]
        for id,val in nums1:
            if result and result[-1][0]==id:
                result[-1][1] +=val
            else:
                result.append([id,val])
        return result
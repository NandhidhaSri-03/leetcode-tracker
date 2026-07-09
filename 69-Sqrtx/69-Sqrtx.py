# Last updated: 7/9/2026, 9:48:34 AM
class Solution(object):
    def mySqrt(self, x):
        if x < 2:
            return x
        
        i = 2
        while i * i <= x:
            i += 1
        
        return i - 1
        
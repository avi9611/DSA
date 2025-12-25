class Solution:
    def countDigits(self, num: int) -> int:
        x = num
        cnt = 0
        while num > 0:
            d = num % 10
            if x % d == 0:
                cnt += 1
            num //= 10
        return cnt
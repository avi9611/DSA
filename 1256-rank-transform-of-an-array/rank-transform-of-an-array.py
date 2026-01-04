class Solution:
    def arrayRankTransform(self, arr: List[int]) -> List[int]:
        n = len(arr)
        if n == 0:
            return []

        def merge_sort(a):
            if len(a) <= 1:
                return a

            mid = len(a) // 2
            left = merge_sort(a[:mid])
            right = merge_sort(a[mid:])

            return merge(left, right)

        def merge(left, right):
            i = j = 0
            res = []

            while i < len(left) and j < len(right):
                if left[i] <= right[j]:
                    res.append(left[i])
                    i += 1
                else:
                    res.append(right[j])
                    j += 1

            while i < len(left):
                res.append(left[i])
                i += 1

            while j < len(right):
                res.append(right[j])
                j += 1

            return res
        sort_arr = [0] * n
        for i in range(n):
            sort_arr[i] = arr[i]
        sort_arr = merge_sort(sort_arr)
        rank_map = {}
        rank = 1
        for i in range(n):
            if sort_arr[i] not in rank_map:
                rank_map[sort_arr[i]] = rank
                rank += 1
        res = [0] * n
        for i in range(n):
            res[i] = rank_map[arr[i]]

        return res

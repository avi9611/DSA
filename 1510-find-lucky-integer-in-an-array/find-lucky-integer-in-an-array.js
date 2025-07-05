/**
 * @param {number[]} arr
 * @return {number}
 */
var findLucky = function(arr) {
    const freq = {};

    for(let num of arr){
        freq[num] = (freq[num] || 0) + 1;
    }

    let res = -1;
    for(let num in freq){
        const n = parseInt(num);
        if(freq[n] == n){
            res = Math.max(res, n);
        }
    }
    return res;
};
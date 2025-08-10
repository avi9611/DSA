/**
 * @param {Array} arr
 * @param {number} depth
 * @return {Array}
 */
var flat = function (arr, n) {
    if (n === 0) return arr; 

    const flatten = [];
    arr.forEach(item => {
        if (Array.isArray(item)) {
            flatten.push(...flat(item, n - 1));
        } else {
            flatten.push(item);
        }
    });

    return flatten;
};



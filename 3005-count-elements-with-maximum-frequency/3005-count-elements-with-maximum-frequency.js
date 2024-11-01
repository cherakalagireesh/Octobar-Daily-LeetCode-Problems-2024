/**
 * @param {number[]} nums
 * @return {number}
 */
var maxFrequencyElements = function(nums) {

    let a = new Array(101).fill(0);
    let maxFreq = 0;
    let len = nums.length;
    let result = 0;

    for(let i = 0 ; i < len ; i++)
    {
        a[nums[i]]++;
        maxFreq = Math.max(maxFreq, a[nums[i]]);
    }

    for(let i = 0 ; i < a.length ; i++)
    {
        if(a[i] == maxFreq)
            result += a[i];
    }

    return result;
};
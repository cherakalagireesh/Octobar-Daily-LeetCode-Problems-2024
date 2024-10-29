/**
 * @param {number} n
 * @return {number}
 */
var fib = function(n) {
    
    if(n <= 1)
        return n;
    
    let last = 1;
    let secondLast = 0;

    for(let i = 2 ; i <= n ; i++)
    {
        let temp = last;
        last = last + secondLast;
        secondLast = temp;
    }

    return last;
};
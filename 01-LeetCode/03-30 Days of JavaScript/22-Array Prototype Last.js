//https://leetcode.com/problems/array-prototype-last/?envType=study-plan-v2&envId=30-days-of-javascript
/**
 * @return {null|boolean|number|string|Array|Object}
 */
Array.prototype.last = function() {
    // this keyword refers to Array.prototype
    if(this.length==0){
        return -1;
    }
    return this[this.length-1];
};

/**
 * const arr = [1, 2, 3];
 * arr.last(); // 3
 */
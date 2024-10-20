// https://leetcode.com/problems/is-object-empty/description/?envType=study-plan-v2&envId=30-days-of-javascript

/**
 * @param {Object|Array} obj
 * @return {boolean}
 */
var isEmpty = function(obj) {
    if(Object.keys(obj).length==0){
        return true;
    }else{
        return false;
    }
};

// Takeaway: remember arrays also are objects in JavaScript 

// Question:
// Given an object or an array, return if it is empty.

//     An empty object contains no key-value pairs.
//     An empty array contains no elements.

// Assume the object or array is the output of JSON.parse.
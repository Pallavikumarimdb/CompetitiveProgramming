/**
 * @param {Array} arr
 * @param {number} size
 * @return {Array}
 */
var chunk = function(arr, size) {
    const retArr=[]

    let i=0;
    let j=size;

    while(i<arr.length){
    // slice array by index value and make a new array
        const sli=arr.slice(i,j);
        // push the sliced array into returning array.
        retArr.push(sli);
//        increase the i and j by size to next slice
        i+=size;
        j+=size
    }
    return retArr;
};

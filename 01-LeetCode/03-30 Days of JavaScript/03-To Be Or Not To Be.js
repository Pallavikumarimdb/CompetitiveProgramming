
//https://leetcode.com/problems/to-be-or-not-to-be/?envType=study-plan-v2&envId=30-days-of-javascript

var expect = function(val) {
    return obj={
         toBe: (val1)=>{
            console.log(val1)
            if(val===val1){
                return true;
            }else{
            // To throw direct error without try catch use this syntax
                throw new Error("Not Equal")
            }
         },
        notToBe: (val2) => {
            if(val!==val2){
                return true;
            }else{
                throw new Error("Equal")
            }
        }
    }
};
// https://leetcode.com/problems/debounce/description/?envType=study-plan-v2&envId=30-days-of-javascript

/**
 * @param {Function} fn
 * @param {number} t milliseconds
 * @return {Function}
 */
var debounce = function(fn, t) {
    let myTimeout;
    return function(...args) {
        clearTimeout(myTimeout)
        myTimeout = setTimeout(()=>fn(...args), t);
    }
};

/**
 * const log = debounce(console.log, 100);
 * log('Hello'); // cancelled
 * log('Hello'); // cancelled
 * log('Hello'); // Logged at t=100ms
 */


// ----------------------EXPLAINATION--------------------------

// # Why to use Debouncing?

// Have you ever encountered a situation where a function gets called multiple times within a short amount of time, leading to performance issues or unexpected behavior? This is a common problem in JavaScript, especially when working with events like scrolling, resizing, or typing.

// Fortunately, there's a simple technique called "debouncing" that can help you control the frequency of function calls and avoid these issues.

// # What is Debouncing?

// Debouncing is a method that limits the rate at which a function gets called. It works by delaying the execution of a function until a certain amount of time has passed without any additional function calls. If another function call happens within this time frame, the timer resets and the function execution is delayed again.

// Debouncing is useful in situations where you want to prevent a function from being called too frequently, such as:

// Handling user input events like keypresses, mouse movements, or button clicks

// Handling expensive computations or network requests that don't need to be performed on every function call

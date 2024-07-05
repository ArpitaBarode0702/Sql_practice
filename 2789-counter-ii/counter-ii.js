/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function(init) {
    let pres=init;
    return{
        increment:()=>{
            return ++pres;
        },
        reset:()=>{
        return pres=init;
    },
        decrement:()=>{
            return --pres;
        },
    
    }
    return { increment, decrement, reset };
    
};

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */
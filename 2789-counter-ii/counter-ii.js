/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function(init) {
    let presentcount=init;


function increment(){
    return ++presentcount;
}
function decrement(){
    return --presentcount;
}
function reset()
{
    return (presentcount=init);
}
return{increment,decrement,reset}
};
/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */
/ you can write to stdout for debugging purposes, e.g.
// console.log('this is a debug message');

function solution(A) {
    
    // write your code in JavaScript (Node.js 8.9.4)
    let leftSum = A[0];
    let rightSum = A.slice(1,A.length).reduce((a,b) =>{return a+b});
    
    let min = Math.abs(rightSum-leftSum);
    for (i=1;i<A.length-1;i++){
        leftSum +=A[i];
        rightSum -=A[i];
        if (Math.abs(rightSum - leftSum) < min) {
            min = Math.abs(rightSum - leftSum);
        }
    }
    
    return min;
    
}
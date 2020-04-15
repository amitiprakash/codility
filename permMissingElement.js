function solution(A) {
    // write your code in JavaScript (Node.js 8.9.4)
    let sum = ((A.length+1)*(A.length+2))/2;
    for(let i=0;i<A.length;i++){
        sum -= A[i];
    }
    
    return sum;
}
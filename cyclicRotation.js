function solution(A, K) {
     const min = 0; 
     const max = 100;
     if (A.length >= min
          && A.length <= max
          && K === parseInt(K, 0)
          && K >= min && K <= max) {
          
          // Converting K
          K = (A.length - (K % A.length));
          // Returning the new array
          return [ ...A.slice(K), ...A.slice(0, K) ];
     }
     
     // Does not meet the requirements, return back the array
     return A; 
}
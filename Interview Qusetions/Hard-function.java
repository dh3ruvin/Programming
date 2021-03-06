/* The following program returns the number of mulitplicative pairs if the pair satiasfy the equation 
0 ≤ P < Q < N and C[P] * C[Q] ≥ C[P] + C[Q]. If the number of multiplicative pairs is greater than 1,000,000,000, 
the function returns 1,000,000,000.

I have used recurrsion to compute the indices pair so that i can compute the product and sum.

The worst case time complexity of the program is O(n) - Reccursive
The worst case space complexity of the program is a little greater than O(1),  because I have used an integer array with at most 2 elements 
in it. 

I have also added a timer to calculate the running time of my function, I have commented out the part that calculates the running time.
Inorder to see the running time just remove the comments from the timers in the main method.

*/

private static int count;   // To keep the count of indices pair which satisfy the equation

public static void createPairs(double[] c, int[] used, int startIndex, int usedCount){
    
    //  If the usedCount is equal to length of user array (2). Considering only two elements of the array.
    if(usedCount == used.length){
        
        // If the count is more than 1000000000
        if(count >= 1000000000){
            return;
        }
        
        // checking the condition 0 ≤ P < Q < N and C[P] * C[Q] ≥ C[P] + C[Q]. 
        if(used[0] >= 0 && used[1] > used[0] && used[1] < c.length){
            if( c[used[0]]*c[used[1]]  >= c[used[0]] + c[used[1]] ){
                count++;
                //System.out.println(Arrays.toString(used)); // To print out the pairs
            }
        }
        
    }else{
        for(int i = startIndex; i < c.length; i++){
            used[usedCount] = i;
            createPairs(c, used, i+1, usedCount+1);
            used[usedCount] = -1;
        }
    }
}

public int solution(int[] a, int[] b){
    
    
    int number_of_elements = a.length;
    
    // Array to store the sum of two arrays
    double c[] = new double[number_of_elements];
    
    // limiting No of elements to make group of
    int pairLength = 2;
    
    // An empty array of size to store two pair indices
    int used[] = new int[pairLength];       
    
    // Filling the array with -1 at the first place.
    Arrays.fill(used, -1);                  
    
    // Calculating the C array
    for(int i=0; i<number_of_elements; i++){
        c[i] =  a[i] + ( b[i] / (double) 1000000);
    }
    
    // Calling the reccursive function
    createPairs(c, used, 0, 0);
    
    return count;
}

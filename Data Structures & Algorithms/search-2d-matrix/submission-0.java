class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        if(m ==0){
            return false;
        }
        for(int i = 0; i<m; i++){
            if(target>= matrix[i][0] && target<= matrix[i][n-1]){
                int start = 0;
                int end = n-1;
                while(start<=end){
                    int mid = start+(end-start)/2;
                    if(target<matrix[i][mid]){
                        end = mid-1;
                    }
                    else if(target> matrix[i][mid]){
                        start = mid+1;
                    }
                    else{
                        return true;
                    }
                }
            }
        }
        return false;
    }

    
}

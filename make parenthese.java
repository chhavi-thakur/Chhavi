class Solution {
    public int minAddToMakeValid(String s) {
        int open =0;
        int close=0;
        for(char c:s.toCharArray()){
            if(c=='(') open+=1;

            else if(open>0) open-=1;
            
            else close+=1;

            

        }
        return open+close;
        
    }
}

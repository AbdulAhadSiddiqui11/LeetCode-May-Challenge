class Solution {
    public int findJudge(int N, int[][] trust) {
        int[] personsTrust = new int[N+1]; // How many other ppl trust this person?
        int[] othersTrust = new int[N+1];  // How many ppl this person trusts?
        
        for(int[] pair : trust) {
            ++personsTrust[pair[1]];
            ++othersTrust[pair[0]];
        }
        
        for(int i=1; i<=N; ++i) {
            if(personsTrust[i] == N-1 && othersTrust[i] == 0) {
                return i;
            }
        }
        return -1;
    }
}

/*
Slightly optimised solution --> Same runtime though (top 100%)


class Solution {
    public int findJudge(int N, int[][] trust) {
        int[] trusts = new int[N+1]; 
        
        for(int[] pair : trust) {
            ++trusts[pair[1]];
            --trusts[pair[0]];
        }
        
        for(int i=1; i<=N; ++i) {
            if(trusts[i] == N-1) {
                return i;
            }
        }
        return -1;
    }
}

*/
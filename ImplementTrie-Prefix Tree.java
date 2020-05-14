class TrieNode {
    public TrieNode[] children;
    public boolean isEndOfWord;
    
    public TrieNode() {
        children = new TrieNode[26];
        Arrays.fill(children,null);
        isEndOfWord = false;
    }
}
class Trie {

    /** Initialize your data structure here. */
    private TrieNode root;
    
    public Trie() {
        root = new TrieNode();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        int end = word.length();
        int index;
        TrieNode temp = root;
        for(int i=0; i<end; ++i) {
            index = word.charAt(i) - 'a';
            if(temp.children[index] == null) {
                temp.children[index] = new TrieNode();
            }
             temp = temp.children[index];
        }
        temp.isEndOfWord = true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        int end = word.length();
        int index;
        TrieNode temp = root;
        for(int i=0; i<end; ++i) {
            index = word.charAt(i) - 'a';
            if(temp.children[index] == null) {
                return false;
            }
            temp = temp.children[index];
        }
        return (temp != null && temp.isEndOfWord);
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String word) {
        int end = word.length();
        int index;
        TrieNode temp = root;
        for(int i=0; i<end; ++i) {
            index = word.charAt(i) - 'a';
            if(temp.children[index] == null) {
                return false;
            }
            temp = temp.children[index];
        }
        return (temp == null)?false:true;
    }
}
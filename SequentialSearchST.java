
import java.util.LinkedList;
import java.util.Queue;

import org.junit.*;

public class SequentialSearchST<Key, Value> {
    private int N;           // number of key-value pairs
    private Node first;      // the linked list of key-value pairs

    // a helper linked list data type
    private class Node {
        private Key key;
        private Value val;
        private Node next;

        public Node(Key key, Value val, Node next)  {
            this.key  = key;
            this.val  = val;
            this.next = next;
        }
    }
    
    /**
     * @param sequentialSearchST
     * 
     * class invariant which is a boolean method 
     * 
     * @return the N is positive and object of SequentialSearchST is not null
     */
    
    public boolean checkClassInvariant(SequentialSearchST<Key, Value> sequentialSearchST)
    {

    	
		return N>=0 && sequentialSearchST!=null;

    }
    
    

    /**
     * Initializes an empty symbol table.
     */
    public SequentialSearchST() {
    }

    /**
     * Returns the number of key-value pairs in this symbol table.
     *
     * @return the number of key-value pairs in this symbol table
     */
    public int size() {
        return N;
    }

    /**
     * Returns true if this symbol table is empty.
     *
     * @return <tt>true</tt> if this symbol table is empty;
     *         <tt>false</tt> otherwise
     */
    public boolean isEmpty() {
        return size() == 0;
    }

    /**
     * Returns true if this symbol table contains the specified key.
     *
     * @param  key the key
     * @return <tt>true</tt> if this symbol table contains <tt>key</tt>;
     *         <tt>false</tt> otherwise
     * @throws NullPointerException if <tt>key</tt> is <tt>null</tt>
     */
    public boolean contains(Key key) {
        if (key == null) throw new NullPointerException("argument to contains() is null");
        return get(key) != null;
    }

    /**
     * Returns the value associated with the given key in this symbol table.
     *
     * @param  key the key
     * @return the value associated with the given key if the key is in the symbol table
     *     and <tt>null</tt> if the key is not in the symbol table
     * @throws NullPointerException if <tt>key</tt> is <tt>null</tt>
     */
    public Value get(Key key) {
        if (key == null) throw new NullPointerException("argument to get() is null"); 
        for (Node x = first; x != null; x = x.next) {
            if (key.equals(x.key))
                return x.val;
        }
        return null;
    }

    /**
     * Inserts the specified key-value pair into the symbol table, overwriting the old 
     * value with the new value if the symbol table already contains the specified key.
     * Deletes the specified key (and its associated value) from this symbol table
     * if the specified value is <tt>null</tt>.
     *
     * @param  key the key
     * @param  val the value
     * @throws NullPointerException if <tt>key</tt> is <tt>null</tt>
     */
    public void put(Key key, Value val) {
    	// pre condition check classinvariant
    	assert checkClassInvariant(this);
    	
    	// take variable which preserve the old size of symbol table
    	int previoussize = size();
    	
        if (key == null) {
        	
        	// post condition check key
        	assert key==null;
        	
        	throw new NullPointerException("first argument to put() is null"); 
        }
        if (val == null) {
        	
        	
        	
            delete(key);
            
            // post condition check key,value and size
            assert val==null && checkKeyinSymbolTable(key) && size() == previoussize - 1;
            
            return;
        }

        for (Node x = first; x != null; x = x.next) {
        	
        	// Loop Invariant
        	assert !checkkeyvalueinSymbolTable(key, val) && size() == previoussize && x!=null;
        	
            if (key.equals(x.key)) {
                x.val = val;
                
             // post condition check key and value
               assert checkkeyvalueinSymbolTable(key, x.val) && size() == previoussize;
                
                return;
            }
        }
        first = new Node(key, val, first);
        N++;
        
        // post condition check first and size
        assert first!=null && N == previoussize + 1;
    }
    
    
    

    /**
     * Removes the specified key and its associated value from this symbol table     
     * (if the key is in this symbol table).    
     *
     * @param  key the key
     * @throws NullPointerException if <tt>key</tt> is <tt>null</tt>
     */
    public void delete(Key key) {
        if (key == null) throw new NullPointerException("argument to delete() is null"); 
        first = delete(first, key);
    }

    // delete key in linked list beginning at Node x
    // warning: function call stack too large if table is large
    private Node delete(Node x, Key key) {
        if (x == null) return null;
        if (key.equals(x.key)) {
            N--;
            return x.next;
        }
        x.next = delete(x.next, key);
        return x;
    }
    
    /**
     * 
     * @param key
     * 
     * check key is present in the symbol table or not?
     * 
     * 
     * @return
     */
    
    public boolean checkKeyinSymbolTable(Key key)
    {
    	
    	
    	for(Key s:this.keys())
    	{
    		if(s.toString().equals((String) key))
    		{
    			return false;
    		}
    	}
    	
		return true;
    	
    }
    
    /**
     * 
     * @param key
     * 
     * check value is present in the symbol table for particular key or not? 
     * 
     * @return
     */
    
    public boolean checkkeyvalueinSymbolTable(Key key,Value val)
    {

    	for(Key s:this.keys())
    	{
    		if(s.toString().equals(key.toString()) && this.get(s) == val)
    		{
    			    			
    			
    			return true;
    		}

    	
    	}
    	
		return false;
    	
    }
    
    
    
    


    /**
     * Returns all keys in the symbol table as an <tt>Iterable</tt>.
     * To iterate over all of the keys in the symbol table named <tt>st</tt>,
     * use the foreach notation: <tt>for (Key key : st.keys())</tt>.
     *
     * @return all keys in the sybol table
     */
    public Iterable<Key> keys()  {
        Queue<Key> queue = new LinkedList<Key>();
        for (Node x = first; x != null; x = x.next)
            queue.add(x.key);
        return queue;
    }


    /**
     * Unit tests the <tt>SequentialSearchST</tt> data type.
     */
    public static void main(String[] args) {
        SequentialSearchST<String, Integer> st = new SequentialSearchST<String, Integer>();
        char input[] = new char[]{'S', 'E','A','R','C','H','E','X','A', 'M', 'P','L','E'};
        
        for (int i = 0;i<input.length; i++) {
            String key = ""+input[i];
            
            
            	 st.put(key, i);
          
           
        }
        for (String s : st.keys())
            System.out.println(s + " " + st.get(s));
    }
}



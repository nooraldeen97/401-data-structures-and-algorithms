# Hashtables
<!-- Short summary or background information -->
Hash tables are created with an algorithm that stores the keys into hash buckets, which contain key-value <br>pairs. Since different keys may hash to the same bucket, the goal of hash table design is to spread out the <br>key-value pairs evenly with each bucket containing as few key-value pairs as possible. When an item is looked <br>up, its key is hashed to find the appropriate bucket, and the bucket is then compared to find the right <br>key-value pair. <br>

## Challenge
<!-- Description of the challenge -->
Deal with hash function and converting the string into index .<br>

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
A hashtable typically has a space complexity of O(n).<br>

Time complexity of inserting on hash table and getting from hashtable is O(1).<br>

## API
<!-- Description of each method publicly available in each of your hashtable -->
### add method
Arguments: key, value<br>
Returns: nothing<br>
This method should hash the key, and add the key and value pair to the table, handling collisions as needed.<br>

### get method
Arguments: key<br>
Returns: Value associated with that key in the table<br>

### contains method
Arguments: key<br>
Returns: Boolean, indicating if the key exists in the table already.<br>

### hash method
Arguments: key<br>
Returns: Index in the collection for that key<br>


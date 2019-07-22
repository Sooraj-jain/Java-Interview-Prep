HashMap is an array of linked list containing data in each node

Each Node contains 4 things. 
1) Key
2) Value
3) HashCode
4) next

By defaults HashTable produces array or size 16. That is index from 0 to 15.

![HashMap](Data_Structures/HashTable/HashTable0.png)

Once put operation is called, 
1) hash(key) is performed 
2) getIndex for the hash is called to get corresponding index between 0-15 
3) Then in the array at that index, a node is created with 4 things listed above. 
This node is either a new node on linked list if there were no other nodes present earlier
Or simply gets attached as the next node in the linked list
4) HashMap in java supports null key -> which always has hash of 0 -> index of 0
5) If either hashcode generated is same OR the index from different hashcode resulted in a same index, 
In these 2 cases, multiple keys can have same index in the hashmap

![HashMap](Data_Structures/HashTable/HashTable1.png)

![HashMap](Data_Structures/HashTable/HashTable2.png)

When get(key) is called, 
1) hash(key) generated
2) index for hashcode is calculated 
3) Goes to that index, 
A) First matches with hash, if same matches with key. When both are same, get value,
IF not, go to next node and repeate the same until the match is found

![HashMap](Data_Structures/HashTable/HashTable3.png)

Once the array is 75% full, the size is doubled, and rehashing is performed, resulting in moving the values to new indexes

In Java8, if the node size in a given linked list at any index of Hashmap reaches 8, then this LL is converted into balanced Tree

Storage and retrieval is efficient in this. LL -> O(n)  balanced tree -> O(log n)


Maps in JAVA

1) Hashtable, HashMap -> HashMap is implementation of map, DOES NOT maintain insertion order
2) Linked hashMap -> Implements map. Inherits HashMap. 
Maintains insertion order 
3) Treemap -> Implementation of Map and Sorted map
Maintains sorted Map

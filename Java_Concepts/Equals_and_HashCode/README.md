When hashCode() method is not implemented, 
2 Employee object attributes having same values can have different hashCode
as a result may not match equals() method and would not be treated as duplicates when equal() is not implemented.

All wrapper classes in java like Integer, String etc have hashCode() and equals() method defined

If its a custom class (UD), then one needs to implement hashCode() and equals() method


IF not
1) Feature of Set<> that does not allow duplicate entries wouldnt be applies to these custom objects
2) In Hashmap<k,v> if 2 objects (having same attribute values) are put as key, it will result in 2 entries which is incorrect.
(should have been one as the 2 objects essentially are same is equals() method was implemented)
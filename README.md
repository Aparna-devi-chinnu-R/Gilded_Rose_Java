doubts:

    Should I use another class to have an operation on item class.
    because  Item has a behaviour of updating itself does'nt seems right.
    What does this gilded rose class mean?
    Why do we have a list ther?
     ---
    void methods how to make them returnable?
     ---
    In sulfras class i have a dummy update method, which is bad what to do?
    without getter how can i get the methods?



TODO :

    1. Name all conditions.  -- done -- better naming not done
    2. Don't pass the item to item class.  --done
    3. Remove static method   --done
    4. Make arrray to list --done
    5. Avoid getters and setters.
    6. No id else condition - done
    7. Avoid void methods - but why?


Solid principles:

    1.S - Singularity
    2.O - open for expansion closed for modification
    3.L - Linskov substitution (Avoid misusage of inheritace)
    4.I - Interface segregation principle (not making interfaces weighted ,
             eg if zookeeper class has 3 methods feed , secure and pet ,
              now who ever thezookeer has to implement these methd, instead if we create seperate methods for these the user will implement according to that )
    5.D - Dependency Injection.

Design Principles:

    1.DRY - There are some functions that are repeating.
    2.SPR -
    3 LSP -
    4.DIP -
    5.KISS - Follwing by naming conventions
    6.ISP - Should I use interface instead of class? When should I use interface amd whrn class?
    7.Open/Closed Principle -y
    8.Composition over inheritance - Not sure when to follow this

Four Principles of Simple designs:

    1.Runs all tests
    2.Minimize duplication
    3.Maximize clarity
    4.Keep it simple

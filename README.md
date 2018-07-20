# CodeLuxoftIM
Description of the task for InterMobility in Luxoft

coding task:

1) 
## See com.luxoft.sanzhar.codeluxoftim.BTNCompareTest
We have a class representing binary tree nodes:
class BTN {
    int val;
    BTN left;
    BTN right;
}
please implement method to compare 2 such trees (returns: true if fully equal, false - otherwise)

2) 
## See com.luxoft.sanzhar.codeluxoftim.ElementUtilTest
We have a class : class Element { int num; String name; int age; }
    please implement method taking Collection<Element> as an argument and returning Collection<Element> where all elements are unique by "num" and age>20. In case of ambiguity, put in target collection any of input elements.


3)
## See project\src\main\resources\task3.sql
We do have 2 tables in a relational database:
∙ Clients (client_id(PK), client_name)
∙ Orders (order_id(PK), client_id, order_sum, order_date)
Please write the following SQL queries:
  a- list of clients, which have an order with order_sum > 50
  b- clients, whose total sum of orders exceeds 100
  

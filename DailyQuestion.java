1.Why is Java a platform independent language?
 
   Java is a independent language. 
  Because Java compiler can convert source into byte code, which is the intermediate language.
 Byte code can be execute any of the platform.


2.What do you understand by an instance variable and a local variable?

      Instance Variable : Instance variable is declared in a class and outside the method, It can invoke to any other method in a class.
      Local variable : Local variable is declared with in the method. 
      
3.Can we overload main method in Java

   We can overload the main method in java but JVM can calls only the original main method. It cannot calls the overloadded main method in java.


4.What are the access modifiers available in java

           *Private
           *Default
           *Protected
           *Public.
5.How will you call a non static method from main method in java

            We can call the non-static method from static method by creating a instance of the class belongs to the method.


6.Why String is immutable in java?

          The String is immutable in Java because of the security, synchronization and concurrency, caching, and class loading. The reason of making string final is to destroy           the immutability and to not allow others to extend it.
    The String objects are cached in the String pool, and it makes the String immutable.
          
          
7.What is the difference between concat() and concatenation  operator "+" ?
  Concat()  :It takes only one argument in a method to concatenation with other string.
          '+' Operator  : It can take more number of arguments to concatenate.-
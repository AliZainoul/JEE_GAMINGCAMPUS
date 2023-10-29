/* 
    POOJAVA_EFREI is the PARENT DIRECTORY
    💻 ~/POOJAVA_EFREI % tree
    .
    ├── Hello.java
    ├── hello
    │   └── Hello.java
    ├── hellow
    │   └── src
    │       └── Hello.java
    └── helloww
        └── hello
            └── src
                └── Hello.java

    7 directories, 4 files
===============================================================================================
    EXAMPLE 1:
===============================================================================================
    Inside the parent directory POOJAVA_EFREI, I have the file Hello.java:// Hello.java
    public class Hello {
        public static void main(String[] args) { 
            System.out.println("Hello, World!");
        } 
    }

    In order to compile POOJAVA_EFREI/Hello.java:
    CASE 1: I am inside POOJAVA_EFREI/ (the parent directory), as simple as that: (WORKING)		
        Single line:		    javac Hello.java && java Hello		
        Or:						javac Hello.java		
        Then:					java Hello

    CASE 2: I am outside POOJAVA_EFREI/, at home directory: (WORKING)
        Single line:		    javac POOJAVA_EFREI/Hello.java && java -cp POOJAVA_EFREI Hello		
        Or:						javac POOJAVA_EFREI/Hello.java		
        Then:					java -cp POOJAVA_EFREI Hello				
        
    /!\ TO DELETE(WITH CAUTION!): rm -rf *.class
===============================================================================================

===============================================================================================
    EXAMPLE 2:
===============================================================================================
Inside the directory POOJAVA_EFREI/hello/ I have: Hello.java/ inside POOJAVA_EFREI/hello/
    package hello;
    public class Hello {
        public static void main(String[] args) { 
            System.out.println("Hello from the hello package!");
        } 
    }
    In order to compile POOJAVA_EFREI/hello/Hello.java:
    
    CASE 3: I am inside POOJAVA_EFREI/hello/ (the folder where my source file is), as simple as that: (NOT WORKING)		
        Single line:		    javac hello/Hello.java && java -cp hello Hello		
        Or:						javac Hello.java		
        Then:					java Hello
    
    CASE 4: I am inside POOJAVA_EFREI/, but outside POOJAVA_EFREI/hello/ : (WORKING)
        Single line:		    javac hello/Hello.java && java -cp . hello.Hello		
        Or:						javac hello/Hello.java		
        Then:					java -cp . hello.Hello				
        
    /!\ TO DELETE(WITH CAUTION!): rm -rf hello/*.class
    

    ===============================================================================================
    EXAMPLE 3:
    ===============================================================================================
    Inside the directory POOJAVA_EFREI/hellow/src I have: Hello.java// Hello.java inside helloww/hello/src directory
    package helloww.hello.src;
    public class Hello {
        public static void main(String[] args) {
            System.out.println("Hello from the helloww.hello.src package!");
        }
    }

    In order to compile POOJAVA_EFREI/hellow/src/Hello.java:
    
    CASE 5: I am inside POOJAVA_EFREI/, but outside POOJAVA_EFREI/hello/ : (WORKING)
        Single line:		    javac hellow/src/Hello.java && java -cp . hellow.src.Hello		
        Or:						javac hellow/src/Hello.java		
        Then:					java -cp . hellow.src.Hello
        
    /!\ TO DELETE(WITH CAUTION!): rm -rf hellow/src/*.class
    
    ===============================================================================================
    EXAMPLE 4:
    ===============================================================================================
    Inside the directory POOJAVA_EFREI/hellow/hello/src I have: Hello.java// Hello.java inside POOJAVA_EFREI/hellow/hello/src
    package hellow.hello.src;
    public class Hello {
        public static void main(String[] args) { 
            System.out.println("Hello, World!");
        } 
    }
    
    In order to compile POOJAVA_EFREI/hellow/src/Hello.java:
    
    CASE 5: I am inside POOJAVA_EFREI/, but outside POOJAVA_EFREI/hello/ : (WORKING)
        Single line:		    javac hellow/hello/src/Hello.java && java -cp . hellow.hello.src.Hello		
        Or:						javac hellow/hello/src/Hello.java		
        Then:					java -cp . hellow.hello.src.Hello
    
    /!\ TO DELETE(WITH CAUTION!): rm -rf helloww/hello/src/*.class
    ==============================================================================================
*/
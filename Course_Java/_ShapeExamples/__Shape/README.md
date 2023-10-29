# Here we are using packages, with Main included to the package  ``` fr.ccc.src.shape ```, small changes!

# Assume that you have this architecture file tree:
Tree of your directory structure:
  ```
  .
  ├── README.md
  └── fr
      └── ccc
          └── src
              └── shape
                  ├── Circle.java
                  ├── Main.java
                  ├── Rectangle.java
                  ├── Shape.java
                  └── Triangle.java

  5 directories, 6 files

  ```


# Compile the program with this command:
  - Open a command prompt and type in:
  ```
  javac -d bin fr/ccc/src/shape/*.java && java -cp bin fr.ccc.src.shape.Main
  ```

  The first command will compile all ```.java``` files inside ```fr.ccc.src.shape ``` :
  ```
  javac -d bin fr/ccc/src/shape/*.java  
  ```
  
  the ```-d bin``` option is for creating a directory named ```bin```
  (if it does not exist) in order to generate the ```.class``` files
  (see tree below),
  whereas the AND ```&&``` operator is in order to process the next command:
  ```
  java -cp bin fr.ccc.src.shape.Main
  ```
  This command is used to specify the classpath ```bin```.
  The classpath is a list of directories and JAR files where Java can find
  the compiled Java class files that the Main program needs to execute.


# After compilation, the architecture tree will be the following:
```
.
├── README.md
├── bin
│   └── fr
│       └── ccc
│           └── src
│               └── shape
│                   ├── Circle.class
│                   ├── Main.class
│                   ├── Rectangle.class
│                   ├── Shape.class
│                   └── Triangle.class
└── fr
    └── ccc
        └── src
            └── shape
                ├── Circle.java
                ├── Main.java
                ├── Rectangle.java
                ├── Shape.java
                └── Triangle.java

10 directories, 11 files

```

- Note that all class files are in the ```bin``` directory, which is a good practice.

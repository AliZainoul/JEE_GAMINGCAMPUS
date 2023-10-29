# Here we are using packages, nothing changes!

# Assume that you have this architecture file tree:
Tree of your directory structure:
  ```
    .
    ├── Main.java
    ├── README.md
    └── src
        ├── Circle.java
        ├── Rectangle.java
        ├── Shape.java
        └── Triangle.java

    2 directories, 6 files
  ```


# Compile the program with this command:
  - Open a command prompt and type in:
  ```
  javac -d bin src/*.java Main.java && java -cp bin Main
  ```

  The first command will compile all ```.java``` files inside ```src```
  then ```Main.java```,
  ```
  javac -d bin src/*.java Main.java
  ```
  the ```-d bin``` option is for creating a directory named ```bin```
  (if it does not exist) in order to generate the ```.class``` files
  (see tree below),
  whereas the AND ```&&``` operator is in order to process the next command:
  ```
  java -cp bin Main
  ```
  This command is used to specify the classpath ```bin```.
  The classpath is a list of directories and JAR files where Java can find
  the compiled Java class files that the Main program needs to execute.


# After compilation, the architecture tree will be the following:
```
.
├── README.md
├── bin
│   ├── Circle.class
│   ├── Rectangle.class
│   ├── Shape.class
│   ├── Triangle.class
│   └── Main.class
├── Main.java
└── src
    ├── Circle.java
    ├── Rectangle.java
    ├── Shape.java
    └── Triangle.java
```

- Note that all class files are in the ```bin``` directory, which is
  good practice.

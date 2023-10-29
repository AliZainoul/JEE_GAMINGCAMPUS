public class Array {
    public static void main (String[] args) {
        // On cree un tableau d'entiers de 5 elements
        // Donc la taille de notre tableau va etre de 5.
        // La syntaxe generale c est: 
        // type[] nomTableau = new type[taille];
        // new est un mot cle qui permet de creer un tableau
        // Un tableau commence toujours a l'indice 0
        // et finit toujours a l'indice taille - 1
        // Afin que: taille -1 - 0 + 1 = taille

        // ICI JE CREE MON TABLEAU GRACE AU MOT CLE NEW
        int[] numbers = new int[5];

        // JE PEUX FAIRE EXACTEMENT PAREIL
        // int[] numbers = {1, 2, 3, 4, 5};
         
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i+1;
            System.out.println("Index i: " + i);
            System.out.println("The element is: " + numbers[i]);
        }
            
        // Même comportement
        for (int number: numbers) {
            System.out.println(number);
        }
        
        // On a cree un tableau d'entiers de 5 elements
        // indice 0: 0 < 5 donc numbers[0] = 1
        // indice 1: 1 < 5 donc numbers[1] = 2
        // indice 2: 2 < 5 donc numbers[2] = 3
        // indice 3: 3 < 5 donc numbers[3] = 4
        // indice 4: 4 < 5 donc numbers[4] = 5

        // Les elements d'un tableau sont indexes a partir de 0
        // Donc le premier element est a l'indice 0
        // On accede a un element via son indice
        // La syntaxe generale c est: nomTableau[indice]

        // Ici numbers[0] est le premier element du tableau 
        // Ici numbers[1] est le deuxieme element du tableau
        // ...

  
    } 
}
/* 
    // La classe Student "herite" de la classe Person
    // Ici la classe Student est la classe fille
    // la classe Person est la classe mere
*/

public class Student extends Person {
    // Membres/Attributs de la classe Student: les caracteristiques d'une personne 
    final private String[] courses;

    // Constructeur: une methode qui permet de creer une instance/objet de la classe
    Student (String _name, int _age, int _ID, String[] _courses) {
        super(_name, _age, _ID);
        this.courses = _courses;
    }


    // Helpers
    public void printInfosStudent() {
        this.printInfos();
        System.out.println("Cours: ");
        for (String course : this.getCourses()) {
            System.out.println(course);
        }
    }
    // Getters
    public String[] getCourses ()    {  
        return this.courses;    
    }
    /*
    // Setters
    public void setCourses (String[] _courses) {  
        this.courses = _courses;  
    }
    */

}
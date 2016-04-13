### 5.1 Studentenverwaltung ###
Schreiben Sie ein Java-Programm, welches eine Studentenverwaltung simuliert. **Die fertigen Klassen dieser Übung werden für weitere Übungen vorausgesetzt.**

##### Folgendes ist dabei zu beachten. #####

* Alle Studenten (Klasse `Student`) gehören einer Universität/Hochschule (Klasse `College`) an
* An dieser Hochschule werden verschiedene Studiengänge (Klasse `Course`) angeboten
* Jeder Studiengang hat eine bestimmte Anzahl an Kursen (Klasse `Class`) und einen Namen
* Ein Kurs hat die Attribute Name, Credits und Name
* Ein Student hat die Attribute firstName, lastName und id (Matrikelnummer)
* Ein Student kann nur einem Studiengang zugeordnet werden

##### Aufgabe 5.1.1 Schematisches Klassendiagramm #####

Zeichnen Sie zunächst ein Klassendiagramm mit allen Klassen, Methoden und Attributen. Eine Assoziation beschreibt die Beziehung zwischen den einzelnen Klassen, tragen Sie diese auch in Ihr Diagramm ein.

##### Aufgabe 5.1.1 Klassenbasis programmieren #####

Um Ihnen bei der Verständnis zu helfen, sind wenige Codebausteine, wie z.B. das Verwenden einer Liste bereits vorgegeben. Erweitern Sie den Code mit Beachtung der `TODO` Kommentare!

###### Student.java ######

``` java
public class Student {
    private String firstName;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    // TODO: hinzufügen von private attribute 'lastName': Text only
    // TODO: hinzufügen von getter und setter für lastName

    // TODO: hinzufügen von private attribute 'course' (Studiengang): Klasse Course
    // TODO: hinzufügen von getter und setter für course

    public Student() {
        // Diese Methode nennt sich Konstruktor und wird immer aufgerufen,
        // wenn ein Objekt der Klasse "Student" erzeugt wird

        // TODO: initialisieren Sie die vorhandenen Variablen!
        this.firstName = ""; // oder: this.setFirstName("");
    }

}
```

###### College.java ######
``` java
// die folgenden Imports werden für eine Liste benötigt
import java.util.ArrayList;
import java.util.List;

public class College {
    // TODO: Liste von Studenten anlegen
    private List<Student> students;

    // einen Studenten der obigen Liste hinzufügen
    public void addStudent(Student student) {
        students.add(student);
    }

    // gibt ALLE Studenten als Liste zurück
    public List<Student> getStudents() {
        return students;
    }

    // TODO: Liste von Studiengängen (Course) anlegen
    // TODO: get-Methode für course list erstellen
    // TODO: add-Methode für course list erstellen

    // TODO: privates Attribut 'name' hinzufügen
    // TODO: getter und setter für Attribut 'name' erstellen


    public College() {
        // obige Liste wird bei der Erstellung eines Objektes initialisiert
        this.students = new ArrayList<Student>();

        // TODO: Initialisierung aller anderen Attribute
    }
}
```

###### Course.java ######
``` java
// TODO: importieren von List und ArrayList

public class Course {
    // TODO: Erstellung private Liste von Kursen (Class) -- Großschreibung beachten

    // TODO: Erstellung des privaten Attributs 'name' mit getter und setter

    // TODO: Konstruktor erstellen, um alle Variablen zu initialisieren
}
```

###### Class.java ######
``` java
public class Class {
    // TODO: try it yourself :-)
}
```

##### Aufgabe 5.1.2 Mainprogramm und Objekte erstellen #####

Erstellen Sie zunächst eine datei `program.java` und erweitern Sie diese mit einer main Funktion. Innerhalb der Main Funktion, initialisieren Sie Ihr Programm mit folgenden Daten: (Sie müssen nichts auf der Console/Terminal ausgeben, sondern alles in der Main via Code hinzufügen)

* **Name der Hochschule:** OTH Regensburg
* **Studiengänge mit Kursauswahl:**
    1. Wirtschaftsinformatik (Bachelor)
        1. Programmieren 1, 8 Credits
        3. BWL 1, 8 Credits
    2. Wirtschaftsinformatik (Master)
        1. Moderne Datenbankkonzepte, 5 Credits
        2. Business Consulting, 5 Credits
    3. Allgemeine Informatik (Bachelor)
        1. Programmieren 1, 8 Credits
        2. Programmieren 2, 7 Credits

###### Zum Beispiel... ######
``` java
// innerhalb der main...
Class class_pg1 = new Class();
class_pg1.setName("Lineare Algebra");
class_pg1.setCredits(8);

Course course_winfo = new Course();
course_winfo.setName("Mathematik Bachelor");
course_winfo.addClass(class_pg1);
```

##### Aufgabe 5.1.3 Studenten erstellen #####
Erweitern Sie Ihr Programm nun so, dass Sie die folgenden Studenten inklusive Noten hinzufügen können:

* Lea Lustig, Master Informatik, Matrikelnummer 1111111
    * Moderne Datenbankkonzepte: Note 1,7
    * Business Consulting: Note 2,0
* Rudi Regen, Bachelor Informatik, Matrikelnummer 2222222
    * Programmieren 1: Note 1,3
    * Programmieren 2: Note 2,3
* Max Munter, Bachelor Informatik, Matrikelnummer 3333333
    * Programmieren 1: Note 5,0
    * BWL: Note 3,0

##### (Zusatz) Aufgabe 5.1.4 Ausgabe der Daten #####
Erweitern Sie ihr Programm nun, um alle Daten der Klassen auf der Console/Terminal auszugeben. Schreiben Sie hierfür die folgenden Funktionen:

```java
class Student:
    public String getStudentData() {
    }

class College:
    public String getCollegeData() {
    }

class Course:
    public String getCourseData() {
    }

class Class:
    public String getClassData() {
    }
```

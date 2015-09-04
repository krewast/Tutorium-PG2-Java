#5.1 Studentenverwaltung

Schreiben Sie ein Java-Programm, welches eine Studentenverwaltung simuliert.

Dieses Programm soll folgende Funktionalitäten besitzen:

* Anlegen eines neuen Studenten
* Bearbeiten eines Studenten
* Kursnoten eines Studenten eintragen
* Einzelinformationen eines Studenten ausgeben
* Übersicht über alle Informationen ausgeben

Folgendes ist dabei zu beachten.

* Alle Studenten gehören einer Universität/Hochschule an
* An dieser Hochschule werden verschiedene Studiengänge angeboten
* Jeder Studiengang hat eine bestimmte Anzahl an Kursen
* Ein Kurs hat die Attribute Credit, Multiplikator, Note und Name
* Ein Student hat die Attribute Name, Matrikelnummer (nummerisch und 8-stellig) und E-Mail
* Ein Student kann nur einem Studiengang zugeordnet werden

##Aufgabe 5.1.1 (Schematisches Klassendiagramm)

Zeichnen Sie zunächst ein Klassendiagramm mit allen Klassen, Methoden und Attributen. Eine Assoziation beschreibt die Beziehung zwischen den einzelnen Klassen, tragen Sie diese auch in Ihr Diagramm ein.

##Aufgabe 5.1.2 (Grunddaten anlegen)

In unserem Beispiel, werden die Daten der Hochschule, der Studiengänge und der Kurse beim Starten des Programmes geladen und können nicht verändert werden.

Initialisieren Sie Ihr Programm mit folgenden Daten:

* Name der Hochschule: OTH Regensburg
* Studiengänge mit Kursauswahl. Die Anzahl der Credits und des Multiplikators ist frei wählbar. (Kann auch vom Modulhandbuch entnommen werden)
    1. Wirtschaftsinformatik (Bachelor)
        1. Programmieren 1
        2. Programmieren 2
        3. BWL 1
        4. BWL 2
    2. Wirtschaftsinformatik (Master)
        1. Moderne Datenbankkonzepte
        2. Business Consulting
    3. Allgemeine Informatik (Bachelor)
        1. Programmieren 1
        2. Programmieren 2

Beispiel zum Befüllen einer Liste:

    List<String> list = new ArrayList<String>();
    list.add("item");

##Aufgabe 5.1.3 (Anlegen und Bearbeiten der Studenten)

Es soll die Möglichkeit geschaffen werden, über die Konsole neuen Studenten anzulegen, diese zu bearbeiten und Kursnoten einzugeben.

Hier ein Beispiel zur Neuanlage:

    Name:
    Mustermann
    Vorname:
    Max
    Matrikelnummer:
    1234567
    E-Mail:
    max.mustermann@st.oth-regensburg.de
    1: Allgemeine Informatik (Bachelor)
    2: Wirtschaftsinformatik (Bachelor)
    3: Wirtschaftsinformatik (Master)
    Wählen Sie einen Studiengang aus:
    2

Hier ein Beispiel zum Noteneingabe:

    1: 1234567[Matrikelnummer]
    2: 7654321[Matrikelnummer]
    Wählen Sie einen Studenten:
    1
    1: Programmieren 1
    2: Programmieren 2
    3: BWL 1
    4: BWL 2
    Wählen Sie einen Kurs:
    3
    Bitte Note eingeben:
    2

##Aufgabe 5.1.4 (Ausgabe der Daten)

Um einen Übersicht über die Daten zu erhalten, soll noch eine Konsolenübersicht über alle Daten der Studierenden entwickelt werden.

Dabei soll sowohl die Möglichkeit alle Informationen inkl. Notendurchschnitt (Beachtung der Credit-Anzahl und des Multiplikators) eines ausgewählten Studierenden zu erhalten, aber auch eine komplette Übersicht über alle Studenten der Hochschule. (Zur Vereinfachung können Kurse, welche noch nicht absolviert wurden, einfach mit der Note 0 bewertet werden.)

Hier ein Beispiel:

    Name des Studierenden: Max Mustermann
    (angestrebter)  Abschluss:  Bachelor
    Fach: Wirtschaftsinformatik
    Matrikelnummer: 1234567
    E-Mail: max.musterman@st.oth-regensburg.de
     -- Pruefungen --
      Name: Programmieren 1
      Credit: 8
      Multiplikator: 1
      Note:       2,00
     -- --
      Name: Programmieren 2
      Credit: 8
      Multiplikator: 2
      Note:       0,00
     -- --
      Name: BWL 1
      Credit: 8
      Multiplikator: 2
      Note:       0,00
     -- --
      Name: BWL 2
      Credit: 8
      Multiplikator: 2
      Note:       0,00
     -- --
    Notendurchschnitt: 2.00
    ---------
    Name des Studierenden: Isabell Musterfrau
    (angestrebter)  Abschluss:  Master
    Fach: Wirtschaftsinformatik
    Matrikelnummer: 7654321
    E-Mail: isabell.musterfrau@st.oth-regensburg.de
     -- Pruefungen --
      Name: Moderne Datenbankkonzepte
      Credit: 8
      Multiplikator: 2
      Note:       3,00
     -- --
      Name: Business Consulting
      Credit: 5
      Multiplikator: 2
      Note:       1,00
     -- --

    Notendurchschnitt: 2.23
    ---------
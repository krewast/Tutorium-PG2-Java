#### Beispiele für super ####
In diesem Beispiel gibt es drei Klassen:

- `SuperClass`ist die Vaterklasse.
- `SubClass`erbt von `SuperClass`
- `SubSubClass`erbt von `SubClass`und somit automatisch auch von `SuperClass`

##### `equals()` #####
Jede dieser Klassen hat eine `equals` Methode und ebenfalls Zugriff auf die `equals` Methode der Vaterklasse. Somit ergibt sich das folgende:
- `SuperClass`: `equals`
- `SubClass`:
  - `equals`
  - `superEquals` (von `SuperClass`)
- `SubSubClass`:
  - `equals`,
  - `superEquals` (von `SubClass`)
  - `superSuperEquals` (Aufruf `superEquals` von `SubClass`, also `equals`von `SuperClass`)

Hätte man jetzt eine weitere Klasse, die jetzt von SubSubClass erbt, wäre die Struktur die gleiche, weil `superSuperEquals` immer auf das höchstgelegende `equals` zugreift (also immer auf das von `SuperClass`)

##### Liste von `SuperClass` Elementen #####
Wenn man eine Liste anlegen möchte, die `SuperClass` Elemente und alle Kindelemente aufnehmen will, kann man eine Liste von `SuperClass` anlegen (siehe `main.java`)

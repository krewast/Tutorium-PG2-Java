#9.4 - Exception anhand einer Bar

Schreiben Sie ein Java-Programm, welches eine Bar simuliert, bei der nur kalte Getränke serviert werden können und an virtuelle Kunden ausgeliefert wird. Die optimale Temperatur eines kalten Getränkes beträgt 8° Celsius, wobei eine Toleranz von +-2° akzeptiert wird.

Bei der Servierung eines solchen kalten Getränkes können einige Fehler enstehen. Lösen sie diese **Fehlererkennung und die anschließende Fehlerbehandlung** mithilfe von **Exceptions**.

Auf folgende Probleme muss unterschiedlich reagiert werden.

- Das Getränk ist zu kalt
- Das Getränk ist zu warm
- Der Vorrat im Lager ist leer

Schreiben Sie ein läufiges Programm, welches das Verhalten simuliert und auf die entsprechenden Fehlermeldung passend reagiert.

Hier ein Beispiel:

	Gebe die Temperatur eines kalten Getränkes ein: 12
	Neuer Vorrat: 9
	Getränk ist zu warm


	Gebe die Temperatur eines kalten Getränkes ein: 10
	Neuer Vorrat: 8
	Das Getränk ist optimal und der Kunde ist zufrieden


	Gebe die Temperatur eines kalten Getränkes ein: 9
	Neuer Vorrat: 7
	Das Getränk ist optimal und der Kunde ist zufrieden


	Gebe die Temperatur eines kalten Getränkes ein: 6
	Neuer Vorrat: 6
	Getränk ist zu kalt
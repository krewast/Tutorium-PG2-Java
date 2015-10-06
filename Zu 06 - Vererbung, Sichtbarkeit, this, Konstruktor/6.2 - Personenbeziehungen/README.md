#6.2 - Personenbeziehungen

Schreiben Sie ein Programm, das für jede der im folgenden Text genannten Personen angibt, wen sie liebt, mag und hasst:

    Jim likes Larry and Jean, but hates Kim. Bob loves Jean, and likes Larry and Kim.
    Jean loves Bob, likes Jim, but hates Kim.
    Kim hates Jim, likes Larry and Bob.
    Larry loves Martin, and hates Karl and Jean.

Die Aufgabe besteht darin, den obigen Text im Programm fest zu hinterlegen und den Text an den entscheidenden Stellen zu splitten. Für jede Person soll eine Liste der likes / loves / hates Beziehungen ausgegeben werden, wie zum Beispiel (erster Satz):

    Jim: [ likes: Larry, Jean] [loves: ] [ hates: Kim]

Das Programm soll so gestaltet sein, dass der obige Text gegen einen vergleichbaren anderen Text ausgetauscht bzw. erweitert werden kann.

*Hinweis: Nutzen Sie auch hierfür die Funktionen der Java-Klasse String (vgl. Java-API-Doc).*
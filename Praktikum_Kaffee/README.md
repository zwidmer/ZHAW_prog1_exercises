# 10_Praktikum-1_Kaffee
Code project used in the context of the PROG1 course.

Aufgabe:

Eine Methode soll sowohl ein an sie übergebenes Objekt vom Typ Kaffee, als auch vom Typ Tee
ohne Fallunterscheidung (Verzweigungen) zubereiten können.
Kaffee und Tee haben offensichtliche Gemeinsamkeiten. Diese Gemeinsamkeiten können Sie in einer
Superklasse Heissgetränk modellieren.

Die Superklasse Heissgetränk soll dabei abstract sein, da wir keine Objekte dieses Typs
zulassen möchten.

Schreiben Sie nun die Superklasse und modifizieren Sie die beiden Subklassen wo nötig.
Testen Sie die neuen Implementationen, indem Sie eine Klasse Getraenkezubereiter
schreiben, die eine Liste mit einigen Heissgetränk Objekten (Kaffee und Tee) erzeugt. Diese
Liste wird anschliessend einer Methode übergeben, welche die Getränke zubereitet. Die Klasse
Getraenkezubereiter soll eine main Methode besitzen, damit der Getraenkezubereiter als
eigenständige Anwendung gestartet werden kann

Kaffee und Tee sollen nun zusätzlich auch als ein Objekt vom Typ Trinkbar behandelt werden
können. Die einzige Methode von Trinkbar-Objekten ist die Methode trinke(), die nur den Text: „Ich
trinke einen <Klassenname>“ ausgibt. Verwenden Sie für den Klassennamen die Methode
getClass(), welche jedes Java Objekt besitzt. Diese Methode gibt ein Objekt vom Typ Class zurück,
auf welchem Sie .getSimpleName() aufrufen können, um den Klassennamen des Objektes zu
erhalten. Ergänzen Sie Ihren Code um die geforderte Funktionalität und erweitern Sie zusätzlich die
Klasse Getraenkezubereiter, damit ein Getränk nach der Zubereitung auch noch getrunken wird.
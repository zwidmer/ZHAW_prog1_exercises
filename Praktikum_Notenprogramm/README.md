# 07_Praktikum_Notenprogramm
Code project used in the context of the PROG1 course.

Aufgabe:

a) In der Klasse Pruefungsverwaltung gibt es die Methode rundeAufHalbeNote, diese Methode
soll folgende Anforderungen erfüllen:
• Noten mit beliebig grosser Genauigkeit sollen auf halbe Noten gerundet werden. Hierbei gilt,
dass .24 und .74 ab- und .25 und .75 aufgerundet werden.
Testen Sie, ob diese Methode die Noten korrekt rundet. Überlegen Sie sich dazu zuerst die
möglichen Äquivalenzklassen. Schreiben Sie anschliessend die dazugehörigen Unit-Tests.

b) In der Klasse ZufaelligeNotengebung gibt es die Methode
generiereZufaelligePruefugsnote. Diese Methode liefert (pseudo-)zufällig verteilte Noten von
1 bis 6 zurück. Solche Methoden sind schwierig zu testen, da der Rückgabewert nicht
vorhersehbar ist. Überlegen Sie sich, wie Sie trotzdem einen Test schreiben können, welcher
gewährleistet, dass die Methode die korrekten Prüfungsnoten von 1 bis 6 generiert.

c) Korrigieren Sie den Code so, dass alle Tests ohne Fehler durchlaufen.
# 09_Praktikum_Bank
Code project used in the context of the PROG1 course.

Aufgabe:

Eine Bank bietet drei Arten von Konten an: „normale“ Bankkonten, Salärkonten und Nummernkonten.
Die Eigenschaften sind nachfolgend beschrieben:
• Jedes Konto hat einen Inhaber (ein String) und einen aktuellen Kontostand.
• Es darf höchstens ein Maximalbetrag von CHF 100'000 auf einem Konto sein.
• Das Salärkonto darf als einziges überzogen werden. Dazu hat es eine Überzugslimite, welche im
Bereich 0 bis maximal CHF 10'000 liegt.
• Es kann Geld auf ein Konto einbezahlt werden. Würde der Kontostand dadurch den Maximalbetrag überschreiten, wird nur soviel einbezahlt, wie noch erlaubt ist.
• Es kann Geld von einem Konto abgehoben werden. Der Kontostand darf dadurch nicht negativ
bzw. beim Salärkonto nicht unter die Überzugslimite fallen. Falls dies so wäre, so wird nur die erlaubte Geldmenge abgehoben.
• Ein Nummernkonto hat nebst dem Inhaber zusätzlich eine Nummer. Diese beginnt für das erste
Nummernkonto bei 1000 und wird für weitere Nummernkonten fortlaufend um 1 erhöht (1001,
1002...).
• Bei allen Konten kann der Inhaber und der Kontostand abgefragt werden. Beim Nummernkonto
wird bei der Abfrage des Inhabers nicht der Name, sondern die Nummer geliefert. Bei Salärkonten
kann man auch die Überzugslimite abfragen.
• Beim Erzeugen eines Kontos wird der Inhaber angegeben und optional eine Ersteinlage (Kontostand zu Beginn). Bei Salärkonten wird zudem die Überzugslimite spezifiziert.

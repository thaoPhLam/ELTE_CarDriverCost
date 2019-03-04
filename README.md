# ELTECarDriverCost

Készítsünk programot, amellyel szimulálni tudjuk autóvezetők költségeinek alakulását. 

Egy gépkocsi tulajdonosának fizetnie kell 
a jármű felelősségbiztosítását,
az üzemanyag árát és 
a karbantartási költségét. 

A gépkocsik háromfélék lehetnek: benzines, gázolajos, villanyos, és egy hónapra adottak az adataik.

• Benzines gépjármű esetén:
- a jármű rendelkezik lökettérfogattal, hengerszámmal és maximális fordulatszámmal,
- a jármű kötelező biztosítási díja = 1500 + lökettérfogat / 2 + hengerszám / 10 egészrésze,
- a jármű egység-fogyasztása = maximális fordulatszám + hengerszám * 10 + lökettérfogat,
- a jármű karbantartási költsége = maximális fordulatszám + hengerszám * 10.

• Diesel kocsi esetén:
- a jármű rendelkezik lökettérfogattal és hengerszámmal,
- a jármű kötelező biztosítási díja = 1700 + hengerszám / 10 egészrésze,
- a jármű egység-fogyasztása = lökettérfogat,
- a jármű karbantartási költsége = 250 + hengerszám * 7,

• Villanyos jármű esetén:
- a jármű rendelkezik akkumulátorkapacitással és teljesítménnyel,
- a jármű kötelező biztosítási díja = 1000 + akkumulátorkapacitás,
- a jármű egység-fogyasztása = teljesítmény * 2,
- a jármű karbantartási költsége = 500.

Ezen adatok alapján a gépjármű teljes költsége az adott hónapokra kiszámolható:

költség = hónapok száma ∙ (karbantartási költség+kötelező biztosítási díja / 12) + egység-fogyasztás*megtett távolság / 100.

A szimuláció adatait egy szövegfájl tartalmazza a következő formátumban. 
Az első sorban szerepel a gépjárművek száma, valamint a hónapok száma. 
A következő sorokban az autók adatai következnek. 
A sor első eleme a sorszám, majd következik a vezető neve (két szó), a gyártmány (egy szó), a típus (egy szó), 
a jármű típusának első karaktere (b: benzines, g: gázolajos, v: villanyos), 
majd típusonként a megfelelő paraméterek a fenti sorrendben. 
Ezt követően minden hónapra a futási adatok minden autóra (ha az autó nem futott, akkor 0), 
azaz sorszám, valamint megtett távolság.

A program kérje be a fájl nevét, majd jelenítse meg hónaponként, valamint a teljes
időtartamra vonatkozóan is) kinek volt a legtöbb a költsége (és mennyi). 
Ehhez valósítsuk meg a gépjárműveket reprezentáló osztályokat, amelyek egy absztrakt
gépjármű osztály leszármazottai.

Egy lehetséges bemenet:
4 gépjármű, 3 hónap
- 1 Dörmögő Dömötör Toyota Corolla b 3500 8 6500
- 2 Pöttöm Panna FIAT Panda v 4500 1750
- 3 Mek Elek Ford Focus g 1900 5
- 4 Tojás Tóbiás Citroen C5 b 1900 4 6300
- 1 125
- 2 38
- 3 1500
- 4 150
- 1 462
- 2 12
- 3 806
- 4 96
- 1 330
- 2 97
- 3 0
- 4 230

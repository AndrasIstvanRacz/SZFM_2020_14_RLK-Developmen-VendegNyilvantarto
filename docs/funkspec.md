# Funkcionális specifikáció

## 1. Bevezetés
 
 Egy Balaton parti panzió nagy forgalommal jár, az emberek szívesebben jönnek egy meghitt,
  családias hangulatú helyre nyaralni. Eddig a vendégeink listájat és adatait erre a célra használt könyvekben,
  füzetekben tároltuk. Napjainkban azonban, hogy versenyképesek tudjunk maradni nyitnunk kell a modern technológia felé.
  Éppen ezért a vezetés engyhangúan úgy döntött, hogy alkalmazkodik az új követelményekhez,
  és egy gyors és hatékony számítógépes rendszerre cseréljük a hagyományos, papír alapú könyvelést.
  Ehhez szükség lenne egy alkalmazásra amely akár több munkaállomáson is futhat de mégis egy és ugyan azon
  adathalmazt éri el. Ehhez tudunk biztosítani egy központi gépet amelyhez a munkaállomásoknak hozzáférést biztosítunk.
  Ilyen módon növelhetjük a hatékonyságunkat mivel egyszerre több vendéggel is foglalkozhatunk párhuzamosan. 
  Mivel a projekt kezdeti stádiumban van elsőnek a legfontosabb funkciók fejlesztése fog megtörténni, 
  majd a visszajelzések alapján priorizáljuk a további featureöket a felhasználói igények alapján.


## 2. Használati esetek

A Követelmény specifikáció 'Követelménylista' című bekezdése alapján az egyes pontok kifejtésére kerül sor ebben a fejezetben.

* Egy rendszer képes a dolgozok adatainak tárolására:
A programmal lehetőséget szeretnénk nyújtani a panzióban dolgozó alkalmazottak nyilvántartására.

* Egy rendszer ami nyilvántartja a panzióban megszállt vendégeket:
A programmal lehetőséget szeretnénk nyújtani a panzióban megszállt vendégek nyilvántartására. 
Továbbá a panzióban dolgozó személyzet számára szeretnénk átláthatóbbá tenni az adminisztrációt. 
Akár több munkaállomáson is futhat de mégis egy és ugyan azon adathalmazt éri el, így növelve a hatékonyságot.

* Egy rendszer ami képes két felhasználótípus megkülönböztetésére, adminisztrátor és dolgozó:
A programmal azt is szeretnénk elérhetővé tenni, hogy kettő felhasználói típust is meg lehessen különböztetni.
Ennek azért van jelentősége, mert a dolgozó csak a vendégek, míg az admin a dolgozók adatait is módosíthatja.
Tehát mind a kettő táblában képes adatot felvenni, keresni, szerkeszteni vagy törölni.

*A rendszer dolgozói felhasználója:
A a dolgozói felhasználó csupán három dolgot végezhet el a vendégek adataival.
Új vendéget vehet fel, kereshet a vendégek között és képes számlát kiállítani.

* A rendszer vendégenként legyen képes több adat tárolására:
Az egyes vendégekről szeretnénk a lehető legtöbb információt eltárolni. Mikor jelentkeztek be, meddig tartózkodtak a panzióban, mennyit fizettek a szállásért.
Illetve a vendégek fontosabb információit mint például név, telefonszám stb.

* A rendszer adjon lehetőséget az adathalmazban való keresésre:
A program segítséget nyújt ,hogy a dolgozó különböző szempontok alapján mint pl: érkezés dátuma szerint tudja csökkenő vagy növekvő sorrendbe listázni a vendégeket. Így könnyedén látható, hogy ki az akinek esedékes a kiköltözés. De ide tartozik, hogy leellenőrizhesse a dolgozó, hogy adott szobában ki(k) tartózkodik és, hogy jelenleg bent van-e a panzióban.

* A rendszer tegye lehetővé, hogy adott idő intervallumban lekérdezük a vendégek számát és a bevételt:
A programban van egy olyan funkció is ami alapján a dolgozók képesek lehetnek egyszerűbbnek titulált lekérdezéseket is végrehajtani. Például, hogy egy bizonyos intervallumban hány vendég van a panzióban és mennyi az akkori bevétel. Így időt spórolhatnak mivel nem kell mindig az eddigi összes adatot lekérdezni, csak ami éppen kell.

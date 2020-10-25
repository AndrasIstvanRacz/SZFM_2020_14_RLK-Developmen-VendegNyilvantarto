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

* Egy rendszer ami nyilvántartja a panzióban megszállt vendégeket:
A programmal lehetőséget szeretnénk nyújtani a panzióban megszállt vendégek nyilvántartására. Továbbá a panzióban dolgozó személyzet számára szeretnénk átláthatóbbá tenni az adminisztrációt. Akár több munkaállomáson is futhat de mégis egy és ugyan azon adathalmazt éri el, így növelve a hatékonyságot.

* A rendszer vendégenként legyen képes több adat tárolására:
Az egyes vendégekről szeretnénk a lehető legtöbb információt eltárolni. Mikor jelentkeztek be, meddig tartózkodtak a panzióban, mennyit fizettek a szállásért.
Illetve a vendégek fontosabb információit mint például név, telefonszám stb.

* A nyilvántartásba lehetővé kell tenni a meglévő elemek módosítását, törlését és új elem létrehozását:
A dinamikusan változó nyilvántartás lehetőséget kínál, hogy ez által új vendégeket vehessen fel a panzió vagy az esetlegesen a tervezettnél korábban távozó vendégeket könnyen és egyszerűen képes legyen kitörölni a nyilvántartásból, vagy ha egy vendégnek javítani kell az adatait, akkor azt a lehető legegyszerűbben képes legyen a dolgozó megtenni. A vendégek listáját is könnyedséggel lehet változtatni, hogy éppen a panzióban tartózkodik vagy sem. Illetve, hogy melyik szobában helyezkedik el. Az új vendégek felvételét is le lehet bonyolítani vagy az esetlegesen a szobában vagy a panzióban okozott kárt is könnyen fel lehet vinni az adatbázisba. Ezen belül a vendégek tartózkodási idejének esetleges meghosszabbítását is egyszerűen fel lehet vinni.

* A rendszer adjon lehetőséget az adathalmazban való keresésre:
A program segítséget nyújt ,hogy a dolgozó különböző szempontok alapján mint pl: érkezés dátuma szerint tudja csökkenő vagy növekvő sorrendbe listázni a vendégeket. Így könnyedén látható, hogy ki az akinek esedékes a kiköltözés. De ide tartozik, hogy leellenőrizhesse a dolgozó, hogy adott szobában ki(k) tartózkodik és, hogy jelenleg bent van-e a panzióban.

* A rendszer tegye lehetővé, hogy adott idő intervallumban lekérdezük a vendégek számát és a bevételt:
A programban van egy olyan funkció is ami alapján a dolgozók képesek lehetnek egyszerűbbnek titulált lekérdezéseket is végrehajtani. Például, hogy egy bizonyos intervallumban hány vendég van a panzióban és mennyi az akkori bevétel. Így időt spórolhatnak mivel nem kell mindig az eddigi összes adatot lekérdezni, csak ami éppen kell.

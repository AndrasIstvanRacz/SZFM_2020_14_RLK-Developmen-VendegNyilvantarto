# Rendszerterv

## 1. Bevezetés
A rendszerterv elkészítésének célja az, hogy a program fejlesztői pontos, részletes és szaknyelvet tartalmazó leírással 
rendelkezzenek ami a rendszerrel kapcsolatos összes fontos szakmai kérdést magában foglalja. 
A szoftver egy Balaton parti panzió működését hivatott elősegíteni. Célja az analóg rendszer digitálisra cserélése 
ennek következtében a panzió befogadóképességét képes növelni és a dolgozók munkáját meggyorsítani. Adminisztratív és 
egyéb feladatokat lát el számítógépes környezetben. A cél platformunk a panzió tulajdonában lévő számítógépek melyek 
Windows operációs rendszert futtatnak. A megvalósítás miatt a program alkalmas lehet más operációs rendszer alatti 
futtatásra is, de ez nem elsődleges cél. A gépek hardverje 8 GB DDR4 -es RAMból, egy Intel Core i7-9750H 2.60GHz 
típusú processzorból és egy NVIDIA GeForce GTX 1660ti típusú videokártyából állnak. A gépek számára biztosítva van a 
stabil 20Mb/s sávszélességű internetelérés. Ezáltal a megfelelő infrastruktúra kiépítésével megvan teremtve a 
megfelelő háttér, hogy a dolgozók lehető legjobb hatásfokkal képesek legyenek használni a szoftvert. 
A rendszer felépítése egy Mysql alapokra épülő modell,egy közös sql adatbázis motorral rendelkező adatbázison, 
amely tárolja az elérhető szobákat, illetve a vendégek alapvetően szükséges adatait amely könnyű és egyszerű működésű 
lesz, hogy a panzió dolgozói kevés idő ráfordítás után is képesek legyenek átlátni a szoftvert és kényelmesen tudják 
használni azt. Ezért a tervezettek szerint olyan programozási nyelvet használunk ami megkönnyíti ennek a szoftvernek a 
leghatékonyabb lekódolását. Erről bővebben a Fejlesztő eszközök fejezetben lesz majd szó. A digitalizálás hatására 
sokkal gyorsabb, egyszerűbb és biztonságosabb lesz az új rendszer a régihez képest.

## 2. A rendszer célja
A rendszer célja, hogy a panzió elavult adminisztrációs módszerét felváltsa ez a 21. századi, adatbázissal 
rendelkező alkalmazás amivel a panzió adminisztrációs munkája gyorsabb, egyszerűbb és biztonságosabb lesz. 
A programot használó dolgozóknak nagyon sok ideje fel fog szabadulni a program gyorsasága miatt, így foglalkozhat 
más teendőkkel is akár, vagy több vendéget is tud kevesebb idő alatt adminisztrálni. Illetve így a panzióban dolgozó
magasabb beosztású személyeknek könnyebb dolga lesz a dolgozók adatainak kezelésével és nyílvántartásával.

## 3. A projekt tervezete

* 3.1. A rendszer felépítése
Az adatbázis kapcsolathoz szükséges egy adatbázis connection osztály,
amely létrehozza, fenntartja, és zárja az adatbáziskapcsolatot.
A rendszer fő pontja így a központi gép, amelyiken az SQL fut, illetve ettől elkülönített gépen is futtatható 
az SQL szerver amely az adatokat biztosítja. Javasoljuk a szerverek külön gépen futtatását, hogy egy esetleges 
hardverhiba esetén csak az egyik része károsodjon a rendszernek. A program controller részének megvalósítását 
Java programozási nyelven terveztük el. A projekthez továbbá felhasználtuk a Maven nevű projekt menedzsment 
eszköztárat is.

* 3.2. Projektmunkások és felelősségeik
A projektet készítő három személy teljesen egyenjogú szerepkörökkel rendelkezik. 
Mindhármuk kiveszi a részét a munka minden egyes fázisából és részéből, egyenrangú fejlesztői a programnak.

| Név                | Szerepkör         |
|--------------------|-------------------|
| Rácz András István | Szoftverfejlesztő |
| Ladik Balázs       | Szoftverfejlesztő |
| Kosztya Zoltán     | Szoftverfejlesztő |

## 4. Ütemterv

### 4.1 Mérföldkövek
A program elkészítésének fő mérföldkövei:

### 4.2 Első felvonás
* A git project használatának elkezdése
* A git repó elkészítése
* A tagok git-re való regisztrációja illetve a projekthez felvétele
* A követelményspecifikáció megírása
* A funckionális specifikáció megírása
* A rendszerterv megírása
* A program prototípus elkészítése



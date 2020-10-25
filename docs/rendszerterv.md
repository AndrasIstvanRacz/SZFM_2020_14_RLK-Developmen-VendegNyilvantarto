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
más teendőkkel is akár, vagy több vendéget is tud kevesebb idő alatt adminisztrálni.


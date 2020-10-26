## 5. Üzleti szereplők  

Az elkészült programot az éppen munkaidejét töltő recepciós és adminisztrátor pozicióban alkalmazott felhasználó fogja használni. A panzió összes alkalmazotjának, akik ezen munkakörök valamelyikében dolgoznak megvan a végzettsége és a tudása ahhoz, hogy SZFM_2020_14_RLK-Development csapat által készített programot magabiztosan képes legyen használni.

### 5.1. Üzleti entitások  

Az üzletben résztvevő entitások:  
- A programot használó személyzet jogosultságától függően két csoportot különböztetünk meg az adminisztrátori jogokkal rendelkező valamint felhasználói jogokkal rendelkező csoportot  
- A panzió szolgáltatásait igénybe vett regisztrált vendégek  
- A panzióba még nem regisztrált, de majd regisztráló vendégek

## 6. Követelmények

### 6.1.Funkcionális követelmények

- Könnyen és egyszerűen kezelhető rendszer.
- Letisztult átlátható adatbázis kezelés.
- Egyszerű adatbázis lekérdezések megvalósítása.
- Könnyű egyszerű adatfelvétel és módosítás.
- Megkönnyített számla kiállítása.
- Biztonságos adatkezelés.
- Beléptető rendszer kiépítése.

### 6.2. Nem funkcionális követelmények

- Letisztult esztétikus felhasználói felület.
- Látás károsultak számára is megfelelő színvilág és betűméretek használata.
- Clean code-nak való megfelelés.

## 7. Funkcionális terv  

A program célja a vendégek regisztrációjának a felgyorsítása valamint a panzióban dolgozó személyzet
munkájának megkönnyebbítése. Valamint a jelenlegi analóg adminisztrációs módszer teljes lecserélése
digitális formára. A korábbi módszer minden 'funkciójának' átültetése számítógépes környezetbe.

Ezek a 'funkciók' nem mások, mint:

 - Bejelentkeztető rendszer.
 - Adminisztrátori felület.
 - Dolgozói felület.
 - Hozzáadás/Szerkesztés opciók.
 - A panzió vendégeinek nyílvántartása.
 - A kiadott szobák feljegyzése.
 - A vendégek kijelentkezésének időpontja.
 - Az igényelt szoba típusa.
 - Számla kiállítása.

### 7.1. Bejelentkeztető rendszer

A bejelentkeztető rendszer arra fog szolgálni, hogy a vendégek adatait diszkréten és biztonságosan tudjuk tárolni. A program inditása után mindig fog kérni egy felhasználónevet és egy jelszót annak a kiküszöbölése miatt, hogy illetéktelenek ne tudjanak hozzáférni a panzió vendégeinek az adataihoz.

### 7.2. Adminisztrátori felület

A bejelentkezés után ha az adott felhasználó rendelkezik adminisztrátori jogokkal, akkor fog megjelenni neki ez a felület. A felület tartalmaz egy Dolgozó menüpontot amin belül a dolgozók adatai láthatóak, szerkeszthetőek valamint hozzá is tudunk új dolgozót adni az adatbázishoz. A másik menüpont a vendég ahol hasonlóképpen a vendégek listáját fogjuk látni ezeket is tudjuk szerkeszteni törölni valamint új vendéget hozzáadni. A legfontosabb különbség az hogy itt lehetőség adódik arra is hogy számlát állítsunk ki a vendégek részére.

### 7.3. Dolgozói felület

Ez a felület azon dolgozók részére lesz látható akik nem rendelkeznek adminisztrátori jogokkal. Ezen a felüleleten az alkalmazott hozzá tud adni az adatbázishoz új vendégeket valamint kitudja választani a listából a vendégeket és számlát tud kiállítani részükre.

### 7.4. Hozzáadás/Szerkesztés opciók

Ez a rész a szerkesztés illetve a hozzáadás gombok használatával jeleníthető meg a program használata során. Ha rákattintunk ezek küzül valamelyikre akkor utána fogunk látni pár mezőt ahova meg kell adni az adott vendég adatait akit hozzá szeretnénk adni az adatbázishoz. Ezek után egyértelműen a mentés gombra kell majd nyomni, hogy a megadott adatok bekerüljenek a rendszerbe. Viszont ha esetleg az adatok beírása után mégis meggondolnánk magunkat és nem szeretnénk hozzáadni a vendéged az adatbázishoz akkor lehetőségünk adódik arra hogy az elvetés gomb megnyomásával visszatérjünk az előző menüpontba.

### 7.5. Számla kiállítása

A számla kiállítása opció arra fog szolgálni, hogy megkönnyítsük az aktuális munkaidejét töltő munkatársunk munkáját azzal, hogy a rendszer automatikusan legenerálja a számlát és nem kell a régi elavult módszerekhez ragaszkodni amikor is még papíron kellet kitölteni a számlát. A rendszer úgy van megtervezve, hogy az adatbázisból automatikusan kiveszi az aktuális vendég adatait és azt jeleníti meg a számlán.

## 8. Rendszerszereplők  

A rendszerben két féle entitás csoportot különböztetünk meg.


A két csoport:
- Személyzet csoportja
- Vendégek csoportja

A programot a személyzet csoportja fogja használni viszont a személyzet csoporton belül megkülönböztetünk két külön jogosultsági körrel rendelkező csoportot. Az egyik ilyen csoport az adminisztrátori jogokkal rendelkező a másik a felhasználói jogokkal rendelkező. Erre azért volt szükség, hogy biztonságosan tudjuk kezelni a vendégek személyes adatait. Viszont attól, hogy a személyzet csoportot megkülönböztetjük jogosultságuk alapján attól még mindig egyfajta szolgáltatást
nyújtanak a vendégek csoportjának.

A személyzet csoportján belül az adminisztrátori jogokkal rendelkezőknek sokkal több joga lesz mint a felhasználói jogokkal rendelkezőknek. Viszont ha azt nézzük a vendégek nem is használhatják
a programot vagyis a felhasználói jogokkal rendelkezők is több joggal rendelkeznek mint a vendégek. Ezek mellett a felhasználói jogokkal rendelkező munkatársaknak a feladatai közé tartozik az is, hogy a kapcsolatot fenntartják a vendégekkel.
Valamint a feladatuk kiterjed a törzsvendégek értesítésére szezonális kedvezmények esetén.
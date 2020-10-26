## 9. Rendszerhasználati esetek és lefutásai

### 9.1. Bejelentkezés

A program elinditásakor egy bejelentkező ablak fogad minket elsőnek. Ide meg kell adnunk a felhasználónevünket és jelszavunkat. Ezután ha rákattintunk a Bejelentkezés gombra a program megkapja a felhasználónév jelszó párt és megkeresi az adatbázisban. Amenyibe létezik ez a pár sikeresen beléptünk a programba. Ellenkező esetben pedig a "Hibás jelszó vagy felhasználonév üzenetet kapjuk."
<p align="center">
    <img  src="pics/Login.jpg">
    <p align="center" style="font-size:80%; margin-top: -1.5em;">A kép szemlélteti a bejelentkezés lefutásának menetét.</p>
</p>

### 9.2. Adat hozzáadása

Adat hozzáadása esetén meg kell adnunk az új adatokat ezt a program ellenörzi és amenyiben minden típus megfelelönek bizonyult a hozzáadás megtörténik. Abban az esetben ha típushibát észlel a szoftver egy felugró ablak keretén belül értesitést kapunk erről amit le okézva a hozzáadás ablakra térhetünk vissza.
<p align="center">
    <img src="pics/AddData.jpg">
    <p align="center" style="font-size:80%; margin-top: -1.5em;">A kép szemlélteti az új adat hozzáadás lefutásának menetét.</p>
</p>

### 9.3. Adat módosítása

Egy adat módosításakor a módosítani kívánt egye betöltésre kerül a szerkesztés ablakban. Itt kiválasztjuk és módositjuk azt az adatot/adatokat amelyeket szeretnénk és a mentés gombra kattintunk. Ekkor amenyiben megfelelő típusu adatokat adtunk meg az adatok módosulnak az adathalmazban. Amenyiben hiba lép fel egy felugro abblak figyelmeztet minket amit le okézva a szerkesztés ablakra térhetünk vissza.
<p align="center">
    <img src="pics/ModifyData.jpg">
    <p align="center" style="font-size:80%; margin-top: -1.5em;">A kép szemlélteti a módosítás lefutásának menetét.</p>
</p>

### 9.4. Adat törlése

Törléskor ki kell választanunk egy sort a táblából amit törölni szeretnénk majd a Törlés gombra kattintunk. Amenyiben az adat létezik egy megerősítés után az adat törlödik is az adatbázisból. Ha nem választotunk ki vagy nem létezik az adat hiba üzenetet kapunk és nem hajtódik végre törlés.
<p align="center">
    <img src="pics/DeleteData.jpg">
    <p align="center" style="font-size:80%; margin-top: -1.5em;">A kép szemlélteti a törlés lefutásának menetét.</p>
</p>

### 9.5. Számlakiálítása

Számlakiálításkor ki kell választanunk egy sort a táblából akinek a nevére ki szeretnénk állítani a számlát. Amenyiben az adat létezik a számla kiálítása megtörténik. Ha nem választotunk ki vagy nem létezik az adat hiba üzenetet kapunk és nem hajtódik végre a számla kiálítás.
<p align="center">
    <img height="100%" src="pics/MakeABill.jpg">
    <p align="center" style="font-size:80%; margin-top: -1.5em;">A kép szemlélteti a számlakiálítás lefutásának menetét.</p>
</p>

### 9.6. Hardver és hálózati topológia

A felhasználói gépeknek el kell érniük az adatbázis szerverként üzemelő központi gépet, mivel a dolgozók a szoftveren keresztül az itt tárolt adatokat fogják elérni. A cél platformunk a panzió tulajdonában lévő számítógépek melyeknek hardvere 8 GB DDR4 és RAM-ból, egy Intel Core i7-9750H 2.60GHz típusú processzorból és egy NVIDIA GeForce GTX 1660ti típusú videokártyából állnak, de ennek ellenére a szoftverunket úgy terveztük, hogy bármely 2000 után piacra dobot számítógépen el tudjon futni. Ezeken Windows 10 operációs renszer fut. A programunk viszont fut linux alapu operációs rendszerek alatt is. 

## 10. Fejlesztő eszközök

A projektet Java 14-be készítetük aminek projektmenedzsmentjéhez az Apache Maven használtuk. A grafikus felületet JavaFX 14-be készítettük. A szoftver által használt adatbázis MySQL alapú relációs adatbázis.

## 11. Architekturális terv 

A rendszert felépítő alrendszerek (szoftver komponensek) lényegében a Java, Sql, Mavan használata Java FX keretén belül. Az alrendszerek meghatározása után a tulajdonságaikat kiaknázva vezérlési, valamint kommunikációs kapcsolatokat lehet létrehozni ezáltal. Ezeknek a komponenseknek és a köztük fennáló kapcsolatok alkotják a szoftver architektúráját. A rendszer szerepe az érdekelt szereplő kommunikációjának lehetővé tétele, a korai fejlesztési fázisok döntéseinek támogatása. Emelett fontos az újrafelhasználhatóság elősegítése. Ennek meghatározásában nagy szerepet játszik a környezet, a fejlesztők céljai és stratégiája által befolyásolt követelmények. De mint minden tervnek ennek is megvannak a meghatározó pillérjei:

* Architektúrát meghatározó fejlesztő szervezet szerkezetéből
* Szereplők
* Követelmények
* Technológiai környezet
* A tervező tapasztalata
  
Architektúra elemek:

* Architektúrális minta
   * típus elemek és kapcsolatok, kényszerek
   * pl. kliens-szerver minta
*  Referencia modell
   * standard funkcionális felosztás és adatfolyam megoldások
   * pl. adatbázis kezelő rendszer
* Referencia architektúra
   * referencia modell leképezése szoftver elemekre
   * pl. ISO OSI architektúra

### 11.1. Rendszer bővíthetősége  

A rendszer teljesen objektum orientált szemlélet szerint kerül implementálásra vagyis a rendszer egy bizonyos szinten alkalmas lesz a bővítésre.

### 11.2. Biztonsági funkciók 

A szoftverben biztonsági funkciók implementálását nem terveztük.

### 11.3. Adatbázis terv

Az alkalmazásunk egy MySQL alapú adatbázist fog kezelni. Ez az adatbázis egy táblából, a Vendég táblából fog állni. Ez a tábla tartalmazni fogja a vendégek nevét, telefonszámát, email címét, a szoba kivételének dátumát, a szoba elhagyasának dátumát, a szoba típusát(1, 2 vagy 3 ágyas) illetve a vendég által fizetendő összeget.
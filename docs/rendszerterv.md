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
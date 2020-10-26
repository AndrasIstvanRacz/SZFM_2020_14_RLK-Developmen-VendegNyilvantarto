## 5. Igényelt üzleti folyamatok
A program inditása egy bejelentkező ablakkal indul. Belépés után a program alapvetően egy oldalsó menűsávból és egy funkcíó képernyőből áll. Az oldalsó menüsáv feladata, hogy konyedén tudjunk navigálni a különböző funkciók között, amit a funkcióképernyőn fog megjeleníteni a szoftver. A menüsávon jogosultságtól függően különböző funkciók érhetök el. Egy dolgozó számára lehetőség van vendég felvételére, keresésére illetve számla kiálítására. Ezzel szemben egy adminisztrátor jogkörrel rendelkező felhasználó képes új dolgozó felvételére, az adatok módosítására és törlésére, továbbá adminisztrátor jog kiosztására a dolgozók között. A program célja, hogy egy SQL alapú adatbázis előnyeit ki tudjuk használni SQL utasítások írása nélkül. Így a mi feladatunk, hogy az adatbázis fontosabb funkciói használatára lehetőséget biztosítsunk a felhasználók számára. 

A következő funkciók a fontosabbak:
* Hozzáadás
* Lekérdezés
* Módosítás
* Törlés

Ezen funkciók könnyed eléréséhez egy grafikus felületett biztosítunk, így megkönnyítve a program használatát a felhasználok részére. Az első említet funkció, a hozzáadás, egy új elem hozzáadását jelenti ahhoz a táblához, vendég vagy dolgozó. Új vendég megadásakor a név, a szoba száma, a szoba használatának kezdő időpontja mezők kitöltése kötelező, illetve minden vendég rendelkezni fog egy azonosítoval amit a szoftver general. Minden vendég felvételekor szerepelni fog, hogy melyik dolgozó vette fel a rendszerbe amit a program automatikusan fog meghatározni a belépet felhasználó alapján. másik három funkció az ezen hozzáadásokból létrejöt táblat fogja használni. A lekerdezés a táblában lévő adatok grafikus megjelenítését jelenti, illetve a lekért adattáblában való keresésre is lehetőséget ad. Továbbá lehetőség lesz az adatok módosítására és törlésére is (Ez csak az adminisztrátorok számára elérhető). A szerkesztésre egy vendég kiválasztásával majd a szerkesztés gomb megnyomásával lesz lehetőség. Ezáltal felugrik egy szerkesztés ablak amin keresztül módosithatjuk a kivánt adatokat. A törlés hasonlóan a szerkesztéshez zajlik, kiválasztunk egy vendéget majd a törlésgomb megnyomásával töröljük azt.

## 6. Képernyőtervek
Az alkalmazásnak próbáltunk a lehető legmegfelelőbb kinézetet megalkotni, amely megkönnyíti a használatot, viszont megjelenése igényes, modern hatást keltsen az alkalmazás használójának. Ehhez JavaFX 14-et használtunk amely lehetőséget adott nekünk a letisztult és átlátható design megalkotására és ugyanakkor rengeteg fontos és hasznos felhasználói eszköz megvalósítását egyszerűsíti. 
### 6.1. Bejelentkezés
A program egy bejelentkező abblakal fog indulni. Az ábrán látható, hogy itt meg kell adnunk a felhasználonevünket és jelszavunkat majd a bejelentkez gomb megnyomásával belépünk a programba. Amenyiben mégsem szeretnénk bejelentkezni lehetőségünk van a kilépésre a Bezárás gombal. A bejelentkezés gomb lenyomása után felhasználó jogosultságától függően vagy az adminisztrátor vagy a dolgozói felület fog megjelenni.
<p align="center">
    <img width="50%" height="50%" src="pics/Bejelentkezes.png">
    <p align="center" style="font-size:80%;">A kép csak szemléltetés céljából készült, NEM a végleges kinézet a grafikus felületnek.</p>
</p>

### 6.2. Adminisztrátori felület
A bejelentkezés után amenyiben rendelkezünk adminisztrátori jogosultsággal egy oldalsó menüsávot fogunk látni mellete pedig egy munkaterületet. A menüsávon két menüpont található, a dolgozó és a vendég. Az első képen a dolgozó menüpontot választotuk ki. Itt láthatjuk, hogy van egy táblázatunk amiben az adatokat láthatjuk. Alapértelmezeten itt kiíratjuk az összes adatot ezért a könyebb keresés érdekébe lehetöség van, oszloponként, keresni a táblázatban. Ezt ugy tehetjük meg, hogy kiválasztjuk az oszlopot, beirjuk a kereset értéke és rákatintunk a keresés gombra, ezáltal lecsökentve a táblázatban szereplő adatok menyiségét. A képen alul további három gombot láthatunk Törlés, Szerkesztés, Hozzáadás. Az első kettő használatához az első lépes egy sor kiválasztása lesz a táblából. Ez egyszeruen az adot sor katintva tehetjük meg. Miutána a sort kijelöltük eldonthetjük, hogy töröljük-e vagy szerkeszteni kivánjuk az adott sort. A törléshez csak rá kell katintanunk a Törlés gombra és egy megerösités után töröltük is a kiválasztot elemet az adatbázisból. Amegyiben az előbb kiválasztot elemet szerkeszteni szeretnénk egyszerüen rá kell katintanunk a Szerkesztés gombra. Ez azt fogja eredményezni, hogy felugrik egy szerkesztés ablak amin belül a kívánt módositásokat végrehajthatjuk . A Hozzáadás gomb új elem hozzáadást fogja jelenteni az adatbázisunkba. Erre rákatintva megnyilik egy ablak amin belül felvehetjük a kivánt elemet. [(A szerkesztés és hozzáadáshoz tartozó ablak részletes kifejtés a 6.4. alfejezetben)](https://github.com/RaczDevelopment/SZFM_2020_14_RLK-Developmen-VendegNyilvantarto/blob/master/docs/funkspec.md#64-hozz%C3%A1ad%C3%A1sszerkeszt%C3%A9s)
<p align="center">
    <img width="100%" height="100%" src="pics/AdminKepernyotervDolgozo.png">
    <p align="center" style="font-size:80%;">A kép csak szemléltetés céljából készült, NEM a végleges kinézet a grafikus felületnek.</p>
</p>
A második, Vendég menüpontot láthatjuk a második ábrán. Itt hasonló funkciókat láthatun amelyek ugyan azon elven működnek mint az elöző menüpontban lévök. Egy új gombot azonban található itt Számla létrehozás néven. Ennek a feladata, hogy kiálitson egy számlát egy adott vendégnek.
<p align="center">
    <img width="100%" height="100%" src="pics/AdminKepernyotervVendeg.png">
    <p align="center" style="font-size:80%;">A kép csak szemléltetés céljából készült, NEM a végleges kinézet a grafikus felületnek.</p>
</p>

### 6.3. Dolgozói felület 
Ezt a fületet azok a dolgozók látják amelyek nem rendelkeznek adminisztrátori jogosultsággal. Dolgozó férhet hozzá a dolgozók adataihoz, nem szerkeszthetik nem módosithatnka azon. Számukra csupán a vendég adattábla áll rendelkezésükre és ennek manipulálása is csak limitált mértékben. Egy dolgozó láthatja a vendégek adatait, kereshet az adattáblában és hozzáadhat új adatot de nem módosihatja és törölheti azokat. Továbba képesek még számlát kiálítani barmely vendég számára. [(Az itt található funkciók a 6.2. alfejezetben leírt módon müködnek)](https://github.com/RaczDevelopment/SZFM_2020_14_RLK-Developmen-VendegNyilvantarto/blob/master/docs/funkspec.md#62-adminisztr%C3%A1tori-fel%C3%BClet)
<p align="center">
    <img width="100%" height="100%" src="pics/DolgozoKepernyoterv.png">
    <p align="center" style="font-size:80%;">A kép csak szemléltetés céljából készült, NEM a végleges kinézet a grafikus felületnek.</p>
</p>

### 6.4. Hozzáadás/Szerkesztés
Ez az ablak a szerkesztés illetve a hozzáadás gombal jelenithető meg. Az ablakon két gombot találhatunk, Mentés és Elvetés. A Mentés gombra kattintva mentjük az új adatot az adathalmazba. Amenyiben mégsem szeretnénk hozzáadni vagy módosítani adatot akkor az Elvetés gombra kattintva egyszerüen bezárhatjuk az ablakot. A képen láthatunk még mezőket, ezeknek a száma az adattábla méretétől függöen változhat, amelyek az adatok megadására szolgálnak. Ha hozzáadni szeretnénk adatot akkor ezek a mezők üresek lesznek. Amenyiben viszont egy elemet szerkesztünk akkor az ablak a kiválasztot sor adatait fogja rndre betölteni.
<p align="center">
    <img width="50%" height="50%" src="pics/Szerkesztes.png">
    <p align="center" style="font-size:80%;">A kép csak szemléltetés céljából készült, NEM a végleges kinézet a grafikus felületnek.</p>
</p>
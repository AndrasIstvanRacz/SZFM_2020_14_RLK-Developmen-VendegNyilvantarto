# Követelményspecifikáció

## 1.Bevezetés

A koronavírus ugyanolyan rossz hatással volt hazánk turizmusára is mint a többi Európai országéra.
 A tavasszal országosan elrendelt karantént a Balaton környéki panziók is megérezték, mivel a tavalyi évhez képest
 a forgalom jelentősen csökkent, ezzel nagy mértékben csökkentve a forgalmat.
 Általánosságban véve tavasszal és nyáron egy Balaton parti panzió nagy forgalommal jár,
 az emberek szívesen jönnek egy meghitt, családias hangulatú helyre nyaralni.
 Viszont idén a karantén bevezetése után sajnos a tavaszi hónapokban a vendégeknek és nyaralni kívánóknak
 nem volt lehetősége igénybe venni a szolgáltatásunkat.
 Szerencsére mihelyt beköszöntött a nyár egyre több vendég választotta kikapcsolódásként a Balatont.
 Ennek köszönhetően elgondolkodtunk azon, hogy valamilyen alternatív megoldást kéne kitalálni a vendégeink
 adatainak a tárolására, mivel eddig ez úgy valósult meg, hogy erre a célra alkalmas füzetekben tároltuk az adatokat.
 Napjainkban azonban, hogy versenyképesek tudjunk maradni nyitnunk kell a modern technologia felé.
 Éppen ezért a vezetés engyhangúan úgy döntött, hogy alkalmazkodik az új követelményekhez,
 és egy gyors és hatékony számítógépes rendszerre cseréli a hagyományos, papír alapú könyvelést.
 Ehhez szükség lenne egy alkalmazásra amely akár több munkaállomáson is futhat de mégis egy és ugyan azon
 adathalmazt éri el. Ehhez tudunk biztosítani egy központi gépet amelyhez a munkaálomásoknak hozzáférést
 biztosítunk. Ilyen módon növelhetjük a hatékonyságunk mivel egyszerre több vendéggel is foglalkozhatunk
 párhuzamosan. Mivel a döntés nem régen született meg ezért először a legfontosabb funkciók fejlesztése
 fog megtörténni, majd a visszajelzések alapján priorizáljuk a további fejlesztéseket a felhasználói
 igények alapján.
 
## 2. Jelenlegi helyzet

A Balaton egyre keresettebb nyaralási helyszín a belföldi valamint a külföldi turisták számára.
Ez a növekedés azt eredményezi, hogy az utóbbi években a panziónkban is megugrott az ide látogató vendégek száma.
A gyors növekedés viszont megnöveli az adminisztrációs munkát amit eddig papíron oldottunk meg.
Dolgozóinknak egy vendégről több adatott is rögziteni kell például:

* Két különböző hatáskörű dolgozónk van: a recepciós(dolgozó) illetve a főnök(admin)
* A főnök  nagyobb hatáskörrel rendelkezik és a többi dolgozó adatainak kezelése is az ő dolga
* A recepciós csupán felvehet vendéget, vagy számlát állíthat ki, a többi a főnök dolga
* Fel kell vennünk a vendég nevét
* Rögzitenünk kell a telefonszámát és email cimét

## 3. Vágyálom rendszer

A vezetőség közös elhatározásra jutott azzal kapcsolatban, hogy a klasszikus papír, ceruza alapú adminisztrációs rendszer már nem elég hatékony. Ezért elkezdtünk gondolkodni, hogy mi lenne a legoptimálisabb megoldás. A gondolkodás közepette több ötlet is felvetésre került viszont az egyik ötlet kiemelkedően a legalkalmasabbnak tűnt mivel a vezetőség egydöntetűen tetszését nyilvánította azzal kapcsolatban, hogy egy alkalmazásra lenne szükség ami tárolja az adatokat. Az alkalmazással kapcsolatban a legfontosabb kritérium az, hogy képes legyen tárolni a jelenlegi helyzet pontban emlitett adatokat. Vendégek felvételéhez valamint az eltárolt adatokhoz elérést kel biztosítani a dolgozóink számára, hogy a vendégek adatait lássák és számlát tudjanak kiállítani. Valamint szeretnénk ha a rendszer úgy nézne ki, hogy ha lenne két különböző jogosultsággal bíró csoport az adminisztrátor jogú felhasználó és a dolgozó jogosultságú. A dolgozó jogosúltságú felhasználó képes legyen új vendég felvételére, vendégek közti keresésre valamint számla kiállítására. Ez azért fontos, mert a biztonságra való törekvés szempontjából úgy szeretnénk kialakítani a rendszert, hogy az adminisztrátor jogú felhasználó képes legyen minden olyan dolgot végrehajtani amit a dolgozó jogosúltsággal rendelkező is meg tud tenni, plussz ezen kívűl képes legyen vendégek adatainak a szerkesztésére, törlésére valamint új dolgozó felvételére, keresésére valamint a dolgozó adatainak módosítására, számla kiállítására és adminisztrátor jogot adni a dolgozóknak.

## 4. Jelenlegi üzleti folyamatok

A panzióban jelenleg minden vendégünkkel kapcsolatos folyamatot papíron alapúló rendszerünk segítségével adminisztráltunk. Ha úgy adódik, hogy egy új személy szeretné igénybe venni a panziónk szolgáltatásait, akkor kézzel írott listánknak a végére vesszük fel az adatait, illetve ha később az adat felvételkor elkövetett hiba miatt egy vagy több adatot meg kell változtatni, akkor a módosítást szintén ebben a hosszú listában hajtjuk végre. Be kell látni, hogy ez a módszer a vendégek nagy létszáma mellett nem hatékony és egy esetleges hiba esetén pedig a módosítás sok keresésbe és időbe telik. Ha egy vendég azzal az igénnyel érkezik a panzióba, hogy szobát szeretne kivenni, akkor a folyamat azzal kezdődik, hogy a recepciós megnézi a füzet alapján melyik szoba üres és ha talál egy megfelő szobát, akkor feljegyzi a vendég adatait, hogy ki és milyen szobát kért, valamint mennyi időre vette ki. Amikor a vendég a szobát elhagyja, a recepciós feljegyzi, hogy a szoba mikor került elhagyásra. Természetesen ha a vendég adataiban valamilyen változás történik vagy vissza kell keresni, akkor a könyvben egyessével a többi vendég adatait is átnézve kell kikeresni az aktuális vendég adatait. Ez a módszer, ahogy már említve is volt elég hosszadalmas és fáradságos munkát igényel. Ennek a kiküszöbölése érdekében egy digitális alkalmazással szeretnénk megoldani ezt a munkafolyamatot. Viszont mivel a diszkréció és a biztonság is elég fontos szempont számunkra ezért úgy szeretnénk kivitelezni a rendszert, hogy a recepciós az alkalmazás használata során ne kapjon jogosúltságot arra, hogy a vendégek adatait kénye kedvére tudja módosítani. Ennek a kritériumnak eleget téve úgy gondoltuk, hogy létrehozunk egy adminisztrátor jogosúltsággal rendelkező felhasználót az alkalmazásban aki képes arra, hogy az adatokat módosíthatja. Ezt a lépést azért tettük meg, hogy a vendégek adatai diszkréten legyen kezelve valamint a biztonság sem elhanyagolható abból a szempontból sem, hogy a számla kiállítása esetén a vendég valós adatai szerepeljenek ott.

## 5.Igényelt üzleti folyamatok modellje

A panziónk szeretné kiküszöbölni a jelenlegi analóg rendszer általi nehézségeket így, mint minden kisebb-nagyobb vendéglátó egység mi is szeretnénk a digitalis rendszerre átálni. A program funkciói között szerepel a legtöbb jelenlegi folyamat digitális változata. Nem ragaszkodnak az online adatbázishoz, illetve biztosítunk egy lokális adatbázist. A rendszernek meg kell tudnia különböztetni két felhasználótípust, adminisztrátort és dolgozót. Az adminisztrátornak teljes hozzáférése van az adatbázishoz. Képes felveni új vendéget és dolgozót illetve képes módosítani azoknak az adatait. Ezzel szemben a dolgozó csak vendég felfételére és a vendégek közti keresésre jogosúlt, illetve számla kiálitására. A dolgozok táblához a dolgozoknak nincs hozzáférése. Új dolgozó felhasználót csak adminisztrátor tud késziteni és törölheti is. Továbbá az adminisztrátor képesnek kell lennie adminisztrátor jog kiosztására is.

## 6.Követelménylista

1. Egy rendszer képes a dolgozok adatainak tárolására
2. Egy rendszer ami képes a vendégek adatainak tárolására
3. Egy rendszer ami képes két felhasználótípus megkülönböztetésére, adminisztrátor és dolgozó.
4. Az adminisztrátor jogú felhasználó képes új vendég felvételére.
5. Az adminisztrátor jogú felhasználó képes vendég keresésére.
6. Az adminisztrátor jogú felhasználó képes vendég adatainak szerkesztésre.
7. Az adminisztrátor jogú felhasználó képes vendég törlésére.
8. Az adminisztrátor jogú felhasználó képes új dolgozó felvételére.
9. Az adminisztrátor jogú felhasználó képes dolgozó keresésére.
10. Az adminisztrátor jogú felhasználó képes dolgozó adatainak szerkesztésre.
11. Az adminisztrátor jogú felhasználó képes dolgozó törlésére.
12. Az adminisztrátor jogú felhasználó képes számla kiálítására.
13. Az adminisztrátor jogú felhasználó képes adminisztrátor jogot adni a dolgozónak.
14. A dolgozó jogosúltságú felhasználó képes új vendég felvételére.
15. A dolgozó jogosúltságú felhasználó képes vendégek közti keresésre.
16. A dolgozó jogosúltságú felhasználó képes számla létrehozására.
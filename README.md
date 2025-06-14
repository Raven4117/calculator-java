# Code Analysis Report

## File: `Calculator.java`
- Lines of Code (LOC): 143
### Zapazanja:
- Nema komentara ni dokumentacije u kodu.
- Ponavljanje koda: Ista logika za množenje, deljenje, sabiranje i oduzimanje se više puta ponavlja. Ovo krši DRY (Don't Repeat Yourself) princip.
- Loša konvencija imenovanja:
- `ToString()` metoda ne pretvara objekat u string, već vraća simbole operacija — naziv je zbunjujuć.
- Potencijalni problem: Nema provere za deljenje nulom — u Javi, deljenje sa nulom daje `Infinity` ili `NaN`
- Korišćenje isključivo statičkih metoda i promenljivih, preporuka je izbegavati nepotrebno statičko stanje u klasi.
- Magic Strings i Magic Chars:** Simboli operacija su ispravno definisani kao konstante unutar klase `Operations`, što je dobra praksa.
- Nema unit testova ni detaljnog upravljanja greškama: Kod trenutno vraća `"ERROR"` kada parsiranje ne uspe, što je neprecizno — preporuka je vraćati deskriptivne poruke o grešci.
- Formatiranje koda:
- Nedosledno korišćenje razmaka (nekad nedostaju razmaci između operatora, zagrada i viticastih zagrada).
- Nema praznih linija između logički odvojenih blokova koda (na primer, između parsiranja operacija i parsiranja brojeva).

---

Preporuke za poboljšanje:
- Poštovati Java konvenciju imenovanja (`camelCase` za metode).
- Dodati JavaDoc komentare koji opisuju klase i metode.
- Implementirati validaciju unosa i rukovanje greškama, posebno za slučaj deljenja nulom.
- Koristiti linter za automatsko pronalaženje problema u formatiranju i potencijalnih grešaka.

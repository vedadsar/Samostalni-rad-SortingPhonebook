# SortHomework

Date su klase `Person` i `PhonebookApp` (pogledajte priloženi link).

1. Implementirati metode `sortByFirstName` i `sortByLastName` klase `PhonebookApp` tako da sortiraju niz osoba po imenu, odnosno prezimenu koristeći **insertion sort**

2. Obratite pažnju na rezultate pod prezimenom "Hodžić". Zakomentarišite liniju `sortByFirstName` i pogledajte rezultate pod istim prezimenom ponovo. Šta primjećujete? Kako biste okarakterisali ovu osobinu sortiranja? Da li se isti efekat dešava ako koristimo *selection* ili *bubble sort*?

3. Dat je i interface `Comparator`. U klasi `PhonebookApp` dodati metodu `sortWithComparator` koja prima dva argumenta: niz osoba i objekat klase koja implementira `Comparator` interface. Zamijenite korištenje metoda `sortByFirstName` i `sortByLastName` tako što ćete koristiti `sortWithComparator` s dva različita komparatora: jedan koji poredi imena, a drugi koji poredi prezimena.

# PO-Kolejka-FIFO
Zadanie 10 z PO
Zaimplementuj klasę (moduł zleceniobiorca) FIFO (First-In-First-Out) reprezentującą kolejkę liczb naturalnych z zakresu od 0 do N (N - parametr konstruktora) z ograniczoną pojemnością (pojemność maksymalna to również parametr konstruktora). Metody kolejki powinny kontrolować poprawność wywołań i w razie potrzeby wyrzucać wyjątki z odpowiedniej klasy (w ramach programu powinna powstać odpowiednia hierarchia klas wyjątków wywiedziona z klasy Exception). Minimalny zbiór sytuacji "wyjątkowych" obejmuje:

kolejka pusta,

kolejka pełna,

nieodpowiednia liczba (obiekt wyjątku dodatkowo przechowuje wartość błędnie wpisanej liczby).

Program (moduł-zleceniodawca) powinien zawierać menu umożliwiające operacje na kolejce oraz reagować na błędy (wyjątki) w następujący sposób:

kolejka pusta - zakończenie programu po wypisaniu stosu wyjątku ('printStackTrace()'),

kolejka pełny - informacje tekstowa oraz wypisanie stosu wyjątku,

nieodpowiednia liczba - informacja na ekran (wraz z tę nieodpowiednią liczbą odczytaną z obiektu wyjątku !) i ponowna próba wczytania liczby i włożenia jej do kolejki (do skutku).

Który moduł należy zmodyfikować, żeby zmienić reakcję na konkretną błędną sytuację ?  

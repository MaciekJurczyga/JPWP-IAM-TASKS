# JPWP-IAM-TASKS
# ZADANIA DO CZĘŚCI PRAKTYCZNEJ
Zadania 1 - 3 polegają na zbudowaniu prostego Identity and Access Management system.
Zadanie 4 to zadanie na wykorzystanie wyrażeń regulranych.
Poniżej znajdziecie instrukcje, jednak w kodzie są też dokładniejsze komenatrze w miejsach, 
w których neleży wpisać kod. 
W zadaniach 1-3, każde kolejne zadanie ma już zaimplementowany kod z poprzednich, więc w razie problemów można tam zaglądnąć. 
<br>
# ZADANIE 1 
**Cel zadania**: 
możliwość utworzenia stworzenia konta użytkownika. <br>
W tym zadaniu należy otworzyć projekt z katalogu /1/Zadanie_1_backend. <br>
Projekt zawiera szkielet aplikacji w springu, pozwalający na komunikacje z bazą danych 
oraz przechwytywanie rządań z przeglądarki. <br>
**Polecenia:**  
W klasie User stworzyć 4 kolumny w bazie danych, kolejno ID, Name, Email, Password. <br>
W klasie Repository dopisać odpowiednią klasę, po której dziedziczy nasz interfejs. <br>
W klasie UserController dodać odpowiednią adnotacje do metody createUser. <br>
W klasie UserServcie stworzyć pole reprezentujące nasze repozytorium. <br>
**Testowanie:**  <br>
Odpal aplikację, następnie z poziomu terminala wykonaj polecenie: <br>
Invoke-WebRequest -Uri "http://localhost:8080/api/users" -Method POST -Headers @{"Content-Type"="application/json"} -Body '{"name": "enter_name", "email": "enter_email", "password": "enter_password"}' <br>
Komenda ta sprawi, ze wyślemy zapytanie z odpowiednimy danymi do rejestracji. <br>
Jeśli wszystko jest zrobione poprawnie, w bazie danych powinien pokazać się nowo stworzony user, możesz to sprawdzić używając narzędzia MySQL Workbench. <br>
<br>
# ZADANIE 2
**Cel zadania:** <br>
Połączenie poprzedniego zadania z frontendem, funkcja register. <br>
W katalogu 2 znajdują się 2 projekty, zadanie_2_backend i zadanie_2_backend, tym razem w backendzie nie trzeba nic zmieniać, 
będzie on tylko potrzebny do testowania.
**Polecenia:** <br>
W projekcie Zadania_2_frontend w katalogu /src/Components/Fun/Register znajduje się funckja register. Należy w niej stworzyć odpowiednie zapytanie do naszego serwera
używając biblioteki axios. 
**Testowanie:** <br>
Odpal aplikacje backend i frontend. 
**Uwaga:** aplikacje Zadania_2_frontend odpala się za pomocą komendy **npm start**. <br>
Stwórz nowego użytkownika, zatwierdź dane i sprawdź czy pojawił się w twojej bazie używająć narzędzia MySQL workbench za pomocą komendy SELECT * FROM acc_mang_database.users_example







 

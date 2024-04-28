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
będzie on tylko potrzebny do testowania. <br>
**Polecenia:** <br>
W projekcie Zadania_2_frontend w katalogu /src/Components/Fun/Register znajduje się funckja register. <br>
Należy w niej stworzyć odpowiednie zapytanie do naszego serwera
używając biblioteki axios. <br>
**Testowanie:** <br>
Odpal aplikacje backend i frontend. 
**Uwaga:** aplikacje Zadania_2_frontend odpala się za pomocą komendy **npm start**. <br>
Stwórz nowego użytkownika, zatwierdź dane i sprawdź czy pojawił się w twojej bazie używająć narzędzia MySQL workbench za pomocą komendy SELECT * FROM acc_mang_database.users_example
<br>
# ZADANIE 3
**Cel zadania:** <br>
Implementacja mechanizmu logowania użytkownika. <br>
W tym zadaniu należy dopisać kod zarówno w backendzie, jak i frontendzie. <br>
**Polecenia:** <br>
**Frontend:** <br>
W katalogu /src/Components/Fun/Login znajduje się funckja Login, należy dopisać w niej zapytanie z danymi logowania, analogicznie jak w zadaniu 2. <br>
**Backend** <br>
W interfejsie Repository zdefiniuj metodę findByEmail(). <br>
W klasie UserService dopisz odpowiedni return statement w metodzie getUserByEmail. <br>
W klasie UserController należy stworzyć obiekt klasy User na podstawie dokończonej implemetacji metody getUserByEmail oraz emailu z zapytania. <br>
**Testowanie:** <br>
Odpal aplikacje, analogicznie jak w zadaniu drugim, stwórz użytkownika i spróbuj się zalogować. <br> 
Jeśli wszystko się udało, powinieneś zobaczyć alert: Zalogowano! 

# ZADANIE 4
**Cel zadania:** <br>
Implementacja prostych wyrażeń regularnych. <br>
**Polecenia:** <br>
Należy dokończych implemetnacje metod w klasie main dodając odpowiedni pattern wyrażenia regularnego.<br>
**Testowanie:** <br>
Modyfikuj zmienną password w celu sprawdzania, czy wyniki w konsoli są takie jak oczekiwano <br>









 

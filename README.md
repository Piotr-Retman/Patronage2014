Patronage2014
=============

Musimy mieć:

1)Skonfigurowanego i zainstalowanego mavena 

2)Skonfigurowanego i zainstalowanego Tomcata
Czynności:

1)Ściagamy projekt przez kliknięcie w repozytorium DOWNLOAD ZIP i rozpakowujemy go na Pulpicie

2)otwieramy cmd.exe i przechodzimy do projektu rozpakowanego

3) Uruchamiamy mavena poprzez wpisanie: mvn clean install tomcat7:run

4) Projekt jest wygenerowany teraz pozostaje otworzenie przeglądarki i wpisanie np adresu:

http://localhost:8080/api/hello?person=Willson wówczas naszym oczom powinien się ukazać JSON o wyglądzie : 

{"message":"Hello,Willson"}



:) i gotowe.

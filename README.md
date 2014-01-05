Musimy mieć:

1)Skonfigurowanego i zainstalowanego mavena

2)Skonfigurowanego i zainstalowanego Tomcata 

3)Zainstalowany SOAP UI
Czynności:

1)Ściagamy projekt przez kliknięcie w repozytorium DOWNLOAD ZIP i rozpakowujemy go na Pulpicie

2)otwieramy cmd.exe i przechodzimy do projektu rozpakowanego

3) Uruchamiamy mavena poprzez wpisanie: mvn clean install tomcat7:run

4) Testujemy projekt z poziomu programu SOAP UI - rekomenduję rozpoczęcie testowania od metody POST gdyż domyślnie
lista jest pusta.

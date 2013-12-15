Patronage2014
=============

Musimy mieć:

1)Skonfigurowanego i zainstalowanego mavena 
2)Skonfigurowanego i zainstalowanego Tomcata (jezeli nie mamy to najszybsza instalacja przebiega dzięki programowi => XAMPP 1.8.1

Czynności:

1)Ściagamy .rar projektu i rozpakowujemy

2)otwieramy cmd.exe i przechodzimy do projektu rozpakowanego np na Pulpicie

3) Uruchamiamy mavena -> mvn package

4) Otwieramy folder target i kopiujemy plik zad2-1.0-SNAPSHOT.war do katalogu webapps Tomcata (jezeli jest to XAMPP 1.8.1 to ścieżka brzmi domyślnie tak: C:/xampp/Tomcat/webapp

5) Odpalamy Tomcata -> Jezeli mamy XAMPP 1.8.1 to uruchamiamy plik wsadowy Windows o nazwie catalina_start.bat jezeli dostaniemy komunikat o tym że serwer jest gotowy to mozemy dla pewnosci otworzyć XAMPP Control Panel i sprawdzić czy Tomcat faktycznie działa (porty domyslne to 8080,8009,8005)

6) jezeli tomcat dziala włączamy przeglądarkę internetową np Chrome i wpisujemy np taki adres: 

http://localhost:8080/api/hello?person=Willson wówczas naszym oczom powinien się ukazać JSON o wyglądzie : 

{"message":"Hello,Willson"} :) i gotowe.

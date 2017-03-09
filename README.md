# Relazione tecnica **ChildrenClothesSurf**

Il progetto prevede la realizzazione di un sito che permetta ai genitori di __cedere/trovare vestiti dei/per i propri figli__.
Questo presuppone che l'utilizzo sia non troppo gravoso per un DB di poccole dimensioni quale MySQL o simili.

I principali compiti previsti per questo sito i seguenti:
* gestione utenti
	- amministratori
		+ dovranno poter vedere tutti i post degli utenti ed approvarli ad uno ad uno
	- utenti
		+ dovranno essere geolocalizzati
		+ potranno inserire i propri capi
		+ cercare capi
		+ contattare utenti con un messaggio ed essere conattati da altri utenti vedendo un numero che mostri i messaggi non letti


-------------

Date queste premesse il DB conterrÃ  le seguenti tabelle


__USERS__

| Colonna   | Tipo                         | Note                                                                |
|-----------|------------------------------|---------------------------------------------------------------------|
| id        | int(11) Auto Increment       |                                                                     |
| username  | varchar(100) UNIQUE NOT NULL |                                                                     |
| password  | varchar(100) NOT NULL        |                                                                     |
| active    | tinyint(1) NOT NULL          | usato per forzare una validazione                                   |
| action    | varchar(50) NOT NULL         | usato per rendere sicure azioni quali validazione, cancellazione... |
| role      | int(11) NOT NULL             | usato per dare ruoli e quindi permessi differenti agli utenti       |
| cittÃ      | varchar(200)                 |                                                                     |
| provincia | varchar(100) NOT NULL        |                                                                     |



__DRESSES__

| Colonna    | Tipo                   | Note                                                       |
|------------|------------------------|------------------------------------------------------------|
| id         | int(11) Auto Increment |                                                            |
| size       | varchar(100)           |                                                            |
| age        | varchar(100)           |                                                            |
| files      | varchar(100)           | usato salvare i possibili files con le foto dei vestiti... |
| colour     | varchar(100)           |                                                            |
| matherials | varchar(100)           |                                                            |
| id_user    | int(11) NOT NULL       |                                                            |



__MESSAGES__

| Colonna       | Tipo                   | Note                                                  |
|---------------|------------------------|-------------------------------------------------------|
| id            | int(11) Auto Increment |                                                       |
| message       | varchar(100) NOT NULL  |                                                       |
| has_been_read | tinyint(1) NOT NULL    | usato per mostrare quanti messaggi vi sono da leggere |
| from_userid   | int(11) NOT NULL       |                                                       |
| to_userid     | int(11) NOT NULL       |                                                       |



__ROLES__

| Colonna       | Tipo                   | Note |
|---------------|------------------------|------|
| id            | int(11) Auto Increment |      |
| role          | varchar(100) NOT NULL  |      |
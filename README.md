# projectSept

```sh
CREATE TABLE LOGSDBMS
   (USER_ID VARCHAR(20)    NOT NULL,
    DATED   DATE           NOT NULL,
    LOGGER  VARCHAR(50)    NOT NULL,
    LEVEL   VARCHAR(10)    NOT NULL,
    MESSAGE VARCHAR(1000)  NOT NULL
   );
   
select * from logsdbms;
```
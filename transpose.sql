<<<<<<< HEAD
--!!!!!!!!!!!!!!!!!!!!DO NOT TOUCH!!!!!!!!!!!!!!!!!!!!!!!!!
--!!!!!!!!!!!!!!!!!!!!DO NOT TOUCH!!!!!!!!!!!!!!!!!!!!!!!!!

--!!!!COPY THIS FILE INTO YOUR QUESTION FOLDER TO MAKE EDITS!!!!

--!!!!!!!!!!!!!!!!!!!!DO NOT TOUCH!!!!!!!!!!!!!!!!!!!!!!!!!
--!!!!!!!!!!!!!!!!!!!!DO NOT TOUCH!!!!!!!!!!!!!!!!!!!!!!!!!
--!!!!!!!!!!!!!!!!!!!!DO NOT TOUCH!!!!!!!!!!!!!!!!!!!!!!!!!

CREATE OR REPLACE TABLE GENDER_STAT_DB.TRANSPOSE_DATA (CountryName varchar(50), IndicatorCode varchar(30), 
YearsByCountry INTEGER, DATA FLOAT );

DELIMITER $$
CREATE PROCEDURE GENDER_STAT_DB.TRANSPOSE(MIN_VALUE INTEGER, MAX_VALUE INTEGER)
BEGIN

DECLARE YEAR INTEGER;
DECLARE COLNAME varchar(50);
SET YEAR = MIN_VALUE;

WHILE YEAR <= MAX_VALUE 
DO

SET @COLNAME = CONCAT('`',YEAR,'`');
SET @STATEMENT = CONCAT(
    'INSERT INTO GENDER_STAT_DB.TRANSPOSE_DATA (CountryName, IndicatorCode, YearsByCountry, Data)',
    ' SELECT CountryName, IndicatorCode, ', YEAR,',', @COLNAME,
    ' FROM GENDER_STAT_DB.gender_data',
    ' WHERE ', @COLNAME,
    ' IS NOT NULL'
);

PREPARE STMT FROM @STATEMENT;
EXECUTE STMT;
DEALLOCATE PREPARE STMT;

SET YEAR = YEAR + 1;
END WHILE;
END$$
DELIMITER ;

CALL GENDER_STAT_DB.TRANSPOSE(2010,2016);
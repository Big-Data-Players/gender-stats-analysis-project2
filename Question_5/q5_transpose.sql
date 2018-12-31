--!!!!!!!!!!!!!!!!!!!!DO NOT TOUCH!!!!!!!!!!!!!!!!!!!!!!!!!
--!!!!!!!!!!!!!!!!!!!!DO NOT TOUCH!!!!!!!!!!!!!!!!!!!!!!!!!

--!!!!COPY THIS FILE INTO YOUR QUESTION FOLDER TO MAKE EDITS!!!!

--!!!!!!!!!!!!!!!!!!!!DO NOT TOUCH!!!!!!!!!!!!!!!!!!!!!!!!!
--!!!!!!!!!!!!!!!!!!!!DO NOT TOUCH!!!!!!!!!!!!!!!!!!!!!!!!!
--!!!!!!!!!!!!!!!!!!!!DO NOT TOUCH!!!!!!!!!!!!!!!!!!!!!!!!!

CREATE TABLE transpose_data(CountryName varchar(50), IndicatorName varchar(250), 
YearsByCountry INTEGER, Data FLOAT );

DELIMITER $$
CREATE PROCEDURE gender_stat_db.TRANSPOSE(MIN_VALUE INTEGER, MAX_VALUE INTEGER)
BEGIN

DECLARE YEAR INTEGER;
DECLARE COLNAME varchar(50);
SET YEAR = MIN_VALUE;

WHILE YEAR <= MAX_VALUE 
DO

SET @COLNAME = CONCAT('`',YEAR,'`');
SET @STATEMENT = CONCAT(
    'INSERT INTO gender_stat_db.transpose_data (CountryName, IndicatorName, YearsByCountry, Data)',
    ' SELECT CountryName, IndicatorName, ', YEAR,',', @COLNAME,
    ' FROM gender_stat_db.gender_data',
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

CALL gender_stat_db.TRANSPOSE(2010,2016);
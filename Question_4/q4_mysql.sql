CREATE VIEW question_4_hive AS
SELECT CountryName, IndicatorCode, YearsByCountry, Data
FROM TRANSPOSE_DATA
WHERE IndicatorCode = 'SL.EMP.SELF.FE.ZS';
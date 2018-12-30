create table gender_data(CountryName varchar(50),CountryCode varchar(20),
IndicatorName varchar(500),IndicatorCode varchar(30),`1960` varchar(100),
`1961` varchar(100),`1962` varchar(100),`1963` varchar(100),`1964` varchar(100),`1965` varchar(100),`1966` varchar(100),
`1967` varchar(100),`1968` varchar(100),`1969` varchar(100),`1970` varchar(100),`1971` varchar(100),`1972` varchar(100),
`1973` varchar(100),`1974` varchar(100),`1975` varchar(100),`1976` varchar(100),`1977` varchar(100),`1978` varchar(100),
`1979` varchar(100),`1980` varchar(100),`1981` varchar(100),`1982` varchar(100),`1983` varchar(100),`1984` varchar(100),
`1985` varchar(100),`1986` varchar(100),`1987` varchar(100),`1988` varchar(100),`1989` varchar(100),`1990` varchar(100),
`1991` varchar(100),`1992` varchar(100),`1993` varchar(100),`1994` varchar(100),`1995` varchar(100),`1996` varchar(100),
`1997` varchar(100),`1998` varchar(100),`1999` varchar(100),`2000` varchar(100),`2001` varchar(100),`2002` varchar(100),
`2003` varchar(100),`2004` varchar(100),`2005` varchar(100),`2006` varchar(100),`2007` varchar(100),`2008` varchar(100),
`2009` varchar(100),`2010` varchar(100),`2011` varchar(100),`2012` varchar(100),`2013` varchar(100),`2014` varchar(100),
`2015` varchar(100),`2016` varchar(100));

-- Create View
-- `2000
-- `,`2001`,`2003`,`2004`,`2005`,`2006`,`2007`,`2009`
CREATE OR REPLACE VIEW question_5_hive AS
SELECT CountryName, IndicatorName,`2000`,`2001`,`2003`,`2004`,`2005`,`2006`,`2007`,`2009`,`2010`, `2011`, `2012`, `2013`, `2014`, `2015`,`2016` FROM gender_data
WHERE IndicatorCode = 'SE.TER.CMPL.MA.ZS' AND CountryName = 'United States';

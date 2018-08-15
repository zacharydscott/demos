set schema 'chinook';

SELECT COUNT(genreid), genreid FROM track 
	WHERE genreid BETWEEN 2 and 10
	GROUP BY genreid
    HAVING COUNT(genreid) > 100
    ORDER BY COUNT(genreid) DESC;
SET SCHEMA 'chinook';

/*SELECT * FROM track NATURAL JOIN album WHERE trackid between 1 and 5;
*/

/*SELECT genre.name FROM customer 
	INNER JOIN invoice using(customerid)
    INNER JOIN invoiceline using(invoiceid)
    INNER JOIN track using (trackid)
    INNER JOIN genre using (genreid)
    WHERE customer.customerid = 10
    GROUP BY genre.name
   	UNION 
SELECT genre.name FROM customer 
	INNER JOIN invoice using(customerid)
    INNER JOIN invoiceline using(invoiceid)
    INNER JOIN track using (trackid)
    INNER JOIN genre using (genreid)
    WHERE customer.customerid = 11
    GROUP BY genre.name;*/

/*SELECT * FROM employee CROSS JOIN genre order by employee.firstname;*/

/*SELECT * FROM track
	INNER JOIN playlisttrack 
    USING (trackid)
    INNER JOIN playlist
    USING (playlistid);*/

/*SELECT * FROM artist 
	FULL JOIN track
    ON(artist.name = track.name)
    ORDER BY artist.artistid;*/


/*SELECT * FROM track tr
	INNER JOIN album ON (tr.albumid = album.albumid)
    WHERE tr.albumid = 6;*/

/*SELECT firstname FROM customers_that_purchased_snoballed;*/

/*CREATE VIEW customers_that_purchased_snoballed AS SELECT * FROM customer 
WHERE customerid IN
    (SELECT customerid FROM invoice
    WHERE invoiceid IN
        (SELECT invoiceid FROM invoiceline
        WHERE trackid IN
            (SELECT trackid FROM track
            WHERE name = 'Snowballed')));*/

/*SELECT * from playlist
WHERE playlistid IN
    (SELECT playlistid FROM playlisttrack
    WHERE trackid IN 
        (SELECT trackid FROM track
        WHERE albumid IN
            (SELECT albumid FROM album
            WHERE artistid IN
                (SELECT artistid FROM artist
                WHERE name = 'AC/DC'))));*/

/*SET SCHEMA 'weapon_store';*/
/*SELECT * FROM weapons
WHERE user_id IN (
	SELECT user_id FROM app_users
	WHERE username = 'KevinG'
    );*/
set schema 'weapon_store';

-- CREATE OR REPLACE FUNCTION my_sum(val_a INTEGER, val_b INTEGER)
-- RETURNS INTEGER AS $$
-- 	BEGIN
-- 		RETURN val_a + val_b;
-- 	END;
-- $$ LANGUAGE plpgsql;

-- SELECT my_sum(5, 10);


-- CREATE OR REPLACE FUNCTION build_a_weapon(
-- 	num_blades INTEGER, 
-- 	weaponweight NUMERIC(5,2),
-- 	weapontype VARCHAR(24),
-- 	u_id INTEGER
-- 	)
-- RETURNS void AS $$
-- BEGIN
-- 	INSERT INTO weapons (number_blades, weight, weapon_type, user_id) 
-- 		VALUES (num_blades, weaponweight, weapontype, u_id);
-- END;
-- $$ LANGUAGE plpgsql

-- SELECT build_a_weapon(22, 10, 'ninja star', 1);

-- SELECT * FROM weapons;

-- CREATE OR REPLACE FUNCTION find_users_weapons(u_id INTEGER)
-- RETURNS refcursor as $$
-- DECLARE 
-- 	curs refcursor;
-- BEGIN
-- 	OPEN curs for SELECT * FROM weapons WHERE user_id = u_id;
-- 	RETURN curs;
-- END;
-- $$ LANGUAGE plpgsql;

-- SELECT find_users_weapons(1);
-- FETCH ALL IN "<unnamed portal 1>";

-- SELECT current_time;

-- CREATE TABLE weapons_log(
-- 	entry_id SERIAL PRIMARY KEY,
-- 	old_weapon_id INTEGER,
-- 	new_weapon_id INTEGER,
-- 	old_number_blades INTEGER,
-- 	new_number_blades INTEGER,
-- 	old_weight NUMERIC(5,2),
-- 	new_weight NUMERIC(5,2),
-- 	old_weapon_type VARCHAR(24),
-- 	new_weapon_type VARCHAR(24),
-- 	old_user_id INTEGER,
-- 	new_user_id INTEGER
-- );

-- CREATE OR REPLACE FUNCTION weapons_log_trig_fun()
-- RETURNS TRIGGER AS $$
-- BEGIN
-- 	IF(TG_OP = 'INSERT') THEN
-- 	INSERT INTO weapons_log (
-- 			old_weapon_id,
-- 			new_weapon_id,
-- 			old_number_blades,
-- 			new_number_blades,
-- 			old_weight,
-- 			new_weight,
-- 			old_weapon_type,
-- 			new_weapon_type,
-- 			old_user_id,
-- 			new_user_id
-- 		)
-- 		VALUES (
-- 			null,
-- 			NEW.weapon_id,
-- 			null,
-- 			NEW.number_blades,
-- 			null,
-- 			NEW.weight,
-- 			null,
-- 			NEW.weapon_type,
-- 			null,
-- 			NEW.user_id
-- 		);
-- 	END IF;
-- 	IF(TG_OP = 'UPDATE') THEN
-- 	INSERT INTO weapons_log (
-- 			old_weapon_id,
-- 			new_weapon_id,
-- 			old_number_blades,
-- 			new_number_blades,
-- 			old_weight,
-- 			new_weight,
-- 			old_weapon_type,
-- 			new_weapon_type,
-- 			old_user_id,
-- 			new_user_id
-- 		)
-- 		VALUES (
-- 			OLD.weapon_id,
-- 			NEW.weapon_id,
-- 			OLD.number_blades,
-- 			NEW.number_blades,
-- 			OLD.weight,
-- 			NEW.weight,
-- 			OLD.weapon_type,
-- 			NEW.weapon_type,
-- 			OLD.user_id,
-- 			NEW.user_id
-- 		);
-- 		END IF;
-- 		IF(TG_OP = 'DELETE') THEN
-- 		INSERT INTO weapons_log (
-- 			old_weapon_id,
-- 			new_weapon_id,
-- 			old_number_blades,
-- 			new_number_blades,
-- 			old_weight,
-- 			new_weight,
-- 			old_weapon_type,
-- 			new_weapon_type,
-- 			old_user_id,
-- 			new_user_id
-- 		)
-- 		VALUES (
-- 			OLD.weapon_id,
-- 			null,
-- 			OLD.number_blades,
-- 			null,
-- 			OLD.weight,
-- 			null,
-- 			OLD.weapon_type,
-- 			null,
-- 			OLD.user_id,
-- 			null
-- 		);
-- 	END IF;
-- 	RETURN NEW; 
-- END;
-- $$ LANGUAGE plpgsql;

-- CREATE TRIGGER weapons_log_trig
-- BEFORE INSERT OR UPDATE OR DELETE ON weapons
-- FOR EACH ROW
-- EXECUTE PROCEDURE weapons_log_trig_fun(); 
-- SELECT * FROM weapons;
-- SELECT * FROM weapons_log;
-- UPDATE weapons SET weapon_id = 8 WHERE weapon_id = 100;
-- SELECT * FROM weapons;
-- SELECT * FROM weapons_log;


-- CREATE OR REPLACE FUNCTION no_weapon_id_update()
-- RETURNS trigger AS $$
-- BEGIN
-- 	IF(TG_OP = 'UPDATE') THEN
-- 		NEW.weapon_id := OLD.weapon_id;
-- 	END IF;
-- 	RETURN NEW;
-- END
-- $$ LANGUAGE plpgsql;

-- CREATE TRIGGER no_weapon_id_update_trig
-- BEFORE UPDATE ON weapons
-- FOR EACH ROW
-- EXECUTE PROCEDURE no_weapon_id_update();



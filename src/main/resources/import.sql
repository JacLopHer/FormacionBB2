INSERT INTO users (created_date,  username, password, enabled, admin ) VALUES (CURRENT_TIMESTAMP(),'Admin@bitbox.com', 'passadmin', true, true );
INSERT INTO users (created_date,  username, password, enabled, admin ) VALUES (CURRENT_TIMESTAMP(),'Comercial@bitbox.com', 'passcomercial', true, 0 );
INSERT INTO users (created_date,  username, password, enabled, admin ) VALUES (CURRENT_TIMESTAMP(),'Cajero@bitbox.com', 'passcajero', 1, 0 );

INSERT INTO item (created_date,  ITEM_CODE, DESCRIPTION, PRICE, STATE, CREATOR, CREATION ) VALUES (CURRENT_TIMESTAMP(),010101, 'BILLY Bookcase', 59.00, 1, 'Manolo', CURRENT_DATE());
INSERT INTO item (created_date,  ITEM_CODE, DESCRIPTION, PRICE, STATE, CREATOR, CREATION ) VALUES (CURRENT_TIMESTAMP(),010102, 'RIGGA Clothes Rack', 12.99, 0, 'Juan',  CURRENT_DATE());
INSERT INTO item (created_date,  ITEM_CODE, DESCRIPTION, PRICE, STATE, CREATOR, CREATION ) VALUES (CURRENT_TIMESTAMP(),010201, 'KALLAX Shelf Unit', 79.00, 1, 'Juan',  CURRENT_DATE());
INSERT INTO item (created_date,  ITEM_CODE, DESCRIPTION, PRICE, STATE, CREATOR, CREATION ) VALUES (CURRENT_TIMESTAMP(),020201, 'RIBA Frame', 19.99, 1, 'pepe',  CURRENT_DATE());
INSERT INTO item (created_date,  ITEM_CODE, DESCRIPTION, PRICE, STATE, CREATOR, CREATION ) VALUES (CURRENT_TIMESTAMP(),010301, 'SATSUMAS Plant Stand', 9.99, 0, 'pepe',  CURRENT_DATE());
INSERT INTO item (created_date,  ITEM_CODE, DESCRIPTION, PRICE, STATE, CREATOR, CREATION ) VALUES (CURRENT_TIMESTAMP(),030301, 'Stroped STOCKHOLM Rug', 29.99, 0, 'Marina',  CURRENT_DATE());
INSERT INTO item (created_date,  ITEM_CODE, DESCRIPTION, PRICE, STATE, CREATOR, CREATION ) VALUES (CURRENT_TIMESTAMP(),040401, 'LACK Side Table', 9.00, 1, 'Juan',  CURRENT_DATE());
INSERT INTO item (created_date,  ITEM_CODE, DESCRIPTION, PRICE, STATE, CREATOR, CREATION ) VALUES (CURRENT_TIMESTAMP(),050401, 'FROSTA Stool', 14.99, 1, 'Marina',  CURRENT_DATE());
INSERT INTO item (created_date,  ITEM_CODE, DESCRIPTION, PRICE, STATE, CREATOR, CREATION ) VALUES (CURRENT_TIMESTAMP(),060201, 'RASKOG Utility Cart', 29.99 , 1, 'Juan',  CURRENT_DATE());
INSERT INTO item (created_date,  ITEM_CODE, DESCRIPTION, PRICE, STATE, CREATOR, CREATION ) VALUES (CURRENT_TIMESTAMP(),070101, 'PLASTIS Dishwashing Brush', 25.99, 0, 'Juan',CURRENT_DATE());

INSERT INTO supplier (created_date,  COUNTRY , NAME ) VALUES (CURRENT_TIMESTAMP(),'China', 'Hong Kong Woods');
INSERT INTO supplier (created_date,  COUNTRY , NAME ) VALUES (CURRENT_TIMESTAMP(),'China', 'Plastic Enterprise');
INSERT INTO supplier (created_date,  COUNTRY , NAME ) VALUES (CURRENT_TIMESTAMP(),'USA', 'Aluminum Tools');
INSERT INTO supplier (created_date,  COUNTRY , NAME ) VALUES (CURRENT_TIMESTAMP(),'Sweeden', 'Furniture Designers');
INSERT INTO supplier (created_date,  COUNTRY , NAME ) VALUES (CURRENT_TIMESTAMP(),'Finland', 'Desktop Finland');
INSERT INTO supplier (created_date,  COUNTRY , NAME ) VALUES (CURRENT_TIMESTAMP(),'Spain', 'Muebles Benito');

INSERT INTO item_supplier (ITEM_ID ,SUPPLIER_ID ) VALUES (1 ,1 );
INSERT INTO item_supplier (ITEM_ID ,SUPPLIER_ID ) VALUES (1 ,3 );
INSERT INTO item_supplier (ITEM_ID ,SUPPLIER_ID ) VALUES (1 ,5 );
INSERT INTO item_supplier (ITEM_ID ,SUPPLIER_ID ) VALUES (2 ,3 );
INSERT INTO item_supplier (ITEM_ID ,SUPPLIER_ID ) VALUES (3 ,5 );
INSERT INTO item_supplier (ITEM_ID ,SUPPLIER_ID ) VALUES (4 ,2 );
INSERT INTO item_supplier (ITEM_ID ,SUPPLIER_ID ) VALUES (5 ,5 );
INSERT INTO item_supplier (ITEM_ID ,SUPPLIER_ID ) VALUES (6 ,2 );
INSERT INTO item_supplier (ITEM_ID ,SUPPLIER_ID ) VALUES (7 ,6 );
INSERT INTO item_supplier (ITEM_ID ,SUPPLIER_ID ) VALUES (8 ,1 );
INSERT INTO item_supplier (ITEM_ID ,SUPPLIER_ID ) VALUES (9 ,4 );
INSERT INTO item_supplier (ITEM_ID ,SUPPLIER_ID ) VALUES (9 ,6 );
INSERT INTO item_supplier (ITEM_ID ,SUPPLIER_ID ) VALUES (4 ,3 );
INSERT INTO item_supplier (ITEM_ID ,SUPPLIER_ID ) VALUES (7 ,2 );
INSERT INTO item_supplier (ITEM_ID ,SUPPLIER_ID ) VALUES (8 ,6 );
INSERT INTO item_supplier (ITEM_ID ,SUPPLIER_ID ) VALUES (10 ,6 );


INSERT INTO price_reduction (created_date,ID_ITEM, reduced_price ,START_DATE ,END_DATE ) VALUES (CURRENT_TIMESTAMP(),1,10,CURRENT_DATE(),CURRENT_DATE() +20);
INSERT INTO price_reduction (created_date,ID_ITEM, reduced_price ,START_DATE ,END_DATE ) VALUES (CURRENT_TIMESTAMP(),2,20,CURRENT_DATE(),CURRENT_DATE() +20);
INSERT INTO price_reduction (created_date,ID_ITEM, reduced_price ,START_DATE ,END_DATE ) VALUES (CURRENT_TIMESTAMP(),3,20,CURRENT_DATE()+8,CURRENT_DATE() +12);
INSERT INTO price_reduction (created_date,ID_ITEM, reduced_price ,START_DATE ,END_DATE ) VALUES (CURRENT_TIMESTAMP(),4,30,CURRENT_DATE(),CURRENT_DATE() +7);
INSERT INTO price_reduction (created_date,ID_ITEM, reduced_price ,START_DATE ,END_DATE ) VALUES (CURRENT_TIMESTAMP(),5,50,CURRENT_DATE(),CURRENT_DATE() +7);
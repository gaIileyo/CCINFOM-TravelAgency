USE homestay_tour_system;
START TRANSACTION;

-- GUESTS
INSERT INTO guest
(first_name, last_name, address, contact_number, email, valid_id_status, trust_rating)
VALUES
('Emma','Johnson','Manila, Philippines','+63-917-111-0001','emma.johnson@gmail.com','Verified',5),
('Liam','Roberts','Cebu City, Philippines','+63-917-111-0002','liam_roberts@outlook.com','Not Verified',4),
('Sofia','Martinez','Davao City, Philippines','+63-917-111-0003','sofia.martinez@yahoo.com','Verified',5),
('Noah','Thompson','Baguio, Philippines','+63-917-111-0004','noah.t@icloud.com','Not Verified',4),
('Isabella','Rossi','Makati, Philippines','+63-917-111-0005','isa.rossi@travelmail.com','Verified',5),
('Lucas','Kim','Seoul, South Korea','+82-10-1234-5678','lucas.kim@naver.com','Not Verified',4),
('Ava','Dubois','Paris, France','+33-600-123-456','ava.dubois@gmail.com','Verified',5),
('Ethan','Muller','Berlin, Germany','+49-151-23456789','ethan.muller@outlook.de','Verified',4),
('Mia','Patel','Mumbai, India','+91-98765-43210','mia.patel@yahoo.in','Not Verified',3),
('Oliver','Smith','Denver, USA','+1-303-555-1212','oliver.smith@icloud.com','Verified',5),
('Daniel','Carter','Iloilo City, Philippines','+63-917-222-0001','daniel.carter@gmail.com','Verified',4),
('Hannah','Kim','Busan, South Korea','+82-10-9876-5432','hannah.kim@outlook.kr','Not Verified',4),
('Miguel','Santos','Cagayan de Oro, Philippines','+63-917-222-0003','miguel.santos@yahoo.com','Verified',5),
('Chloe','Anderson','Vancouver, Canada','+1-604-555-8899','chloe.anderson@icloud.com','Not Verified',4),
('Rafael','Morales','Madrid, Spain','+34-612-345-678','rafael.morales@travelmail.es','Verified',5);

-- HOMESTAYS
INSERT INTO homestay
(property_name, host_name, room_type, address, room_capacity, price_per_night, amenities, availability_status)
VALUES
('Sea Breeze Villa','Carlos Dela Cruz','Family','Palawan, Philippines',4,2000.00,'WiFi, Aircon, Kitchen, Beach Access','Available'),
('Mountain View Cabin','Anna Reyes','Family','Baguio, Philippines',5,1500.00,'Heater, Balcony, Parking, Mountain View','Available'),
('City Stay Inn','Mark Tan','Solo','Manila, Philippines',2,1800.00,'WiFi, TV, Aircon','Available'),
('Island Retreat','Liza Santos','Family','Cebu, Philippines',6,2500.00,'WiFi, Kitchen, Pool Access','Available'),
('Lake House','Pedro Cruz','Family','Laguna, Philippines',4,1700.00,'Lake View, Kitchen, Parking','Available'),
('Forest Lodge','Maria Lim','Family','Davao, Philippines',5,1600.00,'WiFi, Garden, Nature Trail Access','Available'),
('Sunset Resort','John Lee','Family','Boracay, Philippines',6,3000.00,'Beachfront, WiFi, Breakfast','Available'),
('Hilltop Haven','Grace Yu','Family','Tagaytay, Philippines',4,2200.00,'Balcony, WiFi, Scenic View','Available'),
('Urban Suites','Paul Ong','Solo','Quezon City, Philippines',2,1900.00,'WiFi, Work Desk, Aircon','Available'),
('Coastal Escape','Nina Cruz','Family','La Union, Philippines',4,2100.00,'Surf Access, WiFi, Parking','Available');

-- GUIDES
INSERT INTO guide
(last_name, first_name, contact_number, specialization, languages_spoken, daily_service_rate, dot_accreditation_number)
VALUES
('Garcia','Juan','09170000001','City Tour','English, Filipino',1500.00,'DOT-2026-001'),
('Lopez','Maria','09170000002','City Tour','English, Filipino, Cebuano',2000.00,'DOT-2026-002'),
('Mendoza','Carlos','09170000003','City Tour','English, Filipino',1800.00,'DOT-2026-003'),
('Santos','Ana','09170000004','Heritage','English, Filipino',1600.00,'DOT-2026-004'),
('Reyes','Pedro','09170000005','Food','English, Filipino',1700.00,'DOT-2026-005'),
('Torres','Liza','09170000006','City Tour','English, Filipino',1900.00,'DOT-2026-006'),
('Villanueva','Mark','09170000007','City Tour','English, Filipino',2100.00,'DOT-2026-007'),
('Cruz','Sofia','09170000008','Heritage','English, Filipino, Spanish',1500.00,'DOT-2026-008'),
('Gomez','Luis','09170000009','City Tour','English, Filipino',1800.00,'DOT-2026-009'),
('Navarro','Elena','09170000010','City Tour','English, Filipino',2000.00,'DOT-2026-010');

-- TOUR PACKAGES
INSERT INTO tour_package
(package_name, category, duration, price, max_guests, inclusions)
VALUES
('Manila Heritage Walk','Heritage','Half Day',1200.00,15,'Licensed guide, museum entry, bottled water'),
('Intramuros City Highlights','City Tour','1 Day',1800.00,20,'Transport, guide, lunch'),
('Binondo Food Adventure','Food','Evening',1500.00,12,'Food tastings, guide, local maps'),
('Baguio Mountain Tour','Heritage','1 Day',2200.00,18,'Transport, guide, snacks'),
('Cebu Island Hopping','City Tour','Full Day',3000.00,25,'Boat, guide, lunch included');

-- BOOKING TRANSACTIONS
INSERT INTO booking_transaction
(guest_id, property_id, check_in_date, check_out_date, total_stay_cost, status)
VALUES
(1, 1, '2026-03-10', '2026-03-12', 4000.00, 'Confirmed'),
(2, 4, '2026-03-15', '2026-03-17', 5000.00, 'Pending'),
(3, 3, '2026-04-01', '2026-04-04', 5400.00, 'Confirmed'),
(5, 7, '2026-04-20', '2026-04-22', 6000.00, 'Confirmed'),
(10, 2, '2026-05-05', '2026-05-07', 3000.00, 'Confirmed');

-- GUIDE HIRING
INSERT INTO guide_hiring
(guest_id, guide_id, tour_date, service_fee, hiring_status)
VALUES
(1, 2, '2026-03-25', 2000.00, 'Confirmed'),
(3, 2, '2026-03-26', 2000.00, 'Confirmed'),
(5, 4, '2026-03-27', 1600.00, 'Confirmed'),
(7, 5, '2026-03-28', 1700.00, 'Pending'),
(10, 2, '2026-03-29', 2000.00, 'Confirmed'),
(11, 8, '2026-03-30', 1500.00, 'Cancelled'),
(13, 4, '2026-04-05', 1600.00, 'Confirmed'),
(15, 5, '2026-04-06', 1700.00, 'Confirmed');

-- TOUR RESERVATIONS
INSERT INTO tour_reservation
(guest_id, package_id, assigned_guide_id, tour_date, number_of_pax, total_tour_cost, reservation_status)
VALUES
(1, 1, 4, '2026-03-25', 2, 2400.00, 'Confirmed'),
(2, 5, 2, '2026-03-26', 4, 12000.00, 'Waitlisted'),
(3, 3, 5, '2026-04-02', 3, 4500.00, 'Confirmed'),
(7, 2, 1, '2026-04-15', 2, 3600.00, 'Confirmed');

-- GUEST ACTIVITY TRANSACTIONS
INSERT INTO guest_activity_transaction
(guest_id, service_type, reference_id, activity_start_date, activity_end_date,
 base_amount, additional_charges, discount_applied, final_amount,
 payment_method, payment_confirmation_status)
VALUES
(1, 'Accommodation', 101, '2026-03-10', '2026-03-12', 4000.00, 500.00, 200.00, 4300.00, 'GCash', 'Paid'),
(2, 'Tour',          202, '2026-03-25', '2026-03-25', 2000.00,   0.00,   0.00, 2000.00, 'Cash', 'Pending'),
(3, 'Combined',      303, '2026-04-01', '2026-04-04', 6000.00, 800.00, 500.00, 6300.00, 'Credit Card', 'Paid');

COMMIT;

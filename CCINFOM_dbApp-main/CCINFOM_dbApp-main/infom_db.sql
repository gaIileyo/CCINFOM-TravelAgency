DROP DATABASE IF EXISTS homestay_tour_system;
CREATE DATABASE homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    address VARCHAR(100) NOT NULL,
    contact_number VARCHAR(30) NOT NULL,
    email VARCHAR(100) NOT NULL,
    valid_id_status ENUM('Verified','Not Verified') NOT NULL,
    trust_rating INT NOT NULL CHECK (trust_rating BETWEEN 1 AND 5)
);

CREATE TABLE homestay (
    property_id INT AUTO_INCREMENT PRIMARY KEY,
    property_name VARCHAR(100) NOT NULL,
    host_name VARCHAR(100) NOT NULL,
    room_type ENUM('Solo','Family') NOT NULL,
    address VARCHAR(150) NOT NULL,
    room_capacity INT NOT NULL,
    price_per_night DECIMAL(10,2) NOT NULL,
    amenities TEXT,
    availability_status ENUM('Available','Booked') DEFAULT 'Available'
);

CREATE TABLE guide (
    guide_id INT AUTO_INCREMENT PRIMARY KEY,
    last_name VARCHAR(50) NOT NULL,
    first_name VARCHAR(50) NOT NULL,
    contact_number VARCHAR(30) NOT NULL,
    specialization ENUM('City Tour','Heritage','Food') NOT NULL,
    languages_spoken VARCHAR(100),
    daily_service_rate DECIMAL(10,2) NOT NULL,
    dot_accreditation_number VARCHAR(50) NOT NULL
);

CREATE TABLE tour_package (
    package_id INT AUTO_INCREMENT PRIMARY KEY,
    package_name VARCHAR(100) NOT NULL,
    category ENUM('City Tour','Heritage','Food') NOT NULL,
    duration VARCHAR(50) NOT NULL,
    price DECIMAL(10,2) NOT NULL,
    max_guests INT NOT NULL,
    inclusions TEXT
);

CREATE TABLE booking_transaction (
    booking_id INT AUTO_INCREMENT PRIMARY KEY,
    guest_id INT NOT NULL,
    property_id INT NOT NULL,
    check_in_date DATE NOT NULL,
    check_out_date DATE NOT NULL,
    total_stay_cost DECIMAL(10,2) NOT NULL,
    status ENUM('Confirmed','Pending') NOT NULL,

    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
        ON DELETE CASCADE ON UPDATE CASCADE,

    FOREIGN KEY (property_id) REFERENCES homestay(property_id)
        ON DELETE RESTRICT ON UPDATE CASCADE
);

CREATE TABLE guide_hiring (
    guide_hire_id INT AUTO_INCREMENT PRIMARY KEY,
    guest_id INT NOT NULL,
    guide_id INT NOT NULL,
    tour_date DATE NOT NULL,
    service_fee DECIMAL(10,2) NOT NULL,
    hiring_status ENUM('Confirmed','Pending','Cancelled') NOT NULL,

    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
        ON DELETE CASCADE ON UPDATE CASCADE,

    FOREIGN KEY (guide_id) REFERENCES guide(guide_id)
        ON DELETE RESTRICT ON UPDATE CASCADE
);

CREATE TABLE tour_reservation (
    reservation_id INT AUTO_INCREMENT PRIMARY KEY,
    guest_id INT NOT NULL,
    package_id INT NOT NULL,
    assigned_guide_id INT,
    tour_date DATE NOT NULL,
    number_of_pax INT NOT NULL,
    total_tour_cost DECIMAL(10,2) NOT NULL,
    reservation_status ENUM('Confirmed','Waitlisted','Cancelled') NOT NULL,

    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
        ON DELETE CASCADE ON UPDATE CASCADE,

    FOREIGN KEY (package_id) REFERENCES tour_package(package_id)
        ON DELETE RESTRICT ON UPDATE CASCADE,

    FOREIGN KEY (assigned_guide_id) REFERENCES guide(guide_id)
        ON DELETE SET NULL ON UPDATE CASCADE
);

CREATE TABLE guest_activity_transaction (
    activity_transaction_id INT AUTO_INCREMENT PRIMARY KEY,
    guest_id INT NOT NULL,
    service_type ENUM('Accommodation','Tour','Combined') NOT NULL,
    reference_id INT NOT NULL,
    activity_start_date DATE NOT NULL,
    activity_end_date DATE NOT NULL,
    base_amount DECIMAL(10,2) NOT NULL,
    additional_charges DECIMAL(10,2) DEFAULT 0,
    discount_applied DECIMAL(10,2) DEFAULT 0,
    final_amount DECIMAL(10,2) NOT NULL,
    payment_method ENUM('Cash','GCash','Credit Card','Bank Transfer') NOT NULL,
    payment_confirmation_status ENUM('Paid','Pending','Refunded') NOT NULL,

    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
        ON DELETE CASCADE ON UPDATE CASCADE
);



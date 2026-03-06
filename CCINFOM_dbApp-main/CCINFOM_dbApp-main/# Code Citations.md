# Code Citations

## License: unknown
https://github.com/Emmonslab/Elegance/blob/968487d3a39469def503e99bb9688fa7e4373f5f/elegance_code/src/ObjectViewFrame.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax
```


## License: unknown
https://github.com/Emmonslab/Elegance/blob/968487d3a39469def503e99bb9688fa7e4373f5f/elegance_code/src/ObjectViewFrame.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax
```


## License: unknown
https://github.com/d2dcontre/GME-Repo-2/blob/78e81362abbe3212abcba5d58f7acd7d2ab56d67/src/AlphaGUI.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable
```


## License: unknown
https://github.com/fiendishly/rsbot-scripts/blob/a8cc0a291deb1b05e6e56260b630b6fb85e520a8/RuneSpeed.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable
```


## License: unknown
https://github.com/Emmonslab/Elegance/blob/968487d3a39469def503e99bb9688fa7e4373f5f/elegance_code/src/ObjectViewFrame.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax
```


## License: unknown
https://github.com/d2dcontre/GME-Repo-2/blob/78e81362abbe3212abcba5d58f7acd7d2ab56d67/src/AlphaGUI.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable
```


## License: unknown
https://github.com/fiendishly/rsbot-scripts/blob/a8cc0a291deb1b05e6e56260b630b6fb85e520a8/RuneSpeed.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable
```


## License: unknown
https://github.com/Emmonslab/Elegance/blob/968487d3a39469def503e99bb9688fa7e4373f5f/elegance_code/src/ObjectViewFrame.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax
```


## License: unknown
https://github.com/d2dcontre/GME-Repo-2/blob/78e81362abbe3212abcba5d58f7acd7d2ab56d67/src/AlphaGUI.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable
```


## License: unknown
https://github.com/fiendishly/rsbot-scripts/blob/a8cc0a291deb1b05e6e56260b630b6fb85e520a8/RuneSpeed.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable
```


## License: unknown
https://github.com/sixones/zenses/blob/c3ed4c876c8522aae508c42bf117f80894ea3b6b/zenses/src/main/java/org/zenses/ui/views/MainWindow.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table
```


## License: unknown
https://github.com/gjyalpha/jmallory/blob/fc5514c80671aed94935adebac334c292e4064b4/src/main/java/org/jmallory/AdminPane.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table
```


## License: unknown
https://github.com/Emmonslab/Elegance/blob/968487d3a39469def503e99bb9688fa7e4373f5f/elegance_code/src/ObjectViewFrame.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax
```


## License: unknown
https://github.com/d2dcontre/GME-Repo-2/blob/78e81362abbe3212abcba5d58f7acd7d2ab56d67/src/AlphaGUI.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable
```


## License: unknown
https://github.com/fiendishly/rsbot-scripts/blob/a8cc0a291deb1b05e6e56260b630b6fb85e520a8/RuneSpeed.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable
```


## License: unknown
https://github.com/sixones/zenses/blob/c3ed4c876c8522aae508c42bf117f80894ea3b6b/zenses/src/main/java/org/zenses/ui/views/MainWindow.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table
```


## License: unknown
https://github.com/gjyalpha/jmallory/blob/fc5514c80671aed94935adebac334c292e4064b4/src/main/java/org/jmallory/AdminPane.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table
```


## License: MIT
https://github.com/open-star/GD-OpenDolphin/blob/a203db755f1cfcc3be4eae1cdebb348e3e60da84/client/src/open/dolphin/plugin/patientinfodocumentpanel/PatientInfoDocumentPanel.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class
```


## License: unknown
https://github.com/Emmonslab/Elegance/blob/968487d3a39469def503e99bb9688fa7e4373f5f/elegance_code/src/ObjectViewFrame.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.
```


## License: unknown
https://github.com/d2dcontre/GME-Repo-2/blob/78e81362abbe3212abcba5d58f7acd7d2ab56d67/src/AlphaGUI.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable
```


## License: unknown
https://github.com/fiendishly/rsbot-scripts/blob/a8cc0a291deb1b05e6e56260b630b6fb85e520a8/RuneSpeed.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable
```


## License: unknown
https://github.com/sixones/zenses/blob/c3ed4c876c8522aae508c42bf117f80894ea3b6b/zenses/src/main/java/org/zenses/ui/views/MainWindow.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table
```


## License: unknown
https://github.com/gjyalpha/jmallory/blob/fc5514c80671aed94935adebac334c292e4064b4/src/main/java/org/jmallory/AdminPane.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table
```


## License: MIT
https://github.com/open-star/GD-OpenDolphin/blob/a203db755f1cfcc3be4eae1cdebb348e3e60da84/client/src/open/dolphin/plugin/patientinfodocumentpanel/PatientInfoDocumentPanel.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class
```


## License: unknown
https://github.com/Emmonslab/Elegance/blob/968487d3a39469def503e99bb9688fa7e4373f5f/elegance_code/src/ObjectViewFrame.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable
```


## License: unknown
https://github.com/d2dcontre/GME-Repo-2/blob/78e81362abbe3212abcba5d58f7acd7d2ab56d67/src/AlphaGUI.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable
```


## License: unknown
https://github.com/fiendishly/rsbot-scripts/blob/a8cc0a291deb1b05e6e56260b630b6fb85e520a8/RuneSpeed.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable
```


## License: unknown
https://github.com/sixones/zenses/blob/c3ed4c876c8522aae508c42bf117f80894ea3b6b/zenses/src/main/java/org/zenses/ui/views/MainWindow.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table
```


## License: unknown
https://github.com/gjyalpha/jmallory/blob/fc5514c80671aed94935adebac334c292e4064b4/src/main/java/org/jmallory/AdminPane.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table
```


## License: MIT
https://github.com/open-star/GD-OpenDolphin/blob/a203db755f1cfcc3be4eae1cdebb348e3e60da84/client/src/open/dolphin/plugin/patientinfodocumentpanel/PatientInfoDocumentPanel.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class
```


## License: unknown
https://github.com/Emmonslab/Elegance/blob/968487d3a39469def503e99bb9688fa7e4373f5f/elegance_code/src/ObjectViewFrame.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable
```


## License: unknown
https://github.com/d2dcontre/GME-Repo-2/blob/78e81362abbe3212abcba5d58f7acd7d2ab56d67/src/AlphaGUI.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable
```


## License: unknown
https://github.com/fiendishly/rsbot-scripts/blob/a8cc0a291deb1b05e6e56260b630b6fb85e520a8/RuneSpeed.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable
```


## License: unknown
https://github.com/sixones/zenses/blob/c3ed4c876c8522aae508c42bf117f80894ea3b6b/zenses/src/main/java/org/zenses/ui/views/MainWindow.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table
```


## License: unknown
https://github.com/gjyalpha/jmallory/blob/fc5514c80671aed94935adebac334c292e4064b4/src/main/java/org/jmallory/AdminPane.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table
```


## License: MIT
https://github.com/open-star/GD-OpenDolphin/blob/a203db755f1cfcc3be4eae1cdebb348e3e60da84/client/src/open/dolphin/plugin/patientinfodocumentpanel/PatientInfoDocumentPanel.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class
```


## License: unknown
https://github.com/Emmonslab/Elegance/blob/968487d3a39469def503e99bb9688fa7e4373f5f/elegance_code/src/ObjectViewFrame.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable
```


## License: unknown
https://github.com/d2dcontre/GME-Repo-2/blob/78e81362abbe3212abcba5d58f7acd7d2ab56d67/src/AlphaGUI.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable
```


## License: unknown
https://github.com/fiendishly/rsbot-scripts/blob/a8cc0a291deb1b05e6e56260b630b6fb85e520a8/RuneSpeed.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable
```


## License: unknown
https://github.com/sixones/zenses/blob/c3ed4c876c8522aae508c42bf117f80894ea3b6b/zenses/src/main/java/org/zenses/ui/views/MainWindow.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table
```


## License: unknown
https://github.com/gjyalpha/jmallory/blob/fc5514c80671aed94935adebac334c292e4064b4/src/main/java/org/jmallory/AdminPane.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table
```


## License: MIT
https://github.com/open-star/GD-OpenDolphin/blob/a203db755f1cfcc3be4eae1cdebb348e3e60da84/client/src/open/dolphin/plugin/patientinfodocumentpanel/PatientInfoDocumentPanel.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class
```


## License: unknown
https://github.com/Emmonslab/Elegance/blob/968487d3a39469def503e99bb9688fa7e4373f5f/elegance_code/src/ObjectViewFrame.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable
```


## License: unknown
https://github.com/d2dcontre/GME-Repo-2/blob/78e81362abbe3212abcba5d58f7acd7d2ab56d67/src/AlphaGUI.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable
```


## License: unknown
https://github.com/fiendishly/rsbot-scripts/blob/a8cc0a291deb1b05e6e56260b630b6fb85e520a8/RuneSpeed.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable
```


## License: unknown
https://github.com/sixones/zenses/blob/c3ed4c876c8522aae508c42bf117f80894ea3b6b/zenses/src/main/java/org/zenses/ui/views/MainWindow.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table
```


## License: unknown
https://github.com/gjyalpha/jmallory/blob/fc5514c80671aed94935adebac334c292e4064b4/src/main/java/org/jmallory/AdminPane.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table
```


## License: MIT
https://github.com/open-star/GD-OpenDolphin/blob/a203db755f1cfcc3be4eae1cdebb348e3e60da84/client/src/open/dolphin/plugin/patientinfodocumentpanel/PatientInfoDocumentPanel.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class
```


## License: unknown
https://github.com/Emmonslab/Elegance/blob/968487d3a39469def503e99bb9688fa7e4373f5f/elegance_code/src/ObjectViewFrame.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable
```


## License: unknown
https://github.com/d2dcontre/GME-Repo-2/blob/78e81362abbe3212abcba5d58f7acd7d2ab56d67/src/AlphaGUI.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable
```


## License: unknown
https://github.com/fiendishly/rsbot-scripts/blob/a8cc0a291deb1b05e6e56260b630b6fb85e520a8/RuneSpeed.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable
```


## License: unknown
https://github.com/sixones/zenses/blob/c3ed4c876c8522aae508c42bf117f80894ea3b6b/zenses/src/main/java/org/zenses/ui/views/MainWindow.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table
```


## License: unknown
https://github.com/gjyalpha/jmallory/blob/fc5514c80671aed94935adebac334c292e4064b4/src/main/java/org/jmallory/AdminPane.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table
```


## License: MIT
https://github.com/open-star/GD-OpenDolphin/blob/a203db755f1cfcc3be4eae1cdebb348e3e60da84/client/src/open/dolphin/plugin/patientinfodocumentpanel/PatientInfoDocumentPanel.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class
```


## License: unknown
https://github.com/Emmonslab/Elegance/blob/968487d3a39469def503e99bb9688fa7e4373f5f/elegance_code/src/ObjectViewFrame.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable
```


## License: unknown
https://github.com/d2dcontre/GME-Repo-2/blob/78e81362abbe3212abcba5d58f7acd7d2ab56d67/src/AlphaGUI.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable
```


## License: unknown
https://github.com/fiendishly/rsbot-scripts/blob/a8cc0a291deb1b05e6e56260b630b6fb85e520a8/RuneSpeed.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable
```


## License: unknown
https://github.com/sixones/zenses/blob/c3ed4c876c8522aae508c42bf117f80894ea3b6b/zenses/src/main/java/org/zenses/ui/views/MainWindow.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table
```


## License: unknown
https://github.com/gjyalpha/jmallory/blob/fc5514c80671aed94935adebac334c292e4064b4/src/main/java/org/jmallory/AdminPane.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table
```


## License: MIT
https://github.com/open-star/GD-OpenDolphin/blob/a203db755f1cfcc3be4eae1cdebb348e3e60da84/client/src/open/dolphin/plugin/patientinfodocumentpanel/PatientInfoDocumentPanel.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class
```


## License: unknown
https://github.com/fiendishly/rsbot-scripts/blob/a8cc0a291deb1b05e6e56260b630b6fb85e520a8/RuneSpeed.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable
```


## License: unknown
https://github.com/Emmonslab/Elegance/blob/968487d3a39469def503e99bb9688fa7e4373f5f/elegance_code/src/ObjectViewFrame.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable
```


## License: unknown
https://github.com/d2dcontre/GME-Repo-2/blob/78e81362abbe3212abcba5d58f7acd7d2ab56d67/src/AlphaGUI.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable
```


## License: unknown
https://github.com/sixones/zenses/blob/c3ed4c876c8522aae508c42bf117f80894ea3b6b/zenses/src/main/java/org/zenses/ui/views/MainWindow.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table
```


## License: unknown
https://github.com/gjyalpha/jmallory/blob/fc5514c80671aed94935adebac334c292e4064b4/src/main/java/org/jmallory/AdminPane.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table
```


## License: MIT
https://github.com/open-star/GD-OpenDolphin/blob/a203db755f1cfcc3be4eae1cdebb348e3e60da84/client/src/open/dolphin/plugin/patientinfodocumentpanel/PatientInfoDocumentPanel.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class
```


## License: unknown
https://github.com/sixones/zenses/blob/c3ed4c876c8522aae508c42bf117f80894ea3b6b/zenses/src/main/java/org/zenses/ui/views/MainWindow.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table
```


## License: unknown
https://github.com/fiendishly/rsbot-scripts/blob/a8cc0a291deb1b05e6e56260b630b6fb85e520a8/RuneSpeed.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table
```


## License: unknown
https://github.com/Emmonslab/Elegance/blob/968487d3a39469def503e99bb9688fa7e4373f5f/elegance_code/src/ObjectViewFrame.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table
```


## License: unknown
https://github.com/d2dcontre/GME-Repo-2/blob/78e81362abbe3212abcba5d58f7acd7d2ab56d67/src/AlphaGUI.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table
```


## License: unknown
https://github.com/gjyalpha/jmallory/blob/fc5514c80671aed94935adebac334c292e4064b4/src/main/java/org/jmallory/AdminPane.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table
```


## License: MIT
https://github.com/open-star/GD-OpenDolphin/blob/a203db755f1cfcc3be4eae1cdebb348e3e60da84/client/src/open/dolphin/plugin/patientinfodocumentpanel/PatientInfoDocumentPanel.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class
```


## License: unknown
https://github.com/sixones/zenses/blob/c3ed4c876c8522aae508c42bf117f80894ea3b6b/zenses/src/main/java/org/zenses/ui/views/MainWindow.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table
```


## License: unknown
https://github.com/fiendishly/rsbot-scripts/blob/a8cc0a291deb1b05e6e56260b630b6fb85e520a8/RuneSpeed.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table
```


## License: unknown
https://github.com/gjyalpha/jmallory/blob/fc5514c80671aed94935adebac334c292e4064b4/src/main/java/org/jmallory/AdminPane.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table
```


## License: unknown
https://github.com/Emmonslab/Elegance/blob/968487d3a39469def503e99bb9688fa7e4373f5f/elegance_code/src/ObjectViewFrame.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table
```


## License: unknown
https://github.com/d2dcontre/GME-Repo-2/blob/78e81362abbe3212abcba5d58f7acd7d2ab56d67/src/AlphaGUI.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table
```


## License: MIT
https://github.com/open-star/GD-OpenDolphin/blob/a203db755f1cfcc3be4eae1cdebb348e3e60da84/client/src/open/dolphin/plugin/patientinfodocumentpanel/PatientInfoDocumentPanel.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class
```


## License: unknown
https://github.com/sixones/zenses/blob/c3ed4c876c8522aae508c42bf117f80894ea3b6b/zenses/src/main/java/org/zenses/ui/views/MainWindow.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table
```


## License: unknown
https://github.com/fiendishly/rsbot-scripts/blob/a8cc0a291deb1b05e6e56260b630b6fb85e520a8/RuneSpeed.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table
```


## License: unknown
https://github.com/gjyalpha/jmallory/blob/fc5514c80671aed94935adebac334c292e4064b4/src/main/java/org/jmallory/AdminPane.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table
```


## License: unknown
https://github.com/Emmonslab/Elegance/blob/968487d3a39469def503e99bb9688fa7e4373f5f/elegance_code/src/ObjectViewFrame.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table
```


## License: unknown
https://github.com/d2dcontre/GME-Repo-2/blob/78e81362abbe3212abcba5d58f7acd7d2ab56d67/src/AlphaGUI.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table
```


## License: MIT
https://github.com/open-star/GD-OpenDolphin/blob/a203db755f1cfcc3be4eae1cdebb348e3e60da84/client/src/open/dolphin/plugin/patientinfodocumentpanel/PatientInfoDocumentPanel.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class
```


## License: unknown
https://github.com/sixones/zenses/blob/c3ed4c876c8522aae508c42bf117f80894ea3b6b/zenses/src/main/java/org/zenses/ui/views/MainWindow.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table
```


## License: unknown
https://github.com/fiendishly/rsbot-scripts/blob/a8cc0a291deb1b05e6e56260b630b6fb85e520a8/RuneSpeed.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table
```


## License: unknown
https://github.com/gjyalpha/jmallory/blob/fc5514c80671aed94935adebac334c292e4064b4/src/main/java/org/jmallory/AdminPane.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table
```


## License: unknown
https://github.com/Emmonslab/Elegance/blob/968487d3a39469def503e99bb9688fa7e4373f5f/elegance_code/src/ObjectViewFrame.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table
```


## License: unknown
https://github.com/d2dcontre/GME-Repo-2/blob/78e81362abbe3212abcba5d58f7acd7d2ab56d67/src/AlphaGUI.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table
```


## License: MIT
https://github.com/open-star/GD-OpenDolphin/blob/a203db755f1cfcc3be4eae1cdebb348e3e60da84/client/src/open/dolphin/plugin/patientinfodocumentpanel/PatientInfoDocumentPanel.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class
```


## License: unknown
https://github.com/sixones/zenses/blob/c3ed4c876c8522aae508c42bf117f80894ea3b6b/zenses/src/main/java/org/zenses/ui/views/MainWindow.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class
```


## License: unknown
https://github.com/fiendishly/rsbot-scripts/blob/a8cc0a291deb1b05e6e56260b630b6fb85e520a8/RuneSpeed.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class
```


## License: unknown
https://github.com/gjyalpha/jmallory/blob/fc5514c80671aed94935adebac334c292e4064b4/src/main/java/org/jmallory/AdminPane.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class
```


## License: unknown
https://github.com/Emmonslab/Elegance/blob/968487d3a39469def503e99bb9688fa7e4373f5f/elegance_code/src/ObjectViewFrame.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class
```


## License: unknown
https://github.com/d2dcontre/GME-Repo-2/blob/78e81362abbe3212abcba5d58f7acd7d2ab56d67/src/AlphaGUI.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class
```


## License: MIT
https://github.com/open-star/GD-OpenDolphin/blob/a203db755f1cfcc3be4eae1cdebb348e3e60da84/client/src/open/dolphin/plugin/patientinfodocumentpanel/PatientInfoDocumentPanel.java

```
Alright, let me help you set everything up from scratch. Here's a complete guide:

## Step 1: Verify MySQL is Running

Open **Terminal** in VS Code and run:
```powershell
mysql -u root -p
```
Press Enter (leave password blank if you haven't set one). If it connects, MySQL is running. Type `exit` to quit.

## Step 2: Create the Database

In the same MySQL prompt, run:
```sql
CREATE DATABASE IF NOT EXISTS homestay_tour_system;
USE homestay_tour_system;

CREATE TABLE guest (
    guest_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    address VARCHAR(255),
    contact_number VARCHAR(20),
    email_address VARCHAR(100),
    valid_id_status VARCHAR(50),
    trust_rating INT
);

CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_id INT,
    service_type VARCHAR(50),
    property_id INT,
    guide_id INT,
    start_date DATE,
    end_date DATE,
    base_amount DOUBLE,
    additional_charges DOUBLE,
    discount DOUBLE,
    final_amount DOUBLE,
    payment_method VARCHAR(50),
    payment_status VARCHAR(50),
    FOREIGN KEY (guest_id) REFERENCES guest(guest_id)
);

INSERT INTO guest VALUES (1, 'Juan', 'Dela Cruz', '123 Main St', '09123456789', 'juan@email.com', 'Valid', 5);
```

## Step 3: Add MySQL JDBC Driver

Open your project's `pom.xml` file and add this dependency inside `<dependencies>`:

````xml
<!-- filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\pom.xml -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.33</version>
        </dependency>
<!-- ...existing code... -->
````

Then reload your Maven project in VS Code.

## Step 4: Update HomestayBooking.java

Replace your file with this complete, working version:

````java
// filepath: c:\Users\Daniela Francene\Downloads\CCINFOM_dbApp-main\CCINFOM_dbApp-main\HomestayBooking.java
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class
```


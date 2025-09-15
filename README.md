# Travel_And_Tourism_Management_System
A Java-based web application for managing travel bookings and tourism services with MySQL database integration.


🚀 Features

✅ Add, update, and delete customer information  
✅ Book hotels and travel packages with details  
✅ View hotel and package listings with pricing  
✅ User authentication: login, signup, forgot password  
✅ Dashboard for easy navigation of system modules  
✅ Simulated payment integration (Paytm)  
✅ Real-time data storage with MySQL database  
✅ Smooth GUI experience with Java Swing and AWT  
✅ Responsive design with organized icons and images

---

🛠️ Technologies Used

Java (Swing & AWT): Frontend GUI development
MySQL: Backend relational database
JDBC: Database connectivity in Java
Maven/IDE (IntelliJ): Project management & build
Icons & Images: For interactive user interface


---
<b>A brief Overview and details about the project</b>


1 .ABSTRACT

1.1	CONTEXT :
The travel and tourism industry are one of the largest and fastest-growing sectors globally, playing a crucial role in economic development. With a rise in global travel, both for vacation and business, travel agencies face the challenge of efficiently managing large volumes of customer data, bookings, and package customization.
Traditionally, travel services relied heavily on manual entry and paperwork, which often led to inefficiencies, errors, and customer dissatisfaction. In this digital age, both travel providers and customers expect fast, reliable, and interactive systems that can handle bookings, payments, and itineraries all in one place.
This project is developed in this context to support and modernize travel agency operations by introducing a desktop-based software system built using Java and MySQL.

1.2	PROBLEM STATEMENT  :
Manual systems used by many small and medium travel agencies often lead to:
•	Data redundancy and inconsistency.
•	Time-consuming booking processes.
•	Inaccurate or misplaced customer information.
•	Difficulty in managing multiple travel packages.
•	Lack of secure user authentication and tracking.
These limitations affect the efficiency and customer experience of travel agencies. Therefore, there is a need for an automated system that offers:
•	A structured way to manage users and bookings.
•	Easy-to-use GUI.
•	Reliable and secure data storage with MySQL.
•	Simplified booking and payment modules.
This project addresses these issues through a complete desktop application designed specifically for travel agencies.


1.3	OBJECTIVE :
The purposes of the system are :
•	To develop a user-friendly GUI application for travel management.
•	To provide secure login and user management functionalities.
•	To allow users to book tour packages and hotel rooms efficiently.
•	To integrate a database system that maintains records of customers, bookings, and payments.
•	To enable easy retrieval, update, and deletion of user and booking data.




2. INTRODUCTION

2.1 PROJECT INTRODUCTION
The Travel and Tourism Management System is designed to streamline and automate the operations of a travel agency. Managing travel packages, hotel bookings, customer inquiries, payments, and staff administration manually can result in inefficiencies, lost records, and poor customer experience. This system offers a centralized, digital platform to address these challenges effectively.
By digitizing core travel services, the system helps travel agencies operate with greater speed, accuracy, and convenience—benefiting both the service providers and their customers.

1. Login Module:
To maintain the privacy and integrity of user data, access to the system is secured through a login module.
•	User logs in using a unique username and password.
•	Passwords are stored in an encrypted format in the MySQL database to ensure safety.
•	This module acts as the primary security checkpoint and restricts unauthorized access.

2. Dashboard:
Once logged in, the user is redirected to a centralized dashboard displaying:
•	View, Update, and Delete the user details.
•	Check, Book, and View Booked Packages.
•	Check, Book, and View Booked Hotels.
This clean interface allows quick access to the system’s major functionalities and a snapshot of the current status.

3. View Packages:
This module enables customers to view detailed information about travel packages.
•	Destination name, cost, duration, and description
•	Package itinerary highlights
•	Photos and visuals of tourist attractions
•	Number of people allowed per booking
This helps customers make informed decisions when choosing packages.

4. Hotel Booking Module:
Customers can select hotels linked to the travel package of their choice. Admins can manage hotel information and pricing from this module.
•	Hotel name, per-day cost, food and AC charges
•	Display of availability based on travel dates
•	Selection for booking and total cost calculation

5. Book Package Module:
This module allows customers to confirm a package booking by filling in the required details.
•	Customer details (name, contact, identification)
•	Package selected and number of persons
•	Auto-calculated total price based on selected options

6. Payment Module:
After booking, users are redirected to a mock payment interface to simulate the transaction process.
•	Display of calculated total cost
•	Dummy options for card/UPI/net banking
•	Confirmation message after "payment" for record generation


2.2 IMPORTANCE OF DATABASES IN THE TRAVEL AND TOURISM DOMAIN

In the travel industry, data is generated constantly—from new customer registrations to daily bookings and payments. Managing such information manually or using unstructured formats can be time-consuming and error-prone. A database system solves this problem by organizing data efficiently and securely.
In this project, MySQL serves as the backbone for storing and retrieving data related to users, travel packages, hotels, and transactions. Its advantages include:
•	Centralized Data Handling: Ensures all information is stored in one place, avoiding redundancy.
•	Quick Retrieval: Supports real-time access to critical information such as booking records or package availability.
•	Data Integrity: Enforces consistency and relationships through primary and foreign keys.
•	Security: Protects sensitive data like user credentials and booking history.
•	Scalability: Allows the system to grow with future needs and features.
Overall, the database is crucial for maintaining the accuracy, speed, and reliability of the system.

2.3 SCOPE OF THE PROJECT

The Travel and Tourism Management System is built to streamline key operations of travel agencies by automating and organizing their workflows. The scope includes:
•	User Registration and Login: Secure access for customers and admin users.
•	Customer Management: View, add, update, or remove customer details.
•	Package Booking: Display available travel packages with booking functionality.
•	Hotel Management: Integrate hotel booking options within selected packages.
•	Payment Simulation: Mimic payment processing through GUI elements.
•	Admin Dashboard: Provide a central control panel for all system modules.
The current system is designed for use as a standalone desktop application. However, it is built with modularity and scalability in mind, allowing for future upgrades such as online access, multi-user support, and third-party API integration.





3. SYSTEM DESIGN 

3.1 DESIGN OBJECTIVES
The primary objectives of system design in this project are:
•	To develop a structured and modular application architecture.
•	To ensure smooth interaction between different system components.
•	To maintain data consistency and integrity through well-planned database design.
•	To ensure a user-friendly experience with an intuitive GUI.

3.2 SYSTEM ARCHITECTURE
The system follows a two-tier architecture:
•	Presentation Layer (Frontend): Developed in Java using Swing, this layer handles user interaction through forms, buttons, and display screens.
•	Data Layer (Backend): Managed by MySQL, it stores all the data related to users, bookings, packages, hotels, and payments.
Data is exchanged between the two layers via JDBC (Java Database Connectivity).

3.3 FLOWCHART
	The flow of system can be better understood with the help of the following flowchart for the system:
 

<img width="984" height="1160" alt="image" src="https://github.com/user-attachments/assets/7731ed5f-8df8-41a7-a5e5-b8700911b606" />


3.4 ALGORITHM 
Step 1: Start the application.
Step 2 Prompt the user: "Are you a new customer?"
	→ If Yes, redirect to the Sign-Up form and collect user details.
   	→ If No, proceed to the Login form.
Step 3:
Step 4: Display Dashboard Options:
•	View Customer Details
•	Update Customer Details
•	Delete Customer Details
•	View Package and Hotel Details
•	Book Package and Hotel
•	View Booked Package and Hotel Details
Step 5: Based on user’s selection:
•	If "View Customer Details" → Fetch and display from Database.
•	If "Update Customer Details" → Get input → Update in Database.
•	If "Delete Customer Details" → Confirm → Delete from Database.
•	If "View Package and Hotel Details" → Fetch package & hotel data → Display.
•	If "Book Package and Hotel Details" → Collect selection → Save to Database.
•	If "View Booked Package and Hotel Details" → Retrieve booking info → Display.
Step 6: Allow the user to perform multiple operations or logout.
Step 7: End the application session when the user exits.




3.5 DATABASE DESIGN
The backend database is built using MySQL with normalized tables to ensure data integrity. Each table is linked via appropriate primary and foreign keys.
Key Tables:
•	Users: Stores customer and admin credentials.
•	Packages: Contains travel package details.
•	Hotels: Contains hotel info linked to packages.
•	Bookings: Manages customer bookings and status.

3.6 USER INTERFACE DESIGN
The application features a simple, menu-driven graphical user interface. Key design principles followed:
•	Clear navigation buttons and labels.
•	Input validation messages.
•	Feedback confirmation for actions like booking, cancellation, or login.
•	Use of forms, dropdowns, and dialog boxes for user convenience.
Screens Overview:
•	Login/Register Screen
•	Customer Dashboard
•	Package Viewing & Booking Screen
•	Admin Control Panel
•	Hotel Selection Screen
•	Payment Simulation Window





4. IMPLEMENTATION

4.1 PROGRAMMING LANGUAGE AND TOOLS USED
•	Front-end: Java (Swing for GUI)
•	Back-end: Java JDBC for database connectivity
•	Database: MySQL for storing data
•	IDE Used: IntelliJ for debugging the code 
•	Connector: MySQL JDBC Connector
•	Other Tools: Draw.io for diagram creation

4.2 SCREENSHOTS OF THE APPLICATION
I.	Signup Page
This page will help the user to create the account for user, using the username, name, password, security question and answer to that question.

 <img width="788" height="317" alt="image" src="https://github.com/user-attachments/assets/d6f5099b-7bf6-4008-81ef-df66da8cc040" />


II.	Login Page
By entering the username and password we can login to our account .

<img width="788" height="352" alt="image" src="https://github.com/user-attachments/assets/f1a1266a-2698-4725-a806-e2663ad9fa79" />

 

III.	Forget Password
If the user forgets password , then in the Forget Password page if we enter the username and click on ‘Search’ button we can search for the respective name and the security question.

<img width="769" height="345" alt="image" src="https://github.com/user-attachments/assets/e26f49d0-4e7a-41aa-b055-3e2317011350" />

 
If the user enters the correct answer to the security question, then by clicking on ‘Retrieve’ button we can retrieve the password for our account.

<img width="756" height="341" alt="image" src="https://github.com/user-attachments/assets/b0eb863c-c29c-4503-8b4b-736fee0d22e4" />

 
IV.	Loading Page

<img width="795" height="492" alt="image" src="https://github.com/user-attachments/assets/12d6a98e-2f93-4098-b735-d00c91feaa71" />


V.	Dashboard

<img width="940" height="529" alt="image" src="https://github.com/user-attachments/assets/a3894807-49d8-498b-b4a9-8a3d96e920c4" />

 
VI.	Add Personal Details Page

<img width="764" height="430" alt="image" src="https://github.com/user-attachments/assets/28fedd26-2fc3-494c-9584-d2bb2e216894" />


VII.	Update Personal Details Page

<img width="756" height="425" alt="image" src="https://github.com/user-attachments/assets/a30cbbbc-b80f-47c7-9530-506ca68f4825" />

 
VIII.	View Personal Details

<img width="764" height="373" alt="image" src="https://github.com/user-attachments/assets/67a42e42-3d43-4fb2-8358-05e63a6d9cd0" />

 
IX.	Delete personal Details Page 

<img width="778" height="370" alt="image" src="https://github.com/user-attachments/assets/2f870aa1-bc32-4659-862c-67da75e21706" />

 
X.	View Packages Page

<img width="727" height="409" alt="image" src="https://github.com/user-attachments/assets/66cf50b4-53f8-4443-9e65-57297a1d40e6" />

 
XI.	Book Packages Page

<img width="713" height="401" alt="image" src="https://github.com/user-attachments/assets/b066a382-cc71-44f8-94e7-eaa660ac8cee" />

 
XII.	View Booked Packages Page

<img width="677" height="381" alt="image" src="https://github.com/user-attachments/assets/2fd34fc8-95e8-4e25-89a8-f25862bb2084" />

 
XIII.	View Hotels Page

<img width="667" height="375" alt="image" src="https://github.com/user-attachments/assets/1ff01bff-1c6a-436b-bf55-ec4726b93ce9" />

 
XIV.	Book Hotels Page

<img width="673" height="378" alt="image" src="https://github.com/user-attachments/assets/65298ccf-da75-409e-98d7-3b7c53874754" />

 
XV.	View Booked Hotels Page

<img width="688" height="387" alt="image" src="https://github.com/user-attachments/assets/54c89315-a98c-46d3-bd43-066e5b5c0cfa" />

 
XVI.	Payments Page

<img width="731" height="411" alt="image" src="https://github.com/user-attachments/assets/fcfc1a20-49f6-4daf-a4e8-b985f12906d7" />

 








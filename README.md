# STV


Introduction

Purpose

Our project provides trail information to users and stock their trail record. Users can search trails by keyword, by filter and by sort. Target trails are which located around Vancouver. The main purpose of our project is providing better hike life for Vancouverites.

Project Scope

Background :
There are so many beautiful natures  here in Vancouver. Therefore a lot of people who lives around Vancouver love hiking. In addition, we get many visitors from around the world who want to enjoy nature around Vancouver. For these kind of people we created searching and recording hiking trails Apps. 
Overview:
Our project target is every kinds of hikers who want to hike around Vancouver(ex. beginner level to Advanced level, Family, Dog lovers).
Benefit of using our Apps is below.
Easy to find ideal trails for users.
Users can search trails in many ways with using filter or sort.
Filter
Level
Time
Distance
Dog friendly
Season
Location
Review
Sort
Level
Time
Distance
Review	
Users can check many information of trails include reviews.
Users can record their completed trails.
Date
Trail Name
Comments
Time
Users can add bookmark favorite trails.


References

■Project Overview / specification / Description 
https://docs.google.com/document/d/1NqkKX6luMa8zUeEjIaM1m0LfgvoX_4apgyDhIGqdlMc/edit

■Mock up
https://drive.google.com/drive/folders/0B7o6r2R1hiRWaURwX3JBNDdhUDQ

■Mood board
https://www.pinterest.com/kao55flower/stv/

■Use Case Diagram / User's Story / Class Diagram
https://docs.google.com/spreadsheets/d/1Oiz4zxraMMXyitpQJy9IGmhtnNiTLe-KOKkTrmUCJZw/edit#gid=0

■Referenced Data
https://www.vancouvertrails.com/trails/

System Description

Our project system is mainly built as below.
Searching trails
By using keyword
By using filter
By using sort
Creating my page
Record completed trails
Date
Trail name
Time
Comment
Bookmark trail list
Change username, password
Post review
Post trails’ record
Date 
Trail name
Rate
Comment
    
Functional Requirements

Below function is required in our project.
Sign up
Sign in
Search
Filter
Sort
Create my page
Post record
Post review
Add bookmark

Database

The used database in this project was the Google Firebase Realtime Cloud Database, based on JSON. The java-admin Firebase API was used to set the database routines. The database structure is based in two main parents, called Users (taking as “primary key” the username) and Hikes (taking as “primary key” an unique key). Relationship in Firebase is made with parent and children nodes using the primary keys.

The data is all stored in parent-child relationship, all values being stores with key and value. For multiple value data, is necessary a new parent node creation, storing its values as children. In this case, the use of and ID is necessary, even if the unique key is not a necessary data, as used in the hikes node.

Google Firebase works with asynchronous data retrieving, making our software development harder as a first-time user. However, after reading the Firebase documentation and asynchronous methods in Java, we made it possible with the use of callbacks. Our connection, data saving, data deleting, data updating and data retrieving with the database is working properly, with no sync problems.

DAO (Database Access Objects) were created as java classes to provide a better control between Models and Database, for CRUD operations. A static database manager class was created to set the database creating and configuration and providing the unique database instance in the running time execution. 


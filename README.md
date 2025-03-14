# project-parrallel
Java Web Scraper

Description

This is a multi-threaded web scraper built in Java to extract book details (title, price, and rating) from Books to Scrape. The scraper efficiently fetches data using multiple threads to speed up the extraction process.

Features

Extracts book titles, prices, and ratings

Uses multi-threading for improved performance

Parses HTML using Jsoup

Saves extracted data to a CSV file

Technologies Used

Java (Core language)

Jsoup (HTML parsing)

Multithreading (Java Threads for concurrent scraping)

Installation & Usage

Prerequisites

Java 8 or later

Maven (for dependency management)

Steps to Run

Clone the repository:

git clone https://github.com/yourusername/java-web-scraper.git
cd java-web-scraper

Build the project:

mvn clean install

Run the scraper:

java -jar target/webscraper.jar

Expected Output

The extracted book data will be saved in books_data.csv in the project directory.

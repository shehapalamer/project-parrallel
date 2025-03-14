Java Web Scraper
Description
This is a multi-threaded web scraper developed in Java that efficiently extracts book details (title, price, and rating) from the Books to Scrape website. The scraper leverages the power of multithreading to significantly speed up the data extraction process, ensuring optimal performance and accuracy.

Features
Extracts Book Details: Gathers book titles, prices, and ratings.
Multi-Threading: Implements multiple threads to enhance the scraping speed.
HTML Parsing with Jsoup: Utilizes Jsoup to parse and extract data from HTML.
CSV Export: Saves the extracted data into a CSV file for easy access.
Technologies Used
Java (Core Language): Primary language used for development.
Jsoup: For parsing HTML and extracting data from web pages.
Multithreading: Java's built-in thread functionality to perform concurrent scraping tasks.
Installation & Usage
Prerequisites
Ensure that the following are installed on your machine:

Java 8 or Later: To run Java applications.
Maven: For dependency management and project build.
Steps to Run the Project
Clone the Repository
Clone this repository to your local machine:

bash
Copy
git clone https://github.com/yourusername/java-web-scraper.git
cd java-web-scraper
Build the Project
Use Maven to build the project:

bash
Copy
mvn clean install
Run the Scraper
After the build is successful, you can run the scraper with the following command:

bash
Copy
java -jar target/webscraper.jar
Expected Output
The scraped book data will be saved in a CSV file named books_data.csv in the project directory. This file will contain the following columns:

Book Title
Price
Rating
Contributing
Feel free to fork this repository, make improvements, and submit pull requests. Contributions are always welcome!

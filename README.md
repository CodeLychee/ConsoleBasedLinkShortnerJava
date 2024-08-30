# Console Based Link Shortener Using JAVA

A simple Java-based command-line application for shortening URLs. This application allows users to generate shortened URLs from long URLs and retrieve the original URLs from the shortened versions.

## Features

- **Shorten URL:** It Converts long URLs into short, easy-to-share URLs.
- **Expand URL:** It Retrieves the original long URL from a shortened URL.
- **Collision Handling:** It also ensures that each shortened URL is unique, avoiding collisions.

## How It Works

1. **Shortening a URL:**
   - The application generates a unique 6-character string using a mix of lowercase, uppercase, and numeric characters.
   - This string is appended to a base URL (`https://motioncut.shop/`) to create the shortened URL.
   - The long URL and its corresponding shortened URL are stored in a map for future retrieval.

2. **Expanding a URL:**
   - Users can input a shortened URL, and the application will retrieve the original long URL if it exists in the map.
   - If the shortened URL doesn't exist, an error message is displayed.

## Prerequisites

- **Java Development Kit (JDK) 8 or higher**
- **Java IDE or Text Editor** (e.g., IntelliJ IDEA, Eclipse, VSCode)

## How to Run

1. **Clone the Repository:**

   ```bash
   git clone https://github.com/CodeLychee/link-shortener.git
   cd link-shortener
   ```

2. **Compile the Application:**

   ```bash
   javac com/linkshortner/LinkShortner.java
   ```

3. **Run the Application:**

   ```bash
   java com.linkshortner.LinkShortner
   ```

4. **Usage:**
   - Upon running the application, you will be presented with a menu:
     - Option 1: Enter a long URL to shorten it.
     - Option 2: Enter a shortened URL to retrieve the original URL.
     - Option 3: Exit the application.

## Code Overview

The application consists of a single class `LinkShortner`, which contains methods for generating short URLs, expanding them back to the original URLs, and handling user interactions.

### Key Methods:

- `generateShortenUrl(String theLongUrl)`: Generates a unique short URL.
- `shortenUrl(String theLongUrl)`: Shortens a given long URL and handles potential collisions.
- `expandUrl(String theShortUrl)`: Expands a given short URL back to its original long URL.
- `userchoice1()`: Handles user input for URL shortening.
- `userchoice2()`: Handles user input for URL expansion.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contributing

Feel free to submit pull requests, report issues, or suggest features to improve this project.

## Contact

For any questions or suggestions, please contact `watermelonpumpkin67@gmail.com`.

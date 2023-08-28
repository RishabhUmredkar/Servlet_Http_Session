### `servlet1`

- This servlet handles the HTTP GET request.
- It retrieves the user's name, email, and password from the request parameters.
- A session is created using `HttpSession` to store the user's information (`uname`, `email`, and `upass`).
- The servlet generates an HTML page with a header containing navigation links.
- The user's name is displayed on the page.
- This servlet is used for the login page.

### `servlet2`

- This servlet handles the HTTP GET request.
- It retrieves the user's name from the session created in `servlet1`.
- The servlet generates an HTML page with a header containing navigation links.
- The user's name (retrieved from the session) is displayed on the page.
- This servlet is used for the profile page, which displays the user's name.

Both servlets share similar functionality in terms of generating an HTML page with a header and displaying the user's name. The difference lies in how the user's name is obtained.
In `servlet1`, it's retrieved from the request parameters and stored in the session, while in `servlet2`, it's retrieved from the session itself.

Please note that the use of scriptlets within JSP pages is not a recommended practice due to various concerns, such as code maintainability and security.
In real-world applications, it's better to separate the logic from the presentation layer by using a proper MVC (Model-View-Controller) pattern or utilizing modern web frameworks like Spring MVC.

Additionally, the HTML and CSS references in your code are incomplete (e.g., `href='css/style1.css'`). 
Make sure you provide the correct paths to your CSS files for proper styling.



# Consuming REST API with Spring Boot

This project demonstrates how to consume data from a REST API using Spring Boot. The application fetches post data from [jsonplaceholder.typicode.com](https://jsonplaceholder.typicode.com/posts) and displays it on both a JavaFX GUI and a web page.

## Features

- Fetches post data from the [jsonplaceholder API](https://jsonplaceholder.typicode.com/posts)
- Displays fetched data on a JavaFX GUI
- Displays fetched data on a web page
- Supports both desktop application and web application launch modes

## Getting Started

To run this project, follow these steps:

1. Clone the repository to your local machine using the following command:
   ```sh
   git clone https://github.com/your-username/Consuming-REST-API-with-SpringBoot.git
   ```

2. Navigate to the project directory:
   ```sh
   cd Consuming-REST-API-with-SpringBoot
   ```

3. Depending on your preferred launch mode:

    - For Desktop Application:
        - Uncomment the line `Application.launch(PostApp.class, args);` in the `JavaFxAppLauncher` class.
        - Comment out the line `SpringApplication.run(ConsumingRestApiApplication.class, args);` in the `JavafxSpringBootApplication` class.
        - Run the Spring Boot application.

    - For Web Application:
        - Comment out the line `Application.launch(PostApp.class, args);` in the `JavaFxAppLauncher` class.
        - Uncomment the line `SpringApplication.run(ConsumingRestApiApplication.class, args);` in the `JavafxSpringBootApplication` class.
        - Run the Spring Boot application.
        - Access the web page at [http://localhost:8080](http://localhost:8080).

## Technologies Used

- Spring Boot
- JavaFX
- REST API
- Thymeleaf (for web page rendering)

## Directory Structure

```
|-- src
|   |-- main
|       |-- java
|       |   |-- com
|       |       |-- campipal
|       |           |-- campipal
|       |               |-- controller
|       |               |   |-- PostController.java
|       |               |-- model
|       |               |   |-- Post.java
|       |               |-- service
|       |               |   |-- PostService.java
|       |               |-- CampipalApplication.java
|       |               |-- PostApp.java
|       |               
|       |               
|       |-- resources
|           |-- templates
|           |   |-- post.html
```

## Contributing

Contributions are welcome! If you find any issues or want to improve the project, feel free to create a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
```

Feel free to copy and paste this Markdown code into your README file. Make sure to replace placeholders like `[your-username]` with the actual values and adjust any URLs as needed.
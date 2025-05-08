# Student Grade Tracker

## Overview
The **Student Grade Tracker** is a Java-based application designed to help educators manage and track student grades efficiently. This project was developed as part of an internship task, at Code Alpha company, to demonstrate skills in Java programming, basic java, advanced java, and object-oriented design.

## Features
- Add student records via user prompt (scanner object).
- Calculate and display average grades, highest grade, and lowest grade.
- User-friendly console-based interface.

## Technologies Used
- **Programming Language**: Java 21 (LTS)
- **IDE**: Visual Studio Code
- **Version Control**: Git
- **Build Tool**: Maven
## How to Run
1. Clone the repository:
    ```bash
    git clone https://github.com/herveinp/CodeAlpha_Student_Grade_Tracker.git
    ```
2. Open the project in your preferred Java IDE.
3. Compile and run the `App.java` file.
4. Follow the on-screen instructions to use the application.

## Notes
You only need to enter five pieces of information about your student: 'name', 'major', 'class year', 'total subjects', and 'grades'. The program will automatically generate the student ID in the format '{name}-{major}-{classYear}'. The 'total subjects' value determines how many grades you need to submit. And voilà! The program will automatically calculate the average grade, highest grade, and lowest grade.

If you're unsure how to do that, first check the 'AppTest.java' file located in 'src\test\java\com\herve\app'. You'll find a mockup data set there to try out first.

## Folder Structure
```
CodeAlpha_Student_Grade_Tracker/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── Object/       # Contains a student object
│   │   │   ├── App.java     # Entry point of the application
│   └── test/
│       ├── java/             # Unit tests for the application
├── README.md                 # Project documentation
```

## License
This project is licensed under the [MIT License](LICENSE).

## Contact
For any questions or feedback, feel free to reach out:
- **Email**: herve.inp@outlook.com
- **GitHub**: [herveinp](https://github.com/herveinp)
- **LinkedIn**: [herveprba](https://www.linkedin.com/in/herveprba/)
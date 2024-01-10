# OSUFinals - Backend for OSU Finals Schedule Viewer

## Overview
This repository contains the backend code for the OSU Finals Schedule Viewer, a Java Spring Boot application providing RESTful APIs for the frontend.

## Technologies Used
- Java
- Spring Boot
- MongoDB

## Setup and Running Locally
To set up and run the backend locally:
1. Clone the repository: `git clone https://github.com/yourusername/OSUFinals.git`
2. Navigate to the project directory: `cd OSUFinals`
3. Build the project: `./mvnw package`
4. Run the application: `java -jar target/osufinals-0.0.1-SNAPSHOT.jar`

## API Endpoints
- `/api/subjects` - Get all subjects
- `/api/subjects/{subjectId}/courses` - Get courses for a specific subject
- `/api/subjects/{subjectId}/courses/{courseId}/sections` - Get sections for a specific course

## Contributing
I would really appreciate it if anyone could help out by contributing, to contribute you can:
1. Fork the repository.
2. Create a new branch: `git checkout -b my-new-feature`.
3. Make your changes and commit: `git commit -am 'Add some feature'`.
4. Push to the branch: `git push origin my-new-feature`.
5. Submit a pull request.

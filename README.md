Product Catalog App
A modern Android application showcasing clean architecture with MVVM design, Jetpack Compose for UI, Hilt for dependency injection, and Retrofit for network calls.

Coding Practices & Architecture
This project adheres to industry-level coding principles and best practices, including:

Clean Architecture (3-Layered)
The project follows a well-structured MVVM + Clean Architecture pattern, separating concerns between:
<img width="309" alt="z2-MVVM-LayeredArchitecture" src="https://github.com/user-attachments/assets/8ac134ce-f39e-42a8-a968-a925bfa19b5d" />

Presentation Layer
UI logic using Jetpack Compose.

ViewModels handle state.

Stateless components promote reusability.

Domain Layer
Contains all business logic and use cases (pure Kotlin classes).

GetProductsUseCase.kt

GetDetailsUseCase.kt

Data Layer
Responsible for fetching data from remote sources (API).

Repository pattern is used.

Retrofit handles API calls.


Best Practices Followed
Separation of Concerns: UI, logic, and data are in distinct modules.

Dependency Injection: All dependencies injected using Hilt.

Kotlin Best Practices: Use of sealed classes, immutability, data classes.

Jetpack Compose: Modern declarative UI toolkit.

Error Handling: Clear user feedback when the API is unreachable.

Example of graceful error handling: 

<img width="185" alt="z1" src="https://github.com/user-attachments/assets/ae85116a-2744-4b8d-8c77-3130a4a9803d" />

Tech-Stack=>

| Layer        | Libraries/Tools Used                       |
|-------------|---------------------------------------------|
| UI          | Jetpack Compose, Material 3                 |
| DI          | Hilt                                        |
| Networking  | Retrofit, Gson                              |
| Language    | Kotlin (JVM Target 17)                      |
| Architecture| MVVM + Clean Architecture                   |

Run on an emulator or physical device with SDK 24+.

 .gitignore Highlights
Make sure to include a .gitignore file with the following:
bash
Copy
Edit
/.idea
/.gradle
/local.properties
.DS_Store
/build
*.iml
*.apk


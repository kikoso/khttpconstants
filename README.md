# KHttpConstants

**KHttpConstants** is a Kotlin library that provides a set of pre-defined constants for commonly used HTTP headers and status codes. It's designed to simplify HTTP-related development by offering a consistent and easy-to-use API.



---

## Features

- **Predefined HTTP Headers**: Avoid hardcoding headers like `Content-Type` or `Authorization`.
- **HTTP Status Codes**: Access commonly used HTTP status codes such as `200 OK` and `404 Not Found`.

---

## Getting Started

### Installation

Add the following dependency to your project:

#### Gradle (Kotlin DSL)

```kotlin
dependencies {
    implementation("com.github.kikoso:khttpconstants:1.0.0")
}
```

```groovy
dependencies {
    implementation 'com.github.kikoso:khttpconstants:1.0.0'
}
```

## Usage

### Accessing HTTP Headers

You can access predefined HTTP headers such as:

```kotlin
val contentTypeHeader = HttpHeaders.CONTENT_TYPE
```

### Accessing HTTP Status Codes

You can access predefined HTTP status codes like:

```kotlin
val statusCode = HttpStatusCodes.OK
```

# License

    Copyright 2024 Enrique López-Mañas

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

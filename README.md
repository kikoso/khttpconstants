# KHttpConstants

[![Maven Central](https://img.shields.io/maven-central/v/com.example.khttpconstants)](https://search.maven.org/artifact/com.example.khttpconstants)
[![License](https://img.shields.io/github/license/kikoso/khttpconstants)](https://www.apache.org/licenses/LICENSE-2.0)

**KHttpConstants** is a Kotlin Multiplatform library that provides a set of pre-defined constants for commonly used HTTP headers and status codes. It's designed to simplify HTTP-related development by offering a consistent and easy-to-use API across different platforms.

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
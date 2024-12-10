import com.vanniktech.maven.publish.SonatypeHost

plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.vanniktech.mavenPublish)
}

android {
    namespace = "com.enrique.khttpconstants"
    compileSdk = 35

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}

mavenPublishing {
    publishToMavenCentral(SonatypeHost.DEFAULT)

    signAllPublications()

    coordinates("com.github.kikoso", "khttpconstants", "1.0.0")

    pom {
        name = "KHttpConstants"
        description = "KHttpConstants is a Kotlin Multiplatform library that provides a set of pre-defined constants for commonly used HTTP headers and status codes."
        inceptionYear = "2024"
        url = "https://github.com/kikoso/khttpconstants"
        licenses {
            license {
                name = "Apache-2.0"
                url = "https://www.apache.org/licenses/LICENSE-2.0"
                distribution = "repo"
            }
        }
        developers {
            developer {
                id = "kikoso"
                name = "Enrique López-Mañas"
                url = "https://github.com/kikoso"
            }
        }
        scm {
            url = "https://github.com/kikoso/khttpconstants"
            connection = "scm:git:https://github.com/kikoso/khttpconstants.git"
            developerConnection = "scm:git:ssh://git@github.com:kikoso/khttpconstants.git"
        }
    }
}

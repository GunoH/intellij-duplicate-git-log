plugins {
    kotlin("jvm") version "1.8.0"
}

group = "org.example"
version = "0.1-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain(8)
}

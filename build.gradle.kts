@file:Suppress("DSL_SCOPE_VIOLATION")

plugins {
    kotlin("jvm") version "1.8.21"
    alias(libs.plugins.semver.gradle)
}

group = "org.example"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(11)
}

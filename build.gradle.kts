import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.3.20"
    id("org.jetbrains.intellij") version "0.4.2"
}

group = "com.github.shiraji"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

intellij {
    pluginName = "Ooh! Plugin"
    updateSinceUntilBuild = false
    sameSinceUntilBuild = false
}
plugins {
    kotlin("jvm") version "1.3.10"
    id("org.jetbrains.dokka") version "0.9.16"
//    id("war")
    id("org.springframework.boot") version "2.1.0.RELEASE"
}

apply(plugin = "org.springframework.boot")

repositories {
    jcenter()
}

val kotlinVersion = "1.3.10"
val springBootVersion = "2.0.4.RELEASE"
dependencies {
    implementation(kotlin("stdlib", kotlinVersion))
    implementation("org.jetbrains.kotlin:kotlin-reflect:$kotlinVersion")
    testCompile("org.junit.jupiter:junit-jupiter-api:5.3.1")

    implementation("org.springframework.boot:spring-boot-starter:$springBootVersion")
    implementation("org.springframework.boot:spring-boot-starter-web:$springBootVersion")
    implementation("org.springframework.boot:spring-boot-starter-actuator:$springBootVersion")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa:$springBootVersion")
    implementation("com.h2database:h2:1.4.197")
}

val dokka by tasks.getting(org.jetbrains.dokka.gradle.DokkaTask::class) {
    outputFormat = "html"
    outputDirectory = "$buildDir/javadoc"
}

val dokkaJar by tasks.creating(Jar::class) {
    group = JavaBasePlugin.DOCUMENTATION_GROUP
    description = "Assembles Kotlin docs with Dokka"
    classifier = "javadoc"
    from(dokka)
}


